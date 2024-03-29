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

import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1OAuth2EndpointParam;
import io.oferto.argo.client.model.IoK8sApiCoreV1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OAuth2Auth holds all information for client authentication via OAuth2 tokens
 */
@ApiModel(description = "OAuth2Auth holds all information for client authentication via OAuth2 tokens")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1OAuth2Auth {
  @SerializedName("clientIDSecret")
  private IoK8sApiCoreV1SecretKeySelector clientIDSecret = null;

  @SerializedName("clientSecretSecret")
  private IoK8sApiCoreV1SecretKeySelector clientSecretSecret = null;

  @SerializedName("endpointParams")
  private List<IoArgoprojWorkflowV1alpha1OAuth2EndpointParam> endpointParams = null;

  @SerializedName("scopes")
  private List<String> scopes = null;

  @SerializedName("tokenURLSecret")
  private IoK8sApiCoreV1SecretKeySelector tokenURLSecret = null;

  public IoArgoprojWorkflowV1alpha1OAuth2Auth clientIDSecret(IoK8sApiCoreV1SecretKeySelector clientIDSecret) {
    this.clientIDSecret = clientIDSecret;
    return this;
  }

   /**
   * Get clientIDSecret
   * @return clientIDSecret
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getClientIDSecret() {
    return clientIDSecret;
  }

  public void setClientIDSecret(IoK8sApiCoreV1SecretKeySelector clientIDSecret) {
    this.clientIDSecret = clientIDSecret;
  }

  public IoArgoprojWorkflowV1alpha1OAuth2Auth clientSecretSecret(IoK8sApiCoreV1SecretKeySelector clientSecretSecret) {
    this.clientSecretSecret = clientSecretSecret;
    return this;
  }

   /**
   * Get clientSecretSecret
   * @return clientSecretSecret
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getClientSecretSecret() {
    return clientSecretSecret;
  }

  public void setClientSecretSecret(IoK8sApiCoreV1SecretKeySelector clientSecretSecret) {
    this.clientSecretSecret = clientSecretSecret;
  }

  public IoArgoprojWorkflowV1alpha1OAuth2Auth endpointParams(List<IoArgoprojWorkflowV1alpha1OAuth2EndpointParam> endpointParams) {
    this.endpointParams = endpointParams;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1OAuth2Auth addEndpointParamsItem(IoArgoprojWorkflowV1alpha1OAuth2EndpointParam endpointParamsItem) {
    if (this.endpointParams == null) {
      this.endpointParams = new ArrayList<IoArgoprojWorkflowV1alpha1OAuth2EndpointParam>();
    }
    this.endpointParams.add(endpointParamsItem);
    return this;
  }

   /**
   * Get endpointParams
   * @return endpointParams
  **/
  @ApiModelProperty(value = "")
  public List<IoArgoprojWorkflowV1alpha1OAuth2EndpointParam> getEndpointParams() {
    return endpointParams;
  }

  public void setEndpointParams(List<IoArgoprojWorkflowV1alpha1OAuth2EndpointParam> endpointParams) {
    this.endpointParams = endpointParams;
  }

  public IoArgoprojWorkflowV1alpha1OAuth2Auth scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1OAuth2Auth addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<String>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @ApiModelProperty(value = "")
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }

  public IoArgoprojWorkflowV1alpha1OAuth2Auth tokenURLSecret(IoK8sApiCoreV1SecretKeySelector tokenURLSecret) {
    this.tokenURLSecret = tokenURLSecret;
    return this;
  }

   /**
   * Get tokenURLSecret
   * @return tokenURLSecret
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getTokenURLSecret() {
    return tokenURLSecret;
  }

  public void setTokenURLSecret(IoK8sApiCoreV1SecretKeySelector tokenURLSecret) {
    this.tokenURLSecret = tokenURLSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1OAuth2Auth ioArgoprojWorkflowV1alpha1OAuth2Auth = (IoArgoprojWorkflowV1alpha1OAuth2Auth) o;
    return Objects.equals(this.clientIDSecret, ioArgoprojWorkflowV1alpha1OAuth2Auth.clientIDSecret) &&
        Objects.equals(this.clientSecretSecret, ioArgoprojWorkflowV1alpha1OAuth2Auth.clientSecretSecret) &&
        Objects.equals(this.endpointParams, ioArgoprojWorkflowV1alpha1OAuth2Auth.endpointParams) &&
        Objects.equals(this.scopes, ioArgoprojWorkflowV1alpha1OAuth2Auth.scopes) &&
        Objects.equals(this.tokenURLSecret, ioArgoprojWorkflowV1alpha1OAuth2Auth.tokenURLSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIDSecret, clientSecretSecret, endpointParams, scopes, tokenURLSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1OAuth2Auth {\n");
    
    sb.append("    clientIDSecret: ").append(toIndentedString(clientIDSecret)).append("\n");
    sb.append("    clientSecretSecret: ").append(toIndentedString(clientSecretSecret)).append("\n");
    sb.append("    endpointParams: ").append(toIndentedString(endpointParams)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    tokenURLSecret: ").append(toIndentedString(tokenURLSecret)).append("\n");
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

