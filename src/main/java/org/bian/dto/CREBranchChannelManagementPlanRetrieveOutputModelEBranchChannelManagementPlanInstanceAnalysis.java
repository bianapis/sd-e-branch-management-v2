package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREBranchChannelManagementPlanRetrieveOutputModelEBranchChannelManagementPlanInstanceAnalysis
 */
public class CREBranchChannelManagementPlanRetrieveOutputModelEBranchChannelManagementPlanInstanceAnalysis   {
  private String eBranchChannelManagementPlanInstanceAnalysisData = null;

  private String eBranchChannelManagementPlanInstanceAnalysisReportType = null;

  private Object eBranchChannelManagementPlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return eBranchChannelManagementPlanInstanceAnalysisData
  **/

  @JsonProperty("eBranchChannelManagementPlanInstanceAnalysisData")
  public String getEBranchChannelManagementPlanInstanceAnalysisData() {
    return eBranchChannelManagementPlanInstanceAnalysisData;
  }

  public void setEBranchChannelManagementPlanInstanceAnalysisData(String eBranchChannelManagementPlanInstanceAnalysisData) {
    this.eBranchChannelManagementPlanInstanceAnalysisData = eBranchChannelManagementPlanInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return eBranchChannelManagementPlanInstanceAnalysisReportType
  **/

  @JsonProperty("eBranchChannelManagementPlanInstanceAnalysisReportType")
  public String getEBranchChannelManagementPlanInstanceAnalysisReportType() {
    return eBranchChannelManagementPlanInstanceAnalysisReportType;
  }

  public void setEBranchChannelManagementPlanInstanceAnalysisReportType(String eBranchChannelManagementPlanInstanceAnalysisReportType) {
    this.eBranchChannelManagementPlanInstanceAnalysisReportType = eBranchChannelManagementPlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return eBranchChannelManagementPlanInstanceAnalysisReport
  **/

  @JsonProperty("eBranchChannelManagementPlanInstanceAnalysisReport")
  public Object getEBranchChannelManagementPlanInstanceAnalysisReport() {
    return eBranchChannelManagementPlanInstanceAnalysisReport;
  }

  public void setEBranchChannelManagementPlanInstanceAnalysisReport(Object eBranchChannelManagementPlanInstanceAnalysisReport) {
    this.eBranchChannelManagementPlanInstanceAnalysisReport = eBranchChannelManagementPlanInstanceAnalysisReport;
  }


}

