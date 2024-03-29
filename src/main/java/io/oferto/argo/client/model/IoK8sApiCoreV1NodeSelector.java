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

import io.oferto.argo.client.model.IoK8sApiCoreV1NodeSelectorTerm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.
 */
@ApiModel(description = "A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoK8sApiCoreV1NodeSelector {
  @SerializedName("nodeSelectorTerms")
  private List<IoK8sApiCoreV1NodeSelectorTerm> nodeSelectorTerms = new ArrayList<IoK8sApiCoreV1NodeSelectorTerm>();

  public IoK8sApiCoreV1NodeSelector nodeSelectorTerms(List<IoK8sApiCoreV1NodeSelectorTerm> nodeSelectorTerms) {
    this.nodeSelectorTerms = nodeSelectorTerms;
    return this;
  }

  public IoK8sApiCoreV1NodeSelector addNodeSelectorTermsItem(IoK8sApiCoreV1NodeSelectorTerm nodeSelectorTermsItem) {
    this.nodeSelectorTerms.add(nodeSelectorTermsItem);
    return this;
  }

   /**
   * Required. A list of node selector terms. The terms are ORed.
   * @return nodeSelectorTerms
  **/
  @ApiModelProperty(required = true, value = "Required. A list of node selector terms. The terms are ORed.")
  public List<IoK8sApiCoreV1NodeSelectorTerm> getNodeSelectorTerms() {
    return nodeSelectorTerms;
  }

  public void setNodeSelectorTerms(List<IoK8sApiCoreV1NodeSelectorTerm> nodeSelectorTerms) {
    this.nodeSelectorTerms = nodeSelectorTerms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1NodeSelector ioK8sApiCoreV1NodeSelector = (IoK8sApiCoreV1NodeSelector) o;
    return Objects.equals(this.nodeSelectorTerms, ioK8sApiCoreV1NodeSelector.nodeSelectorTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeSelectorTerms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NodeSelector {\n");
    
    sb.append("    nodeSelectorTerms: ").append(toIndentedString(nodeSelectorTerms)).append("\n");
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

