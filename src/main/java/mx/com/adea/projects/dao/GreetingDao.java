package mx.com.adea.projects.dao;

import mx.com.adea.projects.beans.Greeting;

/**
 * Creado por visantillan el 16/03/2017.
 */
public interface GreetingDao {

	public void create(Greeting p);

	public Greeting readById(String id);

	public void update(Greeting p);

	public int deleteById(String id);

}
