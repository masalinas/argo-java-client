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
import java.util.ArrayList;
import java.util.List;

/**
 * IoArgoprojWorkflowV1alpha1WorkflowRetryRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1WorkflowRetryRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("nodeFieldSelector")
  private String nodeFieldSelector = null;

  @SerializedName("parameters")
  private List<String> parameters = null;

  @SerializedName("restartSuccessful")
  private Boolean restartSuccessful = null;

  public IoArgoprojWorkflowV1alpha1WorkflowRetryRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowRetryRequest namespace(String namespace) {
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

  public IoArgoprojWorkflowV1alpha1WorkflowRetryRequest nodeFieldSelector(String nodeFieldSelector) {
    this.nodeFieldSelector = nodeFieldSelector;
    return this;
  }

   /**
   * Get nodeFieldSelector
   * @return nodeFieldSelector
  **/
  @ApiModelProperty(value = "")
  public String getNodeFieldSelector() {
    return nodeFieldSelector;
  }

  public void setNodeFieldSelector(String nodeFieldSelector) {
    this.nodeFieldSelector = nodeFieldSelector;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowRetryRequest parameters(List<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowRetryRequest addParametersItem(String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<String>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(value = "")
  public List<String> getParameters() {
    return parameters;
  }

  public void setParameters(List<String> parameters) {
    this.parameters = parameters;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowRetryRequest restartSuccessful(Boolean restartSuccessful) {
    this.restartSuccessful = restartSuccessful;
    return this;
  }

   /**
   * Get restartSuccessful
   * @return restartSuccessful
  **/
  @ApiModelProperty(value = "")
  public Boolean isRestartSuccessful() {
    return restartSuccessful;
  }

  public void setRestartSuccessful(Boolean restartSuccessful) {
    this.restartSuccessful = restartSuccessful;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1WorkflowRetryRequest ioArgoprojWorkflowV1alpha1WorkflowRetryRequest = (IoArgoprojWorkflowV1alpha1WorkflowRetryRequest) o;
    return Objects.equals(this.name, ioArgoprojWorkflowV1alpha1WorkflowRetryRequest.name) &&
        Objects.equals(this.namespace, ioArgoprojWorkflowV1alpha1WorkflowRetryRequest.namespace) &&
        Objects.equals(this.nodeFieldSelector, ioArgoprojWorkflowV1alpha1WorkflowRetryRequest.nodeFieldSelector) &&
        Objects.equals(this.parameters, ioArgoprojWorkflowV1alpha1WorkflowRetryRequest.parameters) &&
        Objects.equals(this.restartSuccessful, ioArgoprojWorkflowV1alpha1WorkflowRetryRequest.restartSuccessful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, nodeFieldSelector, parameters, restartSuccessful);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1WorkflowRetryRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    nodeFieldSelector: ").append(toIndentedString(nodeFieldSelector)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    restartSuccessful: ").append(toIndentedString(restartSuccessful)).append("\n");
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

