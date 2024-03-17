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
 * IoArgoprojEventsV1alpha1AWSLambdaTrigger
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1AWSLambdaTrigger {
  @SerializedName("accessKey")
  private IoK8sApiCoreV1SecretKeySelector accessKey = null;

  @SerializedName("functionName")
  private String functionName = null;

  @SerializedName("invocationType")
  private String invocationType = null;

  @SerializedName("parameters")
  private List<IoArgoprojEventsV1alpha1TriggerParameter> parameters = null;

  @SerializedName("payload")
  private List<IoArgoprojEventsV1alpha1TriggerParameter> payload = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("roleARN")
  private String roleARN = null;

  @SerializedName("secretKey")
  private IoK8sApiCoreV1SecretKeySelector secretKey = null;

  public IoArgoprojEventsV1alpha1AWSLambdaTrigger accessKey(IoK8sApiCoreV1SecretKeySelector accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(IoK8sApiCoreV1SecretKeySelector accessKey) {
    this.accessKey = accessKey;
  }

  public IoArgoprojEventsV1alpha1AWSLambdaTrigger functionName(String functionName) {
    this.functionName = functionName;
    return this;
  }

   /**
   * FunctionName refers to the name of the function to invoke.
   * @return functionName
  **/
  @ApiModelProperty(value = "FunctionName refers to the name of the function to invoke.")
  public String getFunctionName() {
    return functionName;
  }

  public void setFunctionName(String functionName) {
    this.functionName = functionName;
  }

  public IoArgoprojEventsV1alpha1AWSLambdaTrigger invocationType(String invocationType) {
    this.invocationType = invocationType;
    return this;
  }

   /**
   * Choose from the following options.     * RequestResponse (default) - Invoke the function synchronously. Keep    the connection open until the function returns a response or times out.    The API response includes the function response and additional data.     * Event - Invoke the function asynchronously. Send events that fail multiple    times to the function&#39;s dead-letter queue (if it&#39;s configured). The API    response only includes a status code.     * DryRun - Validate parameter values and verify that the user or role    has permission to invoke the function. +optional
   * @return invocationType
  **/
  @ApiModelProperty(value = "Choose from the following options.     * RequestResponse (default) - Invoke the function synchronously. Keep    the connection open until the function returns a response or times out.    The API response includes the function response and additional data.     * Event - Invoke the function asynchronously. Send events that fail multiple    times to the function's dead-letter queue (if it's configured). The API    response only includes a status code.     * DryRun - Validate parameter values and verify that the user or role    has permission to invoke the function. +optional")
  public String getInvocationType() {
    return invocationType;
  }

  public void setInvocationType(String invocationType) {
    this.invocationType = invocationType;
  }

  public IoArgoprojEventsV1alpha1AWSLambdaTrigger parameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojEventsV1alpha1AWSLambdaTrigger addParametersItem(IoArgoprojEventsV1alpha1TriggerParameter parametersItem) {
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

  public IoArgoprojEventsV1alpha1AWSLambdaTrigger payload(List<IoArgoprojEventsV1alpha1TriggerParameter> payload) {
    this.payload = payload;
    return this;
  }

  public IoArgoprojEventsV1alpha1AWSLambdaTrigger addPayloadItem(IoArgoprojEventsV1alpha1TriggerParameter payloadItem) {
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

  public IoArgoprojEventsV1alpha1AWSLambdaTrigger region(String region) {
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

  public IoArgoprojEventsV1alpha1AWSLambdaTrigger roleARN(String roleARN) {
    this.roleARN = roleARN;
    return this;
  }

   /**
   * Get roleARN
   * @return roleARN
  **/
  @ApiModelProperty(value = "")
  public String getRoleARN() {
    return roleARN;
  }

  public void setRoleARN(String roleARN) {
    this.roleARN = roleARN;
  }

  public IoArgoprojEventsV1alpha1AWSLambdaTrigger secretKey(IoK8sApiCoreV1SecretKeySelector secretKey) {
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Get secretKey
   * @return secretKey
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(IoK8sApiCoreV1SecretKeySelector secretKey) {
    this.secretKey = secretKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1AWSLambdaTrigger ioArgoprojEventsV1alpha1AWSLambdaTrigger = (IoArgoprojEventsV1alpha1AWSLambdaTrigger) o;
    return Objects.equals(this.accessKey, ioArgoprojEventsV1alpha1AWSLambdaTrigger.accessKey) &&
        Objects.equals(this.functionName, ioArgoprojEventsV1alpha1AWSLambdaTrigger.functionName) &&
        Objects.equals(this.invocationType, ioArgoprojEventsV1alpha1AWSLambdaTrigger.invocationType) &&
        Objects.equals(this.parameters, ioArgoprojEventsV1alpha1AWSLambdaTrigger.parameters) &&
        Objects.equals(this.payload, ioArgoprojEventsV1alpha1AWSLambdaTrigger.payload) &&
        Objects.equals(this.region, ioArgoprojEventsV1alpha1AWSLambdaTrigger.region) &&
        Objects.equals(this.roleARN, ioArgoprojEventsV1alpha1AWSLambdaTrigger.roleARN) &&
        Objects.equals(this.secretKey, ioArgoprojEventsV1alpha1AWSLambdaTrigger.secretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, functionName, invocationType, parameters, payload, region, roleARN, secretKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1AWSLambdaTrigger {\n");
    
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    functionName: ").append(toIndentedString(functionName)).append("\n");
    sb.append("    invocationType: ").append(toIndentedString(invocationType)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    roleARN: ").append(toIndentedString(roleARN)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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

