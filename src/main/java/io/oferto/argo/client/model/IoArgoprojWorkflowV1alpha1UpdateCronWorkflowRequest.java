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

import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1CronWorkflow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * IoArgoprojWorkflowV1alpha1UpdateCronWorkflowRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1UpdateCronWorkflowRequest {
  @SerializedName("cronWorkflow")
  private IoArgoprojWorkflowV1alpha1CronWorkflow cronWorkflow = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

  public IoArgoprojWorkflowV1alpha1UpdateCronWorkflowRequest cronWorkflow(IoArgoprojWorkflowV1alpha1CronWorkflow cronWorkflow) {
    this.cronWorkflow = cronWorkflow;
    return this;
  }

   /**
   * Get cronWorkflow
   * @return cronWorkflow
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojWorkflowV1alpha1CronWorkflow getCronWorkflow() {
    return cronWorkflow;
  }

  public void setCronWorkflow(IoArgoprojWorkflowV1alpha1CronWorkflow cronWorkflow) {
    this.cronWorkflow = cronWorkflow;
  }

  public IoArgoprojWorkflowV1alpha1UpdateCronWorkflowRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * DEPRECATED: This field is ignored.
   * @return name
  **/
  @ApiModelProperty(value = "DEPRECATED: This field is ignored.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoArgoprojWorkflowV1alpha1UpdateCronWorkflowRequest namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @ApiModelProperty(value = "")
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
    IoArgoprojWorkflowV1alpha1UpdateCronWorkflowRequest ioArgoprojWorkflowV1alpha1UpdateCronWorkflowRequest = (IoArgoprojWorkflowV1alpha1UpdateCronWorkflowRequest) o;
    return Objects.equals(this.cronWorkflow, ioArgoprojWorkflowV1alpha1UpdateCronWorkflowRequest.cronWorkflow) &&
        Objects.equals(this.name, ioArgoprojWorkflowV1alpha1UpdateCronWorkflowRequest.name) &&
        Objects.equals(this.namespace, ioArgoprojWorkflowV1alpha1UpdateCronWorkflowRequest.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cronWorkflow, name, namespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1UpdateCronWorkflowRequest {\n");
    
    sb.append("    cronWorkflow: ").append(toIndentedString(cronWorkflow)).append("\n");
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

