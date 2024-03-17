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
 * TemplateRef is a reference of template resource.
 */
@ApiModel(description = "TemplateRef is a reference of template resource.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1TemplateRef {
  @SerializedName("clusterScope")
  private Boolean clusterScope = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("template")
  private String template = null;

  public IoArgoprojWorkflowV1alpha1TemplateRef clusterScope(Boolean clusterScope) {
    this.clusterScope = clusterScope;
    return this;
  }

   /**
   * ClusterScope indicates the referred template is cluster scoped (i.e. a ClusterWorkflowTemplate).
   * @return clusterScope
  **/
  @ApiModelProperty(value = "ClusterScope indicates the referred template is cluster scoped (i.e. a ClusterWorkflowTemplate).")
  public Boolean isClusterScope() {
    return clusterScope;
  }

  public void setClusterScope(Boolean clusterScope) {
    this.clusterScope = clusterScope;
  }

  public IoArgoprojWorkflowV1alpha1TemplateRef name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name is the resource name of the template.
   * @return name
  **/
  @ApiModelProperty(value = "Name is the resource name of the template.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoArgoprojWorkflowV1alpha1TemplateRef template(String template) {
    this.template = template;
    return this;
  }

   /**
   * Template is the name of referred template in the resource.
   * @return template
  **/
  @ApiModelProperty(value = "Template is the name of referred template in the resource.")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
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
    IoArgoprojWorkflowV1alpha1TemplateRef ioArgoprojWorkflowV1alpha1TemplateRef = (IoArgoprojWorkflowV1alpha1TemplateRef) o;
    return Objects.equals(this.clusterScope, ioArgoprojWorkflowV1alpha1TemplateRef.clusterScope) &&
        Objects.equals(this.name, ioArgoprojWorkflowV1alpha1TemplateRef.name) &&
        Objects.equals(this.template, ioArgoprojWorkflowV1alpha1TemplateRef.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterScope, name, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1TemplateRef {\n");
    
    sb.append("    clusterScope: ").append(toIndentedString(clusterScope)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

