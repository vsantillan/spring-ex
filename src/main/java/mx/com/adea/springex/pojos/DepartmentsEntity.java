package mx.com.adea.springex.pojos;

import javax.persistence.*;

/**
 * Created by viktor on 15/01/2017.
 */
@Entity
@Table(name = "DEPARTMENTS", schema = "HR", catalog = "")
public class DepartmentsEntity {
	private long departmentId;
	private String departmentName;

	@Id
	@Column(name = "DEPARTMENT_ID")
	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	@Basic
	@Column(name = "DEPARTMENT_NAME")
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		DepartmentsEntity that = (DepartmentsEntity) o;

		if (departmentId != that.departmentId) return false;
		if (departmentName != null ? !departmentName.equals(that.departmentName) : that.departmentName != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (departmentId ^ (departmentId >>> 32));
		result = 31 * result + (departmentName != null ? departmentName.hashCode() : 0);
		return result;
	}
}
