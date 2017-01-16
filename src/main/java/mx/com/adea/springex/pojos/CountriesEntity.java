package mx.com.adea.springex.pojos;

import javax.persistence.*;

/**
 * Created by viktor on 15/01/2017.
 */
@Entity
@Table(name = "COUNTRIES", schema = "HR", catalog = "")
public class CountriesEntity {
	private String countryId;
	private String countryName;

	@Id
	@Column(name = "COUNTRY_ID")
	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	@Basic
	@Column(name = "COUNTRY_NAME")
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		CountriesEntity that = (CountriesEntity) o;

		if (countryId != null ? !countryId.equals(that.countryId) : that.countryId != null) return false;
		if (countryName != null ? !countryName.equals(that.countryName) : that.countryName != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = countryId != null ? countryId.hashCode() : 0;
		result = 31 * result + (countryName != null ? countryName.hashCode() : 0);
		return result;
	}
}
