package mx.com.adea.projects.dao.impl;

import mx.com.adea.projects.beans.Greeting;
import mx.com.adea.projects.dao.AplicacionDao;
import mx.com.adea.projects.pojos.ApAplicacionDatosEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Creado por Administrador on 18/01/2017.
 */

@Repository
public class AplicacionDaoImpl implements AplicacionDao {

	private final SessionFactory sessionFactory;

	@Autowired
	public AplicacionDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public Greeting save(ApAplicacionDatosEntity mgmtAplicacionDatosEntity) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(mgmtAplicacionDatosEntity);
		transaction.commit();
		return new Greeting(1L, "ok");
	}

	@Override
	public ApAplicacionDatosEntity getAplicacionById() {
		return null;
	}

	@Override
	public List<ApAplicacionDatosEntity> listAplicaciones() {
		return null;
	}
}
