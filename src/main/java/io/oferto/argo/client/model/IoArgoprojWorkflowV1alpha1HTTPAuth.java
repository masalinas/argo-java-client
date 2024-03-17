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

import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1BasicAuth;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1ClientCertAuth;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1OAuth2Auth;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * IoArgoprojWorkflowV1alpha1HTTPAuth
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1HTTPAuth {
  @SerializedName("basicAuth")
  private IoArgoprojWorkflowV1alpha1BasicAuth basicAuth = null;

  @SerializedName("clientCert")
  private IoArgoprojWorkflowV1alpha1ClientCertAuth clientCert = null;

  @SerializedName("oauth2")
  private IoArgoprojWorkflowV1alpha1OAuth2Auth oauth2 = null;

  public IoArgoprojWorkflowV1alpha1HTTPAuth basicAuth(IoArgoprojWorkflowV1alpha1BasicAuth basicAuth) {
    this.basicAuth = basicAuth;
    return this;
  }

   /**
   * Get basicAuth
   * @return basicAuth
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojWorkflowV1alpha1BasicAuth getBasicAuth() {
    return basicAuth;
  }

  public void setBasicAuth(IoArgoprojWorkflowV1alpha1BasicAuth basicAuth) {
    this.basicAuth = basicAuth;
  }

  public IoArgoprojWorkflowV1alpha1HTTPAuth clientCert(IoArgoprojWorkflowV1alpha1ClientCertAuth clientCert) {
    this.clientCert = clientCert;
    return this;
  }

   /**
   * Get clientCert
   * @return clientCert
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojWorkflowV1alpha1ClientCertAuth getClientCert() {
    return clientCert;
  }

  public void setClientCert(IoArgoprojWorkflowV1alpha1ClientCertAuth clientCert) {
    this.clientCert = clientCert;
  }

  public IoArgoprojWorkflowV1alpha1HTTPAuth oauth2(IoArgoprojWorkflowV1alpha1OAuth2Auth oauth2) {
    this.oauth2 = oauth2;
    return this;
  }

   /**
   * Get oauth2
   * @return oauth2
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojWorkflowV1alpha1OAuth2Auth getOauth2() {
    return oauth2;
  }

  public void setOauth2(IoArgoprojWorkflowV1alpha1OAuth2Auth oauth2) {
    this.oauth2 = oauth2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1HTTPAuth ioArgoprojWorkflowV1alpha1HTTPAuth = (IoArgoprojWorkflowV1alpha1HTTPAuth) o;
    return Objects.equals(this.basicAuth, ioArgoprojWorkflowV1alpha1HTTPAuth.basicAuth) &&
        Objects.equals(this.clientCert, ioArgoprojWorkflowV1alpha1HTTPAuth.clientCert) &&
        Objects.equals(this.oauth2, ioArgoprojWorkflowV1alpha1HTTPAuth.oauth2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicAuth, clientCert, oauth2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1HTTPAuth {\n");
    
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    clientCert: ").append(toIndentedString(clientCert)).append("\n");
    sb.append("    oauth2: ").append(toIndentedString(oauth2)).append("\n");
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

