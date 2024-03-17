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
import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1TLSConfig;
import io.oferto.argo.client.model.IoK8sApiCoreV1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IoArgoprojEventsV1alpha1RedisEventSource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1RedisEventSource {
  @SerializedName("channels")
  private List<String> channels = null;

  @SerializedName("db")
  private Integer db = null;

  @SerializedName("filter")
  private IoArgoprojEventsV1alpha1EventSourceFilter filter = null;

  @SerializedName("hostAddress")
  private String hostAddress = null;

  @SerializedName("jsonBody")
  private Boolean jsonBody = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("password")
  private IoK8sApiCoreV1SecretKeySelector password = null;

  @SerializedName("tls")
  private IoArgoprojEventsV1alpha1TLSConfig tls = null;

  @SerializedName("username")
  private String username = null;

  public IoArgoprojEventsV1alpha1RedisEventSource channels(List<String> channels) {
    this.channels = channels;
    return this;
  }

  public IoArgoprojEventsV1alpha1RedisEventSource addChannelsItem(String channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<String>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @ApiModelProperty(value = "")
  public List<String> getChannels() {
    return channels;
  }

  public void setChannels(List<String> channels) {
    this.channels = channels;
  }

  public IoArgoprojEventsV1alpha1RedisEventSource db(Integer db) {
    this.db = db;
    return this;
  }

   /**
   * Get db
   * @return db
  **/
  @ApiModelProperty(value = "")
  public Integer getDb() {
    return db;
  }

  public void setDb(Integer db) {
    this.db = db;
  }

  public IoArgoprojEventsV1alpha1RedisEventSource filter(IoArgoprojEventsV1alpha1EventSourceFilter filter) {
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

  public IoArgoprojEventsV1alpha1RedisEventSource hostAddress(String hostAddress) {
    this.hostAddress = hostAddress;
    return this;
  }

   /**
   * Get hostAddress
   * @return hostAddress
  **/
  @ApiModelProperty(value = "")
  public String getHostAddress() {
    return hostAddress;
  }

  public void setHostAddress(String hostAddress) {
    this.hostAddress = hostAddress;
  }

  public IoArgoprojEventsV1alpha1RedisEventSource jsonBody(Boolean jsonBody) {
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

  public IoArgoprojEventsV1alpha1RedisEventSource metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public IoArgoprojEventsV1alpha1RedisEventSource putMetadataItem(String key, String metadataItem) {
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

  public IoArgoprojEventsV1alpha1RedisEventSource namespace(String namespace) {
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

  public IoArgoprojEventsV1alpha1RedisEventSource password(IoK8sApiCoreV1SecretKeySelector password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getPassword() {
    return password;
  }

  public void setPassword(IoK8sApiCoreV1SecretKeySelector password) {
    this.password = password;
  }

  public IoArgoprojEventsV1alpha1RedisEventSource tls(IoArgoprojEventsV1alpha1TLSConfig tls) {
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

  public IoArgoprojEventsV1alpha1RedisEventSource username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1RedisEventSource ioArgoprojEventsV1alpha1RedisEventSource = (IoArgoprojEventsV1alpha1RedisEventSource) o;
    return Objects.equals(this.channels, ioArgoprojEventsV1alpha1RedisEventSource.channels) &&
        Objects.equals(this.db, ioArgoprojEventsV1alpha1RedisEventSource.db) &&
        Objects.equals(this.filter, ioArgoprojEventsV1alpha1RedisEventSource.filter) &&
        Objects.equals(this.hostAddress, ioArgoprojEventsV1alpha1RedisEventSource.hostAddress) &&
        Objects.equals(this.jsonBody, ioArgoprojEventsV1alpha1RedisEventSource.jsonBody) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1RedisEventSource.metadata) &&
        Objects.equals(this.namespace, ioArgoprojEventsV1alpha1RedisEventSource.namespace) &&
        Objects.equals(this.password, ioArgoprojEventsV1alpha1RedisEventSource.password) &&
        Objects.equals(this.tls, ioArgoprojEventsV1alpha1RedisEventSource.tls) &&
        Objects.equals(this.username, ioArgoprojEventsV1alpha1RedisEventSource.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels, db, filter, hostAddress, jsonBody, metadata, namespace, password, tls, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1RedisEventSource {\n");
    
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    db: ").append(toIndentedString(db)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    hostAddress: ").append(toIndentedString(hostAddress)).append("\n");
    sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

