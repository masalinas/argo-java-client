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
 * AzureArtifactRepository defines the controller configuration for an Azure Blob Storage artifact repository
 */
@ApiModel(description = "AzureArtifactRepository defines the controller configuration for an Azure Blob Storage artifact repository")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1AzureArtifactRepository {
  @SerializedName("accountKeySecret")
  private IoK8sApiCoreV1SecretKeySelector accountKeySecret = null;

  @SerializedName("blobNameFormat")
  private String blobNameFormat = null;

  @SerializedName("container")
  private String container = null;

  @SerializedName("endpoint")
  private String endpoint = null;

  @SerializedName("useSDKCreds")
  private Boolean useSDKCreds = null;

  public IoArgoprojWorkflowV1alpha1AzureArtifactRepository accountKeySecret(IoK8sApiCoreV1SecretKeySelector accountKeySecret) {
    this.accountKeySecret = accountKeySecret;
    return this;
  }

   /**
   * AccountKeySecret is the secret selector to the Azure Blob Storage account access key
   * @return accountKeySecret
  **/
  @ApiModelProperty(value = "AccountKeySecret is the secret selector to the Azure Blob Storage account access key")
  public IoK8sApiCoreV1SecretKeySelector getAccountKeySecret() {
    return accountKeySecret;
  }

  public void setAccountKeySecret(IoK8sApiCoreV1SecretKeySelector accountKeySecret) {
    this.accountKeySecret = accountKeySecret;
  }

  public IoArgoprojWorkflowV1alpha1AzureArtifactRepository blobNameFormat(String blobNameFormat) {
    this.blobNameFormat = blobNameFormat;
    return this;
  }

   /**
   * BlobNameFormat is defines the format of how to store blob names. Can reference workflow variables
   * @return blobNameFormat
  **/
  @ApiModelProperty(value = "BlobNameFormat is defines the format of how to store blob names. Can reference workflow variables")
  public String getBlobNameFormat() {
    return blobNameFormat;
  }

  public void setBlobNameFormat(String blobNameFormat) {
    this.blobNameFormat = blobNameFormat;
  }

  public IoArgoprojWorkflowV1alpha1AzureArtifactRepository container(String container) {
    this.container = container;
    return this;
  }

   /**
   * Container is the container where resources will be stored
   * @return container
  **/
  @ApiModelProperty(required = true, value = "Container is the container where resources will be stored")
  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public IoArgoprojWorkflowV1alpha1AzureArtifactRepository endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Endpoint is the service url associated with an account. It is most likely \&quot;https://&lt;ACCOUNT_NAME&gt;.blob.core.windows.net\&quot;
   * @return endpoint
  **/
  @ApiModelProperty(required = true, value = "Endpoint is the service url associated with an account. It is most likely \"https://<ACCOUNT_NAME>.blob.core.windows.net\"")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public IoArgoprojWorkflowV1alpha1AzureArtifactRepository useSDKCreds(Boolean useSDKCreds) {
    this.useSDKCreds = useSDKCreds;
    return this;
  }

   /**
   * UseSDKCreds tells the driver to figure out credentials based on sdk defaults.
   * @return useSDKCreds
  **/
  @ApiModelProperty(value = "UseSDKCreds tells the driver to figure out credentials based on sdk defaults.")
  public Boolean isUseSDKCreds() {
    return useSDKCreds;
  }

  public void setUseSDKCreds(Boolean useSDKCreds) {
    this.useSDKCreds = useSDKCreds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1AzureArtifactRepository ioArgoprojWorkflowV1alpha1AzureArtifactRepository = (IoArgoprojWorkflowV1alpha1AzureArtifactRepository) o;
    return Objects.equals(this.accountKeySecret, ioArgoprojWorkflowV1alpha1AzureArtifactRepository.accountKeySecret) &&
        Objects.equals(this.blobNameFormat, ioArgoprojWorkflowV1alpha1AzureArtifactRepository.blobNameFormat) &&
        Objects.equals(this.container, ioArgoprojWorkflowV1alpha1AzureArtifactRepository.container) &&
        Objects.equals(this.endpoint, ioArgoprojWorkflowV1alpha1AzureArtifactRepository.endpoint) &&
        Objects.equals(this.useSDKCreds, ioArgoprojWorkflowV1alpha1AzureArtifactRepository.useSDKCreds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountKeySecret, blobNameFormat, container, endpoint, useSDKCreds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1AzureArtifactRepository {\n");
    
    sb.append("    accountKeySecret: ").append(toIndentedString(accountKeySecret)).append("\n");
    sb.append("    blobNameFormat: ").append(toIndentedString(blobNameFormat)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    useSDKCreds: ").append(toIndentedString(useSDKCreds)).append("\n");
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

