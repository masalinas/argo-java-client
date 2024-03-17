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

import io.oferto.argo.client.model.IoK8sApiCoreV1SELinuxOptions;
import io.oferto.argo.client.model.IoK8sApiCoreV1SeccompProfile;
import io.oferto.argo.client.model.IoK8sApiCoreV1Sysctl;
import io.oferto.argo.client.model.IoK8sApiCoreV1WindowsSecurityContextOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.
 */
@ApiModel(description = "PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoK8sApiCoreV1PodSecurityContext {
  @SerializedName("fsGroup")
  private Integer fsGroup = null;

  @SerializedName("fsGroupChangePolicy")
  private String fsGroupChangePolicy = null;

  @SerializedName("runAsGroup")
  private Integer runAsGroup = null;

  @SerializedName("runAsNonRoot")
  private Boolean runAsNonRoot = null;

  @SerializedName("runAsUser")
  private Integer runAsUser = null;

  @SerializedName("seLinuxOptions")
  private IoK8sApiCoreV1SELinuxOptions seLinuxOptions = null;

  @SerializedName("seccompProfile")
  private IoK8sApiCoreV1SeccompProfile seccompProfile = null;

  @SerializedName("supplementalGroups")
  private List<Long> supplementalGroups = null;

  @SerializedName("sysctls")
  private List<IoK8sApiCoreV1Sysctl> sysctls = null;

  @SerializedName("windowsOptions")
  private IoK8sApiCoreV1WindowsSecurityContextOptions windowsOptions = null;

  public IoK8sApiCoreV1PodSecurityContext fsGroup(Integer fsGroup) {
    this.fsGroup = fsGroup;
    return this;
  }

   /**
   * A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:  1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR&#39;d with rw-rw----  If unset, the Kubelet will not modify the ownership and permissions of any volume. Note that this field cannot be set when spec.os.name is windows.
   * @return fsGroup
  **/
  @ApiModelProperty(value = "A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:  1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----  If unset, the Kubelet will not modify the ownership and permissions of any volume. Note that this field cannot be set when spec.os.name is windows.")
  public Integer getFsGroup() {
    return fsGroup;
  }

  public void setFsGroup(Integer fsGroup) {
    this.fsGroup = fsGroup;
  }

  public IoK8sApiCoreV1PodSecurityContext fsGroupChangePolicy(String fsGroupChangePolicy) {
    this.fsGroupChangePolicy = fsGroupChangePolicy;
    return this;
  }

   /**
   * fsGroupChangePolicy defines behavior of changing ownership and permission of the volume before being exposed inside Pod. This field will only apply to volume types which support fsGroup based ownership(and permissions). It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir. Valid values are \&quot;OnRootMismatch\&quot; and \&quot;Always\&quot;. If not specified, \&quot;Always\&quot; is used. Note that this field cannot be set when spec.os.name is windows.
   * @return fsGroupChangePolicy
  **/
  @ApiModelProperty(value = "fsGroupChangePolicy defines behavior of changing ownership and permission of the volume before being exposed inside Pod. This field will only apply to volume types which support fsGroup based ownership(and permissions). It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir. Valid values are \"OnRootMismatch\" and \"Always\". If not specified, \"Always\" is used. Note that this field cannot be set when spec.os.name is windows.")
  public String getFsGroupChangePolicy() {
    return fsGroupChangePolicy;
  }

  public void setFsGroupChangePolicy(String fsGroupChangePolicy) {
    this.fsGroupChangePolicy = fsGroupChangePolicy;
  }

  public IoK8sApiCoreV1PodSecurityContext runAsGroup(Integer runAsGroup) {
    this.runAsGroup = runAsGroup;
    return this;
  }

   /**
   * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
   * @return runAsGroup
  **/
  @ApiModelProperty(value = "The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.")
  public Integer getRunAsGroup() {
    return runAsGroup;
  }

  public void setRunAsGroup(Integer runAsGroup) {
    this.runAsGroup = runAsGroup;
  }

  public IoK8sApiCoreV1PodSecurityContext runAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
    return this;
  }

   /**
   * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   * @return runAsNonRoot
  **/
  @ApiModelProperty(value = "Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  public Boolean isRunAsNonRoot() {
    return runAsNonRoot;
  }

  public void setRunAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
  }

  public IoK8sApiCoreV1PodSecurityContext runAsUser(Integer runAsUser) {
    this.runAsUser = runAsUser;
    return this;
  }

   /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
   * @return runAsUser
  **/
  @ApiModelProperty(value = "The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.")
  public Integer getRunAsUser() {
    return runAsUser;
  }

  public void setRunAsUser(Integer runAsUser) {
    this.runAsUser = runAsUser;
  }

  public IoK8sApiCoreV1PodSecurityContext seLinuxOptions(IoK8sApiCoreV1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
    return this;
  }

   /**
   * The SELinux context to be applied to all containers. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
   * @return seLinuxOptions
  **/
  @ApiModelProperty(value = "The SELinux context to be applied to all containers. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.")
  public IoK8sApiCoreV1SELinuxOptions getSeLinuxOptions() {
    return seLinuxOptions;
  }

  public void setSeLinuxOptions(IoK8sApiCoreV1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
  }

  public IoK8sApiCoreV1PodSecurityContext seccompProfile(IoK8sApiCoreV1SeccompProfile seccompProfile) {
    this.seccompProfile = seccompProfile;
    return this;
  }

   /**
   * The seccomp options to use by the containers in this pod. Note that this field cannot be set when spec.os.name is windows.
   * @return seccompProfile
  **/
  @ApiModelProperty(value = "The seccomp options to use by the containers in this pod. Note that this field cannot be set when spec.os.name is windows.")
  public IoK8sApiCoreV1SeccompProfile getSeccompProfile() {
    return seccompProfile;
  }

  public void setSeccompProfile(IoK8sApiCoreV1SeccompProfile seccompProfile) {
    this.seccompProfile = seccompProfile;
  }

  public IoK8sApiCoreV1PodSecurityContext supplementalGroups(List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
    return this;
  }

  public IoK8sApiCoreV1PodSecurityContext addSupplementalGroupsItem(Long supplementalGroupsItem) {
    if (this.supplementalGroups == null) {
      this.supplementalGroups = new ArrayList<Long>();
    }
    this.supplementalGroups.add(supplementalGroupsItem);
    return this;
  }

   /**
   * A list of groups applied to the first process run in each container, in addition to the container&#39;s primary GID.  If unspecified, no groups will be added to any container. Note that this field cannot be set when spec.os.name is windows.
   * @return supplementalGroups
  **/
  @ApiModelProperty(value = "A list of groups applied to the first process run in each container, in addition to the container's primary GID.  If unspecified, no groups will be added to any container. Note that this field cannot be set when spec.os.name is windows.")
  public List<Long> getSupplementalGroups() {
    return supplementalGroups;
  }

  public void setSupplementalGroups(List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
  }

  public IoK8sApiCoreV1PodSecurityContext sysctls(List<IoK8sApiCoreV1Sysctl> sysctls) {
    this.sysctls = sysctls;
    return this;
  }

  public IoK8sApiCoreV1PodSecurityContext addSysctlsItem(IoK8sApiCoreV1Sysctl sysctlsItem) {
    if (this.sysctls == null) {
      this.sysctls = new ArrayList<IoK8sApiCoreV1Sysctl>();
    }
    this.sysctls.add(sysctlsItem);
    return this;
  }

   /**
   * Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch. Note that this field cannot be set when spec.os.name is windows.
   * @return sysctls
  **/
  @ApiModelProperty(value = "Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch. Note that this field cannot be set when spec.os.name is windows.")
  public List<IoK8sApiCoreV1Sysctl> getSysctls() {
    return sysctls;
  }

  public void setSysctls(List<IoK8sApiCoreV1Sysctl> sysctls) {
    this.sysctls = sysctls;
  }

  public IoK8sApiCoreV1PodSecurityContext windowsOptions(IoK8sApiCoreV1WindowsSecurityContextOptions windowsOptions) {
    this.windowsOptions = windowsOptions;
    return this;
  }

   /**
   * The Windows specific settings applied to all containers. If unspecified, the options within a container&#39;s SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is linux.
   * @return windowsOptions
  **/
  @ApiModelProperty(value = "The Windows specific settings applied to all containers. If unspecified, the options within a container's SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is linux.")
  public IoK8sApiCoreV1WindowsSecurityContextOptions getWindowsOptions() {
    return windowsOptions;
  }

  public void setWindowsOptions(IoK8sApiCoreV1WindowsSecurityContextOptions windowsOptions) {
    this.windowsOptions = windowsOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1PodSecurityContext ioK8sApiCoreV1PodSecurityContext = (IoK8sApiCoreV1PodSecurityContext) o;
    return Objects.equals(this.fsGroup, ioK8sApiCoreV1PodSecurityContext.fsGroup) &&
        Objects.equals(this.fsGroupChangePolicy, ioK8sApiCoreV1PodSecurityContext.fsGroupChangePolicy) &&
        Objects.equals(this.runAsGroup, ioK8sApiCoreV1PodSecurityContext.runAsGroup) &&
        Objects.equals(this.runAsNonRoot, ioK8sApiCoreV1PodSecurityContext.runAsNonRoot) &&
        Objects.equals(this.runAsUser, ioK8sApiCoreV1PodSecurityContext.runAsUser) &&
        Objects.equals(this.seLinuxOptions, ioK8sApiCoreV1PodSecurityContext.seLinuxOptions) &&
        Objects.equals(this.seccompProfile, ioK8sApiCoreV1PodSecurityContext.seccompProfile) &&
        Objects.equals(this.supplementalGroups, ioK8sApiCoreV1PodSecurityContext.supplementalGroups) &&
        Objects.equals(this.sysctls, ioK8sApiCoreV1PodSecurityContext.sysctls) &&
        Objects.equals(this.windowsOptions, ioK8sApiCoreV1PodSecurityContext.windowsOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsGroup, fsGroupChangePolicy, runAsGroup, runAsNonRoot, runAsUser, seLinuxOptions, seccompProfile, supplementalGroups, sysctls, windowsOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PodSecurityContext {\n");
    
    sb.append("    fsGroup: ").append(toIndentedString(fsGroup)).append("\n");
    sb.append("    fsGroupChangePolicy: ").append(toIndentedString(fsGroupChangePolicy)).append("\n");
    sb.append("    runAsGroup: ").append(toIndentedString(runAsGroup)).append("\n");
    sb.append("    runAsNonRoot: ").append(toIndentedString(runAsNonRoot)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    seLinuxOptions: ").append(toIndentedString(seLinuxOptions)).append("\n");
    sb.append("    seccompProfile: ").append(toIndentedString(seccompProfile)).append("\n");
    sb.append("    supplementalGroups: ").append(toIndentedString(supplementalGroups)).append("\n");
    sb.append("    sysctls: ").append(toIndentedString(sysctls)).append("\n");
    sb.append("    windowsOptions: ").append(toIndentedString(windowsOptions)).append("\n");
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

