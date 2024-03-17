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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IoArgoprojEventsV1alpha1WatchPathConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1WatchPathConfig {
  @SerializedName("directory")
  private String directory = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("pathRegexp")
  private String pathRegexp = null;

  public IoArgoprojEventsV1alpha1WatchPathConfig directory(String directory) {
    this.directory = directory;
    return this;
  }

   /**
   * Get directory
   * @return directory
  **/
  @ApiModelProperty(value = "")
  public String getDirectory() {
    return directory;
  }

  public void setDirectory(String directory) {
    this.directory = directory;
  }

  public IoArgoprojEventsV1alpha1WatchPathConfig path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public IoArgoprojEventsV1alpha1WatchPathConfig pathRegexp(String pathRegexp) {
    this.pathRegexp = pathRegexp;
    return this;
  }

   /**
   * Get pathRegexp
   * @return pathRegexp
  **/
  @ApiModelProperty(value = "")
  public String getPathRegexp() {
    return pathRegexp;
  }

  public void setPathRegexp(String pathRegexp) {
    this.pathRegexp = pathRegexp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1WatchPathConfig ioArgoprojEventsV1alpha1WatchPathConfig = (IoArgoprojEventsV1alpha1WatchPathConfig) o;
    return Objects.equals(this.directory, ioArgoprojEventsV1alpha1WatchPathConfig.directory) &&
        Objects.equals(this.path, ioArgoprojEventsV1alpha1WatchPathConfig.path) &&
        Objects.equals(this.pathRegexp, ioArgoprojEventsV1alpha1WatchPathConfig.pathRegexp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directory, path, pathRegexp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1WatchPathConfig {\n");
    
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pathRegexp: ").append(toIndentedString(pathRegexp)).append("\n");
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

