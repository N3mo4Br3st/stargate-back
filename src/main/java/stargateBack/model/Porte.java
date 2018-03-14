package stargateBack.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import stargateBack.model.Bandeau;
import stargateBack.model.Glyph;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Porte
 */
@javax.annotation.Generated(value = "stargateBack.codegen.languages.SpringCodegen", date = "2018-01-17T12:31:05.539Z")

public class Porte   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("bandeaux")
  private List<Bandeau> bandeaux = null;

  @JsonProperty("adresse")
  private List<Glyph> adresse = null;

  public Porte id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Porte name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "atlantis", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Porte bandeaux(List<Bandeau> bandeaux) {
    this.bandeaux = bandeaux;
    return this;
  }

  public Porte addBandeauxItem(Bandeau bandeauxItem) {
    if (this.bandeaux == null) {
      this.bandeaux = new ArrayList<Bandeau>();
    }
    this.bandeaux.add(bandeauxItem);
    return this;
  }

   /**
   * Get bandeaux
   * @return bandeaux
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Bandeau> getBandeaux() {
    return bandeaux;
  }

  public void setBandeaux(List<Bandeau> bandeaux) {
    this.bandeaux = bandeaux;
  }

  public Porte adresse(List<Glyph> adresse) {
    this.adresse = adresse;
    return this;
  }

  public Porte addAdresseItem(Glyph adresseItem) {
    if (this.adresse == null) {
      this.adresse = new ArrayList<Glyph>();
    }
    this.adresse.add(adresseItem);
    return this;
  }

   /**
   * Get adresse
   * @return adresse
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Glyph> getAdresse() {
    return adresse;
  }

  public void setAdresse(List<Glyph> adresse) {
    this.adresse = adresse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Porte porte = (Porte) o;
    return Objects.equals(this.id, porte.id) &&
        Objects.equals(this.name, porte.name) &&
        Objects.equals(this.bandeaux, porte.bandeaux) &&
        Objects.equals(this.adresse, porte.adresse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, bandeaux, adresse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Porte {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bandeaux: ").append(toIndentedString(bandeaux)).append("\n");
    sb.append("    adresse: ").append(toIndentedString(adresse)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

