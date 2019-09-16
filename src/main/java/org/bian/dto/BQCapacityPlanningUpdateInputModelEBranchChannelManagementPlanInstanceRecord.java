package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCapacityPlanningUpdateInputModelEBranchChannelManagementPlanInstanceRecord
 */
public class BQCapacityPlanningUpdateInputModelEBranchChannelManagementPlanInstanceRecord   {
  private String eBranchChannelServiceSchedule = null;


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

