package mx.com.adea.springex.dao.impl;

import mx.com.adea.springex.dao.EmployeeDao;
import mx.com.adea.springex.pojos.EmployeesEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by viktor on 15/01/2017.
 */
public class EmployeeDaoImpl implements EmployeeDao{

	private SessionFactory sessionFactory;

	public EmployeeDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<EmployeesEntity> listEmployees() {
		Session session = this.sessionFactory.openSession();
		return (List<EmployeesEntity>) session.createQuery("from EmployeesEntity ").list();
	}
}
