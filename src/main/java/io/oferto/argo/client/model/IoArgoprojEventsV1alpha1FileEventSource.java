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

import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1EventSourceFilter;
import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1WatchPathConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FileEventSource describes an event-source for file related events.
 */
@ApiModel(description = "FileEventSource describes an event-source for file related events.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1FileEventSource {
  @SerializedName("eventType")
  private String eventType = null;

  @SerializedName("filter")
  private IoArgoprojEventsV1alpha1EventSourceFilter filter = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("polling")
  private Boolean polling = null;

  @SerializedName("watchPathConfig")
  private IoArgoprojEventsV1alpha1WatchPathConfig watchPathConfig = null;

  public IoArgoprojEventsV1alpha1FileEventSource eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @ApiModelProperty(value = "")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public IoArgoprojEventsV1alpha1FileEventSource filter(IoArgoprojEventsV1alpha1EventSourceFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojEventsV1alpha1EventSourceFilter getFilter() {
    return filter;
  }

  public void setFilter(IoArgoprojEventsV1alpha1EventSourceFilter filter) {
    this.filter = filter;
  }

  public IoArgoprojEventsV1alpha1FileEventSource metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public IoArgoprojEventsV1alpha1FileEventSource putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public IoArgoprojEventsV1alpha1FileEventSource polling(Boolean polling) {
    this.polling = polling;
    return this;
  }

   /**
   * Get polling
   * @return polling
  **/
  @ApiModelProperty(value = "")
  public Boolean isPolling() {
    return polling;
  }

  public void setPolling(Boolean polling) {
    this.polling = polling;
  }

  public IoArgoprojEventsV1alpha1FileEventSource watchPathConfig(IoArgoprojEventsV1alpha1WatchPathConfig watchPathConfig) {
    this.watchPathConfig = watchPathConfig;
    return this;
  }

   /**
   * Get watchPathConfig
   * @return watchPathConfig
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojEventsV1alpha1WatchPathConfig getWatchPathConfig() {
    return watchPathConfig;
  }

  public void setWatchPathConfig(IoArgoprojEventsV1alpha1WatchPathConfig watchPathConfig) {
    this.watchPathConfig = watchPathConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1FileEventSource ioArgoprojEventsV1alpha1FileEventSource = (IoArgoprojEventsV1alpha1FileEventSource) o;
    return Objects.equals(this.eventType, ioArgoprojEventsV1alpha1FileEventSource.eventType) &&
        Objects.equals(this.filter, ioArgoprojEventsV1alpha1FileEventSource.filter) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1FileEventSource.metadata) &&
        Objects.equals(this.polling, ioArgoprojEventsV1alpha1FileEventSource.polling) &&
        Objects.equals(this.watchPathConfig, ioArgoprojEventsV1alpha1FileEventSource.watchPathConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, filter, metadata, polling, watchPathConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1FileEventSource {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    polling: ").append(toIndentedString(polling)).append("\n");
    sb.append("    watchPathConfig: ").append(toIndentedString(watchPathConfig)).append("\n");
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

