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

import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1EventSourceFilter;
import io.oferto.argo.client.model.IoArgoprojEventsV1alpha1WatchPathConfig;
import io.oferto.argo.client.model.IoK8sApiCoreV1ConfigMapKeySelector;
import io.oferto.argo.client.model.IoK8sApiCoreV1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IoArgoprojEventsV1alpha1HDFSEventSource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojEventsV1alpha1HDFSEventSource {
  @SerializedName("addresses")
  private List<String> addresses = null;

  @SerializedName("checkInterval")
  private String checkInterval = null;

  @SerializedName("filter")
  private IoArgoprojEventsV1alpha1EventSourceFilter filter = null;

  @SerializedName("hdfsUser")
  private String hdfsUser = null;

  @SerializedName("krbCCacheSecret")
  private IoK8sApiCoreV1SecretKeySelector krbCCacheSecret = null;

  @SerializedName("krbConfigConfigMap")
  private IoK8sApiCoreV1ConfigMapKeySelector krbConfigConfigMap = null;

  @SerializedName("krbKeytabSecret")
  private IoK8sApiCoreV1SecretKeySelector krbKeytabSecret = null;

  @SerializedName("krbRealm")
  private String krbRealm = null;

  @SerializedName("krbServicePrincipalName")
  private String krbServicePrincipalName = null;

  @SerializedName("krbUsername")
  private String krbUsername = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("watchPathConfig")
  private IoArgoprojEventsV1alpha1WatchPathConfig watchPathConfig = null;

  public IoArgoprojEventsV1alpha1HDFSEventSource addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public IoArgoprojEventsV1alpha1HDFSEventSource addAddressesItem(String addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<String>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(value = "")
  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  public IoArgoprojEventsV1alpha1HDFSEventSource checkInterval(String checkInterval) {
    this.checkInterval = checkInterval;
    return this;
  }

   /**
   * Get checkInterval
   * @return checkInterval
  **/
  @ApiModelProperty(value = "")
  public String getCheckInterval() {
    return checkInterval;
  }

  public void setCheckInterval(String checkInterval) {
    this.checkInterval = checkInterval;
  }

  public IoArgoprojEventsV1alpha1HDFSEventSource filter(IoArgoprojEventsV1alpha1EventSourceFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojEventsV1alpha1EventSourceFilter getFilter() {
    return filter;
  }

  public void setFilter(IoArgoprojEventsV1alpha1EventSourceFilter filter) {
    this.filter = filter;
  }

  public IoArgoprojEventsV1alpha1HDFSEventSource hdfsUser(String hdfsUser) {
    this.hdfsUser = hdfsUser;
    return this;
  }

   /**
   * HDFSUser is the user to access HDFS file system. It is ignored if either ccache or keytab is used.
   * @return hdfsUser
  **/
  @ApiModelProperty(value = "HDFSUser is the user to access HDFS file system. It is ignored if either ccache or keytab is used.")
  public String getHdfsUser() {
    return hdfsUser;
  }

  public void setHdfsUser(String hdfsUser) {
    this.hdfsUser = hdfsUser;
  }

  public IoArgoprojEventsV1alpha1HDFSEventSource krbCCacheSecret(IoK8sApiCoreV1SecretKeySelector krbCCacheSecret) {
    this.krbCCacheSecret = krbCCacheSecret;
    return this;
  }

   /**
   * KrbCCacheSecret is the secret selector for Kerberos ccache Either ccache or keytab can be set to use Kerberos.
   * @return krbCCacheSecret
  **/
  @ApiModelProperty(value = "KrbCCacheSecret is the secret selector for Kerberos ccache Either ccache or keytab can be set to use Kerberos.")
  public IoK8sApiCoreV1SecretKeySelector getKrbCCacheSecret() {
    return krbCCacheSecret;
  }

  public void setKrbCCacheSecret(IoK8sApiCoreV1SecretKeySelector krbCCacheSecret) {
    this.krbCCacheSecret = krbCCacheSecret;
  }

  public IoArgoprojEventsV1alpha1HDFSEventSource krbConfigConfigMap(IoK8sApiCoreV1ConfigMapKeySelector krbConfigConfigMap) {
    this.krbConfigConfigMap = krbConfigConfigMap;
    return this;
  }

   /**
   * KrbConfig is the configmap selector for Kerberos config as string It must be set if either ccache or keytab is used.
   * @return krbConfigConfigMap
  **/
  @ApiModelProperty(value = "KrbConfig is the configmap selector for Kerberos config as string It must be set if either ccache or keytab is used.")
  public IoK8sApiCoreV1ConfigMapKeySelector getKrbConfigConfigMap() {
    return krbConfigConfigMap;
  }

  public void setKrbConfigConfigMap(IoK8sApiCoreV1ConfigMapKeySelector krbConfigConfigMap) {
    this.krbConfigConfigMap = krbConfigConfigMap;
  }

  public IoArgoprojEventsV1alpha1HDFSEventSource krbKeytabSecret(IoK8sApiCoreV1SecretKeySelector krbKeytabSecret) {
    this.krbKeytabSecret = krbKeytabSecret;
    return this;
  }

   /**
   * KrbKeytabSecret is the secret selector for Kerberos keytab Either ccache or keytab can be set to use Kerberos.
   * @return krbKeytabSecret
  **/
  @ApiModelProperty(value = "KrbKeytabSecret is the secret selector for Kerberos keytab Either ccache or keytab can be set to use Kerberos.")
  public IoK8sApiCoreV1SecretKeySelector getKrbKeytabSecret() {
    return krbKeytabSecret;
  }

  public void setKrbKeytabSecret(IoK8sApiCoreV1SecretKeySelector krbKeytabSecret) {
    this.krbKeytabSecret = krbKeytabSecret;
  }

  public IoArgoprojEventsV1alpha1HDFSEventSource krbRealm(String krbRealm) {
    this.krbRealm = krbRealm;
    return this;
  }

   /**
   * KrbRealm is the Kerberos realm used with Kerberos keytab It must be set if keytab is used.
   * @return krbRealm
  **/
  @ApiModelProperty(value = "KrbRealm is the Kerberos realm used with Kerberos keytab It must be set if keytab is used.")
  public String getKrbRealm() {
    return krbRealm;
  }

  public void setKrbRealm(String krbRealm) {
    this.krbRealm = krbRealm;
  }

  public IoArgoprojEventsV1alpha1HDFSEventSource krbServicePrincipalName(String krbServicePrincipalName) {
    this.krbServicePrincipalName = krbServicePrincipalName;
    return this;
  }

   /**
   * KrbServicePrincipalName is the principal name of Kerberos service It must be set if either ccache or keytab is used.
   * @return krbServicePrincipalName
  **/
  @ApiModelProperty(value = "KrbServicePrincipalName is the principal name of Kerberos service It must be set if either ccache or keytab is used.")
  public String getKrbServicePrincipalName() {
    return krbServicePrincipalName;
  }

  public void setKrbServicePrincipalName(String krbServicePrincipalName) {
    this.krbServicePrincipalName = krbServicePrincipalName;
  }

  public IoArgoprojEventsV1alpha1HDFSEventSource krbUsername(String krbUsername) {
    this.krbUsername = krbUsername;
    return this;
  }

   /**
   * KrbUsername is the Kerberos username used with Kerberos keytab It must be set if keytab is used.
   * @return krbUsername
  **/
  @ApiModelProperty(value = "KrbUsername is the Kerberos username used with Kerberos keytab It must be set if keytab is used.")
  public String getKrbUsername() {
    return krbUsername;
  }

  public void setKrbUsername(String krbUsername) {
    this.krbUsername = krbUsername;
  }

  public IoArgoprojEventsV1alpha1HDFSEventSource metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public IoArgoprojEventsV1alpha1HDFSEventSource putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public IoArgoprojEventsV1alpha1HDFSEventSource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoArgoprojEventsV1alpha1HDFSEventSource watchPathConfig(IoArgoprojEventsV1alpha1WatchPathConfig watchPathConfig) {
    this.watchPathConfig = watchPathConfig;
    return this;
  }

   /**
   * Get watchPathConfig
   * @return watchPathConfig
  **/
  @ApiModelProperty(value = "")
  public IoArgoprojEventsV1alpha1WatchPathConfig getWatchPathConfig() {
    return watchPathConfig;
  }

  public void setWatchPathConfig(IoArgoprojEventsV1alpha1WatchPathConfig watchPathConfig) {
    this.watchPathConfig = watchPathConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1HDFSEventSource ioArgoprojEventsV1alpha1HDFSEventSource = (IoArgoprojEventsV1alpha1HDFSEventSource) o;
    return Objects.equals(this.addresses, ioArgoprojEventsV1alpha1HDFSEventSource.addresses) &&
        Objects.equals(this.checkInterval, ioArgoprojEventsV1alpha1HDFSEventSource.checkInterval) &&
        Objects.equals(this.filter, ioArgoprojEventsV1alpha1HDFSEventSource.filter) &&
        Objects.equals(this.hdfsUser, ioArgoprojEventsV1alpha1HDFSEventSource.hdfsUser) &&
        Objects.equals(this.krbCCacheSecret, ioArgoprojEventsV1alpha1HDFSEventSource.krbCCacheSecret) &&
        Objects.equals(this.krbConfigConfigMap, ioArgoprojEventsV1alpha1HDFSEventSource.krbConfigConfigMap) &&
        Objects.equals(this.krbKeytabSecret, ioArgoprojEventsV1alpha1HDFSEventSource.krbKeytabSecret) &&
        Objects.equals(this.krbRealm, ioArgoprojEventsV1alpha1HDFSEventSource.krbRealm) &&
        Objects.equals(this.krbServicePrincipalName, ioArgoprojEventsV1alpha1HDFSEventSource.krbServicePrincipalName) &&
        Objects.equals(this.krbUsername, ioArgoprojEventsV1alpha1HDFSEventSource.krbUsername) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1HDFSEventSource.metadata) &&
        Objects.equals(this.type, ioArgoprojEventsV1alpha1HDFSEventSource.type) &&
        Objects.equals(this.watchPathConfig, ioArgoprojEventsV1alpha1HDFSEventSource.watchPathConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, checkInterval, filter, hdfsUser, krbCCacheSecret, krbConfigConfigMap, krbKeytabSecret, krbRealm, krbServicePrincipalName, krbUsername, metadata, type, watchPathConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1HDFSEventSource {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    checkInterval: ").append(toIndentedString(checkInterval)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    hdfsUser: ").append(toIndentedString(hdfsUser)).append("\n");
    sb.append("    krbCCacheSecret: ").append(toIndentedString(krbCCacheSecret)).append("\n");
    sb.append("    krbConfigConfigMap: ").append(toIndentedString(krbConfigConfigMap)).append("\n");
    sb.append("    krbKeytabSecret: ").append(toIndentedString(krbKeytabSecret)).append("\n");
    sb.append("    krbRealm: ").append(toIndentedString(krbRealm)).append("\n");
    sb.append("    krbServicePrincipalName: ").append(toIndentedString(krbServicePrincipalName)).append("\n");
    sb.append("    krbUsername: ").append(toIndentedString(krbUsername)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    watchPathConfig: ").append(toIndentedString(watchPathConfig)).append("\n");
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
