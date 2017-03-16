package mx.com.adea.projects.pojos;

import javax.persistence.*;

/**
 * Creado por visantillan on 25/01/2017.
 */
@Entity
@Table(name = "AP_CATALOGO_ERRORES", schema = "VISANTILLAN", catalog = "")
public class ApCatalogoErroresEntity {
	private short idError;
	private String descripcion;
	private short valor;

	@Id
	@Column(name = "ID_ERROR")
	public short getIdError() {
		return idError;
	}

	public void setIdError(short idError) {
		this.idError = idError;
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
	@Column(name = "VALOR")
	public short getValor() {
		return valor;
	}

	public void setValor(short valor) {
		this.valor = valor;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		ApCatalogoErroresEntity that = (ApCatalogoErroresEntity) o;

		if (idError != that.idError) return false;
		if (valor != that.valor) return false;
		if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) idError;
		result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
		result = 31 * result + (int) valor;
		return result;
	}
}
