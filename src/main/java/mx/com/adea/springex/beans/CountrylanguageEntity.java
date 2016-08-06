package mx.com.adea.springex.beans;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Crated by Victor Santillán on 06/08/2016.
 * visantillan@adeamexico.com.mx
 */
@Entity
@Table(name = "countrylanguage", schema = "world", catalog = "")
@IdClass(CountrylanguageEntityPK.class)
public class CountrylanguageEntity {
  private String countryCode;
  private String language;
  private boolean isOfficial;
  private double percentage;

  @Id
  @Column(name = "CountryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  @Id
  @Column(name = "Language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  @Basic
  @Column(name = "IsOfficial")
  public boolean getIsOfficial() {
    return isOfficial;
  }

  public void setIsOfficial(boolean isOfficial) {
    this.isOfficial = isOfficial;
  }

  @Basic
  @Column(name = "Percentage")
  public double getPercentage() {
    return percentage;
  }

  public void setPercentage(double percentage) {
    this.percentage = percentage;
  }
}
