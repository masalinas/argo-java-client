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

import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1Workflow;
import io.oferto.argo.client.model.IoK8sApimachineryPkgApisMetaV1CreateOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * IoArgoprojWorkflowV1alpha1WorkflowCreateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1WorkflowCreateRequest {
  @SerializedName("createOptions")
  private IoK8sApimachineryPkgApisMetaV1CreateOptions createOptions = null;

  @SerializedName("instanceID")
  private String instanceID = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("serverDryRun")
  private Boolean serverDryRun = null;

  @SerializedName("workflow")
  private IoArgoprojWorkflowV1alpha1Workflow workflow = null;

  public IoArgoprojWorkflowV1alpha1WorkflowCreateRequest createOptions(IoK8sApimachineryPkgApisMetaV1CreateOptions createOptions) {
    this.createOptions = createOptions;
    return this;
  }

   /**
   * Get createOptions
   * @return createOptions
  **/
  @ApiModelProperty(value = "")
  public IoK8sApimachineryPkgApisMetaV1CreateOptions getCreateOptions() {
    return createOptions;
  }

  public void setCreateOptions(IoK8sApimachineryPkgApisMetaV1CreateOptions createOptions) {
    this.createOptions = createOptions;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowCreateRequest instanceID(String instanceID) {
    this.instanceID = instanceID;
    return this;
  }

   /**
   * This field is no longer used.
   * @return instanceID
  **/
  @ApiModelProperty(value = "This field is no longer used.")
  public String getInstanceID() {
    return instanceID;
  }

  public void setInstanceID(String instanceID) {
    this.instanceID = instanceID;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowCreateRequest namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @ApiModelProperty(value = "")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowCreateRequest serverDryRun(Boolean serverDryRun) {
    this.serverDryRun = serverDryRun;
    return this;
  }

   /**
   * Get serverDryRun
   * @return serverDryRun
  **/
  @ApiModelProperty(value = "")
  public Boolean isServerDryRun() {
    return serverDryRun;
  }

  public void setServerDryRun(Boolean serverDryRun) {
    this.serverDryRun = serverDryRun;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowCreateRequest workflow(IoArgoprojWorkflowV1alpha1Workflow workflow) {
    this.workflow = workflow;
    return this;
  }

   /**
   * Get workflow
   * @return workflow
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojWorkflowV1alpha1Workflow getWorkflow() {
    return workflow;
  }

  public void setWorkflow(IoArgoprojWorkflowV1alpha1Workflow workflow) {
    this.workflow = workflow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1WorkflowCreateRequest ioArgoprojWorkflowV1alpha1WorkflowCreateRequest = (IoArgoprojWorkflowV1alpha1WorkflowCreateRequest) o;
    return Objects.equals(this.createOptions, ioArgoprojWorkflowV1alpha1WorkflowCreateRequest.createOptions) &&
        Objects.equals(this.instanceID, ioArgoprojWorkflowV1alpha1WorkflowCreateRequest.instanceID) &&
        Objects.equals(this.namespace, ioArgoprojWorkflowV1alpha1WorkflowCreateRequest.namespace) &&
        Objects.equals(this.serverDryRun, ioArgoprojWorkflowV1alpha1WorkflowCreateRequest.serverDryRun) &&
        Objects.equals(this.workflow, ioArgoprojWorkflowV1alpha1WorkflowCreateRequest.workflow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createOptions, instanceID, namespace, serverDryRun, workflow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1WorkflowCreateRequest {\n");
    
    sb.append("    createOptions: ").append(toIndentedString(createOptions)).append("\n");
    sb.append("    instanceID: ").append(toIndentedString(instanceID)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    serverDryRun: ").append(toIndentedString(serverDryRun)).append("\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
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

