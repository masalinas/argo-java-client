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
import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1TLSConfig;
import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1TriggerParameter;
import io.oferto.argo.client.model.IoK8sApiCoreV1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PulsarTrigger refers to the specification of the Pulsar trigger.
 */
@ApiModel(description = "PulsarTrigger refers to the specification of the Pulsar trigger.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1PulsarTrigger {
  @SerializedName("authTokenSecret")
  private IoK8sApiCoreV1SecretKeySelector authTokenSecret = null;

  @SerializedName("connectionBackoff")
  private IoArgoprojEventsV1alpha1Backoff connectionBackoff = null;

  @SerializedName("parameters")
  private List<IoArgoprojEventsV1alpha1TriggerParameter> parameters = null;

  @SerializedName("payload")
  private List<IoArgoprojEventsV1alpha1TriggerParameter> payload = null;

  @SerializedName("tls")
  private IoArgoprojEventsV1alpha1TLSConfig tls = null;

  @SerializedName("tlsAllowInsecureConnection")
  private Boolean tlsAllowInsecureConnection = null;

  @SerializedName("tlsTrustCertsSecret")
  private IoK8sApiCoreV1SecretKeySelector tlsTrustCertsSecret = null;

  @SerializedName("tlsValidateHostname")
  private Boolean tlsValidateHostname = null;

  @SerializedName("topic")
  private String topic = null;

  @SerializedName("url")
  private String url = null;

  public IoArgoprojEventsV1alpha1PulsarTrigger authTokenSecret(IoK8sApiCoreV1SecretKeySelector authTokenSecret) {
    this.authTokenSecret = authTokenSecret;
    return this;
  }

   /**
   * Get authTokenSecret
   * @return authTokenSecret
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getAuthTokenSecret() {
    return authTokenSecret;
  }

  public void setAuthTokenSecret(IoK8sApiCoreV1SecretKeySelector authTokenSecret) {
    this.authTokenSecret = authTokenSecret;
  }

  public IoArgoprojEventsV1alpha1PulsarTrigger connectionBackoff(IoArgoprojEventsV1alpha1Backoff connectionBackoff) {
    this.connectionBackoff = connectionBackoff;
    return this;
  }

   /**
   * Get connectionBackoff
   * @return connectionBackoff
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojEventsV1alpha1Backoff getConnectionBackoff() {
    return connectionBackoff;
  }

  public void setConnectionBackoff(IoArgoprojEventsV1alpha1Backoff connectionBackoff) {
    this.connectionBackoff = connectionBackoff;
  }

  public IoArgoprojEventsV1alpha1PulsarTrigger parameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojEventsV1alpha1PulsarTrigger addParametersItem(IoArgoprojEventsV1alpha1TriggerParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<IoArgoprojEventsV1alpha1TriggerParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Parameters is the list of parameters that is applied to resolved Kafka trigger object.
   * @return parameters
  **/
  @ApiModelProperty(value = "Parameters is the list of parameters that is applied to resolved Kafka trigger object.")
  public List<IoArgoprojEventsV1alpha1TriggerParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    this.parameters = parameters;
  }

  public IoArgoprojEventsV1alpha1PulsarTrigger payload(List<IoArgoprojEventsV1alpha1TriggerParameter> payload) {
    this.payload = payload;
    return this;
  }

  public IoArgoprojEventsV1alpha1PulsarTrigger addPayloadItem(IoArgoprojEventsV1alpha1TriggerParameter payloadItem) {
    if (this.payload == null) {
      this.payload = new ArrayList<IoArgoprojEventsV1alpha1TriggerParameter>();
    }
    this.payload.add(payloadItem);
    return this;
  }

   /**
   * Payload is the list of key-value extracted from an event payload to construct the request payload.
   * @return payload
  **/
  @ApiModelProperty(value = "Payload is the list of key-value extracted from an event payload to construct the request payload.")
  public List<IoArgoprojEventsV1alpha1TriggerParameter> getPayload() {
    return payload;
  }

  public void setPayload(List<IoArgoprojEventsV1alpha1TriggerParameter> payload) {
    this.payload = payload;
  }

  public IoArgoprojEventsV1alpha1PulsarTrigger tls(IoArgoprojEventsV1alpha1TLSConfig tls) {
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

  public IoArgoprojEventsV1alpha1PulsarTrigger tlsAllowInsecureConnection(Boolean tlsAllowInsecureConnection) {
    this.tlsAllowInsecureConnection = tlsAllowInsecureConnection;
    return this;
  }

   /**
   * Get tlsAllowInsecureConnection
   * @return tlsAllowInsecureConnection
  **/
  @ApiModelProperty(value = "")
  public Boolean isTlsAllowInsecureConnection() {
    return tlsAllowInsecureConnection;
  }

  public void setTlsAllowInsecureConnection(Boolean tlsAllowInsecureConnection) {
    this.tlsAllowInsecureConnection = tlsAllowInsecureConnection;
  }

  public IoArgoprojEventsV1alpha1PulsarTrigger tlsTrustCertsSecret(IoK8sApiCoreV1SecretKeySelector tlsTrustCertsSecret) {
    this.tlsTrustCertsSecret = tlsTrustCertsSecret;
    return this;
  }

   /**
   * Get tlsTrustCertsSecret
   * @return tlsTrustCertsSecret
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getTlsTrustCertsSecret() {
    return tlsTrustCertsSecret;
  }

  public void setTlsTrustCertsSecret(IoK8sApiCoreV1SecretKeySelector tlsTrustCertsSecret) {
    this.tlsTrustCertsSecret = tlsTrustCertsSecret;
  }

  public IoArgoprojEventsV1alpha1PulsarTrigger tlsValidateHostname(Boolean tlsValidateHostname) {
    this.tlsValidateHostname = tlsValidateHostname;
    return this;
  }

   /**
   * Get tlsValidateHostname
   * @return tlsValidateHostname
  **/
  @ApiModelProperty(value = "")
  public Boolean isTlsValidateHostname() {
    return tlsValidateHostname;
  }

  public void setTlsValidateHostname(Boolean tlsValidateHostname) {
    this.tlsValidateHostname = tlsValidateHostname;
  }

  public IoArgoprojEventsV1alpha1PulsarTrigger topic(String topic) {
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

  public IoArgoprojEventsV1alpha1PulsarTrigger url(String url) {
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
    IoArgoprojEventsV1alpha1PulsarTrigger ioArgoprojEventsV1alpha1PulsarTrigger = (IoArgoprojEventsV1alpha1PulsarTrigger) o;
    return Objects.equals(this.authTokenSecret, ioArgoprojEventsV1alpha1PulsarTrigger.authTokenSecret) &&
        Objects.equals(this.connectionBackoff, ioArgoprojEventsV1alpha1PulsarTrigger.connectionBackoff) &&
        Objects.equals(this.parameters, ioArgoprojEventsV1alpha1PulsarTrigger.parameters) &&
        Objects.equals(this.payload, ioArgoprojEventsV1alpha1PulsarTrigger.payload) &&
        Objects.equals(this.tls, ioArgoprojEventsV1alpha1PulsarTrigger.tls) &&
        Objects.equals(this.tlsAllowInsecureConnection, ioArgoprojEventsV1alpha1PulsarTrigger.tlsAllowInsecureConnection) &&
        Objects.equals(this.tlsTrustCertsSecret, ioArgoprojEventsV1alpha1PulsarTrigger.tlsTrustCertsSecret) &&
        Objects.equals(this.tlsValidateHostname, ioArgoprojEventsV1alpha1PulsarTrigger.tlsValidateHostname) &&
        Objects.equals(this.topic, ioArgoprojEventsV1alpha1PulsarTrigger.topic) &&
        Objects.equals(this.url, ioArgoprojEventsV1alpha1PulsarTrigger.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authTokenSecret, connectionBackoff, parameters, payload, tls, tlsAllowInsecureConnection, tlsTrustCertsSecret, tlsValidateHostname, topic, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1PulsarTrigger {\n");
    
    sb.append("    authTokenSecret: ").append(toIndentedString(authTokenSecret)).append("\n");
    sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    tlsAllowInsecureConnection: ").append(toIndentedString(tlsAllowInsecureConnection)).append("\n");
    sb.append("    tlsTrustCertsSecret: ").append(toIndentedString(tlsTrustCertsSecret)).append("\n");
    sb.append("    tlsValidateHostname: ").append(toIndentedString(tlsValidateHostname)).append("\n");
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
