package mx.com.adea.springex.dao;

import mx.com.adea.springex.pojos.EmployeesEntity;

import java.util.List;

/**
 * Created by viktor on 15/01/2017.
 */
public interface EmployeeDao {

	List<EmployeesEntity> listEmployees();

}
