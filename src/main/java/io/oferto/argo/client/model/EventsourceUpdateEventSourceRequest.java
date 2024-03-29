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

import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1EventSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * EventsourceUpdateEventSourceRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class EventsourceUpdateEventSourceRequest {
  @SerializedName("eventSource")
  private IoArgoprojEventsV1alpha1EventSource eventSource = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

  public EventsourceUpdateEventSourceRequest eventSource(IoArgoprojEventsV1alpha1EventSource eventSource) {
    this.eventSource = eventSource;
    return this;
  }

   /**
   * Get eventSource
   * @return eventSource
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojEventsV1alpha1EventSource getEventSource() {
    return eventSource;
  }

  public void setEventSource(IoArgoprojEventsV1alpha1EventSource eventSource) {
    this.eventSource = eventSource;
  }

  public EventsourceUpdateEventSourceRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EventsourceUpdateEventSourceRequest namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @ApiModelProperty(value = "")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsourceUpdateEventSourceRequest eventsourceUpdateEventSourceRequest = (EventsourceUpdateEventSourceRequest) o;
    return Objects.equals(this.eventSource, eventsourceUpdateEventSourceRequest.eventSource) &&
        Objects.equals(this.name, eventsourceUpdateEventSourceRequest.name) &&
        Objects.equals(this.namespace, eventsourceUpdateEventSourceRequest.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventSource, name, namespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsourceUpdateEventSourceRequest {\n");
    
    sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

