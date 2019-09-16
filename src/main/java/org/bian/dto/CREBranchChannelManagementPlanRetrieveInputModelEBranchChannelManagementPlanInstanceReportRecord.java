package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREBranchChannelManagementPlanRetrieveInputModelEBranchChannelManagementPlanInstanceReportRecord
 */
public class CREBranchChannelManagementPlanRetrieveInputModelEBranchChannelManagementPlanInstanceReportRecord   {
  private String eBranchChannelManagementPlanInstanceReportReference = null;

  private String eBranchChannelManagementPlanInstanceReportType = null;

  private String eBranchChannelManagementPlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return eBranchChannelManagementPlanInstanceReportReference
  **/

  public String getEBranchChannelManagementPlanInstanceReportReference() {
    return eBranchChannelManagementPlanInstanceReportReference;
  }

  public void setEBranchChannelManagementPlanInstanceReportReference(String eBranchChannelManagementPlanInstanceReportReference) {
    this.eBranchChannelManagementPlanInstanceReportReference = eBranchChannelManagementPlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return eBranchChannelManagementPlanInstanceReportType
  **/

  public String getEBranchChannelManagementPlanInstanceReportType() {
    return eBranchChannelManagementPlanInstanceReportType;
  }

  public void setEBranchChannelManagementPlanInstanceReportType(String eBranchChannelManagementPlanInstanceReportType) {
    this.eBranchChannelManagementPlanInstanceReportType = eBranchChannelManagementPlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return eBranchChannelManagementPlanInstanceReportParameters
  **/

  public String getEBranchChannelManagementPlanInstanceReportParameters() {
    return eBranchChannelManagementPlanInstanceReportParameters;
  }

  public void setEBranchChannelManagementPlanInstanceReportParameters(String eBranchChannelManagementPlanInstanceReportParameters) {
    this.eBranchChannelManagementPlanInstanceReportParameters = eBranchChannelManagementPlanInstanceReportParameters;
  }


}

