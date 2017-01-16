package mx.com.adea.springex.pojos;

import javax.persistence.*;

/**
 * Created by viktor on 15/01/2017.
 */
@Entity
@Table(name = "REGIONS", schema = "HR", catalog = "")
public class RegionsEntity {
	private long regionId;
	private String regionName;

	@Id
	@Column(name = "REGION_ID")
	public long getRegionId() {
		return regionId;
	}

	public void setRegionId(long regionId) {
		this.regionId = regionId;
	}

	@Basic
	@Column(name = "REGION_NAME")
	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		RegionsEntity that = (RegionsEntity) o;

		if (regionId != that.regionId) return false;
		if (regionName != null ? !regionName.equals(that.regionName) : that.regionName != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (regionId ^ (regionId >>> 32));
		result = 31 * result + (regionName != null ? regionName.hashCode() : 0);
		return result;
	}
}
