package mx.com.adea.projects.dao.impl;

import mx.com.adea.projects.beans.Greeting;
import mx.com.adea.projects.dao.GreetingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * Creado por visantillan el 16/03/2017.
 */
public class GreetingDaoImpl implements GreetingDao {

	@Autowired
	private MongoOperations mongoOps;

	public GreetingDaoImpl(SimpleMongoDbFactory mongoOps) {
	}


	@Override
	public void create(Greeting p) {

	}

	@Override
	public Greeting readById(String id) {
		return null;
	}

	@Override
	public void update(Greeting p) {

	}

	@Override
	public int deleteById(String id) {
		return 0;
	}
}
