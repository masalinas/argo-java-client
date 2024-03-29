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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ArtGCStatus maintains state related to ArtifactGC
 */
@ApiModel(description = "ArtGCStatus maintains state related to ArtifactGC")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T20:59:50.224Z")
public class IoArgoprojWorkflowV1alpha1ArtGCStatus {
  @SerializedName("notSpecified")
  private Boolean notSpecified = null;

  @SerializedName("podsRecouped")
  private Map<String, Boolean> podsRecouped = null;

  @SerializedName("strategiesProcessed")
  private Map<String, Boolean> strategiesProcessed = null;

  public IoArgoprojWorkflowV1alpha1ArtGCStatus notSpecified(Boolean notSpecified) {
    this.notSpecified = notSpecified;
    return this;
  }

   /**
   * if this is true, we already checked to see if we need to do it and we don&#39;t
   * @return notSpecified
  **/
  @ApiModelProperty(value = "if this is true, we already checked to see if we need to do it and we don't")
  public Boolean isNotSpecified() {
    return notSpecified;
  }

  public void setNotSpecified(Boolean notSpecified) {
    this.notSpecified = notSpecified;
  }

  public IoArgoprojWorkflowV1alpha1ArtGCStatus podsRecouped(Map<String, Boolean> podsRecouped) {
    this.podsRecouped = podsRecouped;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1ArtGCStatus putPodsRecoupedItem(String key, Boolean podsRecoupedItem) {
    if (this.podsRecouped == null) {
      this.podsRecouped = new HashMap<String, Boolean>();
    }
    this.podsRecouped.put(key, podsRecoupedItem);
    return this;
  }

   /**
   * have completed Pods been processed? (mapped by Pod name) used to prevent re-processing the Status of a Pod more than once
   * @return podsRecouped
  **/
  @ApiModelProperty(value = "have completed Pods been processed? (mapped by Pod name) used to prevent re-processing the Status of a Pod more than once")
  public Map<String, Boolean> getPodsRecouped() {
    return podsRecouped;
  }

  public void setPodsRecouped(Map<String, Boolean> podsRecouped) {
    this.podsRecouped = podsRecouped;
  }

  public IoArgoprojWorkflowV1alpha1ArtGCStatus strategiesProcessed(Map<String, Boolean> strategiesProcessed) {
    this.strategiesProcessed = strategiesProcessed;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1ArtGCStatus putStrategiesProcessedItem(String key, Boolean strategiesProcessedItem) {
    if (this.strategiesProcessed == null) {
      this.strategiesProcessed = new HashMap<String, Boolean>();
    }
    this.strategiesProcessed.put(key, strategiesProcessedItem);
    return this;
  }

   /**
   * have Pods been started to perform this strategy? (enables us not to re-process what we&#39;ve already done)
   * @return strategiesProcessed
  **/
  @ApiModelProperty(value = "have Pods been started to perform this strategy? (enables us not to re-process what we've already done)")
  public Map<String, Boolean> getStrategiesProcessed() {
    return strategiesProcessed;
  }

  public void setStrategiesProcessed(Map<String, Boolean> strategiesProcessed) {
    this.strategiesProcessed = strategiesProcessed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1ArtGCStatus ioArgoprojWorkflowV1alpha1ArtGCStatus = (IoArgoprojWorkflowV1alpha1ArtGCStatus) o;
    return Objects.equals(this.notSpecified, ioArgoprojWorkflowV1alpha1ArtGCStatus.notSpecified) &&
        Objects.equals(this.podsRecouped, ioArgoprojWorkflowV1alpha1ArtGCStatus.podsRecouped) &&
        Objects.equals(this.strategiesProcessed, ioArgoprojWorkflowV1alpha1ArtGCStatus.strategiesProcessed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notSpecified, podsRecouped, strategiesProcessed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1ArtGCStatus {\n");
    
    sb.append("    notSpecified: ").append(toIndentedString(notSpecified)).append("\n");
    sb.append("    podsRecouped: ").append(toIndentedString(podsRecouped)).append("\n");
    sb.append("    strategiesProcessed: ").append(toIndentedString(strategiesProcessed)).append("\n");
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

