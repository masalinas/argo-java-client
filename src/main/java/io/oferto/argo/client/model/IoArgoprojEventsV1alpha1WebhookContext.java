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

import io.oferto.argo.client.model.IoK8sApiCoreV1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IoArgoprojEventsV1alpha1WebhookContext
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1WebhookContext {
  @SerializedName("authSecret")
  private IoK8sApiCoreV1SecretKeySelector authSecret = null;

  @SerializedName("endpoint")
  private String endpoint = null;

  @SerializedName("maxPayloadSize")
  private String maxPayloadSize = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("port")
  private String port = null;

  @SerializedName("serverCertSecret")
  private IoK8sApiCoreV1SecretKeySelector serverCertSecret = null;

  @SerializedName("serverKeySecret")
  private IoK8sApiCoreV1SecretKeySelector serverKeySecret = null;

  @SerializedName("url")
  private String url = null;

  public IoArgoprojEventsV1alpha1WebhookContext authSecret(IoK8sApiCoreV1SecretKeySelector authSecret) {
    this.authSecret = authSecret;
    return this;
  }

   /**
   * Get authSecret
   * @return authSecret
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getAuthSecret() {
    return authSecret;
  }

  public void setAuthSecret(IoK8sApiCoreV1SecretKeySelector authSecret) {
    this.authSecret = authSecret;
  }

  public IoArgoprojEventsV1alpha1WebhookContext endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @ApiModelProperty(value = "")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public IoArgoprojEventsV1alpha1WebhookContext maxPayloadSize(String maxPayloadSize) {
    this.maxPayloadSize = maxPayloadSize;
    return this;
  }

   /**
   * Get maxPayloadSize
   * @return maxPayloadSize
  **/
  @ApiModelProperty(value = "")
  public String getMaxPayloadSize() {
    return maxPayloadSize;
  }

  public void setMaxPayloadSize(String maxPayloadSize) {
    this.maxPayloadSize = maxPayloadSize;
  }

  public IoArgoprojEventsV1alpha1WebhookContext metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public IoArgoprojEventsV1alpha1WebhookContext putMetadataItem(String key, String metadataItem) {
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

  public IoArgoprojEventsV1alpha1WebhookContext method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(value = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public IoArgoprojEventsV1alpha1WebhookContext port(String port) {
    this.port = port;
    return this;
  }

   /**
   * Port on which HTTP server is listening for incoming events.
   * @return port
  **/
  @ApiModelProperty(value = "Port on which HTTP server is listening for incoming events.")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public IoArgoprojEventsV1alpha1WebhookContext serverCertSecret(IoK8sApiCoreV1SecretKeySelector serverCertSecret) {
    this.serverCertSecret = serverCertSecret;
    return this;
  }

   /**
   * ServerCertPath refers the file that contains the cert.
   * @return serverCertSecret
  **/
  @ApiModelProperty(value = "ServerCertPath refers the file that contains the cert.")
  public IoK8sApiCoreV1SecretKeySelector getServerCertSecret() {
    return serverCertSecret;
  }

  public void setServerCertSecret(IoK8sApiCoreV1SecretKeySelector serverCertSecret) {
    this.serverCertSecret = serverCertSecret;
  }

  public IoArgoprojEventsV1alpha1WebhookContext serverKeySecret(IoK8sApiCoreV1SecretKeySelector serverKeySecret) {
    this.serverKeySecret = serverKeySecret;
    return this;
  }

   /**
   * Get serverKeySecret
   * @return serverKeySecret
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getServerKeySecret() {
    return serverKeySecret;
  }

  public void setServerKeySecret(IoK8sApiCoreV1SecretKeySelector serverKeySecret) {
    this.serverKeySecret = serverKeySecret;
  }

  public IoArgoprojEventsV1alpha1WebhookContext url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL is the url of the server.
   * @return url
  **/
  @ApiModelProperty(value = "URL is the url of the server.")
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
    IoArgoprojEventsV1alpha1WebhookContext ioArgoprojEventsV1alpha1WebhookContext = (IoArgoprojEventsV1alpha1WebhookContext) o;
    return Objects.equals(this.authSecret, ioArgoprojEventsV1alpha1WebhookContext.authSecret) &&
        Objects.equals(this.endpoint, ioArgoprojEventsV1alpha1WebhookContext.endpoint) &&
        Objects.equals(this.maxPayloadSize, ioArgoprojEventsV1alpha1WebhookContext.maxPayloadSize) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1WebhookContext.metadata) &&
        Objects.equals(this.method, ioArgoprojEventsV1alpha1WebhookContext.method) &&
        Objects.equals(this.port, ioArgoprojEventsV1alpha1WebhookContext.port) &&
        Objects.equals(this.serverCertSecret, ioArgoprojEventsV1alpha1WebhookContext.serverCertSecret) &&
        Objects.equals(this.serverKeySecret, ioArgoprojEventsV1alpha1WebhookContext.serverKeySecret) &&
        Objects.equals(this.url, ioArgoprojEventsV1alpha1WebhookContext.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authSecret, endpoint, maxPayloadSize, metadata, method, port, serverCertSecret, serverKeySecret, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1WebhookContext {\n");
    
    sb.append("    authSecret: ").append(toIndentedString(authSecret)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    maxPayloadSize: ").append(toIndentedString(maxPayloadSize)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    serverCertSecret: ").append(toIndentedString(serverCertSecret)).append("\n");
    sb.append("    serverKeySecret: ").append(toIndentedString(serverKeySecret)).append("\n");
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

