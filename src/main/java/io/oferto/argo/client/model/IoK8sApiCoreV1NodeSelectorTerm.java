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

import io.oferto.argo.client.model.IoK8sApiCoreV1NodeSelectorRequirement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
 */
@ApiModel(description = "A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoK8sApiCoreV1NodeSelectorTerm {
  @SerializedName("matchExpressions")
  private List<IoK8sApiCoreV1NodeSelectorRequirement> matchExpressions = null;

  @SerializedName("matchFields")
  private List<IoK8sApiCoreV1NodeSelectorRequirement> matchFields = null;

  public IoK8sApiCoreV1NodeSelectorTerm matchExpressions(List<IoK8sApiCoreV1NodeSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
    return this;
  }

  public IoK8sApiCoreV1NodeSelectorTerm addMatchExpressionsItem(IoK8sApiCoreV1NodeSelectorRequirement matchExpressionsItem) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList<IoK8sApiCoreV1NodeSelectorRequirement>();
    }
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }

   /**
   * A list of node selector requirements by node&#39;s labels.
   * @return matchExpressions
  **/
  @ApiModelProperty(value = "A list of node selector requirements by node's labels.")
  public List<IoK8sApiCoreV1NodeSelectorRequirement> getMatchExpressions() {
    return matchExpressions;
  }

  public void setMatchExpressions(List<IoK8sApiCoreV1NodeSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }

  public IoK8sApiCoreV1NodeSelectorTerm matchFields(List<IoK8sApiCoreV1NodeSelectorRequirement> matchFields) {
    this.matchFields = matchFields;
    return this;
  }

  public IoK8sApiCoreV1NodeSelectorTerm addMatchFieldsItem(IoK8sApiCoreV1NodeSelectorRequirement matchFieldsItem) {
    if (this.matchFields == null) {
      this.matchFields = new ArrayList<IoK8sApiCoreV1NodeSelectorRequirement>();
    }
    this.matchFields.add(matchFieldsItem);
    return this;
  }

   /**
   * A list of node selector requirements by node&#39;s fields.
   * @return matchFields
  **/
  @ApiModelProperty(value = "A list of node selector requirements by node's fields.")
  public List<IoK8sApiCoreV1NodeSelectorRequirement> getMatchFields() {
    return matchFields;
  }

  public void setMatchFields(List<IoK8sApiCoreV1NodeSelectorRequirement> matchFields) {
    this.matchFields = matchFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1NodeSelectorTerm ioK8sApiCoreV1NodeSelectorTerm = (IoK8sApiCoreV1NodeSelectorTerm) o;
    return Objects.equals(this.matchExpressions, ioK8sApiCoreV1NodeSelectorTerm.matchExpressions) &&
        Objects.equals(this.matchFields, ioK8sApiCoreV1NodeSelectorTerm.matchFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpressions, matchFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NodeSelectorTerm {\n");
    
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
    sb.append("    matchFields: ").append(toIndentedString(matchFields)).append("\n");
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

