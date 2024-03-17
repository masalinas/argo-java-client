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

import io.oferto.argo.client.model.IoK8sApimachineryPkgApisMetaV1FieldsV1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
 */
@ApiModel(description = "ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoK8sApimachineryPkgApisMetaV1ManagedFieldsEntry {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("fieldsType")
  private String fieldsType = null;

  @SerializedName("fieldsV1")
  private IoK8sApimachineryPkgApisMetaV1FieldsV1 fieldsV1 = null;

  @SerializedName("manager")
  private String manager = null;

  @SerializedName("operation")
  private String operation = null;

  @SerializedName("subresource")
  private String subresource = null;

  @SerializedName("time")
  private String time = null;

  public IoK8sApimachineryPkgApisMetaV1ManagedFieldsEntry apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the version of this resource that this field set applies to. The format is \&quot;group/version\&quot; just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the version of this resource that this field set applies to. The format is \"group/version\" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public IoK8sApimachineryPkgApisMetaV1ManagedFieldsEntry fieldsType(String fieldsType) {
    this.fieldsType = fieldsType;
    return this;
  }

   /**
   * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: \&quot;FieldsV1\&quot;
   * @return fieldsType
  **/
  @ApiModelProperty(value = "FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: \"FieldsV1\"")
  public String getFieldsType() {
    return fieldsType;
  }

  public void setFieldsType(String fieldsType) {
    this.fieldsType = fieldsType;
  }

  public IoK8sApimachineryPkgApisMetaV1ManagedFieldsEntry fieldsV1(IoK8sApimachineryPkgApisMetaV1FieldsV1 fieldsV1) {
    this.fieldsV1 = fieldsV1;
    return this;
  }

   /**
   * FieldsV1 holds the first JSON version format as described in the \&quot;FieldsV1\&quot; type.
   * @return fieldsV1
  **/
  @ApiModelProperty(value = "FieldsV1 holds the first JSON version format as described in the \"FieldsV1\" type.")
  public IoK8sApimachineryPkgApisMetaV1FieldsV1 getFieldsV1() {
    return fieldsV1;
  }

  public void setFieldsV1(IoK8sApimachineryPkgApisMetaV1FieldsV1 fieldsV1) {
    this.fieldsV1 = fieldsV1;
  }

  public IoK8sApimachineryPkgApisMetaV1ManagedFieldsEntry manager(String manager) {
    this.manager = manager;
    return this;
  }

   /**
   * Manager is an identifier of the workflow managing these fields.
   * @return manager
  **/
  @ApiModelProperty(value = "Manager is an identifier of the workflow managing these fields.")
  public String getManager() {
    return manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }

  public IoK8sApimachineryPkgApisMetaV1ManagedFieldsEntry operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are &#39;Apply&#39; and &#39;Update&#39;.
   * @return operation
  **/
  @ApiModelProperty(value = "Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public IoK8sApimachineryPkgApisMetaV1ManagedFieldsEntry subresource(String subresource) {
    this.subresource = subresource;
    return this;
  }

   /**
   * Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource. The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.
   * @return subresource
  **/
  @ApiModelProperty(value = "Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource. The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.")
  public String getSubresource() {
    return subresource;
  }

  public void setSubresource(String subresource) {
    this.subresource = subresource;
  }

  public IoK8sApimachineryPkgApisMetaV1ManagedFieldsEntry time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Time is timestamp of when these fields were set. It should always be empty if Operation is &#39;Apply&#39;
   * @return time
  **/
  @ApiModelProperty(value = "Time is timestamp of when these fields were set. It should always be empty if Operation is 'Apply'")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApimachineryPkgApisMetaV1ManagedFieldsEntry ioK8sApimachineryPkgApisMetaV1ManagedFieldsEntry = (IoK8sApimachineryPkgApisMetaV1ManagedFieldsEntry) o;
    return Objects.equals(this.apiVersion, ioK8sApimachineryPkgApisMetaV1ManagedFieldsEntry.apiVersion) &&
        Objects.equals(this.fieldsType, ioK8sApimachineryPkgApisMetaV1ManagedFieldsEntry.fieldsType) &&
        Objects.equals(this.fieldsV1, ioK8sApimachineryPkgApisMetaV1ManagedFieldsEntry.fieldsV1) &&
        Objects.equals(this.manager, ioK8sApimachineryPkgApisMetaV1ManagedFieldsEntry.manager) &&
        Objects.equals(this.operation, ioK8sApimachineryPkgApisMetaV1ManagedFieldsEntry.operation) &&
        Objects.equals(this.subresource, ioK8sApimachineryPkgApisMetaV1ManagedFieldsEntry.subresource) &&
        Objects.equals(this.time, ioK8sApimachineryPkgApisMetaV1ManagedFieldsEntry.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, fieldsType, fieldsV1, manager, operation, subresource, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1ManagedFieldsEntry {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    fieldsType: ").append(toIndentedString(fieldsType)).append("\n");
    sb.append("    fieldsV1: ").append(toIndentedString(fieldsV1)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    subresource: ").append(toIndentedString(subresource)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

