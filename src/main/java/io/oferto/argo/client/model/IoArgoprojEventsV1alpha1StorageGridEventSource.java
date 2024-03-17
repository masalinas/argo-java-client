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

import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1StorageGridFilter;
import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1WebhookContext;
import io.oferto.argo.client.model.IoK8sApiCoreV1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IoArgoprojEventsV1alpha1StorageGridEventSource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1StorageGridEventSource {
  @SerializedName("apiURL")
  private String apiURL = null;

  @SerializedName("authToken")
  private IoK8sApiCoreV1SecretKeySelector authToken = null;

  @SerializedName("bucket")
  private String bucket = null;

  @SerializedName("events")
  private List<String> events = null;

  @SerializedName("filter")
  private IoArgoprojEventsV1alpha1StorageGridFilter filter = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("topicArn")
  private String topicArn = null;

  @SerializedName("webhook")
  private IoArgoprojEventsV1alpha1WebhookContext webhook = null;

  public IoArgoprojEventsV1alpha1StorageGridEventSource apiURL(String apiURL) {
    this.apiURL = apiURL;
    return this;
  }

   /**
   * APIURL is the url of the storagegrid api.
   * @return apiURL
  **/
  @ApiModelProperty(value = "APIURL is the url of the storagegrid api.")
  public String getApiURL() {
    return apiURL;
  }

  public void setApiURL(String apiURL) {
    this.apiURL = apiURL;
  }

  public IoArgoprojEventsV1alpha1StorageGridEventSource authToken(IoK8sApiCoreV1SecretKeySelector authToken) {
    this.authToken = authToken;
    return this;
  }

   /**
   * Get authToken
   * @return authToken
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getAuthToken() {
    return authToken;
  }

  public void setAuthToken(IoK8sApiCoreV1SecretKeySelector authToken) {
    this.authToken = authToken;
  }

  public IoArgoprojEventsV1alpha1StorageGridEventSource bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

   /**
   * Name of the bucket to register notifications for.
   * @return bucket
  **/
  @ApiModelProperty(value = "Name of the bucket to register notifications for.")
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  public IoArgoprojEventsV1alpha1StorageGridEventSource events(List<String> events) {
    this.events = events;
    return this;
  }

  public IoArgoprojEventsV1alpha1StorageGridEventSource addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<String>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @ApiModelProperty(value = "")
  public List<String> getEvents() {
    return events;
  }

  public void setEvents(List<String> events) {
    this.events = events;
  }

  public IoArgoprojEventsV1alpha1StorageGridEventSource filter(IoArgoprojEventsV1alpha1StorageGridFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Filter on object key which caused the notification.
   * @return filter
  **/
  @ApiModelProperty(value = "Filter on object key which caused the notification.")
  public IoArgoprojEventsV1alpha1StorageGridFilter getFilter() {
    return filter;
  }

  public void setFilter(IoArgoprojEventsV1alpha1StorageGridFilter filter) {
    this.filter = filter;
  }

  public IoArgoprojEventsV1alpha1StorageGridEventSource metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public IoArgoprojEventsV1alpha1StorageGridEventSource putMetadataItem(String key, String metadataItem) {
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

  public IoArgoprojEventsV1alpha1StorageGridEventSource region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @ApiModelProperty(value = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public IoArgoprojEventsV1alpha1StorageGridEventSource topicArn(String topicArn) {
    this.topicArn = topicArn;
    return this;
  }

   /**
   * Get topicArn
   * @return topicArn
  **/
  @ApiModelProperty(value = "")
  public String getTopicArn() {
    return topicArn;
  }

  public void setTopicArn(String topicArn) {
    this.topicArn = topicArn;
  }

  public IoArgoprojEventsV1alpha1StorageGridEventSource webhook(IoArgoprojEventsV1alpha1WebhookContext webhook) {
    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojEventsV1alpha1WebhookContext getWebhook() {
    return webhook;
  }

  public void setWebhook(IoArgoprojEventsV1alpha1WebhookContext webhook) {
    this.webhook = webhook;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1StorageGridEventSource ioArgoprojEventsV1alpha1StorageGridEventSource = (IoArgoprojEventsV1alpha1StorageGridEventSource) o;
    return Objects.equals(this.apiURL, ioArgoprojEventsV1alpha1StorageGridEventSource.apiURL) &&
        Objects.equals(this.authToken, ioArgoprojEventsV1alpha1StorageGridEventSource.authToken) &&
        Objects.equals(this.bucket, ioArgoprojEventsV1alpha1StorageGridEventSource.bucket) &&
        Objects.equals(this.events, ioArgoprojEventsV1alpha1StorageGridEventSource.events) &&
        Objects.equals(this.filter, ioArgoprojEventsV1alpha1StorageGridEventSource.filter) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1StorageGridEventSource.metadata) &&
        Objects.equals(this.region, ioArgoprojEventsV1alpha1StorageGridEventSource.region) &&
        Objects.equals(this.topicArn, ioArgoprojEventsV1alpha1StorageGridEventSource.topicArn) &&
        Objects.equals(this.webhook, ioArgoprojEventsV1alpha1StorageGridEventSource.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiURL, authToken, bucket, events, filter, metadata, region, topicArn, webhook);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1StorageGridEventSource {\n");
    
    sb.append("    apiURL: ").append(toIndentedString(apiURL)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    topicArn: ").append(toIndentedString(topicArn)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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

