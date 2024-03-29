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

import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1Backoff;
import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1EventSourceFilter;
import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1TLSConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IoArgoprojEventsV1alpha1MQTTEventSource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1MQTTEventSource {
  @SerializedName("clientId")
  private String clientId = null;

  @SerializedName("connectionBackoff")
  private IoArgoprojEventsV1alpha1Backoff connectionBackoff = null;

  @SerializedName("filter")
  private IoArgoprojEventsV1alpha1EventSourceFilter filter = null;

  @SerializedName("jsonBody")
  private Boolean jsonBody = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("tls")
  private IoArgoprojEventsV1alpha1TLSConfig tls = null;

  @SerializedName("topic")
  private String topic = null;

  @SerializedName("url")
  private String url = null;

  public IoArgoprojEventsV1alpha1MQTTEventSource clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(value = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public IoArgoprojEventsV1alpha1MQTTEventSource connectionBackoff(IoArgoprojEventsV1alpha1Backoff connectionBackoff) {
    this.connectionBackoff = connectionBackoff;
    return this;
  }

   /**
   * ConnectionBackoff holds backoff applied to connection.
   * @return connectionBackoff
  **/
  @ApiModelProperty(value = "ConnectionBackoff holds backoff applied to connection.")
  public IoArgoprojEventsV1alpha1Backoff getConnectionBackoff() {
    return connectionBackoff;
  }

  public void setConnectionBackoff(IoArgoprojEventsV1alpha1Backoff connectionBackoff) {
    this.connectionBackoff = connectionBackoff;
  }

  public IoArgoprojEventsV1alpha1MQTTEventSource filter(IoArgoprojEventsV1alpha1EventSourceFilter filter) {
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

  public IoArgoprojEventsV1alpha1MQTTEventSource jsonBody(Boolean jsonBody) {
    this.jsonBody = jsonBody;
    return this;
  }

   /**
   * Get jsonBody
   * @return jsonBody
  **/
  @ApiModelProperty(value = "")
  public Boolean isJsonBody() {
    return jsonBody;
  }

  public void setJsonBody(Boolean jsonBody) {
    this.jsonBody = jsonBody;
  }

  public IoArgoprojEventsV1alpha1MQTTEventSource metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public IoArgoprojEventsV1alpha1MQTTEventSource putMetadataItem(String key, String metadataItem) {
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

  public IoArgoprojEventsV1alpha1MQTTEventSource tls(IoArgoprojEventsV1alpha1TLSConfig tls) {
    this.tls = tls;
    return this;
  }

   /**
   * Get tls
   * @return tls
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojEventsV1alpha1TLSConfig getTls() {
    return tls;
  }

  public void setTls(IoArgoprojEventsV1alpha1TLSConfig tls) {
    this.tls = tls;
  }

  public IoArgoprojEventsV1alpha1MQTTEventSource topic(String topic) {
    this.topic = topic;
    return this;
  }

   /**
   * Get topic
   * @return topic
  **/
  @ApiModelProperty(value = "")
  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public IoArgoprojEventsV1alpha1MQTTEventSource url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1MQTTEventSource ioArgoprojEventsV1alpha1MQTTEventSource = (IoArgoprojEventsV1alpha1MQTTEventSource) o;
    return Objects.equals(this.clientId, ioArgoprojEventsV1alpha1MQTTEventSource.clientId) &&
        Objects.equals(this.connectionBackoff, ioArgoprojEventsV1alpha1MQTTEventSource.connectionBackoff) &&
        Objects.equals(this.filter, ioArgoprojEventsV1alpha1MQTTEventSource.filter) &&
        Objects.equals(this.jsonBody, ioArgoprojEventsV1alpha1MQTTEventSource.jsonBody) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1MQTTEventSource.metadata) &&
        Objects.equals(this.tls, ioArgoprojEventsV1alpha1MQTTEventSource.tls) &&
        Objects.equals(this.topic, ioArgoprojEventsV1alpha1MQTTEventSource.topic) &&
        Objects.equals(this.url, ioArgoprojEventsV1alpha1MQTTEventSource.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, connectionBackoff, filter, jsonBody, metadata, tls, topic, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1MQTTEventSource {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

