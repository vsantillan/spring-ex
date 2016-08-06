package mx.com.adea.springex.dao.impl;

import mx.com.adea.springex.beans.UsuarioWebmxEntity;
import mx.com.adea.springex.dao.UsuarioDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Crated by Victor Santillán on 06/08/2016.
 * visantillan@adeamexico.com.mx
 */
@Repository
public class UsuarioDAOImpl implements UsuarioDAO {
  private SessionFactory sessionFactory;

  public UsuarioDAOImpl(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  @Override
  public void save(UsuarioWebmxEntity p) {
    Session session = this.sessionFactory.openSession();
    Transaction tx = session.beginTransaction();
    session.persist(p);
    tx.commit();
    session.close();
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<UsuarioWebmxEntity> list() {
    Session session = this.sessionFactory.openSession();
    List<UsuarioWebmxEntity> personList = session.createQuery("from UsuarioWebmxEntity").list();
    session.close();
    return personList;
  }
}
