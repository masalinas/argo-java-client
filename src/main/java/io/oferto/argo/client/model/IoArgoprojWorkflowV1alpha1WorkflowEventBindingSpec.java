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

import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1Event;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1Submit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * IoArgoprojWorkflowV1alpha1WorkflowEventBindingSpec
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1WorkflowEventBindingSpec {
  @SerializedName("event")
  private IoArgoprojWorkflowV1alpha1Event event = null;

  @SerializedName("submit")
  private IoArgoprojWorkflowV1alpha1Submit submit = null;

  public IoArgoprojWorkflowV1alpha1WorkflowEventBindingSpec event(IoArgoprojWorkflowV1alpha1Event event) {
    this.event = event;
    return this;
  }

   /**
   * Event is the event to bind to
   * @return event
  **/
  @ApiModelProperty(required = true, value = "Event is the event to bind to")
  public IoArgoprojWorkflowV1alpha1Event getEvent() {
    return event;
  }

  public void setEvent(IoArgoprojWorkflowV1alpha1Event event) {
    this.event = event;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowEventBindingSpec submit(IoArgoprojWorkflowV1alpha1Submit submit) {
    this.submit = submit;
    return this;
  }

   /**
   * Submit is the workflow template to submit
   * @return submit
  **/
  @ApiModelProperty(value = "Submit is the workflow template to submit")
  public IoArgoprojWorkflowV1alpha1Submit getSubmit() {
    return submit;
  }

  public void setSubmit(IoArgoprojWorkflowV1alpha1Submit submit) {
    this.submit = submit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1WorkflowEventBindingSpec ioArgoprojWorkflowV1alpha1WorkflowEventBindingSpec = (IoArgoprojWorkflowV1alpha1WorkflowEventBindingSpec) o;
    return Objects.equals(this.event, ioArgoprojWorkflowV1alpha1WorkflowEventBindingSpec.event) &&
        Objects.equals(this.submit, ioArgoprojWorkflowV1alpha1WorkflowEventBindingSpec.submit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, submit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1WorkflowEventBindingSpec {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    submit: ").append(toIndentedString(submit)).append("\n");
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

