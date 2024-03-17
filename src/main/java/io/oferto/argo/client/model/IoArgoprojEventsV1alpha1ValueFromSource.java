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

import io.oferto.argo.client.model.IoK8sApiCoreV1ConfigMapKeySelector;
import io.oferto.argo.client.model.IoK8sApiCoreV1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * IoArgoprojEventsV1alpha1ValueFromSource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1ValueFromSource {
  @SerializedName("configMapKeyRef")
  private IoK8sApiCoreV1ConfigMapKeySelector configMapKeyRef = null;

  @SerializedName("secretKeyRef")
  private IoK8sApiCoreV1SecretKeySelector secretKeyRef = null;

  public IoArgoprojEventsV1alpha1ValueFromSource configMapKeyRef(IoK8sApiCoreV1ConfigMapKeySelector configMapKeyRef) {
    this.configMapKeyRef = configMapKeyRef;
    return this;
  }

   /**
   * Get configMapKeyRef
   * @return configMapKeyRef
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1ConfigMapKeySelector getConfigMapKeyRef() {
    return configMapKeyRef;
  }

  public void setConfigMapKeyRef(IoK8sApiCoreV1ConfigMapKeySelector configMapKeyRef) {
    this.configMapKeyRef = configMapKeyRef;
  }

  public IoArgoprojEventsV1alpha1ValueFromSource secretKeyRef(IoK8sApiCoreV1SecretKeySelector secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
    return this;
  }

   /**
   * Get secretKeyRef
   * @return secretKeyRef
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getSecretKeyRef() {
    return secretKeyRef;
  }

  public void setSecretKeyRef(IoK8sApiCoreV1SecretKeySelector secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1ValueFromSource ioArgoprojEventsV1alpha1ValueFromSource = (IoArgoprojEventsV1alpha1ValueFromSource) o;
    return Objects.equals(this.configMapKeyRef, ioArgoprojEventsV1alpha1ValueFromSource.configMapKeyRef) &&
        Objects.equals(this.secretKeyRef, ioArgoprojEventsV1alpha1ValueFromSource.secretKeyRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapKeyRef, secretKeyRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1ValueFromSource {\n");
    
    sb.append("    configMapKeyRef: ").append(toIndentedString(configMapKeyRef)).append("\n");
    sb.append("    secretKeyRef: ").append(toIndentedString(secretKeyRef)).append("\n");
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

