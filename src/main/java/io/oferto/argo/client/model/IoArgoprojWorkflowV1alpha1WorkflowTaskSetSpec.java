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

import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1Template;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IoArgoprojWorkflowV1alpha1WorkflowTaskSetSpec
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1WorkflowTaskSetSpec {
  @SerializedName("tasks")
  private Map<String, IoArgoprojWorkflowV1alpha1Template> tasks = null;

  public IoArgoprojWorkflowV1alpha1WorkflowTaskSetSpec tasks(Map<String, IoArgoprojWorkflowV1alpha1Template> tasks) {
    this.tasks = tasks;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowTaskSetSpec putTasksItem(String key, IoArgoprojWorkflowV1alpha1Template tasksItem) {
    if (this.tasks == null) {
      this.tasks = new HashMap<String, IoArgoprojWorkflowV1alpha1Template>();
    }
    this.tasks.put(key, tasksItem);
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @ApiModelProperty(value = "")
  public Map<String, IoArgoprojWorkflowV1alpha1Template> getTasks() {
    return tasks;
  }

  public void setTasks(Map<String, IoArgoprojWorkflowV1alpha1Template> tasks) {
    this.tasks = tasks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1WorkflowTaskSetSpec ioArgoprojWorkflowV1alpha1WorkflowTaskSetSpec = (IoArgoprojWorkflowV1alpha1WorkflowTaskSetSpec) o;
    return Objects.equals(this.tasks, ioArgoprojWorkflowV1alpha1WorkflowTaskSetSpec.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tasks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1WorkflowTaskSetSpec {\n");
    
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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

