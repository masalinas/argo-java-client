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
 * Header indicate a key-value request header to be used when fetching artifacts over HTTP
 */
@ApiModel(description = "Header indicate a key-value request header to be used when fetching artifacts over HTTP")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1Header {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  public IoArgoprojWorkflowV1alpha1Header name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name is the header name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is the header name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoArgoprojWorkflowV1alpha1Header value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value is the literal value to use for the header
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Value is the literal value to use for the header")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1Header ioArgoprojWorkflowV1alpha1Header = (IoArgoprojWorkflowV1alpha1Header) o;
    return Objects.equals(this.name, ioArgoprojWorkflowV1alpha1Header.name) &&
        Objects.equals(this.value, ioArgoprojWorkflowV1alpha1Header.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Header {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
