package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREBranchChannelManagementPlanRetrieveInputModelEBranchChannelManagementPlanInstanceAnalysis
 */
public class CREBranchChannelManagementPlanRetrieveInputModelEBranchChannelManagementPlanInstanceAnalysis   {
  private String eBranchChannelManagementPlanInstanceAnalysisReference = null;

  private String eBranchChannelManagementPlanInstanceAnalysisReportType = null;

  private String eBranchChannelManagementPlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return eBranchChannelManagementPlanInstanceAnalysisReference
  **/

  public String getEBranchChannelManagementPlanInstanceAnalysisReference() {
    return eBranchChannelManagementPlanInstanceAnalysisReference;
  }

  public void setEBranchChannelManagementPlanInstanceAnalysisReference(String eBranchChannelManagementPlanInstanceAnalysisReference) {
    this.eBranchChannelManagementPlanInstanceAnalysisReference = eBranchChannelManagementPlanInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return eBranchChannelManagementPlanInstanceAnalysisReportType
  **/

  public String getEBranchChannelManagementPlanInstanceAnalysisReportType() {
    return eBranchChannelManagementPlanInstanceAnalysisReportType;
  }

  public void setEBranchChannelManagementPlanInstanceAnalysisReportType(String eBranchChannelManagementPlanInstanceAnalysisReportType) {
    this.eBranchChannelManagementPlanInstanceAnalysisReportType = eBranchChannelManagementPlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return eBranchChannelManagementPlanInstanceAnalysisParameters
  **/

  public String getEBranchChannelManagementPlanInstanceAnalysisParameters() {
    return eBranchChannelManagementPlanInstanceAnalysisParameters;
  }

  public void setEBranchChannelManagementPlanInstanceAnalysisParameters(String eBranchChannelManagementPlanInstanceAnalysisParameters) {
    this.eBranchChannelManagementPlanInstanceAnalysisParameters = eBranchChannelManagementPlanInstanceAnalysisParameters;
  }


}

