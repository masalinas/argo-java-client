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

/**
 * ArtifactoryArtifact is the location of an artifactory artifact
 */
@ApiModel(description = "ArtifactoryArtifact is the location of an artifactory artifact")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1ArtifactoryArtifact {
  @SerializedName("passwordSecret")
  private IoK8sApiCoreV1SecretKeySelector passwordSecret = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("usernameSecret")
  private IoK8sApiCoreV1SecretKeySelector usernameSecret = null;

  public IoArgoprojWorkflowV1alpha1ArtifactoryArtifact passwordSecret(IoK8sApiCoreV1SecretKeySelector passwordSecret) {
    this.passwordSecret = passwordSecret;
    return this;
  }

   /**
   * PasswordSecret is the secret selector to the repository password
   * @return passwordSecret
  **/
  @ApiModelProperty(value = "PasswordSecret is the secret selector to the repository password")
  public IoK8sApiCoreV1SecretKeySelector getPasswordSecret() {
    return passwordSecret;
  }

  public void setPasswordSecret(IoK8sApiCoreV1SecretKeySelector passwordSecret) {
    this.passwordSecret = passwordSecret;
  }

  public IoArgoprojWorkflowV1alpha1ArtifactoryArtifact url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL of the artifact
   * @return url
  **/
  @ApiModelProperty(required = true, value = "URL of the artifact")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public IoArgoprojWorkflowV1alpha1ArtifactoryArtifact usernameSecret(IoK8sApiCoreV1SecretKeySelector usernameSecret) {
    this.usernameSecret = usernameSecret;
    return this;
  }

   /**
   * UsernameSecret is the secret selector to the repository username
   * @return usernameSecret
  **/
  @ApiModelProperty(value = "UsernameSecret is the secret selector to the repository username")
  public IoK8sApiCoreV1SecretKeySelector getUsernameSecret() {
    return usernameSecret;
  }

  public void setUsernameSecret(IoK8sApiCoreV1SecretKeySelector usernameSecret) {
    this.usernameSecret = usernameSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1ArtifactoryArtifact ioArgoprojWorkflowV1alpha1ArtifactoryArtifact = (IoArgoprojWorkflowV1alpha1ArtifactoryArtifact) o;
    return Objects.equals(this.passwordSecret, ioArgoprojWorkflowV1alpha1ArtifactoryArtifact.passwordSecret) &&
        Objects.equals(this.url, ioArgoprojWorkflowV1alpha1ArtifactoryArtifact.url) &&
        Objects.equals(this.usernameSecret, ioArgoprojWorkflowV1alpha1ArtifactoryArtifact.usernameSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordSecret, url, usernameSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1ArtifactoryArtifact {\n");
    
    sb.append("    passwordSecret: ").append(toIndentedString(passwordSecret)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    usernameSecret: ").append(toIndentedString(usernameSecret)).append("\n");
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

