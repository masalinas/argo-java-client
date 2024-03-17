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
 * Mutex holds Mutex configuration
 */
@ApiModel(description = "Mutex holds Mutex configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1Mutex {
  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

  public IoArgoprojWorkflowV1alpha1Mutex name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of the mutex
   * @return name
  **/
  @ApiModelProperty(value = "name of the mutex")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoArgoprojWorkflowV1alpha1Mutex namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace is the namespace of the mutex, default: [namespace of workflow]
   * @return namespace
  **/
  @ApiModelProperty(value = "Namespace is the namespace of the mutex, default: [namespace of workflow]")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1Mutex ioArgoprojWorkflowV1alpha1Mutex = (IoArgoprojWorkflowV1alpha1Mutex) o;
    return Objects.equals(this.name, ioArgoprojWorkflowV1alpha1Mutex.name) &&
        Objects.equals(this.namespace, ioArgoprojWorkflowV1alpha1Mutex.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Mutex {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
