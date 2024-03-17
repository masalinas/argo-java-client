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
 * CreateS3BucketOptions options used to determine automatic automatic bucket-creation process
 */
@ApiModel(description = "CreateS3BucketOptions options used to determine automatic automatic bucket-creation process")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1CreateS3BucketOptions {
  @SerializedName("objectLocking")
  private Boolean objectLocking = null;

  public IoArgoprojWorkflowV1alpha1CreateS3BucketOptions objectLocking(Boolean objectLocking) {
    this.objectLocking = objectLocking;
    return this;
  }

   /**
   * ObjectLocking Enable object locking
   * @return objectLocking
  **/
  @ApiModelProperty(value = "ObjectLocking Enable object locking")
  public Boolean isObjectLocking() {
    return objectLocking;
  }

  public void setObjectLocking(Boolean objectLocking) {
    this.objectLocking = objectLocking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1CreateS3BucketOptions ioArgoprojWorkflowV1alpha1CreateS3BucketOptions = (IoArgoprojWorkflowV1alpha1CreateS3BucketOptions) o;
    return Objects.equals(this.objectLocking, ioArgoprojWorkflowV1alpha1CreateS3BucketOptions.objectLocking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectLocking);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1CreateS3BucketOptions {\n");
    
    sb.append("    objectLocking: ").append(toIndentedString(objectLocking)).append("\n");
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

