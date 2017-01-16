package mx.com.adea.springex.pojos;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Time;

/**
 * Created by viktor on 15/01/2017.
 */
public class JobHistoryEntityPK implements Serializable {
	private long employeeId;
	private Time startDate;

	@Column(name = "EMPLOYEE_ID")
	@Id
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "START_DATE")
	@Id
	public Time getStartDate() {
		return startDate;
	}

	public void setStartDate(Time startDate) {
		this.startDate = startDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		JobHistoryEntityPK that = (JobHistoryEntityPK) o;

		if (employeeId != that.employeeId) return false;
		if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (employeeId ^ (employeeId >>> 32));
		result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
		return result;
	}
}
