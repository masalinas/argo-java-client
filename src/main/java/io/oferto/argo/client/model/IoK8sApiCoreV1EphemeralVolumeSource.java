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

import io.oferto.argo.client.model.IoK8sApiCoreV1PersistentVolumeClaimTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * Represents an ephemeral volume that is handled by a normal storage driver.
 */
@ApiModel(description = "Represents an ephemeral volume that is handled by a normal storage driver.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoK8sApiCoreV1EphemeralVolumeSource {
  @SerializedName("volumeClaimTemplate")
  private IoK8sApiCoreV1PersistentVolumeClaimTemplate volumeClaimTemplate = null;

  public IoK8sApiCoreV1EphemeralVolumeSource volumeClaimTemplate(IoK8sApiCoreV1PersistentVolumeClaimTemplate volumeClaimTemplate) {
    this.volumeClaimTemplate = volumeClaimTemplate;
    return this;
  }

   /**
   * Will be used to create a stand-alone PVC to provision the volume. The pod in which this EphemeralVolumeSource is embedded will be the owner of the PVC, i.e. the PVC will be deleted together with the pod.  The name of the PVC will be &#x60;&lt;pod name&gt;-&lt;volume name&gt;&#x60; where &#x60;&lt;volume name&gt;&#x60; is the name from the &#x60;PodSpec.Volumes&#x60; array entry. Pod validation will reject the pod if the concatenated name is not valid for a PVC (for example, too long).  An existing PVC with that name that is not owned by the pod will *not* be used for the pod to avoid using an unrelated volume by mistake. Starting the pod is then blocked until the unrelated PVC is removed. If such a pre-created PVC is meant to be used by the pod, the PVC has to updated with an owner reference to the pod once the pod exists. Normally this should not be necessary, but it may be useful when manually reconstructing a broken cluster.  This field is read-only and no changes will be made by Kubernetes to the PVC after it has been created.  Required, must not be nil.
   * @return volumeClaimTemplate
  **/
  @ApiModelProperty(value = "Will be used to create a stand-alone PVC to provision the volume. The pod in which this EphemeralVolumeSource is embedded will be the owner of the PVC, i.e. the PVC will be deleted together with the pod.  The name of the PVC will be `<pod name>-<volume name>` where `<volume name>` is the name from the `PodSpec.Volumes` array entry. Pod validation will reject the pod if the concatenated name is not valid for a PVC (for example, too long).  An existing PVC with that name that is not owned by the pod will *not* be used for the pod to avoid using an unrelated volume by mistake. Starting the pod is then blocked until the unrelated PVC is removed. If such a pre-created PVC is meant to be used by the pod, the PVC has to updated with an owner reference to the pod once the pod exists. Normally this should not be necessary, but it may be useful when manually reconstructing a broken cluster.  This field is read-only and no changes will be made by Kubernetes to the PVC after it has been created.  Required, must not be nil.")
  public IoK8sApiCoreV1PersistentVolumeClaimTemplate getVolumeClaimTemplate() {
    return volumeClaimTemplate;
  }

  public void setVolumeClaimTemplate(IoK8sApiCoreV1PersistentVolumeClaimTemplate volumeClaimTemplate) {
    this.volumeClaimTemplate = volumeClaimTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1EphemeralVolumeSource ioK8sApiCoreV1EphemeralVolumeSource = (IoK8sApiCoreV1EphemeralVolumeSource) o;
    return Objects.equals(this.volumeClaimTemplate, ioK8sApiCoreV1EphemeralVolumeSource.volumeClaimTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeClaimTemplate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1EphemeralVolumeSource {\n");
    
    sb.append("    volumeClaimTemplate: ").append(toIndentedString(volumeClaimTemplate)).append("\n");
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
