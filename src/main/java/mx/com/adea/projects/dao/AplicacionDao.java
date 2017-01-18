package mx.com.adea.projects.dao;

import mx.com.adea.projects.beans.Greeting;
import mx.com.adea.projects.pojos.MgmtAplicacionDatosEntity;

import java.util.List;

/**
 * Creado por Administrador on 18/01/2017.
 */
public interface AplicacionDao {

	Greeting save(MgmtAplicacionDatosEntity mgmtAplicacionDatosEntity);

	MgmtAplicacionDatosEntity getAplicacionById();

	List<MgmtAplicacionDatosEntity> listAplicaciones();

}
