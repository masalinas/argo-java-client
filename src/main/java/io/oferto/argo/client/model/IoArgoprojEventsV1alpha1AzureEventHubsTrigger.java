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

import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1TriggerParameter;
import io.oferto.argo.client.model.IoK8sApiCoreV1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IoArgoprojEventsV1alpha1AzureEventHubsTrigger
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1AzureEventHubsTrigger {
  @SerializedName("fqdn")
  private String fqdn = null;

  @SerializedName("hubName")
  private String hubName = null;

  @SerializedName("parameters")
  private List<IoArgoprojEventsV1alpha1TriggerParameter> parameters = null;

  @SerializedName("payload")
  private List<IoArgoprojEventsV1alpha1TriggerParameter> payload = null;

  @SerializedName("sharedAccessKey")
  private IoK8sApiCoreV1SecretKeySelector sharedAccessKey = null;

  @SerializedName("sharedAccessKeyName")
  private IoK8sApiCoreV1SecretKeySelector sharedAccessKeyName = null;

  public IoArgoprojEventsV1alpha1AzureEventHubsTrigger fqdn(String fqdn) {
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

  public IoArgoprojEventsV1alpha1AzureEventHubsTrigger hubName(String hubName) {
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

  public IoArgoprojEventsV1alpha1AzureEventHubsTrigger parameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojEventsV1alpha1AzureEventHubsTrigger addParametersItem(IoArgoprojEventsV1alpha1TriggerParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<IoArgoprojEventsV1alpha1TriggerParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(value = "")
  public List<IoArgoprojEventsV1alpha1TriggerParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    this.parameters = parameters;
  }

  public IoArgoprojEventsV1alpha1AzureEventHubsTrigger payload(List<IoArgoprojEventsV1alpha1TriggerParameter> payload) {
    this.payload = payload;
    return this;
  }

  public IoArgoprojEventsV1alpha1AzureEventHubsTrigger addPayloadItem(IoArgoprojEventsV1alpha1TriggerParameter payloadItem) {
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

  public IoArgoprojEventsV1alpha1AzureEventHubsTrigger sharedAccessKey(IoK8sApiCoreV1SecretKeySelector sharedAccessKey) {
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

  public IoArgoprojEventsV1alpha1AzureEventHubsTrigger sharedAccessKeyName(IoK8sApiCoreV1SecretKeySelector sharedAccessKeyName) {
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
    IoArgoprojEventsV1alpha1AzureEventHubsTrigger ioArgoprojEventsV1alpha1AzureEventHubsTrigger = (IoArgoprojEventsV1alpha1AzureEventHubsTrigger) o;
    return Objects.equals(this.fqdn, ioArgoprojEventsV1alpha1AzureEventHubsTrigger.fqdn) &&
        Objects.equals(this.hubName, ioArgoprojEventsV1alpha1AzureEventHubsTrigger.hubName) &&
        Objects.equals(this.parameters, ioArgoprojEventsV1alpha1AzureEventHubsTrigger.parameters) &&
        Objects.equals(this.payload, ioArgoprojEventsV1alpha1AzureEventHubsTrigger.payload) &&
        Objects.equals(this.sharedAccessKey, ioArgoprojEventsV1alpha1AzureEventHubsTrigger.sharedAccessKey) &&
        Objects.equals(this.sharedAccessKeyName, ioArgoprojEventsV1alpha1AzureEventHubsTrigger.sharedAccessKeyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fqdn, hubName, parameters, payload, sharedAccessKey, sharedAccessKeyName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1AzureEventHubsTrigger {\n");
    
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
    sb.append("    hubName: ").append(toIndentedString(hubName)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
