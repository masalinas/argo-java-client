/*
 * Argo Workflows API
 * Argo Workflows is an open source container-native workflow engine for orchestrating parallel jobs on Kubernetes. For more information, please see https://argo-workflows.readthedocs.io/en/release-3.5/
 *
 * OpenAPI spec version: VERSION
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.oferto.argo.client.model;

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

/**
 * IoArgoprojEventsV1alpha1Int64OrString
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1Int64OrString {
  @SerializedName("int64Val")
  private String int64Val = null;

  @SerializedName("strVal")
  private String strVal = null;

  @SerializedName("type")
  private String type = null;

  public IoArgoprojEventsV1alpha1Int64OrString int64Val(String int64Val) {
    this.int64Val = int64Val;
    return this;
  }

   /**
   * Get int64Val
   * @return int64Val
  **/
  @ApiModelProperty(value = "")
  public String getInt64Val() {
    return int64Val;
  }

  public void setInt64Val(String int64Val) {
    this.int64Val = int64Val;
  }

  public IoArgoprojEventsV1alpha1Int64OrString strVal(String strVal) {
    this.strVal = strVal;
    return this;
  }

   /**
   * Get strVal
   * @return strVal
  **/
  @ApiModelProperty(value = "")
  public String getStrVal() {
    return strVal;
  }

  public void setStrVal(String strVal) {
    this.strVal = strVal;
  }

  public IoArgoprojEventsV1alpha1Int64OrString type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1Int64OrString ioArgoprojEventsV1alpha1Int64OrString = (IoArgoprojEventsV1alpha1Int64OrString) o;
    return Objects.equals(this.int64Val, ioArgoprojEventsV1alpha1Int64OrString.int64Val) &&
        Objects.equals(this.strVal, ioArgoprojEventsV1alpha1Int64OrString.strVal) &&
        Objects.equals(this.type, ioArgoprojEventsV1alpha1Int64OrString.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(int64Val, strVal, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1Int64OrString {\n");
    
    sb.append("    int64Val: ").append(toIndentedString(int64Val)).append("\n");
    sb.append("    strVal: ").append(toIndentedString(strVal)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

