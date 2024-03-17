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

import io.oferto.argo.client.model.IoK8sApiCoreV1PodDNSConfigOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.
 */
@ApiModel(description = "PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoK8sApiCoreV1PodDNSConfig {
  @SerializedName("nameservers")
  private List<String> nameservers = null;

  @SerializedName("options")
  private List<IoK8sApiCoreV1PodDNSConfigOption> options = null;

  @SerializedName("searches")
  private List<String> searches = null;

  public IoK8sApiCoreV1PodDNSConfig nameservers(List<String> nameservers) {
    this.nameservers = nameservers;
    return this;
  }

  public IoK8sApiCoreV1PodDNSConfig addNameserversItem(String nameserversItem) {
    if (this.nameservers == null) {
      this.nameservers = new ArrayList<String>();
    }
    this.nameservers.add(nameserversItem);
    return this;
  }

   /**
   * A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
   * @return nameservers
  **/
  @ApiModelProperty(value = "A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.")
  public List<String> getNameservers() {
    return nameservers;
  }

  public void setNameservers(List<String> nameservers) {
    this.nameservers = nameservers;
  }

  public IoK8sApiCoreV1PodDNSConfig options(List<IoK8sApiCoreV1PodDNSConfigOption> options) {
    this.options = options;
    return this;
  }

  public IoK8sApiCoreV1PodDNSConfig addOptionsItem(IoK8sApiCoreV1PodDNSConfigOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<IoK8sApiCoreV1PodDNSConfigOption>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
   * @return options
  **/
  @ApiModelProperty(value = "A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.")
  public List<IoK8sApiCoreV1PodDNSConfigOption> getOptions() {
    return options;
  }

  public void setOptions(List<IoK8sApiCoreV1PodDNSConfigOption> options) {
    this.options = options;
  }

  public IoK8sApiCoreV1PodDNSConfig searches(List<String> searches) {
    this.searches = searches;
    return this;
  }

  public IoK8sApiCoreV1PodDNSConfig addSearchesItem(String searchesItem) {
    if (this.searches == null) {
      this.searches = new ArrayList<String>();
    }
    this.searches.add(searchesItem);
    return this;
  }

   /**
   * A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
   * @return searches
  **/
  @ApiModelProperty(value = "A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.")
  public List<String> getSearches() {
    return searches;
  }

  public void setSearches(List<String> searches) {
    this.searches = searches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1PodDNSConfig ioK8sApiCoreV1PodDNSConfig = (IoK8sApiCoreV1PodDNSConfig) o;
    return Objects.equals(this.nameservers, ioK8sApiCoreV1PodDNSConfig.nameservers) &&
        Objects.equals(this.options, ioK8sApiCoreV1PodDNSConfig.options) &&
        Objects.equals(this.searches, ioK8sApiCoreV1PodDNSConfig.searches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameservers, options, searches);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PodDNSConfig {\n");
    
    sb.append("    nameservers: ").append(toIndentedString(nameservers)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    searches: ").append(toIndentedString(searches)).append("\n");
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

