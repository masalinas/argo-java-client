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

import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1BitbucketBasicAuth;
import io.oferto.argo.client.model.IoK8sApiCoreV1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * IoArgoprojEventsV1alpha1BitbucketAuth
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1BitbucketAuth {
  @SerializedName("basic")
  private IoArgoprojEventsV1alpha1BitbucketBasicAuth basic = null;

  @SerializedName("oauthToken")
  private IoK8sApiCoreV1SecretKeySelector oauthToken = null;

  public IoArgoprojEventsV1alpha1BitbucketAuth basic(IoArgoprojEventsV1alpha1BitbucketBasicAuth basic) {
    this.basic = basic;
    return this;
  }

   /**
   * Get basic
   * @return basic
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojEventsV1alpha1BitbucketBasicAuth getBasic() {
    return basic;
  }

  public void setBasic(IoArgoprojEventsV1alpha1BitbucketBasicAuth basic) {
    this.basic = basic;
  }

  public IoArgoprojEventsV1alpha1BitbucketAuth oauthToken(IoK8sApiCoreV1SecretKeySelector oauthToken) {
    this.oauthToken = oauthToken;
    return this;
  }

   /**
   * Get oauthToken
   * @return oauthToken
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretKeySelector getOauthToken() {
    return oauthToken;
  }

  public void setOauthToken(IoK8sApiCoreV1SecretKeySelector oauthToken) {
    this.oauthToken = oauthToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1BitbucketAuth ioArgoprojEventsV1alpha1BitbucketAuth = (IoArgoprojEventsV1alpha1BitbucketAuth) o;
    return Objects.equals(this.basic, ioArgoprojEventsV1alpha1BitbucketAuth.basic) &&
        Objects.equals(this.oauthToken, ioArgoprojEventsV1alpha1BitbucketAuth.oauthToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basic, oauthToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1BitbucketAuth {\n");
    
    sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
    sb.append("    oauthToken: ").append(toIndentedString(oauthToken)).append("\n");
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
