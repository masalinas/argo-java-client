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

import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1Condition;
import io.oferto.argo.client.model.IoK8sApiCoreV1ObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CronWorkflowStatus is the status of a CronWorkflow
 */
@ApiModel(description = "CronWorkflowStatus is the status of a CronWorkflow")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1CronWorkflowStatus {
  @SerializedName("active")
  private List<IoK8sApiCoreV1ObjectReference> active = new ArrayList<IoK8sApiCoreV1ObjectReference>();

  @SerializedName("conditions")
  private List<IoArgoprojWorkflowV1alpha1Condition> conditions = new ArrayList<IoArgoprojWorkflowV1alpha1Condition>();

  @SerializedName("lastScheduledTime")
  private String lastScheduledTime = null;

  public IoArgoprojWorkflowV1alpha1CronWorkflowStatus active(List<IoK8sApiCoreV1ObjectReference> active) {
    this.active = active;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1CronWorkflowStatus addActiveItem(IoK8sApiCoreV1ObjectReference activeItem) {
    this.active.add(activeItem);
    return this;
  }

   /**
   * Active is a list of active workflows stemming from this CronWorkflow
   * @return active
  **/
  @ApiModelProperty(required = true, value = "Active is a list of active workflows stemming from this CronWorkflow")
  public List<IoK8sApiCoreV1ObjectReference> getActive() {
    return active;
  }

  public void setActive(List<IoK8sApiCoreV1ObjectReference> active) {
    this.active = active;
  }

  public IoArgoprojWorkflowV1alpha1CronWorkflowStatus conditions(List<IoArgoprojWorkflowV1alpha1Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1CronWorkflowStatus addConditionsItem(IoArgoprojWorkflowV1alpha1Condition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions is a list of conditions the CronWorkflow may have
   * @return conditions
  **/
  @ApiModelProperty(required = true, value = "Conditions is a list of conditions the CronWorkflow may have")
  public List<IoArgoprojWorkflowV1alpha1Condition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoArgoprojWorkflowV1alpha1Condition> conditions) {
    this.conditions = conditions;
  }

  public IoArgoprojWorkflowV1alpha1CronWorkflowStatus lastScheduledTime(String lastScheduledTime) {
    this.lastScheduledTime = lastScheduledTime;
    return this;
  }

   /**
   * LastScheduleTime is the last time the CronWorkflow was scheduled
   * @return lastScheduledTime
  **/
  @ApiModelProperty(required = true, value = "LastScheduleTime is the last time the CronWorkflow was scheduled")
  public String getLastScheduledTime() {
    return lastScheduledTime;
  }

  public void setLastScheduledTime(String lastScheduledTime) {
    this.lastScheduledTime = lastScheduledTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1CronWorkflowStatus ioArgoprojWorkflowV1alpha1CronWorkflowStatus = (IoArgoprojWorkflowV1alpha1CronWorkflowStatus) o;
    return Objects.equals(this.active, ioArgoprojWorkflowV1alpha1CronWorkflowStatus.active) &&
        Objects.equals(this.conditions, ioArgoprojWorkflowV1alpha1CronWorkflowStatus.conditions) &&
        Objects.equals(this.lastScheduledTime, ioArgoprojWorkflowV1alpha1CronWorkflowStatus.lastScheduledTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, conditions, lastScheduledTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1CronWorkflowStatus {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    lastScheduledTime: ").append(toIndentedString(lastScheduledTime)).append("\n");
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

