package stargateBack.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Led
 */
@javax.annotation.Generated(value = "stargateBack.codegen.languages.SpringCodegen", date = "2018-01-17T12:31:05.539Z")

public class Led   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("groupe")
  private Integer groupe = null;

  @JsonProperty("niveauRouge")
  private Integer niveauRouge = null;

  @JsonProperty("niveauVert")
  private Integer niveauVert = null;

  @JsonProperty("niveauBleu")
  private Integer niveauBleu = null;
  
@SuppressWarnings("unused")
private Led() {
	
}
  
  public Led(Integer id,Integer groupe,Integer niveauRouge,Integer niveauVert,Integer niveauBleu){
	  this.id=id;
	  this.groupe=groupe;
	  this.niveauRouge=niveauRouge;
	  this.niveauVert=niveauVert;
	  this.niveauBleu=niveauBleu;
  }
  
  public Led id(Integer id) {
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

  public Led groupe(Integer groupe) {
    this.groupe = groupe;
    return this;
  }

   /**
   * Get groupe
   * @return groupe
  **/
  @ApiModelProperty(value = "")


  public Integer getGroupe() {
    return groupe;
  }

  public void setGroupe(Integer groupe) {
    this.groupe = groupe;
  }

  public Led niveauRouge(Integer niveauRouge) {
    this.niveauRouge = niveauRouge;
    return this;
  }

   /**
   * Get niveauRouge
   * @return niveauRouge
  **/
  @ApiModelProperty(value = "")


  public Integer getNiveauRouge() {
    return niveauRouge;
  }

  public void setNiveauRouge(Integer niveauRouge) {
    this.niveauRouge = niveauRouge;
  }

  public Led niveauVert(Integer niveauVert) {
    this.niveauVert = niveauVert;
    return this;
  }

   /**
   * Get niveauVert
   * @return niveauVert
  **/
  @ApiModelProperty(value = "")


  public Integer getNiveauVert() {
    return niveauVert;
  }

  public void setNiveauVert(Integer niveauVert) {
    this.niveauVert = niveauVert;
  }

  public Led niveauBleu(Integer niveauBleu) {
    this.niveauBleu = niveauBleu;
    return this;
  }

   /**
   * Get niveaubleu
   * @return niveaubleu
  **/
  @ApiModelProperty(value = "")


  public Integer getNiveauBleu() {
    return niveauBleu;
  }

  public void setNiveauBleu(Integer niveauBleu) {
    this.niveauBleu = niveauBleu;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Led led = (Led) o;
    return Objects.equals(this.id, led.id) &&
        Objects.equals(this.groupe, led.groupe) &&
        Objects.equals(this.niveauRouge, led.niveauRouge) &&
        Objects.equals(this.niveauVert, led.niveauVert) &&
        Objects.equals(this.niveauBleu, led.niveauBleu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupe, niveauRouge, niveauVert, niveauBleu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Led {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupe: ").append(toIndentedString(groupe)).append("\n");
    sb.append("    niveauRouge: ").append(toIndentedString(niveauRouge)).append("\n");
    sb.append("    niveauVert: ").append(toIndentedString(niveauVert)).append("\n");
    sb.append("    niveaubleu: ").append(toIndentedString(niveauBleu)).append("\n");
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

