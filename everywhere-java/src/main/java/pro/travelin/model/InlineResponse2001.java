/*
 * Everywhere
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2019-09-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package pro.travelin.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import pro.travelin.model.ProTravelinCreateIteneraryOutputIteneraryMember;

/**
 * InlineResponse2001
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-14T09:31:17.066+02:00[Europe/Rome]")
public class InlineResponse2001 {
  public static final String SERIALIZED_NAME_ITENERARY = "itenerary";
  @SerializedName(SERIALIZED_NAME_ITENERARY)
  private ProTravelinCreateIteneraryOutputIteneraryMember itenerary;


  public InlineResponse2001 itenerary(ProTravelinCreateIteneraryOutputIteneraryMember itenerary) {
    
    this.itenerary = itenerary;
    return this;
  }

   /**
   * Get itenerary
   * @return itenerary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProTravelinCreateIteneraryOutputIteneraryMember getItenerary() {
    return itenerary;
  }



  public void setItenerary(ProTravelinCreateIteneraryOutputIteneraryMember itenerary) {
    this.itenerary = itenerary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.itenerary, inlineResponse2001.itenerary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itenerary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    sb.append("    itenerary: ").append(toIndentedString(itenerary)).append("\n");
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

