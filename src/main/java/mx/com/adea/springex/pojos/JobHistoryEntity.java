package mx.com.adea.springex.pojos;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by viktor on 15/01/2017.
 */
@Entity
@Table(name = "JOB_HISTORY", schema = "HR", catalog = "")
@IdClass(JobHistoryEntityPK.class)
public class JobHistoryEntity {
	private long employeeId;
	private Time startDate;
	private Time endDate;
	private EmployeesEntity employeesByEmployeeId;
	private DepartmentsEntity departmentsByDepartmentId;

	@Id
	@Column(name = "EMPLOYEE_ID")
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	@Id
	@Column(name = "START_DATE")
	public Time getStartDate() {
		return startDate;
	}

	public void setStartDate(Time startDate) {
		this.startDate = startDate;
	}

	@Basic
	@Column(name = "END_DATE")
	public Time getEndDate() {
		return endDate;
	}

	public void setEndDate(Time endDate) {
		this.endDate = endDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		JobHistoryEntity that = (JobHistoryEntity) o;

		if (employeeId != that.employeeId) return false;
		if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
		if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (employeeId ^ (employeeId >>> 32));
		result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
		result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
		return result;
	}

	@ManyToOne
	@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID", nullable = false, insertable = false, updatable = false)
	public EmployeesEntity getEmployeesByEmployeeId() {
		return employeesByEmployeeId;
	}

	public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
		this.employeesByEmployeeId = employeesByEmployeeId;
	}

	@ManyToOne
	@JoinColumn(name = "DEPARTMENT_ID", referencedColumnName = "DEPARTMENT_ID")
	public DepartmentsEntity getDepartmentsByDepartmentId() {
		return departmentsByDepartmentId;
	}

	public void setDepartmentsByDepartmentId(DepartmentsEntity departmentsByDepartmentId) {
		this.departmentsByDepartmentId = departmentsByDepartmentId;
	}
}
