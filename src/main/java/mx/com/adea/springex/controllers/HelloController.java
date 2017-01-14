package mx.com.adea.springex.controllers;

import mx.com.adea.springex.beans.UsuarioWebmxEntity;
import mx.com.adea.springex.dao.UsuarioDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Crated by Victor Santillán on 01/08/2016.
 * visantillan@adeamexico.com.mx
 */
@Controller
public class HelloController {

	private final UsuarioDAO userDao;

	private final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@Autowired
	public HelloController(UsuarioDAO userDao) {
		this.userDao = userDao;
	}

	@RequestMapping(value = "/hola", method = RequestMethod.GET)
	public String hola(@RequestParam(value = "name", required = false, defaultValue = "World")
												 String name, Model model) {

		model.addAttribute("recipient", name);
		List<UsuarioWebmxEntity> list = userDao.list();
		logger.debug(String.valueOf(list.size()));
		return "hola";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String fecha() {
		logger.debug("WORKS");
		return "index";
	}
}
