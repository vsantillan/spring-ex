package mx.com.adea.projects.controllers;

import mx.com.adea.projects.beans.Greeting;
import mx.com.adea.projects.dao.AplicacionDao;
import mx.com.adea.projects.pojos.ApAplicacionDatosEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Crated by Victor Santillán on 01/08/2016.
 * visantillan@adeamexico.com.mx
 */
@RestController
@RequestMapping("users")
public class HelloController {

	private final AplicacionDao dao;

	private final Logger logger = LoggerFactory.getLogger(HelloController.class);

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	public HelloController(AplicacionDao aplicacionDao) {
		this.dao = aplicacionDao;
	}

	@RequestMapping(value = "/greeting.action", method = RequestMethod.GET, produces = "application/json")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@RequestMapping(value = "/getAllProjects.action")
	public List<ApAplicacionDatosEntity> getProjects() {
		return dao.listAplicaciones();
	}

	@RequestMapping(value = "/aplicacion.action", produces = "application/json")
	public Greeting saveAplicacion(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@RequestMapping(value = "/greeting.xml.action", method = RequestMethod.GET, produces = "application/xml")
	public Greeting greetingXml(@RequestParam(value = "name", defaultValue = "World") String name) {
		Greeting greeting = new Greeting();
		greeting.setId(counter.incrementAndGet());
		greeting.setContent(String.format(template, name));
		return greeting;
	}

	@RequestMapping(value = "/testmap.action")
	public Map<String, ?> testMap(@RequestParam(value = "name", defaultValue = "World") String name) {
		Map<String, Greeting> map = new HashMap<>();

		map.put("greeting", new Greeting(counter.incrementAndGet(), String.format(template, name)));

		return map;
	}
}
