package mx.com.adea.projects.beans;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Creado por Administrador on 17/01/2017.
 */
@XmlRootElement(name = "Greeting")
public class Greeting {
	private long id;
	private String content;

	public Greeting() {
	}

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
