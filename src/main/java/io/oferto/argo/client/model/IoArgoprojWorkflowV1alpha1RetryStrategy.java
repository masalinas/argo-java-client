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

import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1Backoff;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1RetryAffinity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * RetryStrategy provides controls on how to retry a workflow step
 */
@ApiModel(description = "RetryStrategy provides controls on how to retry a workflow step")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1RetryStrategy {
  @SerializedName("affinity")
  private IoArgoprojWorkflowV1alpha1RetryAffinity affinity = null;

  @SerializedName("backoff")
  private IoArgoprojWorkflowV1alpha1Backoff backoff = null;

  @SerializedName("expression")
  private String expression = null;

  @SerializedName("limit")
  private String limit = null;

  @SerializedName("retryPolicy")
  private String retryPolicy = null;

  public IoArgoprojWorkflowV1alpha1RetryStrategy affinity(IoArgoprojWorkflowV1alpha1RetryAffinity affinity) {
    this.affinity = affinity;
    return this;
  }

   /**
   * Affinity prevents running workflow&#39;s step on the same host
   * @return affinity
  **/
  @ApiModelProperty(value = "Affinity prevents running workflow's step on the same host")
  public IoArgoprojWorkflowV1alpha1RetryAffinity getAffinity() {
    return affinity;
  }

  public void setAffinity(IoArgoprojWorkflowV1alpha1RetryAffinity affinity) {
    this.affinity = affinity;
  }

  public IoArgoprojWorkflowV1alpha1RetryStrategy backoff(IoArgoprojWorkflowV1alpha1Backoff backoff) {
    this.backoff = backoff;
    return this;
  }

   /**
   * Backoff is a backoff strategy
   * @return backoff
  **/
  @ApiModelProperty(value = "Backoff is a backoff strategy")
  public IoArgoprojWorkflowV1alpha1Backoff getBackoff() {
    return backoff;
  }

  public void setBackoff(IoArgoprojWorkflowV1alpha1Backoff backoff) {
    this.backoff = backoff;
  }

  public IoArgoprojWorkflowV1alpha1RetryStrategy expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * Expression is a condition expression for when a node will be retried. If it evaluates to false, the node will not be retried and the retry strategy will be ignored
   * @return expression
  **/
  @ApiModelProperty(value = "Expression is a condition expression for when a node will be retried. If it evaluates to false, the node will not be retried and the retry strategy will be ignored")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public IoArgoprojWorkflowV1alpha1RetryStrategy limit(String limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Limit is the maximum number of retry attempts when retrying a container. It does not include the original container; the maximum number of total attempts will be &#x60;limit + 1&#x60;.
   * @return limit
  **/
  @ApiModelProperty(value = "Limit is the maximum number of retry attempts when retrying a container. It does not include the original container; the maximum number of total attempts will be `limit + 1`.")
  public String getLimit() {
    return limit;
  }

  public void setLimit(String limit) {
    this.limit = limit;
  }

  public IoArgoprojWorkflowV1alpha1RetryStrategy retryPolicy(String retryPolicy) {
    this.retryPolicy = retryPolicy;
    return this;
  }

   /**
   * RetryPolicy is a policy of NodePhase statuses that will be retried
   * @return retryPolicy
  **/
  @ApiModelProperty(value = "RetryPolicy is a policy of NodePhase statuses that will be retried")
  public String getRetryPolicy() {
    return retryPolicy;
  }

  public void setRetryPolicy(String retryPolicy) {
    this.retryPolicy = retryPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1RetryStrategy ioArgoprojWorkflowV1alpha1RetryStrategy = (IoArgoprojWorkflowV1alpha1RetryStrategy) o;
    return Objects.equals(this.affinity, ioArgoprojWorkflowV1alpha1RetryStrategy.affinity) &&
        Objects.equals(this.backoff, ioArgoprojWorkflowV1alpha1RetryStrategy.backoff) &&
        Objects.equals(this.expression, ioArgoprojWorkflowV1alpha1RetryStrategy.expression) &&
        Objects.equals(this.limit, ioArgoprojWorkflowV1alpha1RetryStrategy.limit) &&
        Objects.equals(this.retryPolicy, ioArgoprojWorkflowV1alpha1RetryStrategy.retryPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinity, backoff, expression, limit, retryPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1RetryStrategy {\n");
    
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    backoff: ").append(toIndentedString(backoff)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    retryPolicy: ").append(toIndentedString(retryPolicy)).append("\n");
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

