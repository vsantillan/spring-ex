package mx.com.adea.projects.pojos;

import javax.persistence.*;

/**
 * Crated by Victor Santillán on 17/01/2017.
 * visantillan@adeamexico.com.mx
 */
@Entity
@Table(name = "MGMT_REVISION", schema = "VISANTILLAN", catalog = "")
public class MgmtRevisionEntity {
	private String idRevision;
	private int idEntrega;
	private String desarrolladorQa;
	private Double calificacionDesarrollo;
	private String autorizaPublicacion;
	private String entregaManual;
	private String entregaMatriz;
	private String entregaOtroDocumento;
	private String observacionesDesarrollador;
	private String obsevracionesRevisionQa;

	@Id
	@Column(name = "ID_REVISION")
	public String getIdRevision() {
		return idRevision;
	}

	public void setIdRevision(String idRevision) {
		this.idRevision = idRevision;
	}

	@Basic
	@Column(name = "ID_ENTREGA")
	public int getIdEntrega() {
		return idEntrega;
	}

	public void setIdEntrega(int idEntrega) {
		this.idEntrega = idEntrega;
	}

	@Basic
	@Column(name = "DESARROLLADOR_QA")
	public String getDesarrolladorQa() {
		return desarrolladorQa;
	}

	public void setDesarrolladorQa(String desarrolladorQa) {
		this.desarrolladorQa = desarrolladorQa;
	}

	@Basic
	@Column(name = "CALIFICACION_DESARROLLO")
	public Double getCalificacionDesarrollo() {
		return calificacionDesarrollo;
	}

	public void setCalificacionDesarrollo(Double calificacionDesarrollo) {
		this.calificacionDesarrollo = calificacionDesarrollo;
	}

	@Basic
	@Column(name = "AUTORIZA_PUBLICACION")
	public String getAutorizaPublicacion() {
		return autorizaPublicacion;
	}

	public void setAutorizaPublicacion(String autorizaPublicacion) {
		this.autorizaPublicacion = autorizaPublicacion;
	}

	@Basic
	@Column(name = "ENTREGA_MANUAL")
	public String getEntregaManual() {
		return entregaManual;
	}

	public void setEntregaManual(String entregaManual) {
		this.entregaManual = entregaManual;
	}

	@Basic
	@Column(name = "ENTREGA_MATRIZ")
	public String getEntregaMatriz() {
		return entregaMatriz;
	}

	public void setEntregaMatriz(String entregaMatriz) {
		this.entregaMatriz = entregaMatriz;
	}

	@Basic
	@Column(name = "ENTREGA_OTRO_DOCUMENTO")
	public String getEntregaOtroDocumento() {
		return entregaOtroDocumento;
	}

	public void setEntregaOtroDocumento(String entregaOtroDocumento) {
		this.entregaOtroDocumento = entregaOtroDocumento;
	}

	@Basic
	@Column(name = "OBSERVACIONES_DESARROLLADOR")
	public String getObservacionesDesarrollador() {
		return observacionesDesarrollador;
	}

	public void setObservacionesDesarrollador(String observacionesDesarrollador) {
		this.observacionesDesarrollador = observacionesDesarrollador;
	}

	@Basic
	@Column(name = "OBSEVRACIONES_REVISION_QA")
	public String getObsevracionesRevisionQa() {
		return obsevracionesRevisionQa;
	}

	public void setObsevracionesRevisionQa(String obsevracionesRevisionQa) {
		this.obsevracionesRevisionQa = obsevracionesRevisionQa;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MgmtRevisionEntity that = (MgmtRevisionEntity) o;

		if (idEntrega != that.idEntrega) return false;
		if (idRevision != null ? !idRevision.equals(that.idRevision) : that.idRevision != null)
			return false;
		if (desarrolladorQa != null ? !desarrolladorQa.equals(that.desarrolladorQa) : that.desarrolladorQa != null)
			return false;
		if (calificacionDesarrollo != null ? !calificacionDesarrollo.equals(that.calificacionDesarrollo) : that.calificacionDesarrollo != null)
			return false;
		if (autorizaPublicacion != null ? !autorizaPublicacion.equals(that.autorizaPublicacion) : that.autorizaPublicacion != null)
			return false;
		if (entregaManual != null ? !entregaManual.equals(that.entregaManual) : that.entregaManual != null)
			return false;
		if (entregaMatriz != null ? !entregaMatriz.equals(that.entregaMatriz) : that.entregaMatriz != null)
			return false;
		if (entregaOtroDocumento != null ? !entregaOtroDocumento.equals(that.entregaOtroDocumento) : that.entregaOtroDocumento != null)
			return false;
		if (observacionesDesarrollador != null ? !observacionesDesarrollador.equals(that.observacionesDesarrollador) : that.observacionesDesarrollador != null)
			return false;
		if (obsevracionesRevisionQa != null ? !obsevracionesRevisionQa.equals(that.obsevracionesRevisionQa) : that.obsevracionesRevisionQa != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = idRevision != null ? idRevision.hashCode() : 0;
		result = 31 * result + idEntrega;
		result = 31 * result + (desarrolladorQa != null ? desarrolladorQa.hashCode() : 0);
		result = 31 * result + (calificacionDesarrollo != null ? calificacionDesarrollo.hashCode() : 0);
		result = 31 * result + (autorizaPublicacion != null ? autorizaPublicacion.hashCode() : 0);
		result = 31 * result + (entregaManual != null ? entregaManual.hashCode() : 0);
		result = 31 * result + (entregaMatriz != null ? entregaMatriz.hashCode() : 0);
		result = 31 * result + (entregaOtroDocumento != null ? entregaOtroDocumento.hashCode() : 0);
		result = 31 * result + (observacionesDesarrollador != null ? observacionesDesarrollador.hashCode() : 0);
		result = 31 * result + (obsevracionesRevisionQa != null ? obsevracionesRevisionQa.hashCode() : 0);
		return result;
	}
}
