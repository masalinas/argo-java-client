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

import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1WorkflowEventBindingSpec;
import io.oferto.argo.client.model.IoK8sApimachineryPkgApisMetaV1ObjectMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * WorkflowEventBinding is the definition of an event resource
 */
@ApiModel(description = "WorkflowEventBinding is the definition of an event resource")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1WorkflowEventBinding {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;

  @SerializedName("spec")
  private IoArgoprojWorkflowV1alpha1WorkflowEventBindingSpec spec = null;

  public IoArgoprojWorkflowV1alpha1WorkflowEventBinding apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.io.k8s.community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.io.k8s.community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowEventBinding kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.io.k8s.community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.io.k8s.community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowEventBinding metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(required = true, value = "")
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowEventBinding spec(IoArgoprojWorkflowV1alpha1WorkflowEventBindingSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @ApiModelProperty(required = true, value = "")
  public IoArgoprojWorkflowV1alpha1WorkflowEventBindingSpec getSpec() {
    return spec;
  }

  public void setSpec(IoArgoprojWorkflowV1alpha1WorkflowEventBindingSpec spec) {
    this.spec = spec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1WorkflowEventBinding ioArgoprojWorkflowV1alpha1WorkflowEventBinding = (IoArgoprojWorkflowV1alpha1WorkflowEventBinding) o;
    return Objects.equals(this.apiVersion, ioArgoprojWorkflowV1alpha1WorkflowEventBinding.apiVersion) &&
        Objects.equals(this.kind, ioArgoprojWorkflowV1alpha1WorkflowEventBinding.kind) &&
        Objects.equals(this.metadata, ioArgoprojWorkflowV1alpha1WorkflowEventBinding.metadata) &&
        Objects.equals(this.spec, ioArgoprojWorkflowV1alpha1WorkflowEventBinding.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1WorkflowEventBinding {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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

