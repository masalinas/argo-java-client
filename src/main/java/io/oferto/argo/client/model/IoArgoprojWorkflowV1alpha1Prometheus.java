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

import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1Counter;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1Gauge;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1Histogram;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1MetricLabel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Prometheus is a prometheus metric to be emitted
 */
@ApiModel(description = "Prometheus is a prometheus metric to be emitted")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1Prometheus {
  @SerializedName("counter")
  private IoArgoprojWorkflowV1alpha1Counter counter = null;

  @SerializedName("gauge")
  private IoArgoprojWorkflowV1alpha1Gauge gauge = null;

  @SerializedName("help")
  private String help = null;

  @SerializedName("histogram")
  private IoArgoprojWorkflowV1alpha1Histogram histogram = null;

  @SerializedName("labels")
  private List<IoArgoprojWorkflowV1alpha1MetricLabel> labels = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("when")
  private String when = null;

  public IoArgoprojWorkflowV1alpha1Prometheus counter(IoArgoprojWorkflowV1alpha1Counter counter) {
    this.counter = counter;
    return this;
  }

   /**
   * Counter is a counter metric
   * @return counter
  **/
  @ApiModelProperty(value = "Counter is a counter metric")
  public IoArgoprojWorkflowV1alpha1Counter getCounter() {
    return counter;
  }

  public void setCounter(IoArgoprojWorkflowV1alpha1Counter counter) {
    this.counter = counter;
  }

  public IoArgoprojWorkflowV1alpha1Prometheus gauge(IoArgoprojWorkflowV1alpha1Gauge gauge) {
    this.gauge = gauge;
    return this;
  }

   /**
   * Gauge is a gauge metric
   * @return gauge
  **/
  @ApiModelProperty(value = "Gauge is a gauge metric")
  public IoArgoprojWorkflowV1alpha1Gauge getGauge() {
    return gauge;
  }

  public void setGauge(IoArgoprojWorkflowV1alpha1Gauge gauge) {
    this.gauge = gauge;
  }

  public IoArgoprojWorkflowV1alpha1Prometheus help(String help) {
    this.help = help;
    return this;
  }

   /**
   * Help is a string that describes the metric
   * @return help
  **/
  @ApiModelProperty(required = true, value = "Help is a string that describes the metric")
  public String getHelp() {
    return help;
  }

  public void setHelp(String help) {
    this.help = help;
  }

  public IoArgoprojWorkflowV1alpha1Prometheus histogram(IoArgoprojWorkflowV1alpha1Histogram histogram) {
    this.histogram = histogram;
    return this;
  }

   /**
   * Histogram is a histogram metric
   * @return histogram
  **/
  @ApiModelProperty(value = "Histogram is a histogram metric")
  public IoArgoprojWorkflowV1alpha1Histogram getHistogram() {
    return histogram;
  }

  public void setHistogram(IoArgoprojWorkflowV1alpha1Histogram histogram) {
    this.histogram = histogram;
  }

  public IoArgoprojWorkflowV1alpha1Prometheus labels(List<IoArgoprojWorkflowV1alpha1MetricLabel> labels) {
    this.labels = labels;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1Prometheus addLabelsItem(IoArgoprojWorkflowV1alpha1MetricLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<IoArgoprojWorkflowV1alpha1MetricLabel>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Labels is a list of metric labels
   * @return labels
  **/
  @ApiModelProperty(value = "Labels is a list of metric labels")
  public List<IoArgoprojWorkflowV1alpha1MetricLabel> getLabels() {
    return labels;
  }

  public void setLabels(List<IoArgoprojWorkflowV1alpha1MetricLabel> labels) {
    this.labels = labels;
  }

  public IoArgoprojWorkflowV1alpha1Prometheus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name is the name of the metric
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is the name of the metric")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoArgoprojWorkflowV1alpha1Prometheus when(String when) {
    this.when = when;
    return this;
  }

   /**
   * When is a conditional statement that decides when to emit the metric
   * @return when
  **/
  @ApiModelProperty(value = "When is a conditional statement that decides when to emit the metric")
  public String getWhen() {
    return when;
  }

  public void setWhen(String when) {
    this.when = when;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1Prometheus ioArgoprojWorkflowV1alpha1Prometheus = (IoArgoprojWorkflowV1alpha1Prometheus) o;
    return Objects.equals(this.counter, ioArgoprojWorkflowV1alpha1Prometheus.counter) &&
        Objects.equals(this.gauge, ioArgoprojWorkflowV1alpha1Prometheus.gauge) &&
        Objects.equals(this.help, ioArgoprojWorkflowV1alpha1Prometheus.help) &&
        Objects.equals(this.histogram, ioArgoprojWorkflowV1alpha1Prometheus.histogram) &&
        Objects.equals(this.labels, ioArgoprojWorkflowV1alpha1Prometheus.labels) &&
        Objects.equals(this.name, ioArgoprojWorkflowV1alpha1Prometheus.name) &&
        Objects.equals(this.when, ioArgoprojWorkflowV1alpha1Prometheus.when);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counter, gauge, help, histogram, labels, name, when);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Prometheus {\n");
    
    sb.append("    counter: ").append(toIndentedString(counter)).append("\n");
    sb.append("    gauge: ").append(toIndentedString(gauge)).append("\n");
    sb.append("    help: ").append(toIndentedString(help)).append("\n");
    sb.append("    histogram: ").append(toIndentedString(histogram)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
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

