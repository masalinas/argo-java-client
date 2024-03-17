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

import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1WorkflowTemplate;
import io.oferto.argo.client.model.IoK8sApimachineryPkgApisMetaV1CreateOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * IoArgoprojWorkflowV1alpha1WorkflowTemplateCreateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1WorkflowTemplateCreateRequest {
  @SerializedName("createOptions")
  private IoK8sApimachineryPkgApisMetaV1CreateOptions createOptions = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("template")
  private IoArgoprojWorkflowV1alpha1WorkflowTemplate template = null;

  public IoArgoprojWorkflowV1alpha1WorkflowTemplateCreateRequest createOptions(IoK8sApimachineryPkgApisMetaV1CreateOptions createOptions) {
    this.createOptions = createOptions;
    return this;
  }

   /**
   * Get createOptions
   * @return createOptions
  **/
  @ApiModelProperty(value = "")
  public IoK8sApimachineryPkgApisMetaV1CreateOptions getCreateOptions() {
    return createOptions;
  }

  public void setCreateOptions(IoK8sApimachineryPkgApisMetaV1CreateOptions createOptions) {
    this.createOptions = createOptions;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowTemplateCreateRequest namespace(String namespace) {
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

  public IoArgoprojWorkflowV1alpha1WorkflowTemplateCreateRequest template(IoArgoprojWorkflowV1alpha1WorkflowTemplate template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojWorkflowV1alpha1WorkflowTemplate getTemplate() {
    return template;
  }

  public void setTemplate(IoArgoprojWorkflowV1alpha1WorkflowTemplate template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1WorkflowTemplateCreateRequest ioArgoprojWorkflowV1alpha1WorkflowTemplateCreateRequest = (IoArgoprojWorkflowV1alpha1WorkflowTemplateCreateRequest) o;
    return Objects.equals(this.createOptions, ioArgoprojWorkflowV1alpha1WorkflowTemplateCreateRequest.createOptions) &&
        Objects.equals(this.namespace, ioArgoprojWorkflowV1alpha1WorkflowTemplateCreateRequest.namespace) &&
        Objects.equals(this.template, ioArgoprojWorkflowV1alpha1WorkflowTemplateCreateRequest.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createOptions, namespace, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1WorkflowTemplateCreateRequest {\n");
    
    sb.append("    createOptions: ").append(toIndentedString(createOptions)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

