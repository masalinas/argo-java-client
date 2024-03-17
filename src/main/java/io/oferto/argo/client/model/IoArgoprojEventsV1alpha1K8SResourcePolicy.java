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

import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1Backoff;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IoArgoprojEventsV1alpha1K8SResourcePolicy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1K8SResourcePolicy {
  @SerializedName("backoff")
  private IoArgoprojEventsV1alpha1Backoff backoff = null;

  @SerializedName("errorOnBackoffTimeout")
  private Boolean errorOnBackoffTimeout = null;

  @SerializedName("labels")
  private Map<String, String> labels = null;

  public IoArgoprojEventsV1alpha1K8SResourcePolicy backoff(IoArgoprojEventsV1alpha1Backoff backoff) {
    this.backoff = backoff;
    return this;
  }

   /**
   * Get backoff
   * @return backoff
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojEventsV1alpha1Backoff getBackoff() {
    return backoff;
  }

  public void setBackoff(IoArgoprojEventsV1alpha1Backoff backoff) {
    this.backoff = backoff;
  }

  public IoArgoprojEventsV1alpha1K8SResourcePolicy errorOnBackoffTimeout(Boolean errorOnBackoffTimeout) {
    this.errorOnBackoffTimeout = errorOnBackoffTimeout;
    return this;
  }

   /**
   * Get errorOnBackoffTimeout
   * @return errorOnBackoffTimeout
  **/
  @ApiModelProperty(value = "")
  public Boolean isErrorOnBackoffTimeout() {
    return errorOnBackoffTimeout;
  }

  public void setErrorOnBackoffTimeout(Boolean errorOnBackoffTimeout) {
    this.errorOnBackoffTimeout = errorOnBackoffTimeout;
  }

  public IoArgoprojEventsV1alpha1K8SResourcePolicy labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public IoArgoprojEventsV1alpha1K8SResourcePolicy putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1K8SResourcePolicy ioArgoprojEventsV1alpha1K8SResourcePolicy = (IoArgoprojEventsV1alpha1K8SResourcePolicy) o;
    return Objects.equals(this.backoff, ioArgoprojEventsV1alpha1K8SResourcePolicy.backoff) &&
        Objects.equals(this.errorOnBackoffTimeout, ioArgoprojEventsV1alpha1K8SResourcePolicy.errorOnBackoffTimeout) &&
        Objects.equals(this.labels, ioArgoprojEventsV1alpha1K8SResourcePolicy.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backoff, errorOnBackoffTimeout, labels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1K8SResourcePolicy {\n");
    
    sb.append("    backoff: ").append(toIndentedString(backoff)).append("\n");
    sb.append("    errorOnBackoffTimeout: ").append(toIndentedString(errorOnBackoffTimeout)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
