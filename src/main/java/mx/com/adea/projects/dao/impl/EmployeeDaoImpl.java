package mx.com.adea.projects.dao.impl;

import mx.com.adea.projects.dao.EmployeeDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Creado por viktor on 15/01/2017.
 */
public class EmployeeDaoImpl implements EmployeeDao{

	private SessionFactory sessionFactory;

	public EmployeeDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<String> listEmployees() {
		Session session = this.sessionFactory.openSession();
		return null;
	}
}
