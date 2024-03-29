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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Histogram is a Histogram prometheus metric
 */
@ApiModel(description = "Histogram is a Histogram prometheus metric")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1Histogram {
  @SerializedName("buckets")
  private List<BigDecimal> buckets = new ArrayList<BigDecimal>();

  @SerializedName("value")
  private String value = null;

  public IoArgoprojWorkflowV1alpha1Histogram buckets(List<BigDecimal> buckets) {
    this.buckets = buckets;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1Histogram addBucketsItem(BigDecimal bucketsItem) {
    this.buckets.add(bucketsItem);
    return this;
  }

   /**
   * Buckets is a list of bucket divisors for the histogram
   * @return buckets
  **/
  @ApiModelProperty(required = true, value = "Buckets is a list of bucket divisors for the histogram")
  public List<BigDecimal> getBuckets() {
    return buckets;
  }

  public void setBuckets(List<BigDecimal> buckets) {
    this.buckets = buckets;
  }

  public IoArgoprojWorkflowV1alpha1Histogram value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value is the value of the metric
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Value is the value of the metric")
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
    IoArgoprojWorkflowV1alpha1Histogram ioArgoprojWorkflowV1alpha1Histogram = (IoArgoprojWorkflowV1alpha1Histogram) o;
    return Objects.equals(this.buckets, ioArgoprojWorkflowV1alpha1Histogram.buckets) &&
        Objects.equals(this.value, ioArgoprojWorkflowV1alpha1Histogram.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buckets, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Histogram {\n");
    
    sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
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

