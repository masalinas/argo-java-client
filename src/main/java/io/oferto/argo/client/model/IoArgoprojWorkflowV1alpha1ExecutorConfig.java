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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ExecutorConfig holds configurations of an executor container.
 */
@ApiModel(description = "ExecutorConfig holds configurations of an executor container.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1ExecutorConfig {
  @SerializedName("serviceAccountName")
  private String serviceAccountName = null;

  public IoArgoprojWorkflowV1alpha1ExecutorConfig serviceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return this;
  }

   /**
   * ServiceAccountName specifies the service account name of the executor container.
   * @return serviceAccountName
  **/
  @ApiModelProperty(value = "ServiceAccountName specifies the service account name of the executor container.")
  public String getServiceAccountName() {
    return serviceAccountName;
  }

  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1ExecutorConfig ioArgoprojWorkflowV1alpha1ExecutorConfig = (IoArgoprojWorkflowV1alpha1ExecutorConfig) o;
    return Objects.equals(this.serviceAccountName, ioArgoprojWorkflowV1alpha1ExecutorConfig.serviceAccountName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceAccountName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1ExecutorConfig {\n");
    
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
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

