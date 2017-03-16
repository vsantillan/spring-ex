package mx.com.adea.projects.pojos;

import javax.persistence.*;

/**
 * Creado por visantillan on 25/01/2017.
 */
@Entity
@Table(name = "AP_PANTALLAS", schema = "VISANTILLAN", catalog = "")
public class ApPantallasEntity {
	private int idPantalla;
	private String descripcion;
	private String captura;
	private String tipoValor;

	@Id
	@Column(name = "ID_PANTALLA")
	public int getIdPantalla() {
		return idPantalla;
	}

	public void setIdPantalla(int idPantalla) {
		this.idPantalla = idPantalla;
	}

	@Basic
	@Column(name = "DESCRIPCION")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Basic
	@Column(name = "CAPTURA")
	public String getCaptura() {
		return captura;
	}

	public void setCaptura(String captura) {
		this.captura = captura;
	}

	@Basic
	@Column(name = "TIPO_VALOR")
	public String getTipoValor() {
		return tipoValor;
	}

	public void setTipoValor(String tipoValor) {
		this.tipoValor = tipoValor;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		ApPantallasEntity that = (ApPantallasEntity) o;

		if (idPantalla != that.idPantalla) return false;
		if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
		if (captura != null ? !captura.equals(that.captura) : that.captura != null) return false;
		if (tipoValor != null ? !tipoValor.equals(that.tipoValor) : that.tipoValor != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = idPantalla;
		result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
		result = 31 * result + (captura != null ? captura.hashCode() : 0);
		result = 31 * result + (tipoValor != null ? tipoValor.hashCode() : 0);
		return result;
	}
}
