package mx.com.adea.projects.pojos;

import javax.persistence.*;
import java.sql.Time;

/**
 * Creado por visantillan on 25/01/2017.
 */
@Entity
@Table(name = "AP_ENTREGA", schema = "VISANTILLAN", catalog = "")
public class ApEntregaEntity {
	private long hdEntrega;
	private String tipoRevision;
	private String tipoDesarrollo;
	private String requerimientoAplicacion;
	private String usoAplicacion;
	private boolean complejidad;
	private String liderProyecto;
	private String desarrollador;
	private Time fechaDesarrolloInicio;
	private Time fechaDesarrolloFin;
	private Time fechaLiberacion;
	private String version;

	@Id
	@Column(name = "HD_ENTREGA")
	public long getHdEntrega() {
		return hdEntrega;
	}

	public void setHdEntrega(long hdEntrega) {
		this.hdEntrega = hdEntrega;
	}

	@Basic
	@Column(name = "TIPO_REVISION")
	public String getTipoRevision() {
		return tipoRevision;
	}

	public void setTipoRevision(String tipoRevision) {
		this.tipoRevision = tipoRevision;
	}

	@Basic
	@Column(name = "TIPO_DESARROLLO")
	public String getTipoDesarrollo() {
		return tipoDesarrollo;
	}

	public void setTipoDesarrollo(String tipoDesarrollo) {
		this.tipoDesarrollo = tipoDesarrollo;
	}

	@Basic
	@Column(name = "REQUERIMIENTO_APLICACION")
	public String getRequerimientoAplicacion() {
		return requerimientoAplicacion;
	}

	public void setRequerimientoAplicacion(String requerimientoAplicacion) {
		this.requerimientoAplicacion = requerimientoAplicacion;
	}

	@Basic
	@Column(name = "USO_APLICACION")
	public String getUsoAplicacion() {
		return usoAplicacion;
	}

	public void setUsoAplicacion(String usoAplicacion) {
		this.usoAplicacion = usoAplicacion;
	}

	@Basic
	@Column(name = "COMPLEJIDAD")
	public boolean isComplejidad() {
		return complejidad;
	}

	public void setComplejidad(boolean complejidad) {
		this.complejidad = complejidad;
	}

	@Basic
	@Column(name = "LIDER_PROYECTO")
	public String getLiderProyecto() {
		return liderProyecto;
	}

	public void setLiderProyecto(String liderProyecto) {
		this.liderProyecto = liderProyecto;
	}

	@Basic
	@Column(name = "DESARROLLADOR")
	public String getDesarrollador() {
		return desarrollador;
	}

	public void setDesarrollador(String desarrollador) {
		this.desarrollador = desarrollador;
	}

	@Basic
	@Column(name = "FECHA_DESARROLLO_INICIO")
	public Time getFechaDesarrolloInicio() {
		return fechaDesarrolloInicio;
	}

	public void setFechaDesarrolloInicio(Time fechaDesarrolloInicio) {
		this.fechaDesarrolloInicio = fechaDesarrolloInicio;
	}

	@Basic
	@Column(name = "FECHA_DESARROLLO_FIN")
	public Time getFechaDesarrolloFin() {
		return fechaDesarrolloFin;
	}

	public void setFechaDesarrolloFin(Time fechaDesarrolloFin) {
		this.fechaDesarrolloFin = fechaDesarrolloFin;
	}

	@Basic
	@Column(name = "FECHA_LIBERACION")
	public Time getFechaLiberacion() {
		return fechaLiberacion;
	}

	public void setFechaLiberacion(Time fechaLiberacion) {
		this.fechaLiberacion = fechaLiberacion;
	}

	@Basic
	@Column(name = "VERSION")
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		ApEntregaEntity that = (ApEntregaEntity) o;

		if (hdEntrega != that.hdEntrega) return false;
		if (complejidad != that.complejidad) return false;
		if (tipoRevision != null ? !tipoRevision.equals(that.tipoRevision) : that.tipoRevision != null) return false;
		if (tipoDesarrollo != null ? !tipoDesarrollo.equals(that.tipoDesarrollo) : that.tipoDesarrollo != null)
			return false;
		if (requerimientoAplicacion != null ? !requerimientoAplicacion.equals(that.requerimientoAplicacion) : that.requerimientoAplicacion != null)
			return false;
		if (usoAplicacion != null ? !usoAplicacion.equals(that.usoAplicacion) : that.usoAplicacion != null) return false;
		if (liderProyecto != null ? !liderProyecto.equals(that.liderProyecto) : that.liderProyecto != null) return false;
		if (desarrollador != null ? !desarrollador.equals(that.desarrollador) : that.desarrollador != null) return false;
		if (fechaDesarrolloInicio != null ? !fechaDesarrolloInicio.equals(that.fechaDesarrolloInicio) : that.fechaDesarrolloInicio != null)
			return false;
		if (fechaDesarrolloFin != null ? !fechaDesarrolloFin.equals(that.fechaDesarrolloFin) : that.fechaDesarrolloFin != null)
			return false;
		if (fechaLiberacion != null ? !fechaLiberacion.equals(that.fechaLiberacion) : that.fechaLiberacion != null)
			return false;
		if (version != null ? !version.equals(that.version) : that.version != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (hdEntrega ^ (hdEntrega >>> 32));
		result = 31 * result + (tipoRevision != null ? tipoRevision.hashCode() : 0);
		result = 31 * result + (tipoDesarrollo != null ? tipoDesarrollo.hashCode() : 0);
		result = 31 * result + (requerimientoAplicacion != null ? requerimientoAplicacion.hashCode() : 0);
		result = 31 * result + (usoAplicacion != null ? usoAplicacion.hashCode() : 0);
		result = 31 * result + (complejidad ? 1 : 0);
		result = 31 * result + (liderProyecto != null ? liderProyecto.hashCode() : 0);
		result = 31 * result + (desarrollador != null ? desarrollador.hashCode() : 0);
		result = 31 * result + (fechaDesarrolloInicio != null ? fechaDesarrolloInicio.hashCode() : 0);
		result = 31 * result + (fechaDesarrolloFin != null ? fechaDesarrolloFin.hashCode() : 0);
		result = 31 * result + (fechaLiberacion != null ? fechaLiberacion.hashCode() : 0);
		result = 31 * result + (version != null ? version.hashCode() : 0);
		return result;
	}
}
