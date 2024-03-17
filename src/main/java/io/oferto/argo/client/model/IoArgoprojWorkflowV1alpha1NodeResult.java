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

import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1Outputs;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * IoArgoprojWorkflowV1alpha1NodeResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1NodeResult {
  @SerializedName("message")
  private String message = null;

  @SerializedName("outputs")
  private IoArgoprojWorkflowV1alpha1Outputs outputs = null;

  @SerializedName("phase")
  private String phase = null;

  @SerializedName("progress")
  private String progress = null;

  public IoArgoprojWorkflowV1alpha1NodeResult message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoArgoprojWorkflowV1alpha1NodeResult outputs(IoArgoprojWorkflowV1alpha1Outputs outputs) {
    this.outputs = outputs;
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojWorkflowV1alpha1Outputs getOutputs() {
    return outputs;
  }

  public void setOutputs(IoArgoprojWorkflowV1alpha1Outputs outputs) {
    this.outputs = outputs;
  }

  public IoArgoprojWorkflowV1alpha1NodeResult phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @ApiModelProperty(value = "")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public IoArgoprojWorkflowV1alpha1NodeResult progress(String progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @ApiModelProperty(value = "")
  public String getProgress() {
    return progress;
  }

  public void setProgress(String progress) {
    this.progress = progress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1NodeResult ioArgoprojWorkflowV1alpha1NodeResult = (IoArgoprojWorkflowV1alpha1NodeResult) o;
    return Objects.equals(this.message, ioArgoprojWorkflowV1alpha1NodeResult.message) &&
        Objects.equals(this.outputs, ioArgoprojWorkflowV1alpha1NodeResult.outputs) &&
        Objects.equals(this.phase, ioArgoprojWorkflowV1alpha1NodeResult.phase) &&
        Objects.equals(this.progress, ioArgoprojWorkflowV1alpha1NodeResult.progress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, outputs, phase, progress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1NodeResult {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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
