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

import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1Artifact;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1Parameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Arguments to a template
 */
@ApiModel(description = "Arguments to a template")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1Arguments {
  @SerializedName("artifacts")
  private List<IoArgoprojWorkflowV1alpha1Artifact> artifacts = null;

  @SerializedName("parameters")
  private List<IoArgoprojWorkflowV1alpha1Parameter> parameters = null;

  public IoArgoprojWorkflowV1alpha1Arguments artifacts(List<IoArgoprojWorkflowV1alpha1Artifact> artifacts) {
    this.artifacts = artifacts;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1Arguments addArtifactsItem(IoArgoprojWorkflowV1alpha1Artifact artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new ArrayList<IoArgoprojWorkflowV1alpha1Artifact>();
    }
    this.artifacts.add(artifactsItem);
    return this;
  }

   /**
   * Artifacts is the list of artifacts to pass to the template or workflow
   * @return artifacts
  **/
  @ApiModelProperty(value = "Artifacts is the list of artifacts to pass to the template or workflow")
  public List<IoArgoprojWorkflowV1alpha1Artifact> getArtifacts() {
    return artifacts;
  }

  public void setArtifacts(List<IoArgoprojWorkflowV1alpha1Artifact> artifacts) {
    this.artifacts = artifacts;
  }

  public IoArgoprojWorkflowV1alpha1Arguments parameters(List<IoArgoprojWorkflowV1alpha1Parameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1Arguments addParametersItem(IoArgoprojWorkflowV1alpha1Parameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<IoArgoprojWorkflowV1alpha1Parameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Parameters is the list of parameters to pass to the template or workflow
   * @return parameters
  **/
  @ApiModelProperty(value = "Parameters is the list of parameters to pass to the template or workflow")
  public List<IoArgoprojWorkflowV1alpha1Parameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<IoArgoprojWorkflowV1alpha1Parameter> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1Arguments ioArgoprojWorkflowV1alpha1Arguments = (IoArgoprojWorkflowV1alpha1Arguments) o;
    return Objects.equals(this.artifacts, ioArgoprojWorkflowV1alpha1Arguments.artifacts) &&
        Objects.equals(this.parameters, ioArgoprojWorkflowV1alpha1Arguments.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifacts, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Arguments {\n");
    
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
