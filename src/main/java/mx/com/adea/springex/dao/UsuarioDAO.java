package mx.com.adea.springex.dao;

import mx.com.adea.springex.beans.UsuarioWebmxEntity;

import java.util.List;

/**
 * Crated by Victor Santillán on 06/08/2016.
 * visantillan@adeamexico.com.mx
 */
public interface UsuarioDAO {

  void save(UsuarioWebmxEntity p);

  List<UsuarioWebmxEntity> list();
}
