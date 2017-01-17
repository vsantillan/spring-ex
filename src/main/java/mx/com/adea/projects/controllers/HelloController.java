package mx.com.adea.projects.controllers;

import mx.com.adea.projects.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Crated by Victor Santillán on 01/08/2016.
 * visantillan@adeamexico.com.mx
 */
@Controller
public class HelloController {

	private final EmployeeDao employeeDao;

	private final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@Autowired
	public HelloController(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@RequestMapping(value = "/hola", method = RequestMethod.GET)
	public String hola(@RequestParam(value = "name", required = false, defaultValue = "World")
												 String name, Model model) {
		logger.debug(name);

		model.addAttribute("recipient", name);
		return "hola";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String fecha() {
		logger.debug("WORKS");
		return "index";
	}
}
