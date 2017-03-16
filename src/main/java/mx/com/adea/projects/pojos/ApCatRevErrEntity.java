package mx.com.adea.projects.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Creado por visantillan on 25/01/2017.
 */
@Entity
@Table(name = "AP_CAT_REV_ERR", schema = "VISANTILLAN", catalog = "")
public class ApCatRevErrEntity {
	private int idCat;

	@Id
	@Column(name = "ID_CAT")
	public int getIdCat() {
		return idCat;
	}

	public void setIdCat(int idCat) {
		this.idCat = idCat;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		ApCatRevErrEntity that = (ApCatRevErrEntity) o;

		if (idCat != that.idCat) return false;

		return true;
	}

	@Override
	public int hashCode() {
		return idCat;
	}
}
