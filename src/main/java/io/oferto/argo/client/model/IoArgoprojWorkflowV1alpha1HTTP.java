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

import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1HTTPBodySource;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1HTTPHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IoArgoprojWorkflowV1alpha1HTTP
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1HTTP {
  @SerializedName("body")
  private String body = null;

  @SerializedName("bodyFrom")
  private IoArgoprojWorkflowV1alpha1HTTPBodySource bodyFrom = null;

  @SerializedName("headers")
  private List<IoArgoprojWorkflowV1alpha1HTTPHeader> headers = null;

  @SerializedName("insecureSkipVerify")
  private Boolean insecureSkipVerify = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("successCondition")
  private String successCondition = null;

  @SerializedName("timeoutSeconds")
  private Integer timeoutSeconds = null;

  @SerializedName("url")
  private String url = null;

  public IoArgoprojWorkflowV1alpha1HTTP body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Body is content of the HTTP Request
   * @return body
  **/
  @ApiModelProperty(value = "Body is content of the HTTP Request")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public IoArgoprojWorkflowV1alpha1HTTP bodyFrom(IoArgoprojWorkflowV1alpha1HTTPBodySource bodyFrom) {
    this.bodyFrom = bodyFrom;
    return this;
  }

   /**
   * BodyFrom is  content of the HTTP Request as Bytes
   * @return bodyFrom
  **/
  @ApiModelProperty(value = "BodyFrom is  content of the HTTP Request as Bytes")
  public IoArgoprojWorkflowV1alpha1HTTPBodySource getBodyFrom() {
    return bodyFrom;
  }

  public void setBodyFrom(IoArgoprojWorkflowV1alpha1HTTPBodySource bodyFrom) {
    this.bodyFrom = bodyFrom;
  }

  public IoArgoprojWorkflowV1alpha1HTTP headers(List<IoArgoprojWorkflowV1alpha1HTTPHeader> headers) {
    this.headers = headers;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1HTTP addHeadersItem(IoArgoprojWorkflowV1alpha1HTTPHeader headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<IoArgoprojWorkflowV1alpha1HTTPHeader>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Headers are an optional list of headers to send with HTTP requests
   * @return headers
  **/
  @ApiModelProperty(value = "Headers are an optional list of headers to send with HTTP requests")
  public List<IoArgoprojWorkflowV1alpha1HTTPHeader> getHeaders() {
    return headers;
  }

  public void setHeaders(List<IoArgoprojWorkflowV1alpha1HTTPHeader> headers) {
    this.headers = headers;
  }

  public IoArgoprojWorkflowV1alpha1HTTP insecureSkipVerify(Boolean insecureSkipVerify) {
    this.insecureSkipVerify = insecureSkipVerify;
    return this;
  }

   /**
   * InsecureSkipVerify is a bool when if set to true will skip TLS verification for the HTTP client
   * @return insecureSkipVerify
  **/
  @ApiModelProperty(value = "InsecureSkipVerify is a bool when if set to true will skip TLS verification for the HTTP client")
  public Boolean isInsecureSkipVerify() {
    return insecureSkipVerify;
  }

  public void setInsecureSkipVerify(Boolean insecureSkipVerify) {
    this.insecureSkipVerify = insecureSkipVerify;
  }

  public IoArgoprojWorkflowV1alpha1HTTP method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Method is HTTP methods for HTTP Request
   * @return method
  **/
  @ApiModelProperty(value = "Method is HTTP methods for HTTP Request")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public IoArgoprojWorkflowV1alpha1HTTP successCondition(String successCondition) {
    this.successCondition = successCondition;
    return this;
  }

   /**
   * SuccessCondition is an expression if evaluated to true is considered successful
   * @return successCondition
  **/
  @ApiModelProperty(value = "SuccessCondition is an expression if evaluated to true is considered successful")
  public String getSuccessCondition() {
    return successCondition;
  }

  public void setSuccessCondition(String successCondition) {
    this.successCondition = successCondition;
  }

  public IoArgoprojWorkflowV1alpha1HTTP timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * TimeoutSeconds is request timeout for HTTP Request. Default is 30 seconds
   * @return timeoutSeconds
  **/
  @ApiModelProperty(value = "TimeoutSeconds is request timeout for HTTP Request. Default is 30 seconds")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }

  public IoArgoprojWorkflowV1alpha1HTTP url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL of the HTTP Request
   * @return url
  **/
  @ApiModelProperty(required = true, value = "URL of the HTTP Request")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1HTTP ioArgoprojWorkflowV1alpha1HTTP = (IoArgoprojWorkflowV1alpha1HTTP) o;
    return Objects.equals(this.body, ioArgoprojWorkflowV1alpha1HTTP.body) &&
        Objects.equals(this.bodyFrom, ioArgoprojWorkflowV1alpha1HTTP.bodyFrom) &&
        Objects.equals(this.headers, ioArgoprojWorkflowV1alpha1HTTP.headers) &&
        Objects.equals(this.insecureSkipVerify, ioArgoprojWorkflowV1alpha1HTTP.insecureSkipVerify) &&
        Objects.equals(this.method, ioArgoprojWorkflowV1alpha1HTTP.method) &&
        Objects.equals(this.successCondition, ioArgoprojWorkflowV1alpha1HTTP.successCondition) &&
        Objects.equals(this.timeoutSeconds, ioArgoprojWorkflowV1alpha1HTTP.timeoutSeconds) &&
        Objects.equals(this.url, ioArgoprojWorkflowV1alpha1HTTP.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, bodyFrom, headers, insecureSkipVerify, method, successCondition, timeoutSeconds, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1HTTP {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    bodyFrom: ").append(toIndentedString(bodyFrom)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    insecureSkipVerify: ").append(toIndentedString(insecureSkipVerify)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    successCondition: ").append(toIndentedString(successCondition)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

