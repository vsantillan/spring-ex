package mx.com.adea.projects.pojos;

import javax.persistence.*;
import java.sql.Time;

/**
 * Creado por visantillan on 25/01/2017.
 */
@Entity
@Table(name = "AP_OBSERVACIONES", schema = "VISANTILLAN", catalog = "")
public class ApObservacionesEntity {
	private int idObservacion;
	private Time fechaObservacion;
	private String itemRevisar;
	private String observaciones;
	private String observacionesDesarrolaldor;
	private String ok;

	@Id
	@Column(name = "ID_OBSERVACION")
	public int getIdObservacion() {
		return idObservacion;
	}

	public void setIdObservacion(int idObservacion) {
		this.idObservacion = idObservacion;
	}

	@Basic
	@Column(name = "FECHA_OBSERVACION")
	public Time getFechaObservacion() {
		return fechaObservacion;
	}

	public void setFechaObservacion(Time fechaObservacion) {
		this.fechaObservacion = fechaObservacion;
	}

	@Basic
	@Column(name = "ITEM_REVISAR")
	public String getItemRevisar() {
		return itemRevisar;
	}

	public void setItemRevisar(String itemRevisar) {
		this.itemRevisar = itemRevisar;
	}

	@Basic
	@Column(name = "OBSERVACIONES")
	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Basic
	@Column(name = "OBSERVACIONES_DESARROLALDOR")
	public String getObservacionesDesarrolaldor() {
		return observacionesDesarrolaldor;
	}

	public void setObservacionesDesarrolaldor(String observacionesDesarrolaldor) {
		this.observacionesDesarrolaldor = observacionesDesarrolaldor;
	}

	@Basic
	@Column(name = "OK")
	public String getOk() {
		return ok;
	}

	public void setOk(String ok) {
		this.ok = ok;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		ApObservacionesEntity that = (ApObservacionesEntity) o;

		if (idObservacion != that.idObservacion) return false;
		if (fechaObservacion != null ? !fechaObservacion.equals(that.fechaObservacion) : that.fechaObservacion != null)
			return false;
		if (itemRevisar != null ? !itemRevisar.equals(that.itemRevisar) : that.itemRevisar != null) return false;
		if (observaciones != null ? !observaciones.equals(that.observaciones) : that.observaciones != null) return false;
		if (observacionesDesarrolaldor != null ? !observacionesDesarrolaldor.equals(that.observacionesDesarrolaldor) : that.observacionesDesarrolaldor != null)
			return false;
		if (ok != null ? !ok.equals(that.ok) : that.ok != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = idObservacion;
		result = 31 * result + (fechaObservacion != null ? fechaObservacion.hashCode() : 0);
		result = 31 * result + (itemRevisar != null ? itemRevisar.hashCode() : 0);
		result = 31 * result + (observaciones != null ? observaciones.hashCode() : 0);
		result = 31 * result + (observacionesDesarrolaldor != null ? observacionesDesarrolaldor.hashCode() : 0);
		result = 31 * result + (ok != null ? ok.hashCode() : 0);
		return result;
	}
}
