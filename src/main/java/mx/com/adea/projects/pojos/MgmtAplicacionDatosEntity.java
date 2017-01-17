package mx.com.adea.projects.pojos;

import javax.persistence.*;

/**
 * Crated by Victor Santillán on 17/01/2017.
 * visantillan@adeamexico.com.mx
 */
@Entity
@Table(name = "MGMT_APLICACION_DATOS", schema = "VISANTILLAN", catalog = "")
public class MgmtAplicacionDatosEntity {
	private String idAplicacion;
	private int cliente;
	private Integer operatoria;
	private String nombre;
	private String versionActual;
	private String descripcion;
	private String estatusActual;
	private String tipoAplicacion;
	private String plataforma;
	private String rutaEjecucion;
	private String rutaRepo;

	@Id
	@Column(name = "ID_APLICACION")
	public String getIdAplicacion() {
		return idAplicacion;
	}

	public void setIdAplicacion(String idAplicacion) {
		this.idAplicacion = idAplicacion;
	}

	@Basic
	@Column(name = "CLIENTE")
	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	@Basic
	@Column(name = "OPERATORIA")
	public Integer getOperatoria() {
		return operatoria;
	}

	public void setOperatoria(Integer operatoria) {
		this.operatoria = operatoria;
	}

	@Basic
	@Column(name = "NOMBRE")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Basic
	@Column(name = "VERSION_ACTUAL")
	public String getVersionActual() {
		return versionActual;
	}

	public void setVersionActual(String versionActual) {
		this.versionActual = versionActual;
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
	@Column(name = "ESTATUS_ACTUAL")
	public String getEstatusActual() {
		return estatusActual;
	}

	public void setEstatusActual(String estatusActual) {
		this.estatusActual = estatusActual;
	}

	@Basic
	@Column(name = "TIPO_APLICACION")
	public String getTipoAplicacion() {
		return tipoAplicacion;
	}

	public void setTipoAplicacion(String tipoAplicacion) {
		this.tipoAplicacion = tipoAplicacion;
	}

	@Basic
	@Column(name = "PLATAFORMA")
	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	@Basic
	@Column(name = "RUTA_EJECUCION")
	public String getRutaEjecucion() {
		return rutaEjecucion;
	}

	public void setRutaEjecucion(String rutaEjecucion) {
		this.rutaEjecucion = rutaEjecucion;
	}

	@Basic
	@Column(name = "RUTA_REPO")
	public String getRutaRepo() {
		return rutaRepo;
	}

	public void setRutaRepo(String rutaRepo) {
		this.rutaRepo = rutaRepo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MgmtAplicacionDatosEntity that = (MgmtAplicacionDatosEntity) o;

		if (cliente != that.cliente) return false;
		if (idAplicacion != null ? !idAplicacion.equals(that.idAplicacion) : that.idAplicacion != null)
			return false;
		if (operatoria != null ? !operatoria.equals(that.operatoria) : that.operatoria != null)
			return false;
		if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
		if (versionActual != null ? !versionActual.equals(that.versionActual) : that.versionActual != null)
			return false;
		if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null)
			return false;
		if (estatusActual != null ? !estatusActual.equals(that.estatusActual) : that.estatusActual != null)
			return false;
		if (tipoAplicacion != null ? !tipoAplicacion.equals(that.tipoAplicacion) : that.tipoAplicacion != null)
			return false;
		if (plataforma != null ? !plataforma.equals(that.plataforma) : that.plataforma != null)
			return false;
		if (rutaEjecucion != null ? !rutaEjecucion.equals(that.rutaEjecucion) : that.rutaEjecucion != null)
			return false;
		if (rutaRepo != null ? !rutaRepo.equals(that.rutaRepo) : that.rutaRepo != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = idAplicacion != null ? idAplicacion.hashCode() : 0;
		result = 31 * result + cliente;
		result = 31 * result + (operatoria != null ? operatoria.hashCode() : 0);
		result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
		result = 31 * result + (versionActual != null ? versionActual.hashCode() : 0);
		result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
		result = 31 * result + (estatusActual != null ? estatusActual.hashCode() : 0);
		result = 31 * result + (tipoAplicacion != null ? tipoAplicacion.hashCode() : 0);
		result = 31 * result + (plataforma != null ? plataforma.hashCode() : 0);
		result = 31 * result + (rutaEjecucion != null ? rutaEjecucion.hashCode() : 0);
		result = 31 * result + (rutaRepo != null ? rutaRepo.hashCode() : 0);
		return result;
	}
}
