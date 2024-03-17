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

import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1ArtifactLocation;
import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1TriggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IoArgoprojEventsV1alpha1ArgoWorkflowTrigger
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1ArgoWorkflowTrigger {
  @SerializedName("args")
  private List<String> args = null;

  @SerializedName("operation")
  private String operation = null;

  @SerializedName("parameters")
  private List<IoArgoprojEventsV1alpha1TriggerParameter> parameters = null;

  @SerializedName("source")
  private IoArgoprojEventsV1alpha1ArtifactLocation source = null;

  public IoArgoprojEventsV1alpha1ArgoWorkflowTrigger args(List<String> args) {
    this.args = args;
    return this;
  }

  public IoArgoprojEventsV1alpha1ArgoWorkflowTrigger addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<String>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @ApiModelProperty(value = "")
  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public IoArgoprojEventsV1alpha1ArgoWorkflowTrigger operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(value = "")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public IoArgoprojEventsV1alpha1ArgoWorkflowTrigger parameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojEventsV1alpha1ArgoWorkflowTrigger addParametersItem(IoArgoprojEventsV1alpha1TriggerParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<IoArgoprojEventsV1alpha1TriggerParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(value = "")
  public List<IoArgoprojEventsV1alpha1TriggerParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    this.parameters = parameters;
  }

  public IoArgoprojEventsV1alpha1ArgoWorkflowTrigger source(IoArgoprojEventsV1alpha1ArtifactLocation source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojEventsV1alpha1ArtifactLocation getSource() {
    return source;
  }

  public void setSource(IoArgoprojEventsV1alpha1ArtifactLocation source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1ArgoWorkflowTrigger ioArgoprojEventsV1alpha1ArgoWorkflowTrigger = (IoArgoprojEventsV1alpha1ArgoWorkflowTrigger) o;
    return Objects.equals(this.args, ioArgoprojEventsV1alpha1ArgoWorkflowTrigger.args) &&
        Objects.equals(this.operation, ioArgoprojEventsV1alpha1ArgoWorkflowTrigger.operation) &&
        Objects.equals(this.parameters, ioArgoprojEventsV1alpha1ArgoWorkflowTrigger.parameters) &&
        Objects.equals(this.source, ioArgoprojEventsV1alpha1ArgoWorkflowTrigger.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, operation, parameters, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1ArgoWorkflowTrigger {\n");
    
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

