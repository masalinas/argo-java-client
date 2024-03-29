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

import io.oferto.argo.client.model.IoK8sApiCoreV1ExecAction;
import io.oferto.argo.client.model.IoK8sApiCoreV1HTTPGetAction;
import io.oferto.argo.client.model.IoK8sApiCoreV1TCPSocketAction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.
 */
@ApiModel(description = "LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoK8sApiCoreV1LifecycleHandler {
  @SerializedName("exec")
  private IoK8sApiCoreV1ExecAction exec = null;

  @SerializedName("httpGet")
  private IoK8sApiCoreV1HTTPGetAction httpGet = null;

  @SerializedName("tcpSocket")
  private IoK8sApiCoreV1TCPSocketAction tcpSocket = null;

  public IoK8sApiCoreV1LifecycleHandler exec(IoK8sApiCoreV1ExecAction exec) {
    this.exec = exec;
    return this;
  }

   /**
   * Exec specifies the action to take.
   * @return exec
  **/
  @ApiModelProperty(value = "Exec specifies the action to take.")
  public IoK8sApiCoreV1ExecAction getExec() {
    return exec;
  }

  public void setExec(IoK8sApiCoreV1ExecAction exec) {
    this.exec = exec;
  }

  public IoK8sApiCoreV1LifecycleHandler httpGet(IoK8sApiCoreV1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
    return this;
  }

   /**
   * HTTPGet specifies the http request to perform.
   * @return httpGet
  **/
  @ApiModelProperty(value = "HTTPGet specifies the http request to perform.")
  public IoK8sApiCoreV1HTTPGetAction getHttpGet() {
    return httpGet;
  }

  public void setHttpGet(IoK8sApiCoreV1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
  }

  public IoK8sApiCoreV1LifecycleHandler tcpSocket(IoK8sApiCoreV1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
    return this;
  }

   /**
   * Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.
   * @return tcpSocket
  **/
  @ApiModelProperty(value = "Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.")
  public IoK8sApiCoreV1TCPSocketAction getTcpSocket() {
    return tcpSocket;
  }

  public void setTcpSocket(IoK8sApiCoreV1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1LifecycleHandler ioK8sApiCoreV1LifecycleHandler = (IoK8sApiCoreV1LifecycleHandler) o;
    return Objects.equals(this.exec, ioK8sApiCoreV1LifecycleHandler.exec) &&
        Objects.equals(this.httpGet, ioK8sApiCoreV1LifecycleHandler.httpGet) &&
        Objects.equals(this.tcpSocket, ioK8sApiCoreV1LifecycleHandler.tcpSocket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exec, httpGet, tcpSocket);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1LifecycleHandler {\n");
    
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
    sb.append("    tcpSocket: ").append(toIndentedString(tcpSocket)).append("\n");
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

