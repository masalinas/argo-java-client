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

import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1BitbucketServerRepository;
import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1EventSourceFilter;
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
 * IoArgoprojEventsV1alpha1BitbucketServerEventSource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1BitbucketServerEventSource {
  @SerializedName("accessToken")
  private IoK8sApiCoreV1SecretKeySelector accessToken = null;

  @SerializedName("bitbucketserverBaseURL")
  private String bitbucketserverBaseURL = null;

  @SerializedName("deleteHookOnFinish")
  private Boolean deleteHookOnFinish = null;

  @SerializedName("events")
  private List<String> events = null;

  @SerializedName("filter")
  private IoArgoprojEventsV1alpha1EventSourceFilter filter = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("projectKey")
  private String projectKey = null;

  @SerializedName("repositories")
  private List<IoArgoprojEventsV1alpha1BitbucketServerRepository> repositories = null;

  @SerializedName("repositorySlug")
  private String repositorySlug = null;

  @SerializedName("webhook")
  private IoArgoprojEventsV1alpha1WebhookContext webhook = null;

  @SerializedName("webhookSecret")
  private IoK8sApiCoreV1SecretKeySelector webhookSecret = null;

  public IoArgoprojEventsV1alpha1BitbucketServerEventSource accessToken(IoK8sApiCoreV1SecretKeySelector accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(IoK8sApiCoreV1SecretKeySelector accessToken) {
    this.accessToken = accessToken;
  }

  public IoArgoprojEventsV1alpha1BitbucketServerEventSource bitbucketserverBaseURL(String bitbucketserverBaseURL) {
    this.bitbucketserverBaseURL = bitbucketserverBaseURL;
    return this;
  }

   /**
   * Get bitbucketserverBaseURL
   * @return bitbucketserverBaseURL
  **/
  @ApiModelProperty(value = "")
  public String getBitbucketserverBaseURL() {
    return bitbucketserverBaseURL;
  }

  public void setBitbucketserverBaseURL(String bitbucketserverBaseURL) {
    this.bitbucketserverBaseURL = bitbucketserverBaseURL;
  }

  public IoArgoprojEventsV1alpha1BitbucketServerEventSource deleteHookOnFinish(Boolean deleteHookOnFinish) {
    this.deleteHookOnFinish = deleteHookOnFinish;
    return this;
  }

   /**
   * Get deleteHookOnFinish
   * @return deleteHookOnFinish
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeleteHookOnFinish() {
    return deleteHookOnFinish;
  }

  public void setDeleteHookOnFinish(Boolean deleteHookOnFinish) {
    this.deleteHookOnFinish = deleteHookOnFinish;
  }

  public IoArgoprojEventsV1alpha1BitbucketServerEventSource events(List<String> events) {
    this.events = events;
    return this;
  }

  public IoArgoprojEventsV1alpha1BitbucketServerEventSource addEventsItem(String eventsItem) {
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

  public IoArgoprojEventsV1alpha1BitbucketServerEventSource filter(IoArgoprojEventsV1alpha1EventSourceFilter filter) {
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

  public IoArgoprojEventsV1alpha1BitbucketServerEventSource metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public IoArgoprojEventsV1alpha1BitbucketServerEventSource putMetadataItem(String key, String metadataItem) {
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

  public IoArgoprojEventsV1alpha1BitbucketServerEventSource projectKey(String projectKey) {
    this.projectKey = projectKey;
    return this;
  }

   /**
   * Get projectKey
   * @return projectKey
  **/
  @ApiModelProperty(value = "")
  public String getProjectKey() {
    return projectKey;
  }

  public void setProjectKey(String projectKey) {
    this.projectKey = projectKey;
  }

  public IoArgoprojEventsV1alpha1BitbucketServerEventSource repositories(List<IoArgoprojEventsV1alpha1BitbucketServerRepository> repositories) {
    this.repositories = repositories;
    return this;
  }

  public IoArgoprojEventsV1alpha1BitbucketServerEventSource addRepositoriesItem(IoArgoprojEventsV1alpha1BitbucketServerRepository repositoriesItem) {
    if (this.repositories == null) {
      this.repositories = new ArrayList<IoArgoprojEventsV1alpha1BitbucketServerRepository>();
    }
    this.repositories.add(repositoriesItem);
    return this;
  }

   /**
   * Get repositories
   * @return repositories
  **/
  @ApiModelProperty(value = "")
  public List<IoArgoprojEventsV1alpha1BitbucketServerRepository> getRepositories() {
    return repositories;
  }

  public void setRepositories(List<IoArgoprojEventsV1alpha1BitbucketServerRepository> repositories) {
    this.repositories = repositories;
  }

  public IoArgoprojEventsV1alpha1BitbucketServerEventSource repositorySlug(String repositorySlug) {
    this.repositorySlug = repositorySlug;
    return this;
  }

   /**
   * Get repositorySlug
   * @return repositorySlug
  **/
  @ApiModelProperty(value = "")
  public String getRepositorySlug() {
    return repositorySlug;
  }

  public void setRepositorySlug(String repositorySlug) {
    this.repositorySlug = repositorySlug;
  }

  public IoArgoprojEventsV1alpha1BitbucketServerEventSource webhook(IoArgoprojEventsV1alpha1WebhookContext webhook) {
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

  public IoArgoprojEventsV1alpha1BitbucketServerEventSource webhookSecret(IoK8sApiCoreV1SecretKeySelector webhookSecret) {
    this.webhookSecret = webhookSecret;
    return this;
  }

   /**
   * Get webhookSecret
   * @return webhookSecret
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getWebhookSecret() {
    return webhookSecret;
  }

  public void setWebhookSecret(IoK8sApiCoreV1SecretKeySelector webhookSecret) {
    this.webhookSecret = webhookSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1BitbucketServerEventSource ioArgoprojEventsV1alpha1BitbucketServerEventSource = (IoArgoprojEventsV1alpha1BitbucketServerEventSource) o;
    return Objects.equals(this.accessToken, ioArgoprojEventsV1alpha1BitbucketServerEventSource.accessToken) &&
        Objects.equals(this.bitbucketserverBaseURL, ioArgoprojEventsV1alpha1BitbucketServerEventSource.bitbucketserverBaseURL) &&
        Objects.equals(this.deleteHookOnFinish, ioArgoprojEventsV1alpha1BitbucketServerEventSource.deleteHookOnFinish) &&
        Objects.equals(this.events, ioArgoprojEventsV1alpha1BitbucketServerEventSource.events) &&
        Objects.equals(this.filter, ioArgoprojEventsV1alpha1BitbucketServerEventSource.filter) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1BitbucketServerEventSource.metadata) &&
        Objects.equals(this.projectKey, ioArgoprojEventsV1alpha1BitbucketServerEventSource.projectKey) &&
        Objects.equals(this.repositories, ioArgoprojEventsV1alpha1BitbucketServerEventSource.repositories) &&
        Objects.equals(this.repositorySlug, ioArgoprojEventsV1alpha1BitbucketServerEventSource.repositorySlug) &&
        Objects.equals(this.webhook, ioArgoprojEventsV1alpha1BitbucketServerEventSource.webhook) &&
        Objects.equals(this.webhookSecret, ioArgoprojEventsV1alpha1BitbucketServerEventSource.webhookSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, bitbucketserverBaseURL, deleteHookOnFinish, events, filter, metadata, projectKey, repositories, repositorySlug, webhook, webhookSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1BitbucketServerEventSource {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    bitbucketserverBaseURL: ").append(toIndentedString(bitbucketserverBaseURL)).append("\n");
    sb.append("    deleteHookOnFinish: ").append(toIndentedString(deleteHookOnFinish)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
    sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
    sb.append("    repositorySlug: ").append(toIndentedString(repositorySlug)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
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

