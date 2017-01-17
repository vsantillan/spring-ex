package mx.com.adea.projects.pojos;

import javax.persistence.*;
import java.sql.Time;

/**
 * Crated by Victor Santillán on 17/01/2017.
 * visantillan@adeamexico.com.mx
 */
@Entity
@Table(name = "MGMT_SOLICITUD", schema = "VISANTILLAN", catalog = "")
public class MgmtSolicitudEntity {
	private long hdSolicitud;
	private String solicitante;
	private short extension;
	private Time fechaSolicitud;

	@Id
	@Column(name = "HD_SOLICITUD")
	public long getHdSolicitud() {
		return hdSolicitud;
	}

	public void setHdSolicitud(long hdSolicitud) {
		this.hdSolicitud = hdSolicitud;
	}

	@Basic
	@Column(name = "SOLICITANTE")
	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	@Basic
	@Column(name = "EXTENSION")
	public short getExtension() {
		return extension;
	}

	public void setExtension(short extension) {
		this.extension = extension;
	}

	@Basic
	@Column(name = "FECHA_SOLICITUD")
	public Time getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Time fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MgmtSolicitudEntity that = (MgmtSolicitudEntity) o;

		if (hdSolicitud != that.hdSolicitud) return false;
		if (extension != that.extension) return false;
		if (solicitante != null ? !solicitante.equals(that.solicitante) : that.solicitante != null)
			return false;
		if (fechaSolicitud != null ? !fechaSolicitud.equals(that.fechaSolicitud) : that.fechaSolicitud != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (hdSolicitud ^ (hdSolicitud >>> 32));
		result = 31 * result + (solicitante != null ? solicitante.hashCode() : 0);
		result = 31 * result + (int) extension;
		result = 31 * result + (fechaSolicitud != null ? fechaSolicitud.hashCode() : 0);
		return result;
	}
}
