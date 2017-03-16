package mx.com.adea.projects.pojos;

import javax.persistence.*;

/**
 * Creado por visantillan on 25/01/2017.
 */
@Entity
@Table(name = "AP_MATRIZ_PRUEBAS", schema = "VISANTILLAN", catalog = "")
public class ApMatrizPruebasEntity {
	private int idMatriz;
	private String objetivo;
	private String modificacionDesc;
	private String numAutorizacion;
	private String dicDatos;
	private String datosPrueba;

	@Id
	@Column(name = "ID_MATRIZ")
	public int getIdMatriz() {
		return idMatriz;
	}

	public void setIdMatriz(int idMatriz) {
		this.idMatriz = idMatriz;
	}

	@Basic
	@Column(name = "OBJETIVO")
	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	@Basic
	@Column(name = "MODIFICACION_DESC")
	public String getModificacionDesc() {
		return modificacionDesc;
	}

	public void setModificacionDesc(String modificacionDesc) {
		this.modificacionDesc = modificacionDesc;
	}

	@Basic
	@Column(name = "NUM_AUTORIZACION")
	public String getNumAutorizacion() {
		return numAutorizacion;
	}

	public void setNumAutorizacion(String numAutorizacion) {
		this.numAutorizacion = numAutorizacion;
	}

	@Basic
	@Column(name = "DIC_DATOS")
	public String getDicDatos() {
		return dicDatos;
	}

	public void setDicDatos(String dicDatos) {
		this.dicDatos = dicDatos;
	}

	@Basic
	@Column(name = "DATOS_PRUEBA")
	public String getDatosPrueba() {
		return datosPrueba;
	}

	public void setDatosPrueba(String datosPrueba) {
		this.datosPrueba = datosPrueba;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		ApMatrizPruebasEntity that = (ApMatrizPruebasEntity) o;

		if (idMatriz != that.idMatriz) return false;
		if (objetivo != null ? !objetivo.equals(that.objetivo) : that.objetivo != null) return false;
		if (modificacionDesc != null ? !modificacionDesc.equals(that.modificacionDesc) : that.modificacionDesc != null)
			return false;
		if (numAutorizacion != null ? !numAutorizacion.equals(that.numAutorizacion) : that.numAutorizacion != null)
			return false;
		if (dicDatos != null ? !dicDatos.equals(that.dicDatos) : that.dicDatos != null) return false;
		if (datosPrueba != null ? !datosPrueba.equals(that.datosPrueba) : that.datosPrueba != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = idMatriz;
		result = 31 * result + (objetivo != null ? objetivo.hashCode() : 0);
		result = 31 * result + (modificacionDesc != null ? modificacionDesc.hashCode() : 0);
		result = 31 * result + (numAutorizacion != null ? numAutorizacion.hashCode() : 0);
		result = 31 * result + (dicDatos != null ? dicDatos.hashCode() : 0);
		result = 31 * result + (datosPrueba != null ? datosPrueba.hashCode() : 0);
		return result;
	}
}
