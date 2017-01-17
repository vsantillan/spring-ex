package mx.com.adea.projects.beans;

/**
 * Creado por Administrador on 17/01/2017.
 */
public class Greeting {
	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
