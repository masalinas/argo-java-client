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
 * IoArgoprojEventsV1alpha1StripeEventSource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1StripeEventSource {
  @SerializedName("apiKey")
  private IoK8sApiCoreV1SecretKeySelector apiKey = null;

  @SerializedName("createWebhook")
  private Boolean createWebhook = null;

  @SerializedName("eventFilter")
  private List<String> eventFilter = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("webhook")
  private IoArgoprojEventsV1alpha1WebhookContext webhook = null;

  public IoArgoprojEventsV1alpha1StripeEventSource apiKey(IoK8sApiCoreV1SecretKeySelector apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getApiKey() {
    return apiKey;
  }

  public void setApiKey(IoK8sApiCoreV1SecretKeySelector apiKey) {
    this.apiKey = apiKey;
  }

  public IoArgoprojEventsV1alpha1StripeEventSource createWebhook(Boolean createWebhook) {
    this.createWebhook = createWebhook;
    return this;
  }

   /**
   * Get createWebhook
   * @return createWebhook
  **/
  @ApiModelProperty(value = "")
  public Boolean isCreateWebhook() {
    return createWebhook;
  }

  public void setCreateWebhook(Boolean createWebhook) {
    this.createWebhook = createWebhook;
  }

  public IoArgoprojEventsV1alpha1StripeEventSource eventFilter(List<String> eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

  public IoArgoprojEventsV1alpha1StripeEventSource addEventFilterItem(String eventFilterItem) {
    if (this.eventFilter == null) {
      this.eventFilter = new ArrayList<String>();
    }
    this.eventFilter.add(eventFilterItem);
    return this;
  }

   /**
   * Get eventFilter
   * @return eventFilter
  **/
  @ApiModelProperty(value = "")
  public List<String> getEventFilter() {
    return eventFilter;
  }

  public void setEventFilter(List<String> eventFilter) {
    this.eventFilter = eventFilter;
  }

  public IoArgoprojEventsV1alpha1StripeEventSource metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public IoArgoprojEventsV1alpha1StripeEventSource putMetadataItem(String key, String metadataItem) {
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

  public IoArgoprojEventsV1alpha1StripeEventSource webhook(IoArgoprojEventsV1alpha1WebhookContext webhook) {
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
    IoArgoprojEventsV1alpha1StripeEventSource ioArgoprojEventsV1alpha1StripeEventSource = (IoArgoprojEventsV1alpha1StripeEventSource) o;
    return Objects.equals(this.apiKey, ioArgoprojEventsV1alpha1StripeEventSource.apiKey) &&
        Objects.equals(this.createWebhook, ioArgoprojEventsV1alpha1StripeEventSource.createWebhook) &&
        Objects.equals(this.eventFilter, ioArgoprojEventsV1alpha1StripeEventSource.eventFilter) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1StripeEventSource.metadata) &&
        Objects.equals(this.webhook, ioArgoprojEventsV1alpha1StripeEventSource.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, createWebhook, eventFilter, metadata, webhook);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1StripeEventSource {\n");
    
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    createWebhook: ").append(toIndentedString(createWebhook)).append("\n");
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

