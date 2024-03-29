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
 * OSSLifecycleRule specifies how to manage bucket&#39;s lifecycle
 */
@ApiModel(description = "OSSLifecycleRule specifies how to manage bucket's lifecycle")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1OSSLifecycleRule {
  @SerializedName("markDeletionAfterDays")
  private Integer markDeletionAfterDays = null;

  @SerializedName("markInfrequentAccessAfterDays")
  private Integer markInfrequentAccessAfterDays = null;

  public IoArgoprojWorkflowV1alpha1OSSLifecycleRule markDeletionAfterDays(Integer markDeletionAfterDays) {
    this.markDeletionAfterDays = markDeletionAfterDays;
    return this;
  }

   /**
   * MarkDeletionAfterDays is the number of days before we delete objects in the bucket
   * @return markDeletionAfterDays
  **/
  @ApiModelProperty(value = "MarkDeletionAfterDays is the number of days before we delete objects in the bucket")
  public Integer getMarkDeletionAfterDays() {
    return markDeletionAfterDays;
  }

  public void setMarkDeletionAfterDays(Integer markDeletionAfterDays) {
    this.markDeletionAfterDays = markDeletionAfterDays;
  }

  public IoArgoprojWorkflowV1alpha1OSSLifecycleRule markInfrequentAccessAfterDays(Integer markInfrequentAccessAfterDays) {
    this.markInfrequentAccessAfterDays = markInfrequentAccessAfterDays;
    return this;
  }

   /**
   * MarkInfrequentAccessAfterDays is the number of days before we convert the objects in the bucket to Infrequent Access (IA) storage type
   * @return markInfrequentAccessAfterDays
  **/
  @ApiModelProperty(value = "MarkInfrequentAccessAfterDays is the number of days before we convert the objects in the bucket to Infrequent Access (IA) storage type")
  public Integer getMarkInfrequentAccessAfterDays() {
    return markInfrequentAccessAfterDays;
  }

  public void setMarkInfrequentAccessAfterDays(Integer markInfrequentAccessAfterDays) {
    this.markInfrequentAccessAfterDays = markInfrequentAccessAfterDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1OSSLifecycleRule ioArgoprojWorkflowV1alpha1OSSLifecycleRule = (IoArgoprojWorkflowV1alpha1OSSLifecycleRule) o;
    return Objects.equals(this.markDeletionAfterDays, ioArgoprojWorkflowV1alpha1OSSLifecycleRule.markDeletionAfterDays) &&
        Objects.equals(this.markInfrequentAccessAfterDays, ioArgoprojWorkflowV1alpha1OSSLifecycleRule.markInfrequentAccessAfterDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(markDeletionAfterDays, markInfrequentAccessAfterDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1OSSLifecycleRule {\n");
    
    sb.append("    markDeletionAfterDays: ").append(toIndentedString(markDeletionAfterDays)).append("\n");
    sb.append("    markInfrequentAccessAfterDays: ").append(toIndentedString(markInfrequentAccessAfterDays)).append("\n");
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

