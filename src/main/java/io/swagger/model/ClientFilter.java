/*
 * Outcarcerate
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * ClientFilter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-09-24T19:29:11.667Z")
public class ClientFilter   {
  @JsonProperty("attorney_id")
  private String attorneyId = null;

  public ClientFilter attorneyId(String attorneyId) {
    this.attorneyId = attorneyId;
    return this;
  }

  /**
   * Get attorneyId
   * @return attorneyId
   **/
  @JsonProperty("attorney_id")
  @ApiModelProperty(value = "")
  public String getAttorneyId() {
    return attorneyId;
  }

  public void setAttorneyId(String attorneyId) {
    this.attorneyId = attorneyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientFilter clientFilter = (ClientFilter) o;
    return Objects.equals(this.attorneyId, clientFilter.attorneyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attorneyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientFilter {\n");
    
    sb.append("    attorneyId: ").append(toIndentedString(attorneyId)).append("\n");
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

