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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CustomTrigger refers to the specification of the custom trigger.
 */
@ApiModel(description = "CustomTrigger refers to the specification of the custom trigger.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1CustomTrigger {
  @SerializedName("certSecret")
  private IoK8sApiCoreV1SecretKeySelector certSecret = null;

  @SerializedName("parameters")
  private List<IoArgoprojEventsV1alpha1TriggerParameter> parameters = null;

  @SerializedName("payload")
  private List<IoArgoprojEventsV1alpha1TriggerParameter> payload = null;

  @SerializedName("secure")
  private Boolean secure = null;

  @SerializedName("serverNameOverride")
  private String serverNameOverride = null;

  @SerializedName("serverURL")
  private String serverURL = null;

  @SerializedName("spec")
  private Map<String, String> spec = null;

  public IoArgoprojEventsV1alpha1CustomTrigger certSecret(IoK8sApiCoreV1SecretKeySelector certSecret) {
    this.certSecret = certSecret;
    return this;
  }

   /**
   * CertSecret refers to the secret that contains cert for secure connection between sensor and custom trigger gRPC server.
   * @return certSecret
  **/
  @ApiModelProperty(value = "CertSecret refers to the secret that contains cert for secure connection between sensor and custom trigger gRPC server.")
  public IoK8sApiCoreV1SecretKeySelector getCertSecret() {
    return certSecret;
  }

  public void setCertSecret(IoK8sApiCoreV1SecretKeySelector certSecret) {
    this.certSecret = certSecret;
  }

  public IoArgoprojEventsV1alpha1CustomTrigger parameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojEventsV1alpha1CustomTrigger addParametersItem(IoArgoprojEventsV1alpha1TriggerParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<IoArgoprojEventsV1alpha1TriggerParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Parameters is the list of parameters that is applied to resolved custom trigger trigger object.
   * @return parameters
  **/
  @ApiModelProperty(value = "Parameters is the list of parameters that is applied to resolved custom trigger trigger object.")
  public List<IoArgoprojEventsV1alpha1TriggerParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    this.parameters = parameters;
  }

  public IoArgoprojEventsV1alpha1CustomTrigger payload(List<IoArgoprojEventsV1alpha1TriggerParameter> payload) {
    this.payload = payload;
    return this;
  }

  public IoArgoprojEventsV1alpha1CustomTrigger addPayloadItem(IoArgoprojEventsV1alpha1TriggerParameter payloadItem) {
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

  public IoArgoprojEventsV1alpha1CustomTrigger secure(Boolean secure) {
    this.secure = secure;
    return this;
  }

   /**
   * Get secure
   * @return secure
  **/
  @ApiModelProperty(value = "")
  public Boolean isSecure() {
    return secure;
  }

  public void setSecure(Boolean secure) {
    this.secure = secure;
  }

  public IoArgoprojEventsV1alpha1CustomTrigger serverNameOverride(String serverNameOverride) {
    this.serverNameOverride = serverNameOverride;
    return this;
  }

   /**
   * ServerNameOverride for the secure connection between sensor and custom trigger gRPC server.
   * @return serverNameOverride
  **/
  @ApiModelProperty(value = "ServerNameOverride for the secure connection between sensor and custom trigger gRPC server.")
  public String getServerNameOverride() {
    return serverNameOverride;
  }

  public void setServerNameOverride(String serverNameOverride) {
    this.serverNameOverride = serverNameOverride;
  }

  public IoArgoprojEventsV1alpha1CustomTrigger serverURL(String serverURL) {
    this.serverURL = serverURL;
    return this;
  }

   /**
   * Get serverURL
   * @return serverURL
  **/
  @ApiModelProperty(value = "")
  public String getServerURL() {
    return serverURL;
  }

  public void setServerURL(String serverURL) {
    this.serverURL = serverURL;
  }

  public IoArgoprojEventsV1alpha1CustomTrigger spec(Map<String, String> spec) {
    this.spec = spec;
    return this;
  }

  public IoArgoprojEventsV1alpha1CustomTrigger putSpecItem(String key, String specItem) {
    if (this.spec == null) {
      this.spec = new HashMap<String, String>();
    }
    this.spec.put(key, specItem);
    return this;
  }

   /**
   * Spec is the custom trigger resource specification that custom trigger gRPC server knows how to interpret.
   * @return spec
  **/
  @ApiModelProperty(value = "Spec is the custom trigger resource specification that custom trigger gRPC server knows how to interpret.")
  public Map<String, String> getSpec() {
    return spec;
  }

  public void setSpec(Map<String, String> spec) {
    this.spec = spec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1CustomTrigger ioArgoprojEventsV1alpha1CustomTrigger = (IoArgoprojEventsV1alpha1CustomTrigger) o;
    return Objects.equals(this.certSecret, ioArgoprojEventsV1alpha1CustomTrigger.certSecret) &&
        Objects.equals(this.parameters, ioArgoprojEventsV1alpha1CustomTrigger.parameters) &&
        Objects.equals(this.payload, ioArgoprojEventsV1alpha1CustomTrigger.payload) &&
        Objects.equals(this.secure, ioArgoprojEventsV1alpha1CustomTrigger.secure) &&
        Objects.equals(this.serverNameOverride, ioArgoprojEventsV1alpha1CustomTrigger.serverNameOverride) &&
        Objects.equals(this.serverURL, ioArgoprojEventsV1alpha1CustomTrigger.serverURL) &&
        Objects.equals(this.spec, ioArgoprojEventsV1alpha1CustomTrigger.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certSecret, parameters, payload, secure, serverNameOverride, serverURL, spec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1CustomTrigger {\n");
    
    sb.append("    certSecret: ").append(toIndentedString(certSecret)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
    sb.append("    serverNameOverride: ").append(toIndentedString(serverNameOverride)).append("\n");
    sb.append("    serverURL: ").append(toIndentedString(serverURL)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
