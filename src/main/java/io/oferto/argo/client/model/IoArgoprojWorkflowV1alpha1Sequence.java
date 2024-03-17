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
 * Sequence expands a workflow step into numeric range
 */
@ApiModel(description = "Sequence expands a workflow step into numeric range")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1Sequence {
  @SerializedName("count")
  private String count = null;

  @SerializedName("end")
  private String end = null;

  @SerializedName("format")
  private String format = null;

  @SerializedName("start")
  private String start = null;

  public IoArgoprojWorkflowV1alpha1Sequence count(String count) {
    this.count = count;
    return this;
  }

   /**
   * Count is number of elements in the sequence (default: 0). Not to be used with end
   * @return count
  **/
  @ApiModelProperty(value = "Count is number of elements in the sequence (default: 0). Not to be used with end")
  public String getCount() {
    return count;
  }

  public void setCount(String count) {
    this.count = count;
  }

  public IoArgoprojWorkflowV1alpha1Sequence end(String end) {
    this.end = end;
    return this;
  }

   /**
   * Number at which to end the sequence (default: 0). Not to be used with Count
   * @return end
  **/
  @ApiModelProperty(value = "Number at which to end the sequence (default: 0). Not to be used with Count")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public IoArgoprojWorkflowV1alpha1Sequence format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Format is a printf format string to format the value in the sequence
   * @return format
  **/
  @ApiModelProperty(value = "Format is a printf format string to format the value in the sequence")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public IoArgoprojWorkflowV1alpha1Sequence start(String start) {
    this.start = start;
    return this;
  }

   /**
   * Number at which to start the sequence (default: 0)
   * @return start
  **/
  @ApiModelProperty(value = "Number at which to start the sequence (default: 0)")
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1Sequence ioArgoprojWorkflowV1alpha1Sequence = (IoArgoprojWorkflowV1alpha1Sequence) o;
    return Objects.equals(this.count, ioArgoprojWorkflowV1alpha1Sequence.count) &&
        Objects.equals(this.end, ioArgoprojWorkflowV1alpha1Sequence.end) &&
        Objects.equals(this.format, ioArgoprojWorkflowV1alpha1Sequence.format) &&
        Objects.equals(this.start, ioArgoprojWorkflowV1alpha1Sequence.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, end, format, start);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Sequence {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

