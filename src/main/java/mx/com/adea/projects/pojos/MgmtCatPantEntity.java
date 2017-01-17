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
@Table(name = "MGMT_CAT_PANT", schema = "VISANTILLAN", catalog = "")
public class MgmtCatPantEntity {
	private int idCatPant;

	@Id
	@Column(name = "ID_CAT_PANT")
	public int getIdCatPant() {
		return idCatPant;
	}

	public void setIdCatPant(int idCatPant) {
		this.idCatPant = idCatPant;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MgmtCatPantEntity that = (MgmtCatPantEntity) o;

		if (idCatPant != that.idCatPant) return false;

		return true;
	}

	@Override
	public int hashCode() {
		return idCatPant;
	}
}
