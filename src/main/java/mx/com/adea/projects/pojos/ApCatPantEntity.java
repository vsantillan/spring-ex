package mx.com.adea.projects.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Creado por visantillan on 25/01/2017.
 */
@Entity
@Table(name = "AP_CAT_PANT", schema = "VISANTILLAN", catalog = "")
public class ApCatPantEntity {
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

		ApCatPantEntity that = (ApCatPantEntity) o;

		if (idCatPant != that.idCatPant) return false;

		return true;
	}

	@Override
	public int hashCode() {
		return idCatPant;
	}
}
