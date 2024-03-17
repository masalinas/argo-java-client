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

import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1ArtGCStatus;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1ArtifactRepositoryRefStatus;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1Condition;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1NodeStatus;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1Outputs;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1SynchronizationStatus;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1Template;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1WorkflowSpec;
import io.oferto.argo.client.model.IoK8sApiCoreV1Volume;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * WorkflowStatus contains overall status information about a workflow
 */
@ApiModel(description = "WorkflowStatus contains overall status information about a workflow")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1WorkflowStatus {
  @SerializedName("artifactGCStatus")
  private IoArgoprojWorkflowV1alpha1ArtGCStatus artifactGCStatus = null;

  @SerializedName("artifactRepositoryRef")
  private IoArgoprojWorkflowV1alpha1ArtifactRepositoryRefStatus artifactRepositoryRef = null;

  @SerializedName("compressedNodes")
  private String compressedNodes = null;

  @SerializedName("conditions")
  private List<IoArgoprojWorkflowV1alpha1Condition> conditions = null;

  @SerializedName("estimatedDuration")
  private Integer estimatedDuration = null;

  @SerializedName("finishedAt")
  private String finishedAt = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("nodes")
  private Map<String, IoArgoprojWorkflowV1alpha1NodeStatus> nodes = null;

  @SerializedName("offloadNodeStatusVersion")
  private String offloadNodeStatusVersion = null;

  @SerializedName("outputs")
  private IoArgoprojWorkflowV1alpha1Outputs outputs = null;

  @SerializedName("persistentVolumeClaims")
  private List<IoK8sApiCoreV1Volume> persistentVolumeClaims = null;

  @SerializedName("phase")
  private String phase = null;

  @SerializedName("progress")
  private String progress = null;

  @SerializedName("resourcesDuration")
  private Map<String, Long> resourcesDuration = null;

  @SerializedName("startedAt")
  private String startedAt = null;

  @SerializedName("storedTemplates")
  private Map<String, IoArgoprojWorkflowV1alpha1Template> storedTemplates = null;

  @SerializedName("storedWorkflowTemplateSpec")
  private IoArgoprojWorkflowV1alpha1WorkflowSpec storedWorkflowTemplateSpec = null;

  @SerializedName("synchronization")
  private IoArgoprojWorkflowV1alpha1SynchronizationStatus synchronization = null;

  @SerializedName("taskResultsCompletionStatus")
  private Map<String, Boolean> taskResultsCompletionStatus = null;

  public IoArgoprojWorkflowV1alpha1WorkflowStatus artifactGCStatus(IoArgoprojWorkflowV1alpha1ArtGCStatus artifactGCStatus) {
    this.artifactGCStatus = artifactGCStatus;
    return this;
  }

   /**
   * ArtifactGCStatus maintains the status of Artifact Garbage Collection
   * @return artifactGCStatus
  **/
  @ApiModelProperty(value = "ArtifactGCStatus maintains the status of Artifact Garbage Collection")
  public IoArgoprojWorkflowV1alpha1ArtGCStatus getArtifactGCStatus() {
    return artifactGCStatus;
  }

  public void setArtifactGCStatus(IoArgoprojWorkflowV1alpha1ArtGCStatus artifactGCStatus) {
    this.artifactGCStatus = artifactGCStatus;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus artifactRepositoryRef(IoArgoprojWorkflowV1alpha1ArtifactRepositoryRefStatus artifactRepositoryRef) {
    this.artifactRepositoryRef = artifactRepositoryRef;
    return this;
  }

   /**
   * ArtifactRepositoryRef is used to cache the repository to use so we do not need to determine it everytime we reconcile.
   * @return artifactRepositoryRef
  **/
  @ApiModelProperty(value = "ArtifactRepositoryRef is used to cache the repository to use so we do not need to determine it everytime we reconcile.")
  public IoArgoprojWorkflowV1alpha1ArtifactRepositoryRefStatus getArtifactRepositoryRef() {
    return artifactRepositoryRef;
  }

  public void setArtifactRepositoryRef(IoArgoprojWorkflowV1alpha1ArtifactRepositoryRefStatus artifactRepositoryRef) {
    this.artifactRepositoryRef = artifactRepositoryRef;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus compressedNodes(String compressedNodes) {
    this.compressedNodes = compressedNodes;
    return this;
  }

   /**
   * Compressed and base64 decoded Nodes map
   * @return compressedNodes
  **/
  @ApiModelProperty(value = "Compressed and base64 decoded Nodes map")
  public String getCompressedNodes() {
    return compressedNodes;
  }

  public void setCompressedNodes(String compressedNodes) {
    this.compressedNodes = compressedNodes;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus conditions(List<IoArgoprojWorkflowV1alpha1Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus addConditionsItem(IoArgoprojWorkflowV1alpha1Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<IoArgoprojWorkflowV1alpha1Condition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions is a list of conditions the Workflow may have
   * @return conditions
  **/
  @ApiModelProperty(value = "Conditions is a list of conditions the Workflow may have")
  public List<IoArgoprojWorkflowV1alpha1Condition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoArgoprojWorkflowV1alpha1Condition> conditions) {
    this.conditions = conditions;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus estimatedDuration(Integer estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
    return this;
  }

   /**
   * EstimatedDuration in seconds.
   * @return estimatedDuration
  **/
  @ApiModelProperty(value = "EstimatedDuration in seconds.")
  public Integer getEstimatedDuration() {
    return estimatedDuration;
  }

  public void setEstimatedDuration(Integer estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus finishedAt(String finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

   /**
   * Time at which this workflow completed
   * @return finishedAt
  **/
  @ApiModelProperty(value = "Time at which this workflow completed")
  public String getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(String finishedAt) {
    this.finishedAt = finishedAt;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A human readable message indicating details about why the workflow is in this condition.
   * @return message
  **/
  @ApiModelProperty(value = "A human readable message indicating details about why the workflow is in this condition.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus nodes(Map<String, IoArgoprojWorkflowV1alpha1NodeStatus> nodes) {
    this.nodes = nodes;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus putNodesItem(String key, IoArgoprojWorkflowV1alpha1NodeStatus nodesItem) {
    if (this.nodes == null) {
      this.nodes = new HashMap<String, IoArgoprojWorkflowV1alpha1NodeStatus>();
    }
    this.nodes.put(key, nodesItem);
    return this;
  }

   /**
   * Nodes is a mapping between a node ID and the node&#39;s status.
   * @return nodes
  **/
  @ApiModelProperty(value = "Nodes is a mapping between a node ID and the node's status.")
  public Map<String, IoArgoprojWorkflowV1alpha1NodeStatus> getNodes() {
    return nodes;
  }

  public void setNodes(Map<String, IoArgoprojWorkflowV1alpha1NodeStatus> nodes) {
    this.nodes = nodes;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus offloadNodeStatusVersion(String offloadNodeStatusVersion) {
    this.offloadNodeStatusVersion = offloadNodeStatusVersion;
    return this;
  }

   /**
   * Whether on not node status has been offloaded to a database. If exists, then Nodes and CompressedNodes will be empty. This will actually be populated with a hash of the offloaded data.
   * @return offloadNodeStatusVersion
  **/
  @ApiModelProperty(value = "Whether on not node status has been offloaded to a database. If exists, then Nodes and CompressedNodes will be empty. This will actually be populated with a hash of the offloaded data.")
  public String getOffloadNodeStatusVersion() {
    return offloadNodeStatusVersion;
  }

  public void setOffloadNodeStatusVersion(String offloadNodeStatusVersion) {
    this.offloadNodeStatusVersion = offloadNodeStatusVersion;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus outputs(IoArgoprojWorkflowV1alpha1Outputs outputs) {
    this.outputs = outputs;
    return this;
  }

   /**
   * Outputs captures output values and artifact locations produced by the workflow via global outputs
   * @return outputs
  **/
  @ApiModelProperty(value = "Outputs captures output values and artifact locations produced by the workflow via global outputs")
  public IoArgoprojWorkflowV1alpha1Outputs getOutputs() {
    return outputs;
  }

  public void setOutputs(IoArgoprojWorkflowV1alpha1Outputs outputs) {
    this.outputs = outputs;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus persistentVolumeClaims(List<IoK8sApiCoreV1Volume> persistentVolumeClaims) {
    this.persistentVolumeClaims = persistentVolumeClaims;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus addPersistentVolumeClaimsItem(IoK8sApiCoreV1Volume persistentVolumeClaimsItem) {
    if (this.persistentVolumeClaims == null) {
      this.persistentVolumeClaims = new ArrayList<IoK8sApiCoreV1Volume>();
    }
    this.persistentVolumeClaims.add(persistentVolumeClaimsItem);
    return this;
  }

   /**
   * PersistentVolumeClaims tracks all PVCs that were created as part of the io.argoproj.workflow.v1alpha1. The contents of this list are drained at the end of the workflow.
   * @return persistentVolumeClaims
  **/
  @ApiModelProperty(value = "PersistentVolumeClaims tracks all PVCs that were created as part of the io.argoproj.workflow.v1alpha1. The contents of this list are drained at the end of the workflow.")
  public List<IoK8sApiCoreV1Volume> getPersistentVolumeClaims() {
    return persistentVolumeClaims;
  }

  public void setPersistentVolumeClaims(List<IoK8sApiCoreV1Volume> persistentVolumeClaims) {
    this.persistentVolumeClaims = persistentVolumeClaims;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Phase a simple, high-level summary of where the workflow is in its lifecycle. Will be \&quot;\&quot; (Unknown), \&quot;Pending\&quot;, or \&quot;Running\&quot; before the workflow is completed, and \&quot;Succeeded\&quot;, \&quot;Failed\&quot; or \&quot;Error\&quot; once the workflow has completed.
   * @return phase
  **/
  @ApiModelProperty(value = "Phase a simple, high-level summary of where the workflow is in its lifecycle. Will be \"\" (Unknown), \"Pending\", or \"Running\" before the workflow is completed, and \"Succeeded\", \"Failed\" or \"Error\" once the workflow has completed.")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus progress(String progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Progress to completion
   * @return progress
  **/
  @ApiModelProperty(value = "Progress to completion")
  public String getProgress() {
    return progress;
  }

  public void setProgress(String progress) {
    this.progress = progress;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus resourcesDuration(Map<String, Long> resourcesDuration) {
    this.resourcesDuration = resourcesDuration;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus putResourcesDurationItem(String key, Long resourcesDurationItem) {
    if (this.resourcesDuration == null) {
      this.resourcesDuration = new HashMap<String, Long>();
    }
    this.resourcesDuration.put(key, resourcesDurationItem);
    return this;
  }

   /**
   * ResourcesDuration is the total for the workflow
   * @return resourcesDuration
  **/
  @ApiModelProperty(value = "ResourcesDuration is the total for the workflow")
  public Map<String, Long> getResourcesDuration() {
    return resourcesDuration;
  }

  public void setResourcesDuration(Map<String, Long> resourcesDuration) {
    this.resourcesDuration = resourcesDuration;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus startedAt(String startedAt) {
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Time at which this workflow started
   * @return startedAt
  **/
  @ApiModelProperty(value = "Time at which this workflow started")
  public String getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus storedTemplates(Map<String, IoArgoprojWorkflowV1alpha1Template> storedTemplates) {
    this.storedTemplates = storedTemplates;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus putStoredTemplatesItem(String key, IoArgoprojWorkflowV1alpha1Template storedTemplatesItem) {
    if (this.storedTemplates == null) {
      this.storedTemplates = new HashMap<String, IoArgoprojWorkflowV1alpha1Template>();
    }
    this.storedTemplates.put(key, storedTemplatesItem);
    return this;
  }

   /**
   * StoredTemplates is a mapping between a template ref and the node&#39;s status.
   * @return storedTemplates
  **/
  @ApiModelProperty(value = "StoredTemplates is a mapping between a template ref and the node's status.")
  public Map<String, IoArgoprojWorkflowV1alpha1Template> getStoredTemplates() {
    return storedTemplates;
  }

  public void setStoredTemplates(Map<String, IoArgoprojWorkflowV1alpha1Template> storedTemplates) {
    this.storedTemplates = storedTemplates;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus storedWorkflowTemplateSpec(IoArgoprojWorkflowV1alpha1WorkflowSpec storedWorkflowTemplateSpec) {
    this.storedWorkflowTemplateSpec = storedWorkflowTemplateSpec;
    return this;
  }

   /**
   * StoredWorkflowSpec stores the WorkflowTemplate spec for future execution.
   * @return storedWorkflowTemplateSpec
  **/
  @ApiModelProperty(value = "StoredWorkflowSpec stores the WorkflowTemplate spec for future execution.")
  public IoArgoprojWorkflowV1alpha1WorkflowSpec getStoredWorkflowTemplateSpec() {
    return storedWorkflowTemplateSpec;
  }

  public void setStoredWorkflowTemplateSpec(IoArgoprojWorkflowV1alpha1WorkflowSpec storedWorkflowTemplateSpec) {
    this.storedWorkflowTemplateSpec = storedWorkflowTemplateSpec;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus synchronization(IoArgoprojWorkflowV1alpha1SynchronizationStatus synchronization) {
    this.synchronization = synchronization;
    return this;
  }

   /**
   * Synchronization stores the status of synchronization locks
   * @return synchronization
  **/
  @ApiModelProperty(value = "Synchronization stores the status of synchronization locks")
  public IoArgoprojWorkflowV1alpha1SynchronizationStatus getSynchronization() {
    return synchronization;
  }

  public void setSynchronization(IoArgoprojWorkflowV1alpha1SynchronizationStatus synchronization) {
    this.synchronization = synchronization;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus taskResultsCompletionStatus(Map<String, Boolean> taskResultsCompletionStatus) {
    this.taskResultsCompletionStatus = taskResultsCompletionStatus;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus putTaskResultsCompletionStatusItem(String key, Boolean taskResultsCompletionStatusItem) {
    if (this.taskResultsCompletionStatus == null) {
      this.taskResultsCompletionStatus = new HashMap<String, Boolean>();
    }
    this.taskResultsCompletionStatus.put(key, taskResultsCompletionStatusItem);
    return this;
  }

   /**
   * TaskResultsCompletionStatus tracks task result completion status (mapped by pod name). Used to prevent premature archiving and garbage collection.
   * @return taskResultsCompletionStatus
  **/
  @ApiModelProperty(value = "TaskResultsCompletionStatus tracks task result completion status (mapped by pod name). Used to prevent premature archiving and garbage collection.")
  public Map<String, Boolean> getTaskResultsCompletionStatus() {
    return taskResultsCompletionStatus;
  }

  public void setTaskResultsCompletionStatus(Map<String, Boolean> taskResultsCompletionStatus) {
    this.taskResultsCompletionStatus = taskResultsCompletionStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1WorkflowStatus ioArgoprojWorkflowV1alpha1WorkflowStatus = (IoArgoprojWorkflowV1alpha1WorkflowStatus) o;
    return Objects.equals(this.artifactGCStatus, ioArgoprojWorkflowV1alpha1WorkflowStatus.artifactGCStatus) &&
        Objects.equals(this.artifactRepositoryRef, ioArgoprojWorkflowV1alpha1WorkflowStatus.artifactRepositoryRef) &&
        Objects.equals(this.compressedNodes, ioArgoprojWorkflowV1alpha1WorkflowStatus.compressedNodes) &&
        Objects.equals(this.conditions, ioArgoprojWorkflowV1alpha1WorkflowStatus.conditions) &&
        Objects.equals(this.estimatedDuration, ioArgoprojWorkflowV1alpha1WorkflowStatus.estimatedDuration) &&
        Objects.equals(this.finishedAt, ioArgoprojWorkflowV1alpha1WorkflowStatus.finishedAt) &&
        Objects.equals(this.message, ioArgoprojWorkflowV1alpha1WorkflowStatus.message) &&
        Objects.equals(this.nodes, ioArgoprojWorkflowV1alpha1WorkflowStatus.nodes) &&
        Objects.equals(this.offloadNodeStatusVersion, ioArgoprojWorkflowV1alpha1WorkflowStatus.offloadNodeStatusVersion) &&
        Objects.equals(this.outputs, ioArgoprojWorkflowV1alpha1WorkflowStatus.outputs) &&
        Objects.equals(this.persistentVolumeClaims, ioArgoprojWorkflowV1alpha1WorkflowStatus.persistentVolumeClaims) &&
        Objects.equals(this.phase, ioArgoprojWorkflowV1alpha1WorkflowStatus.phase) &&
        Objects.equals(this.progress, ioArgoprojWorkflowV1alpha1WorkflowStatus.progress) &&
        Objects.equals(this.resourcesDuration, ioArgoprojWorkflowV1alpha1WorkflowStatus.resourcesDuration) &&
        Objects.equals(this.startedAt, ioArgoprojWorkflowV1alpha1WorkflowStatus.startedAt) &&
        Objects.equals(this.storedTemplates, ioArgoprojWorkflowV1alpha1WorkflowStatus.storedTemplates) &&
        Objects.equals(this.storedWorkflowTemplateSpec, ioArgoprojWorkflowV1alpha1WorkflowStatus.storedWorkflowTemplateSpec) &&
        Objects.equals(this.synchronization, ioArgoprojWorkflowV1alpha1WorkflowStatus.synchronization) &&
        Objects.equals(this.taskResultsCompletionStatus, ioArgoprojWorkflowV1alpha1WorkflowStatus.taskResultsCompletionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactGCStatus, artifactRepositoryRef, compressedNodes, conditions, estimatedDuration, finishedAt, message, nodes, offloadNodeStatusVersion, outputs, persistentVolumeClaims, phase, progress, resourcesDuration, startedAt, storedTemplates, storedWorkflowTemplateSpec, synchronization, taskResultsCompletionStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1WorkflowStatus {\n");
    
    sb.append("    artifactGCStatus: ").append(toIndentedString(artifactGCStatus)).append("\n");
    sb.append("    artifactRepositoryRef: ").append(toIndentedString(artifactRepositoryRef)).append("\n");
    sb.append("    compressedNodes: ").append(toIndentedString(compressedNodes)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    estimatedDuration: ").append(toIndentedString(estimatedDuration)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    offloadNodeStatusVersion: ").append(toIndentedString(offloadNodeStatusVersion)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    persistentVolumeClaims: ").append(toIndentedString(persistentVolumeClaims)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    resourcesDuration: ").append(toIndentedString(resourcesDuration)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    storedTemplates: ").append(toIndentedString(storedTemplates)).append("\n");
    sb.append("    storedWorkflowTemplateSpec: ").append(toIndentedString(storedWorkflowTemplateSpec)).append("\n");
    sb.append("    synchronization: ").append(toIndentedString(synchronization)).append("\n");
    sb.append("    taskResultsCompletionStatus: ").append(toIndentedString(taskResultsCompletionStatus)).append("\n");
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
