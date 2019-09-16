package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREBranchChannelManagementPlanRetrieveOutputModelEBranchChannelManagementPlanInstanceReportRecord
 */
public class CREBranchChannelManagementPlanRetrieveOutputModelEBranchChannelManagementPlanInstanceReportRecord   {
  private String eBranchChannelManagementPlanInstanceReportData = null;

  private String eBranchChannelManagementPlanInstanceReportType = null;

  private Object eBranchChannelManagementPlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return eBranchChannelManagementPlanInstanceReportData
  **/

  @JsonProperty("eBranchChannelManagementPlanInstanceReportData")
  public String getEBranchChannelManagementPlanInstanceReportData() {
    return eBranchChannelManagementPlanInstanceReportData;
  }

  public void setEBranchChannelManagementPlanInstanceReportData(String eBranchChannelManagementPlanInstanceReportData) {
    this.eBranchChannelManagementPlanInstanceReportData = eBranchChannelManagementPlanInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return eBranchChannelManagementPlanInstanceReportType
  **/

  @JsonProperty("eBranchChannelManagementPlanInstanceReportType")
  public String getEBranchChannelManagementPlanInstanceReportType() {
    return eBranchChannelManagementPlanInstanceReportType;
  }

  public void setEBranchChannelManagementPlanInstanceReportType(String eBranchChannelManagementPlanInstanceReportType) {
    this.eBranchChannelManagementPlanInstanceReportType = eBranchChannelManagementPlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return eBranchChannelManagementPlanInstanceReport
  **/
@JsonProperty("eBranchChannelManagementPlanInstanceReport")
  public Object getEBranchChannelManagementPlanInstanceReport() {
    return eBranchChannelManagementPlanInstanceReport;
  }

  public void setEBranchChannelManagementPlanInstanceReport(Object eBranchChannelManagementPlanInstanceReport) {
    this.eBranchChannelManagementPlanInstanceReport = eBranchChannelManagementPlanInstanceReport;
  }


}

