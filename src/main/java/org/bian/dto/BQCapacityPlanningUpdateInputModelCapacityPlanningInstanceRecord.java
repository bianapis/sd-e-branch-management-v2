package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCapacityPlanningUpdateInputModelCapacityPlanningInstanceRecord
 */
public class BQCapacityPlanningUpdateInputModelCapacityPlanningInstanceRecord   {
  private String eBranchChannelPlatformUtilization = null;

  private String eBranchChannelLoadingProjections = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Record of the channel resource utilization and loading 
   * @return eBranchChannelPlatformUtilization
  **/

  @JsonProperty("eBranchChannelPlatformUtilization")
  public String getEBranchChannelPlatformUtilization() {
    return eBranchChannelPlatformUtilization;
  }

  public void setEBranchChannelPlatformUtilization(String eBranchChannelPlatformUtilization) {
    this.eBranchChannelPlatformUtilization = eBranchChannelPlatformUtilization;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Estimated projected resource utilization and loading based on historical patterns and anticipated activity - used to identify the need for capacity upgrades 
   * @return eBranchChannelLoadingProjections
  **/

  @JsonProperty("eBranchChannelLoadingProjections")
  public String getEBranchChannelLoadingProjections() {
    return eBranchChannelLoadingProjections;
  }

  public void setEBranchChannelLoadingProjections(String eBranchChannelLoadingProjections) {
    this.eBranchChannelLoadingProjections = eBranchChannelLoadingProjections;
  }


}

