package stargateBack.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonCreator;
import stargateBack.model.Led;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Bandeau
 */
@javax.annotation.Generated(value = "stargateBack.codegen.languages.SpringCodegen", date = "2018-01-17T12:31:05.539Z")

public class Bandeau   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("leds")
  private List<Led> leds = null;

  public Bandeau id(Integer id) {
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

  public Bandeau name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "glyphs", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Bandeau leds(List<Led> leds) {
    this.leds = leds;
    return this;
  }

  public Bandeau addLedsItem(Led ledsItem) {
    if (this.leds == null) {
      this.leds = new ArrayList<Led>();
    }
    this.leds.add(ledsItem);
    return this;
  }

   /**
   * Get leds
   * @return leds
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Led> getLeds() {
    return leds;
  }

  public void setLeds(List<Led> leds) {
    this.leds = leds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bandeau bandeau = (Bandeau) o;
    return Objects.equals(this.id, bandeau.id) &&
        Objects.equals(this.name, bandeau.name) &&
        Objects.equals(this.leds, bandeau.leds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, leds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bandeau {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    leds: ").append(toIndentedString(leds)).append("\n");
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

