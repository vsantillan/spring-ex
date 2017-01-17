package mx.com.adea.projects.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Crated by Victor Santillán on 17/01/2017.
 * visantillan@adeamexico.com.mx
 */
@Entity
@Table(name = "MGMT_CAT_REV_ERR", schema = "VISANTILLAN", catalog = "")
public class MgmtCatRevErrEntity {
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

		MgmtCatRevErrEntity that = (MgmtCatRevErrEntity) o;

		if (idCat != that.idCat) return false;

		return true;
	}

	@Override
	public int hashCode() {
		return idCat;
	}
}
