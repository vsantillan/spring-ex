package mx.com.adea.projects.pojos;

import javax.persistence.*;
import java.sql.Time;

/**
 * Creado por visantillan on 25/01/2017.
 */
@Entity
@Table(name = "AP_PUBLICACION", schema = "VISANTILLAN", catalog = "")
public class ApPublicacionEntity {
	private int idPublicacion;
	private Long hdPublicacion;
	private String desarrollador;
	private Time fechaSolicitud;
	private Time fechaPublicacion;
	private String liderProyecto;
	private String ambientePublicacion;

	@Id
	@Column(name = "ID_PUBLICACION")
	public int getIdPublicacion() {
		return idPublicacion;
	}

	public void setIdPublicacion(int idPublicacion) {
		this.idPublicacion = idPublicacion;
	}

	@Basic
	@Column(name = "HD_PUBLICACION")
	public Long getHdPublicacion() {
		return hdPublicacion;
	}

	public void setHdPublicacion(Long hdPublicacion) {
		this.hdPublicacion = hdPublicacion;
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
	@Column(name = "FECHA_SOLICITUD")
	public Time getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Time fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	@Basic
	@Column(name = "FECHA_PUBLICACION")
	public Time getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Time fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
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
	@Column(name = "AMBIENTE_PUBLICACION")
	public String getAmbientePublicacion() {
		return ambientePublicacion;
	}

	public void setAmbientePublicacion(String ambientePublicacion) {
		this.ambientePublicacion = ambientePublicacion;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		ApPublicacionEntity that = (ApPublicacionEntity) o;

		if (idPublicacion != that.idPublicacion) return false;
		if (hdPublicacion != null ? !hdPublicacion.equals(that.hdPublicacion) : that.hdPublicacion != null) return false;
		if (desarrollador != null ? !desarrollador.equals(that.desarrollador) : that.desarrollador != null) return false;
		if (fechaSolicitud != null ? !fechaSolicitud.equals(that.fechaSolicitud) : that.fechaSolicitud != null)
			return false;
		if (fechaPublicacion != null ? !fechaPublicacion.equals(that.fechaPublicacion) : that.fechaPublicacion != null)
			return false;
		if (liderProyecto != null ? !liderProyecto.equals(that.liderProyecto) : that.liderProyecto != null) return false;
		if (ambientePublicacion != null ? !ambientePublicacion.equals(that.ambientePublicacion) : that.ambientePublicacion != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = idPublicacion;
		result = 31 * result + (hdPublicacion != null ? hdPublicacion.hashCode() : 0);
		result = 31 * result + (desarrollador != null ? desarrollador.hashCode() : 0);
		result = 31 * result + (fechaSolicitud != null ? fechaSolicitud.hashCode() : 0);
		result = 31 * result + (fechaPublicacion != null ? fechaPublicacion.hashCode() : 0);
		result = 31 * result + (liderProyecto != null ? liderProyecto.hashCode() : 0);
		result = 31 * result + (ambientePublicacion != null ? ambientePublicacion.hashCode() : 0);
		return result;
	}
}
