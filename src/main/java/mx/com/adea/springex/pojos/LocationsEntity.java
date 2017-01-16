package mx.com.adea.springex.pojos;

import javax.persistence.*;

/**
 * Created by viktor on 15/01/2017.
 */
@Entity
@Table(name = "LOCATIONS", schema = "HR", catalog = "")
public class LocationsEntity {
	private long locationId;
	private String streetAddress;
	private String postalCode;
	private String city;
	private String stateProvince;
	private CountriesEntity countriesByCountryId;

	@Id
	@Column(name = "LOCATION_ID")
	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	@Basic
	@Column(name = "STREET_ADDRESS")
	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	@Basic
	@Column(name = "POSTAL_CODE")
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Basic
	@Column(name = "CITY")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Basic
	@Column(name = "STATE_PROVINCE")
	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		LocationsEntity that = (LocationsEntity) o;

		if (locationId != that.locationId) return false;
		if (streetAddress != null ? !streetAddress.equals(that.streetAddress) : that.streetAddress != null) return false;
		if (postalCode != null ? !postalCode.equals(that.postalCode) : that.postalCode != null) return false;
		if (city != null ? !city.equals(that.city) : that.city != null) return false;
		if (stateProvince != null ? !stateProvince.equals(that.stateProvince) : that.stateProvince != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (locationId ^ (locationId >>> 32));
		result = 31 * result + (streetAddress != null ? streetAddress.hashCode() : 0);
		result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
		result = 31 * result + (city != null ? city.hashCode() : 0);
		result = 31 * result + (stateProvince != null ? stateProvince.hashCode() : 0);
		return result;
	}

	@ManyToOne
	@JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRY_ID")
	public CountriesEntity getCountriesByCountryId() {
		return countriesByCountryId;
	}

	public void setCountriesByCountryId(CountriesEntity countriesByCountryId) {
		this.countriesByCountryId = countriesByCountryId;
	}
}
