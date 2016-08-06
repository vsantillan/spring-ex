package mx.com.adea.springex.beans;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Crated by Victor Santillán on 06/08/2016.
 * visantillan@adeamexico.com.mx
 */
public class CountrylanguageEntityPK implements Serializable {
  private String countryCode;
  private String language;

  @Column(name = "CountryCode")
  @Id
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  @Column(name = "Language")
  @Id
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    CountrylanguageEntityPK that = (CountrylanguageEntityPK) o;

    if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null)
      return false;
    if (language != null ? !language.equals(that.language) : that.language != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = countryCode != null ? countryCode.hashCode() : 0;
    result = 31 * result + (language != null ? language.hashCode() : 0);
    return result;
  }
}
