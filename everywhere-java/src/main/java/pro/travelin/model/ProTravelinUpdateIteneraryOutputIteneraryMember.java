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
import org.threeten.bp.OffsetDateTime;

/**
 * ProTravelinUpdateIteneraryOutputIteneraryMember
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-14T09:31:17.066+02:00[Europe/Rome]")
public class ProTravelinUpdateIteneraryOutputIteneraryMember {
  public static final String SERIALIZED_NAME_ITENERARY_ID = "iteneraryId";
  @SerializedName(SERIALIZED_NAME_ITENERARY_ID)
  private String iteneraryId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;


  public ProTravelinUpdateIteneraryOutputIteneraryMember iteneraryId(String iteneraryId) {
    
    this.iteneraryId = iteneraryId;
    return this;
  }

   /**
   * Get iteneraryId
   * @return iteneraryId
  **/
  @ApiModelProperty(required = true, value = "")

  public String getIteneraryId() {
    return iteneraryId;
  }



  public void setIteneraryId(String iteneraryId) {
    this.iteneraryId = iteneraryId;
  }


  public ProTravelinUpdateIteneraryOutputIteneraryMember name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }



  public void setName(String name) {
    this.name = name;
  }


  public ProTravelinUpdateIteneraryOutputIteneraryMember description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }



  public void setDescription(String description) {
    this.description = description;
  }


  public ProTravelinUpdateIteneraryOutputIteneraryMember startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartTime() {
    return startTime;
  }



  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public ProTravelinUpdateIteneraryOutputIteneraryMember endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndTime() {
    return endTime;
  }



  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProTravelinUpdateIteneraryOutputIteneraryMember proTravelinUpdateIteneraryOutputIteneraryMember = (ProTravelinUpdateIteneraryOutputIteneraryMember) o;
    return Objects.equals(this.iteneraryId, proTravelinUpdateIteneraryOutputIteneraryMember.iteneraryId) &&
        Objects.equals(this.name, proTravelinUpdateIteneraryOutputIteneraryMember.name) &&
        Objects.equals(this.description, proTravelinUpdateIteneraryOutputIteneraryMember.description) &&
        Objects.equals(this.startTime, proTravelinUpdateIteneraryOutputIteneraryMember.startTime) &&
        Objects.equals(this.endTime, proTravelinUpdateIteneraryOutputIteneraryMember.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iteneraryId, name, description, startTime, endTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProTravelinUpdateIteneraryOutputIteneraryMember {\n");
    sb.append("    iteneraryId: ").append(toIndentedString(iteneraryId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

