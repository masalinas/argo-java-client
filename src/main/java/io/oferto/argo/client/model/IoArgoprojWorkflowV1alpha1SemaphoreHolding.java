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
import java.util.ArrayList;
import java.util.List;

/**
 * IoArgoprojWorkflowV1alpha1SemaphoreHolding
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1SemaphoreHolding {
  @SerializedName("holders")
  private List<String> holders = null;

  @SerializedName("semaphore")
  private String semaphore = null;

  public IoArgoprojWorkflowV1alpha1SemaphoreHolding holders(List<String> holders) {
    this.holders = holders;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1SemaphoreHolding addHoldersItem(String holdersItem) {
    if (this.holders == null) {
      this.holders = new ArrayList<String>();
    }
    this.holders.add(holdersItem);
    return this;
  }

   /**
   * Holders stores the list of current holder names in the io.argoproj.workflow.v1alpha1.
   * @return holders
  **/
  @ApiModelProperty(value = "Holders stores the list of current holder names in the io.argoproj.workflow.v1alpha1.")
  public List<String> getHolders() {
    return holders;
  }

  public void setHolders(List<String> holders) {
    this.holders = holders;
  }

  public IoArgoprojWorkflowV1alpha1SemaphoreHolding semaphore(String semaphore) {
    this.semaphore = semaphore;
    return this;
  }

   /**
   * Semaphore stores the semaphore name.
   * @return semaphore
  **/
  @ApiModelProperty(value = "Semaphore stores the semaphore name.")
  public String getSemaphore() {
    return semaphore;
  }

  public void setSemaphore(String semaphore) {
    this.semaphore = semaphore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1SemaphoreHolding ioArgoprojWorkflowV1alpha1SemaphoreHolding = (IoArgoprojWorkflowV1alpha1SemaphoreHolding) o;
    return Objects.equals(this.holders, ioArgoprojWorkflowV1alpha1SemaphoreHolding.holders) &&
        Objects.equals(this.semaphore, ioArgoprojWorkflowV1alpha1SemaphoreHolding.semaphore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holders, semaphore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1SemaphoreHolding {\n");
    
    sb.append("    holders: ").append(toIndentedString(holders)).append("\n");
    sb.append("    semaphore: ").append(toIndentedString(semaphore)).append("\n");
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

