package mx.com.adea.projects.controllers;

import mx.com.adea.projects.beans.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Crated by Victor Santillán on 01/08/2016.
 * visantillan@adeamexico.com.mx
 */
@RestController
public class HelloController {

	private final Logger logger = LoggerFactory.getLogger(HelloController.class);

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting.action")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(),
				String.format(template, name));
	}
}
