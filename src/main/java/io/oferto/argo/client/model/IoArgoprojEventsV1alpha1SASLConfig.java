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
 * IoArgoprojEventsV1alpha1SASLConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1SASLConfig {
  @SerializedName("mechanism")
  private String mechanism = null;

  @SerializedName("password")
  private IoK8sApiCoreV1SecretKeySelector password = null;

  @SerializedName("user")
  private IoK8sApiCoreV1SecretKeySelector user = null;

  public IoArgoprojEventsV1alpha1SASLConfig mechanism(String mechanism) {
    this.mechanism = mechanism;
    return this;
  }

   /**
   * Get mechanism
   * @return mechanism
  **/
  @ApiModelProperty(value = "")
  public String getMechanism() {
    return mechanism;
  }

  public void setMechanism(String mechanism) {
    this.mechanism = mechanism;
  }

  public IoArgoprojEventsV1alpha1SASLConfig password(IoK8sApiCoreV1SecretKeySelector password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getPassword() {
    return password;
  }

  public void setPassword(IoK8sApiCoreV1SecretKeySelector password) {
    this.password = password;
  }

  public IoArgoprojEventsV1alpha1SASLConfig user(IoK8sApiCoreV1SecretKeySelector user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getUser() {
    return user;
  }

  public void setUser(IoK8sApiCoreV1SecretKeySelector user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1SASLConfig ioArgoprojEventsV1alpha1SASLConfig = (IoArgoprojEventsV1alpha1SASLConfig) o;
    return Objects.equals(this.mechanism, ioArgoprojEventsV1alpha1SASLConfig.mechanism) &&
        Objects.equals(this.password, ioArgoprojEventsV1alpha1SASLConfig.password) &&
        Objects.equals(this.user, ioArgoprojEventsV1alpha1SASLConfig.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mechanism, password, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1SASLConfig {\n");
    
    sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

