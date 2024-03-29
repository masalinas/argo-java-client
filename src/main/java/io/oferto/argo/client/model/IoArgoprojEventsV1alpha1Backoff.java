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

import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1Amount;
import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1Int64OrString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * IoArgoprojEventsV1alpha1Backoff
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1Backoff {
  @SerializedName("duration")
  private IoArgoprojEventsV1alpha1Int64OrString duration = null;

  @SerializedName("factor")
  private IoArgoprojEventsV1alpha1Amount factor = null;

  @SerializedName("jitter")
  private IoArgoprojEventsV1alpha1Amount jitter = null;

  @SerializedName("steps")
  private Integer steps = null;

  public IoArgoprojEventsV1alpha1Backoff duration(IoArgoprojEventsV1alpha1Int64OrString duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojEventsV1alpha1Int64OrString getDuration() {
    return duration;
  }

  public void setDuration(IoArgoprojEventsV1alpha1Int64OrString duration) {
    this.duration = duration;
  }

  public IoArgoprojEventsV1alpha1Backoff factor(IoArgoprojEventsV1alpha1Amount factor) {
    this.factor = factor;
    return this;
  }

   /**
   * Get factor
   * @return factor
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojEventsV1alpha1Amount getFactor() {
    return factor;
  }

  public void setFactor(IoArgoprojEventsV1alpha1Amount factor) {
    this.factor = factor;
  }

  public IoArgoprojEventsV1alpha1Backoff jitter(IoArgoprojEventsV1alpha1Amount jitter) {
    this.jitter = jitter;
    return this;
  }

   /**
   * Get jitter
   * @return jitter
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojEventsV1alpha1Amount getJitter() {
    return jitter;
  }

  public void setJitter(IoArgoprojEventsV1alpha1Amount jitter) {
    this.jitter = jitter;
  }

  public IoArgoprojEventsV1alpha1Backoff steps(Integer steps) {
    this.steps = steps;
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @ApiModelProperty(value = "")
  public Integer getSteps() {
    return steps;
  }

  public void setSteps(Integer steps) {
    this.steps = steps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1Backoff ioArgoprojEventsV1alpha1Backoff = (IoArgoprojEventsV1alpha1Backoff) o;
    return Objects.equals(this.duration, ioArgoprojEventsV1alpha1Backoff.duration) &&
        Objects.equals(this.factor, ioArgoprojEventsV1alpha1Backoff.factor) &&
        Objects.equals(this.jitter, ioArgoprojEventsV1alpha1Backoff.jitter) &&
        Objects.equals(this.steps, ioArgoprojEventsV1alpha1Backoff.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, factor, jitter, steps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1Backoff {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    jitter: ").append(toIndentedString(jitter)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

