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

import io.oferto.argo.client.model.IoK8sApimachineryPkgApisMetaV1LabelSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key &lt;topologyKey&gt; matches that of any node on which a pod of the set of pods is running
 */
@ApiModel(description = "Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoK8sApiCoreV1PodAffinityTerm {
  @SerializedName("labelSelector")
  private IoK8sApimachineryPkgApisMetaV1LabelSelector labelSelector = null;

  @SerializedName("namespaceSelector")
  private IoK8sApimachineryPkgApisMetaV1LabelSelector namespaceSelector = null;

  @SerializedName("namespaces")
  private List<String> namespaces = null;

  @SerializedName("topologyKey")
  private String topologyKey = null;

  public IoK8sApiCoreV1PodAffinityTerm labelSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
    return this;
  }

   /**
   * A label query over a set of resources, in this case pods.
   * @return labelSelector
  **/
  @ApiModelProperty(value = "A label query over a set of resources, in this case pods.")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getLabelSelector() {
    return labelSelector;
  }

  public void setLabelSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }

  public IoK8sApiCoreV1PodAffinityTerm namespaceSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
    return this;
  }

   /**
   * A label query over the set of namespaces that the term applies to. The term is applied to the union of the namespaces selected by this field and the ones listed in the namespaces field. null selector and null or empty namespaces list means \&quot;this pod&#39;s namespace\&quot;. An empty selector ({}) matches all namespaces. This field is beta-level and is only honored when PodAffinityNamespaceSelector feature is enabled.
   * @return namespaceSelector
  **/
  @ApiModelProperty(value = "A label query over the set of namespaces that the term applies to. The term is applied to the union of the namespaces selected by this field and the ones listed in the namespaces field. null selector and null or empty namespaces list means \"this pod's namespace\". An empty selector ({}) matches all namespaces. This field is beta-level and is only honored when PodAffinityNamespaceSelector feature is enabled.")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getNamespaceSelector() {
    return namespaceSelector;
  }

  public void setNamespaceSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }

  public IoK8sApiCoreV1PodAffinityTerm namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public IoK8sApiCoreV1PodAffinityTerm addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<String>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

   /**
   * namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means \&quot;this pod&#39;s namespace\&quot;
   * @return namespaces
  **/
  @ApiModelProperty(value = "namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means \"this pod's namespace\"")
  public List<String> getNamespaces() {
    return namespaces;
  }

  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }

  public IoK8sApiCoreV1PodAffinityTerm topologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
    return this;
  }

   /**
   * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
   * @return topologyKey
  **/
  @ApiModelProperty(required = true, value = "This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.")
  public String getTopologyKey() {
    return topologyKey;
  }

  public void setTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1PodAffinityTerm ioK8sApiCoreV1PodAffinityTerm = (IoK8sApiCoreV1PodAffinityTerm) o;
    return Objects.equals(this.labelSelector, ioK8sApiCoreV1PodAffinityTerm.labelSelector) &&
        Objects.equals(this.namespaceSelector, ioK8sApiCoreV1PodAffinityTerm.namespaceSelector) &&
        Objects.equals(this.namespaces, ioK8sApiCoreV1PodAffinityTerm.namespaces) &&
        Objects.equals(this.topologyKey, ioK8sApiCoreV1PodAffinityTerm.topologyKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSelector, namespaceSelector, namespaces, topologyKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PodAffinityTerm {\n");
    
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    namespaceSelector: ").append(toIndentedString(namespaceSelector)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    topologyKey: ").append(toIndentedString(topologyKey)).append("\n");
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
