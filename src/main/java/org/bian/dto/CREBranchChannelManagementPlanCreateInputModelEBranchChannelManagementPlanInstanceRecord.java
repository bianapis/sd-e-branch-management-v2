package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREBranchChannelManagementPlanCreateInputModelEBranchChannelManagementPlanInstanceRecord
 */
public class CREBranchChannelManagementPlanCreateInputModelEBranchChannelManagementPlanInstanceRecord   {
  private String eBranchChannelManagementPlanPeriod = null;

  private String eBranchChannelServicePerformanceGoals = null;

  private String eBranchChannelServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The time period addressed by the management plan 
   * @return eBranchChannelManagementPlanPeriod
  **/

  @JsonProperty("eBranchChannelManagementPlanPeriod")
  public String getEBranchChannelManagementPlanPeriod() {
    return eBranchChannelManagementPlanPeriod;
  }

  public void setEBranchChannelManagementPlanPeriod(String eBranchChannelManagementPlanPeriod) {
    this.eBranchChannelManagementPlanPeriod = eBranchChannelManagementPlanPeriod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The target and actual service performance goals that are tracked by channel management 
   * @return eBranchChannelServicePerformanceGoals
  **/

  @JsonProperty("eBranchChannelServicePerformanceGoals")
  public String getEBranchChannelServicePerformanceGoals() {
    return eBranchChannelServicePerformanceGoals;
  }

  public void setEBranchChannelServicePerformanceGoals(String eBranchChannelServicePerformanceGoals) {
    this.eBranchChannelServicePerformanceGoals = eBranchChannelServicePerformanceGoals;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The target and actual channel service schedule - recording planned and actual service availability and outages (includes any partial service access constraints or restrictions for a 24/7 service)  
   * @return eBranchChannelServiceSchedule
  **/

  @JsonProperty("eBranchChannelServiceSchedule")
  public String getEBranchChannelServiceSchedule() {
    return eBranchChannelServiceSchedule;
  }

  public void setEBranchChannelServiceSchedule(String eBranchChannelServiceSchedule) {
    this.eBranchChannelServiceSchedule = eBranchChannelServiceSchedule;
  }


}

