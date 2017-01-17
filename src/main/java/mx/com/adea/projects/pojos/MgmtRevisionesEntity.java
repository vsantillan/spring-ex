package mx.com.adea.projects.pojos;

import javax.persistence.*;
import java.sql.Time;

/**
 * Crated by Victor Santillán on 17/01/2017.
 * visantillan@adeamexico.com.mx
 */
@Entity
@Table(name = "MGMT_REVISIONES", schema = "VISANTILLAN", catalog = "")
public class MgmtRevisionesEntity {
	private int idRevisiones;
	private long noRevision;
	private Short noErrores;
	private short tiempoRevision;
	private Time fechaCorreccionError;
	private Long calificacion;

	@Id
	@Column(name = "ID_REVISIONES")
	public int getIdRevisiones() {
		return idRevisiones;
	}

	public void setIdRevisiones(int idRevisiones) {
		this.idRevisiones = idRevisiones;
	}

	@Basic
	@Column(name = "NO_REVISION")
	public long getNoRevision() {
		return noRevision;
	}

	public void setNoRevision(long noRevision) {
		this.noRevision = noRevision;
	}

	@Basic
	@Column(name = "NO_ERRORES")
	public Short getNoErrores() {
		return noErrores;
	}

	public void setNoErrores(Short noErrores) {
		this.noErrores = noErrores;
	}

	@Basic
	@Column(name = "TIEMPO_REVISION")
	public short getTiempoRevision() {
		return tiempoRevision;
	}

	public void setTiempoRevision(short tiempoRevision) {
		this.tiempoRevision = tiempoRevision;
	}

	@Basic
	@Column(name = "FECHA_CORRECCION_ERROR")
	public Time getFechaCorreccionError() {
		return fechaCorreccionError;
	}

	public void setFechaCorreccionError(Time fechaCorreccionError) {
		this.fechaCorreccionError = fechaCorreccionError;
	}

	@Basic
	@Column(name = "CALIFICACION")
	public Long getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Long calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MgmtRevisionesEntity that = (MgmtRevisionesEntity) o;

		if (idRevisiones != that.idRevisiones) return false;
		if (noRevision != that.noRevision) return false;
		if (tiempoRevision != that.tiempoRevision) return false;
		if (noErrores != null ? !noErrores.equals(that.noErrores) : that.noErrores != null)
			return false;
		if (fechaCorreccionError != null ? !fechaCorreccionError.equals(that.fechaCorreccionError) : that.fechaCorreccionError != null)
			return false;
		if (calificacion != null ? !calificacion.equals(that.calificacion) : that.calificacion != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = idRevisiones;
		result = 31 * result + (int) (noRevision ^ (noRevision >>> 32));
		result = 31 * result + (noErrores != null ? noErrores.hashCode() : 0);
		result = 31 * result + (int) tiempoRevision;
		result = 31 * result + (fechaCorreccionError != null ? fechaCorreccionError.hashCode() : 0);
		result = 31 * result + (calificacion != null ? calificacion.hashCode() : 0);
		return result;
	}
}
