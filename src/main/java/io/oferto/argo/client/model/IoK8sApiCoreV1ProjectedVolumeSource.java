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

import io.oferto.argo.client.model.IoK8sApiCoreV1VolumeProjection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a projected volume source
 */
@ApiModel(description = "Represents a projected volume source")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoK8sApiCoreV1ProjectedVolumeSource {
  @SerializedName("defaultMode")
  private Integer defaultMode = null;

  @SerializedName("sources")
  private List<IoK8sApiCoreV1VolumeProjection> sources = null;

  public IoK8sApiCoreV1ProjectedVolumeSource defaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
    return this;
  }

   /**
   * Mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   * @return defaultMode
  **/
  @ApiModelProperty(value = "Mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
  public Integer getDefaultMode() {
    return defaultMode;
  }

  public void setDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
  }

  public IoK8sApiCoreV1ProjectedVolumeSource sources(List<IoK8sApiCoreV1VolumeProjection> sources) {
    this.sources = sources;
    return this;
  }

  public IoK8sApiCoreV1ProjectedVolumeSource addSourcesItem(IoK8sApiCoreV1VolumeProjection sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<IoK8sApiCoreV1VolumeProjection>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * list of volume projections
   * @return sources
  **/
  @ApiModelProperty(value = "list of volume projections")
  public List<IoK8sApiCoreV1VolumeProjection> getSources() {
    return sources;
  }

  public void setSources(List<IoK8sApiCoreV1VolumeProjection> sources) {
    this.sources = sources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ProjectedVolumeSource ioK8sApiCoreV1ProjectedVolumeSource = (IoK8sApiCoreV1ProjectedVolumeSource) o;
    return Objects.equals(this.defaultMode, ioK8sApiCoreV1ProjectedVolumeSource.defaultMode) &&
        Objects.equals(this.sources, ioK8sApiCoreV1ProjectedVolumeSource.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultMode, sources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ProjectedVolumeSource {\n");
    
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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

