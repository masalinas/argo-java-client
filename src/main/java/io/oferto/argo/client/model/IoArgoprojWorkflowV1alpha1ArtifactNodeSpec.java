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

import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1Artifact;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1ArtifactLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ArtifactNodeSpec specifies the Artifacts that need to be deleted for a given Node
 */
@ApiModel(description = "ArtifactNodeSpec specifies the Artifacts that need to be deleted for a given Node")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1ArtifactNodeSpec {
  @SerializedName("archiveLocation")
  private IoArgoprojWorkflowV1alpha1ArtifactLocation archiveLocation = null;

  @SerializedName("artifacts")
  private Map<String, IoArgoprojWorkflowV1alpha1Artifact> artifacts = null;

  public IoArgoprojWorkflowV1alpha1ArtifactNodeSpec archiveLocation(IoArgoprojWorkflowV1alpha1ArtifactLocation archiveLocation) {
    this.archiveLocation = archiveLocation;
    return this;
  }

   /**
   * ArchiveLocation is the template-level Artifact location specification
   * @return archiveLocation
  **/
  @ApiModelProperty(value = "ArchiveLocation is the template-level Artifact location specification")
  public IoArgoprojWorkflowV1alpha1ArtifactLocation getArchiveLocation() {
    return archiveLocation;
  }

  public void setArchiveLocation(IoArgoprojWorkflowV1alpha1ArtifactLocation archiveLocation) {
    this.archiveLocation = archiveLocation;
  }

  public IoArgoprojWorkflowV1alpha1ArtifactNodeSpec artifacts(Map<String, IoArgoprojWorkflowV1alpha1Artifact> artifacts) {
    this.artifacts = artifacts;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1ArtifactNodeSpec putArtifactsItem(String key, IoArgoprojWorkflowV1alpha1Artifact artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new HashMap<String, IoArgoprojWorkflowV1alpha1Artifact>();
    }
    this.artifacts.put(key, artifactsItem);
    return this;
  }

   /**
   * Artifacts maps artifact name to Artifact description
   * @return artifacts
  **/
  @ApiModelProperty(value = "Artifacts maps artifact name to Artifact description")
  public Map<String, IoArgoprojWorkflowV1alpha1Artifact> getArtifacts() {
    return artifacts;
  }

  public void setArtifacts(Map<String, IoArgoprojWorkflowV1alpha1Artifact> artifacts) {
    this.artifacts = artifacts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1ArtifactNodeSpec ioArgoprojWorkflowV1alpha1ArtifactNodeSpec = (IoArgoprojWorkflowV1alpha1ArtifactNodeSpec) o;
    return Objects.equals(this.archiveLocation, ioArgoprojWorkflowV1alpha1ArtifactNodeSpec.archiveLocation) &&
        Objects.equals(this.artifacts, ioArgoprojWorkflowV1alpha1ArtifactNodeSpec.artifacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveLocation, artifacts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1ArtifactNodeSpec {\n");
    
    sb.append("    archiveLocation: ").append(toIndentedString(archiveLocation)).append("\n");
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
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
