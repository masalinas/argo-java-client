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

import io.oferto.argo.client.model.GrpcGatewayRuntimeStreamError;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1WorkflowWatchEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * StreamResultOfIoArgoprojWorkflowV1alpha1WorkflowWatchEvent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class StreamResultOfIoArgoprojWorkflowV1alpha1WorkflowWatchEvent {
  @SerializedName("error")
  private GrpcGatewayRuntimeStreamError error = null;

  @SerializedName("result")
  private IoArgoprojWorkflowV1alpha1WorkflowWatchEvent result = null;

  public StreamResultOfIoArgoprojWorkflowV1alpha1WorkflowWatchEvent error(GrpcGatewayRuntimeStreamError error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public GrpcGatewayRuntimeStreamError getError() {
    return error;
  }

  public void setError(GrpcGatewayRuntimeStreamError error) {
    this.error = error;
  }

  public StreamResultOfIoArgoprojWorkflowV1alpha1WorkflowWatchEvent result(IoArgoprojWorkflowV1alpha1WorkflowWatchEvent result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojWorkflowV1alpha1WorkflowWatchEvent getResult() {
    return result;
  }

  public void setResult(IoArgoprojWorkflowV1alpha1WorkflowWatchEvent result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamResultOfIoArgoprojWorkflowV1alpha1WorkflowWatchEvent streamResultOfIoArgoprojWorkflowV1alpha1WorkflowWatchEvent = (StreamResultOfIoArgoprojWorkflowV1alpha1WorkflowWatchEvent) o;
    return Objects.equals(this.error, streamResultOfIoArgoprojWorkflowV1alpha1WorkflowWatchEvent.error) &&
        Objects.equals(this.result, streamResultOfIoArgoprojWorkflowV1alpha1WorkflowWatchEvent.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamResultOfIoArgoprojWorkflowV1alpha1WorkflowWatchEvent {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

