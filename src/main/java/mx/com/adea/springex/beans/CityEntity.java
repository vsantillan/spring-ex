package mx.com.adea.springex.beans;

import javax.persistence.*;

/**
 * Crated by Victor Santillán on 06/08/2016.
 * visantillan@adeamexico.com.mx
 */
@Entity
@Table(name = "city", schema = "world", catalog = "")
public class CityEntity {
  private int id;
  private String name;
  private String countryCode;
  private String district;
  private int population;

  @Id
  @Column(name = "ID")
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Basic
  @Column(name = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Basic
  @Column(name = "CountryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  @Basic
  @Column(name = "District")
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  @Basic
  @Column(name = "Population")
  public int getPopulation() {
    return population;
  }

  public void setPopulation(int population) {
    this.population = population;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    CityEntity that = (CityEntity) o;

    if (id != that.id) return false;
    if (population != that.population) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null)
      return false;
    if (district != null ? !district.equals(that.district) : that.district != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
    result = 31 * result + (district != null ? district.hashCode() : 0);
    result = 31 * result + population;
    return result;
  }
}
