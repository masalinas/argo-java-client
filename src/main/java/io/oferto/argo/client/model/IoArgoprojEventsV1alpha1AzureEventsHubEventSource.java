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
import io.oferto.argo.client.model.IoK8sApiCoreV1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IoArgoprojEventsV1alpha1AzureEventsHubEventSource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1AzureEventsHubEventSource {
  @SerializedName("filter")
  private IoArgoprojEventsV1alpha1EventSourceFilter filter = null;

  @SerializedName("fqdn")
  private String fqdn = null;

  @SerializedName("hubName")
  private String hubName = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("sharedAccessKey")
  private IoK8sApiCoreV1SecretKeySelector sharedAccessKey = null;

  @SerializedName("sharedAccessKeyName")
  private IoK8sApiCoreV1SecretKeySelector sharedAccessKeyName = null;

  public IoArgoprojEventsV1alpha1AzureEventsHubEventSource filter(IoArgoprojEventsV1alpha1EventSourceFilter filter) {
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

  public IoArgoprojEventsV1alpha1AzureEventsHubEventSource fqdn(String fqdn) {
    this.fqdn = fqdn;
    return this;
  }

   /**
   * Get fqdn
   * @return fqdn
  **/
  @ApiModelProperty(value = "")
  public String getFqdn() {
    return fqdn;
  }

  public void setFqdn(String fqdn) {
    this.fqdn = fqdn;
  }

  public IoArgoprojEventsV1alpha1AzureEventsHubEventSource hubName(String hubName) {
    this.hubName = hubName;
    return this;
  }

   /**
   * Get hubName
   * @return hubName
  **/
  @ApiModelProperty(value = "")
  public String getHubName() {
    return hubName;
  }

  public void setHubName(String hubName) {
    this.hubName = hubName;
  }

  public IoArgoprojEventsV1alpha1AzureEventsHubEventSource metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public IoArgoprojEventsV1alpha1AzureEventsHubEventSource putMetadataItem(String key, String metadataItem) {
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

  public IoArgoprojEventsV1alpha1AzureEventsHubEventSource sharedAccessKey(IoK8sApiCoreV1SecretKeySelector sharedAccessKey) {
    this.sharedAccessKey = sharedAccessKey;
    return this;
  }

   /**
   * Get sharedAccessKey
   * @return sharedAccessKey
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getSharedAccessKey() {
    return sharedAccessKey;
  }

  public void setSharedAccessKey(IoK8sApiCoreV1SecretKeySelector sharedAccessKey) {
    this.sharedAccessKey = sharedAccessKey;
  }

  public IoArgoprojEventsV1alpha1AzureEventsHubEventSource sharedAccessKeyName(IoK8sApiCoreV1SecretKeySelector sharedAccessKeyName) {
    this.sharedAccessKeyName = sharedAccessKeyName;
    return this;
  }

   /**
   * Get sharedAccessKeyName
   * @return sharedAccessKeyName
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getSharedAccessKeyName() {
    return sharedAccessKeyName;
  }

  public void setSharedAccessKeyName(IoK8sApiCoreV1SecretKeySelector sharedAccessKeyName) {
    this.sharedAccessKeyName = sharedAccessKeyName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1AzureEventsHubEventSource ioArgoprojEventsV1alpha1AzureEventsHubEventSource = (IoArgoprojEventsV1alpha1AzureEventsHubEventSource) o;
    return Objects.equals(this.filter, ioArgoprojEventsV1alpha1AzureEventsHubEventSource.filter) &&
        Objects.equals(this.fqdn, ioArgoprojEventsV1alpha1AzureEventsHubEventSource.fqdn) &&
        Objects.equals(this.hubName, ioArgoprojEventsV1alpha1AzureEventsHubEventSource.hubName) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1AzureEventsHubEventSource.metadata) &&
        Objects.equals(this.sharedAccessKey, ioArgoprojEventsV1alpha1AzureEventsHubEventSource.sharedAccessKey) &&
        Objects.equals(this.sharedAccessKeyName, ioArgoprojEventsV1alpha1AzureEventsHubEventSource.sharedAccessKeyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, fqdn, hubName, metadata, sharedAccessKey, sharedAccessKeyName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1AzureEventsHubEventSource {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
    sb.append("    hubName: ").append(toIndentedString(hubName)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    sharedAccessKey: ").append(toIndentedString(sharedAccessKey)).append("\n");
    sb.append("    sharedAccessKeyName: ").append(toIndentedString(sharedAccessKeyName)).append("\n");
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
