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

import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1BasicAuth;
import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1SecureHeader;
import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1TLSConfig;
import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1TriggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IoArgoprojEventsV1alpha1HTTPTrigger
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1HTTPTrigger {
  @SerializedName("basicAuth")
  private IoArgoprojEventsV1alpha1BasicAuth basicAuth = null;

  @SerializedName("headers")
  private Map<String, String> headers = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("parameters")
  private List<IoArgoprojEventsV1alpha1TriggerParameter> parameters = null;

  @SerializedName("payload")
  private List<IoArgoprojEventsV1alpha1TriggerParameter> payload = null;

  @SerializedName("secureHeaders")
  private List<IoArgoprojEventsV1alpha1SecureHeader> secureHeaders = null;

  @SerializedName("timeout")
  private String timeout = null;

  @SerializedName("tls")
  private IoArgoprojEventsV1alpha1TLSConfig tls = null;

  @SerializedName("url")
  private String url = null;

  public IoArgoprojEventsV1alpha1HTTPTrigger basicAuth(IoArgoprojEventsV1alpha1BasicAuth basicAuth) {
    this.basicAuth = basicAuth;
    return this;
  }

   /**
   * Get basicAuth
   * @return basicAuth
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojEventsV1alpha1BasicAuth getBasicAuth() {
    return basicAuth;
  }

  public void setBasicAuth(IoArgoprojEventsV1alpha1BasicAuth basicAuth) {
    this.basicAuth = basicAuth;
  }

  public IoArgoprojEventsV1alpha1HTTPTrigger headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  public IoArgoprojEventsV1alpha1HTTPTrigger putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<String, String>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  public IoArgoprojEventsV1alpha1HTTPTrigger method(String method) {
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

  public IoArgoprojEventsV1alpha1HTTPTrigger parameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojEventsV1alpha1HTTPTrigger addParametersItem(IoArgoprojEventsV1alpha1TriggerParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<IoArgoprojEventsV1alpha1TriggerParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Parameters is the list of key-value extracted from event&#39;s payload that are applied to the HTTP trigger resource.
   * @return parameters
  **/
  @ApiModelProperty(value = "Parameters is the list of key-value extracted from event's payload that are applied to the HTTP trigger resource.")
  public List<IoArgoprojEventsV1alpha1TriggerParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    this.parameters = parameters;
  }

  public IoArgoprojEventsV1alpha1HTTPTrigger payload(List<IoArgoprojEventsV1alpha1TriggerParameter> payload) {
    this.payload = payload;
    return this;
  }

  public IoArgoprojEventsV1alpha1HTTPTrigger addPayloadItem(IoArgoprojEventsV1alpha1TriggerParameter payloadItem) {
    if (this.payload == null) {
      this.payload = new ArrayList<IoArgoprojEventsV1alpha1TriggerParameter>();
    }
    this.payload.add(payloadItem);
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @ApiModelProperty(value = "")
  public List<IoArgoprojEventsV1alpha1TriggerParameter> getPayload() {
    return payload;
  }

  public void setPayload(List<IoArgoprojEventsV1alpha1TriggerParameter> payload) {
    this.payload = payload;
  }

  public IoArgoprojEventsV1alpha1HTTPTrigger secureHeaders(List<IoArgoprojEventsV1alpha1SecureHeader> secureHeaders) {
    this.secureHeaders = secureHeaders;
    return this;
  }

  public IoArgoprojEventsV1alpha1HTTPTrigger addSecureHeadersItem(IoArgoprojEventsV1alpha1SecureHeader secureHeadersItem) {
    if (this.secureHeaders == null) {
      this.secureHeaders = new ArrayList<IoArgoprojEventsV1alpha1SecureHeader>();
    }
    this.secureHeaders.add(secureHeadersItem);
    return this;
  }

   /**
   * Get secureHeaders
   * @return secureHeaders
  **/
  @ApiModelProperty(value = "")
  public List<IoArgoprojEventsV1alpha1SecureHeader> getSecureHeaders() {
    return secureHeaders;
  }

  public void setSecureHeaders(List<IoArgoprojEventsV1alpha1SecureHeader> secureHeaders) {
    this.secureHeaders = secureHeaders;
  }

  public IoArgoprojEventsV1alpha1HTTPTrigger timeout(String timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @ApiModelProperty(value = "")
  public String getTimeout() {
    return timeout;
  }

  public void setTimeout(String timeout) {
    this.timeout = timeout;
  }

  public IoArgoprojEventsV1alpha1HTTPTrigger tls(IoArgoprojEventsV1alpha1TLSConfig tls) {
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

  public IoArgoprojEventsV1alpha1HTTPTrigger url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL refers to the URL to send HTTP request to.
   * @return url
  **/
  @ApiModelProperty(value = "URL refers to the URL to send HTTP request to.")
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
    IoArgoprojEventsV1alpha1HTTPTrigger ioArgoprojEventsV1alpha1HTTPTrigger = (IoArgoprojEventsV1alpha1HTTPTrigger) o;
    return Objects.equals(this.basicAuth, ioArgoprojEventsV1alpha1HTTPTrigger.basicAuth) &&
        Objects.equals(this.headers, ioArgoprojEventsV1alpha1HTTPTrigger.headers) &&
        Objects.equals(this.method, ioArgoprojEventsV1alpha1HTTPTrigger.method) &&
        Objects.equals(this.parameters, ioArgoprojEventsV1alpha1HTTPTrigger.parameters) &&
        Objects.equals(this.payload, ioArgoprojEventsV1alpha1HTTPTrigger.payload) &&
        Objects.equals(this.secureHeaders, ioArgoprojEventsV1alpha1HTTPTrigger.secureHeaders) &&
        Objects.equals(this.timeout, ioArgoprojEventsV1alpha1HTTPTrigger.timeout) &&
        Objects.equals(this.tls, ioArgoprojEventsV1alpha1HTTPTrigger.tls) &&
        Objects.equals(this.url, ioArgoprojEventsV1alpha1HTTPTrigger.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicAuth, headers, method, parameters, payload, secureHeaders, timeout, tls, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1HTTPTrigger {\n");
    
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    secureHeaders: ").append(toIndentedString(secureHeaders)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
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

