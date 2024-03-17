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

import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1ManifestFrom;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ResourceTemplate is a template subtype to manipulate kubernetes resources
 */
@ApiModel(description = "ResourceTemplate is a template subtype to manipulate kubernetes resources")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1ResourceTemplate {
  @SerializedName("action")
  private String action = null;

  @SerializedName("failureCondition")
  private String failureCondition = null;

  @SerializedName("flags")
  private List<String> flags = null;

  @SerializedName("manifest")
  private String manifest = null;

  @SerializedName("manifestFrom")
  private IoArgoprojWorkflowV1alpha1ManifestFrom manifestFrom = null;

  @SerializedName("mergeStrategy")
  private String mergeStrategy = null;

  @SerializedName("setOwnerReference")
  private Boolean setOwnerReference = null;

  @SerializedName("successCondition")
  private String successCondition = null;

  public IoArgoprojWorkflowV1alpha1ResourceTemplate action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Action is the action to perform to the resource. Must be one of: get, create, apply, delete, replace, patch
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Action is the action to perform to the resource. Must be one of: get, create, apply, delete, replace, patch")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public IoArgoprojWorkflowV1alpha1ResourceTemplate failureCondition(String failureCondition) {
    this.failureCondition = failureCondition;
    return this;
  }

   /**
   * FailureCondition is a label selector expression which describes the conditions of the k8s resource in which the step was considered failed
   * @return failureCondition
  **/
  @ApiModelProperty(value = "FailureCondition is a label selector expression which describes the conditions of the k8s resource in which the step was considered failed")
  public String getFailureCondition() {
    return failureCondition;
  }

  public void setFailureCondition(String failureCondition) {
    this.failureCondition = failureCondition;
  }

  public IoArgoprojWorkflowV1alpha1ResourceTemplate flags(List<String> flags) {
    this.flags = flags;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1ResourceTemplate addFlagsItem(String flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<String>();
    }
    this.flags.add(flagsItem);
    return this;
  }

   /**
   * Flags is a set of additional options passed to kubectl before submitting a resource I.e. to disable resource validation: flags: [  \&quot;--validate&#x3D;false\&quot;  # disable resource validation ]
   * @return flags
  **/
  @ApiModelProperty(value = "Flags is a set of additional options passed to kubectl before submitting a resource I.e. to disable resource validation: flags: [  \"--validate=false\"  # disable resource validation ]")
  public List<String> getFlags() {
    return flags;
  }

  public void setFlags(List<String> flags) {
    this.flags = flags;
  }

  public IoArgoprojWorkflowV1alpha1ResourceTemplate manifest(String manifest) {
    this.manifest = manifest;
    return this;
  }

   /**
   * Manifest contains the kubernetes manifest
   * @return manifest
  **/
  @ApiModelProperty(value = "Manifest contains the kubernetes manifest")
  public String getManifest() {
    return manifest;
  }

  public void setManifest(String manifest) {
    this.manifest = manifest;
  }

  public IoArgoprojWorkflowV1alpha1ResourceTemplate manifestFrom(IoArgoprojWorkflowV1alpha1ManifestFrom manifestFrom) {
    this.manifestFrom = manifestFrom;
    return this;
  }

   /**
   * ManifestFrom is the source for a single kubernetes manifest
   * @return manifestFrom
  **/
  @ApiModelProperty(value = "ManifestFrom is the source for a single kubernetes manifest")
  public IoArgoprojWorkflowV1alpha1ManifestFrom getManifestFrom() {
    return manifestFrom;
  }

  public void setManifestFrom(IoArgoprojWorkflowV1alpha1ManifestFrom manifestFrom) {
    this.manifestFrom = manifestFrom;
  }

  public IoArgoprojWorkflowV1alpha1ResourceTemplate mergeStrategy(String mergeStrategy) {
    this.mergeStrategy = mergeStrategy;
    return this;
  }

   /**
   * MergeStrategy is the strategy used to merge a patch. It defaults to \&quot;strategic\&quot; Must be one of: strategic, merge, json
   * @return mergeStrategy
  **/
  @ApiModelProperty(value = "MergeStrategy is the strategy used to merge a patch. It defaults to \"strategic\" Must be one of: strategic, merge, json")
  public String getMergeStrategy() {
    return mergeStrategy;
  }

  public void setMergeStrategy(String mergeStrategy) {
    this.mergeStrategy = mergeStrategy;
  }

  public IoArgoprojWorkflowV1alpha1ResourceTemplate setOwnerReference(Boolean setOwnerReference) {
    this.setOwnerReference = setOwnerReference;
    return this;
  }

   /**
   * SetOwnerReference sets the reference to the workflow on the OwnerReference of generated resource.
   * @return setOwnerReference
  **/
  @ApiModelProperty(value = "SetOwnerReference sets the reference to the workflow on the OwnerReference of generated resource.")
  public Boolean isSetOwnerReference() {
    return setOwnerReference;
  }

  public void setSetOwnerReference(Boolean setOwnerReference) {
    this.setOwnerReference = setOwnerReference;
  }

  public IoArgoprojWorkflowV1alpha1ResourceTemplate successCondition(String successCondition) {
    this.successCondition = successCondition;
    return this;
  }

   /**
   * SuccessCondition is a label selector expression which describes the conditions of the k8s resource in which it is acceptable to proceed to the following step
   * @return successCondition
  **/
  @ApiModelProperty(value = "SuccessCondition is a label selector expression which describes the conditions of the k8s resource in which it is acceptable to proceed to the following step")
  public String getSuccessCondition() {
    return successCondition;
  }

  public void setSuccessCondition(String successCondition) {
    this.successCondition = successCondition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1ResourceTemplate ioArgoprojWorkflowV1alpha1ResourceTemplate = (IoArgoprojWorkflowV1alpha1ResourceTemplate) o;
    return Objects.equals(this.action, ioArgoprojWorkflowV1alpha1ResourceTemplate.action) &&
        Objects.equals(this.failureCondition, ioArgoprojWorkflowV1alpha1ResourceTemplate.failureCondition) &&
        Objects.equals(this.flags, ioArgoprojWorkflowV1alpha1ResourceTemplate.flags) &&
        Objects.equals(this.manifest, ioArgoprojWorkflowV1alpha1ResourceTemplate.manifest) &&
        Objects.equals(this.manifestFrom, ioArgoprojWorkflowV1alpha1ResourceTemplate.manifestFrom) &&
        Objects.equals(this.mergeStrategy, ioArgoprojWorkflowV1alpha1ResourceTemplate.mergeStrategy) &&
        Objects.equals(this.setOwnerReference, ioArgoprojWorkflowV1alpha1ResourceTemplate.setOwnerReference) &&
        Objects.equals(this.successCondition, ioArgoprojWorkflowV1alpha1ResourceTemplate.successCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, failureCondition, flags, manifest, manifestFrom, mergeStrategy, setOwnerReference, successCondition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1ResourceTemplate {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    failureCondition: ").append(toIndentedString(failureCondition)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
    sb.append("    manifestFrom: ").append(toIndentedString(manifestFrom)).append("\n");
    sb.append("    mergeStrategy: ").append(toIndentedString(mergeStrategy)).append("\n");
    sb.append("    setOwnerReference: ").append(toIndentedString(setOwnerReference)).append("\n");
    sb.append("    successCondition: ").append(toIndentedString(successCondition)).append("\n");
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
