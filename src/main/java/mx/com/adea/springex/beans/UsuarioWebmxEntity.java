package mx.com.adea.springex.beans;

import javax.persistence.*;
import java.sql.Date;

/**
 * Crated by Victor Santillán on 06/08/2016.
 * visantillan@adeamexico.com.mx
 */
@Entity
@Table(name = "usuario_webmx", schema = "world", catalog = "")
public class UsuarioWebmxEntity {
  private String login;
  private String password;
  private String nombre;
  private double cliente;
  private String email;
  private Date fechaalta;
  private Date fechabaja;
  private String status;
  private double intentos;
  private Date fecharevocado;
  private Date fechaVigencia;
  private Integer noAcceso;
  private String apellidoPaterno;
  private String apellidoMaterno;
  private Integer area;
  private Date fechaCaducidadPw;

  @Id
  @Column(name = "LOGIN")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  @Basic
  @Column(name = "PASSWORD")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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
  @Column(name = "CLIENTE")
  public double getCliente() {
    return cliente;
  }

  public void setCliente(double cliente) {
    this.cliente = cliente;
  }

  @Basic
  @Column(name = "EMAIL")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Basic
  @Column(name = "FECHAALTA")
  public Date getFechaalta() {
    return fechaalta;
  }

  public void setFechaalta(Date fechaalta) {
    this.fechaalta = fechaalta;
  }

  @Basic
  @Column(name = "FECHABAJA")
  public Date getFechabaja() {
    return fechabaja;
  }

  public void setFechabaja(Date fechabaja) {
    this.fechabaja = fechabaja;
  }

  @Basic
  @Column(name = "STATUS")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Basic
  @Column(name = "INTENTOS")
  public double getIntentos() {
    return intentos;
  }

  public void setIntentos(double intentos) {
    this.intentos = intentos;
  }

  @Basic
  @Column(name = "FECHAREVOCADO")
  public Date getFecharevocado() {
    return fecharevocado;
  }

  public void setFecharevocado(Date fecharevocado) {
    this.fecharevocado = fecharevocado;
  }

  @Basic
  @Column(name = "FECHA_VIGENCIA")
  public Date getFechaVigencia() {
    return fechaVigencia;
  }

  public void setFechaVigencia(Date fechaVigencia) {
    this.fechaVigencia = fechaVigencia;
  }

  @Basic
  @Column(name = "NO_ACCESO")
  public Integer getNoAcceso() {
    return noAcceso;
  }

  public void setNoAcceso(Integer noAcceso) {
    this.noAcceso = noAcceso;
  }

  @Basic
  @Column(name = "APELLIDO_PATERNO")
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  @Basic
  @Column(name = "APELLIDO_MATERNO")
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  @Basic
  @Column(name = "AREA")
  public Integer getArea() {
    return area;
  }

  public void setArea(Integer area) {
    this.area = area;
  }

  @Basic
  @Column(name = "FECHA_CADUCIDAD_PW")
  public Date getFechaCaducidadPw() {
    return fechaCaducidadPw;
  }

  public void setFechaCaducidadPw(Date fechaCaducidadPw) {
    this.fechaCaducidadPw = fechaCaducidadPw;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    UsuarioWebmxEntity that = (UsuarioWebmxEntity) o;

    if (Double.compare(that.cliente, cliente) != 0) return false;
    if (Double.compare(that.intentos, intentos) != 0) return false;
    if (login != null ? !login.equals(that.login) : that.login != null) return false;
    if (password != null ? !password.equals(that.password) : that.password != null) return false;
    if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
    if (email != null ? !email.equals(that.email) : that.email != null) return false;
    if (fechaalta != null ? !fechaalta.equals(that.fechaalta) : that.fechaalta != null)
      return false;
    if (fechabaja != null ? !fechabaja.equals(that.fechabaja) : that.fechabaja != null)
      return false;
    if (status != null ? !status.equals(that.status) : that.status != null) return false;
    if (fecharevocado != null ? !fecharevocado.equals(that.fecharevocado) : that.fecharevocado != null)
      return false;
    if (fechaVigencia != null ? !fechaVigencia.equals(that.fechaVigencia) : that.fechaVigencia != null)
      return false;
    if (noAcceso != null ? !noAcceso.equals(that.noAcceso) : that.noAcceso != null) return false;
    if (apellidoPaterno != null ? !apellidoPaterno.equals(that.apellidoPaterno) : that.apellidoPaterno != null)
      return false;
    if (apellidoMaterno != null ? !apellidoMaterno.equals(that.apellidoMaterno) : that.apellidoMaterno != null)
      return false;
    if (area != null ? !area.equals(that.area) : that.area != null) return false;
    if (fechaCaducidadPw != null ? !fechaCaducidadPw.equals(that.fechaCaducidadPw) : that.fechaCaducidadPw != null)
      return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = login != null ? login.hashCode() : 0;
    result = 31 * result + (password != null ? password.hashCode() : 0);
    result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
    temp = Double.doubleToLongBits(cliente);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    result = 31 * result + (email != null ? email.hashCode() : 0);
    result = 31 * result + (fechaalta != null ? fechaalta.hashCode() : 0);
    result = 31 * result + (fechabaja != null ? fechabaja.hashCode() : 0);
    result = 31 * result + (status != null ? status.hashCode() : 0);
    temp = Double.doubleToLongBits(intentos);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    result = 31 * result + (fecharevocado != null ? fecharevocado.hashCode() : 0);
    result = 31 * result + (fechaVigencia != null ? fechaVigencia.hashCode() : 0);
    result = 31 * result + (noAcceso != null ? noAcceso.hashCode() : 0);
    result = 31 * result + (apellidoPaterno != null ? apellidoPaterno.hashCode() : 0);
    result = 31 * result + (apellidoMaterno != null ? apellidoMaterno.hashCode() : 0);
    result = 31 * result + (area != null ? area.hashCode() : 0);
    result = 31 * result + (fechaCaducidadPw != null ? fechaCaducidadPw.hashCode() : 0);
    return result;
  }
}
