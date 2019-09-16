package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelManagementPlanCreateOutputModelEBranchChannelManagementPlanInstanceRecord;
import org.bian.dto.CREBranchChannelManagementPlanRetrieveOutputModelEBranchChannelManagementPlanInstanceAnalysis;
import org.bian.dto.CREBranchChannelManagementPlanRetrieveOutputModelEBranchChannelManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CREBranchChannelManagementPlanRetrieveOutputModel
 */
public class CREBranchChannelManagementPlanRetrieveOutputModel   {
  private CREBranchChannelManagementPlanCreateOutputModelEBranchChannelManagementPlanInstanceRecord eBranchChannelManagementPlanInstanceRecord = null;

  private String eBranchChannelManagementPlanRetrieveActionTaskReference = null;

  private Object eBranchChannelManagementPlanRetrieveActionTaskRecord = null;

  private String eBranchChannelManagementPlanRetrieveActionResponse = null;

  private CREBranchChannelManagementPlanRetrieveOutputModelEBranchChannelManagementPlanInstanceReportRecord eBranchChannelManagementPlanInstanceReportRecord = null;

  private CREBranchChannelManagementPlanRetrieveOutputModelEBranchChannelManagementPlanInstanceAnalysis eBranchChannelManagementPlanInstanceAnalysis = null;


  /**
   * Get eBranchChannelManagementPlanInstanceRecord
   * @return eBranchChannelManagementPlanInstanceRecord
  **/

  @JsonProperty("eBranchChannelManagementPlanInstanceRecord")
  public CREBranchChannelManagementPlanCreateOutputModelEBranchChannelManagementPlanInstanceRecord getEBranchChannelManagementPlanInstanceRecord() {
    return eBranchChannelManagementPlanInstanceRecord;
  }

  public void setEBranchChannelManagementPlanInstanceRecord(CREBranchChannelManagementPlanCreateOutputModelEBranchChannelManagementPlanInstanceRecord eBranchChannelManagementPlanInstanceRecord) {
    this.eBranchChannelManagementPlanInstanceRecord = eBranchChannelManagementPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a E-Branch Channel Management Plan instance retrieve service call 
   * @return eBranchChannelManagementPlanRetrieveActionTaskReference
  **/

  @JsonProperty("eBranchChannelManagementPlanRetrieveActionTaskReference")
  public String getEBranchChannelManagementPlanRetrieveActionTaskReference() {
    return eBranchChannelManagementPlanRetrieveActionTaskReference;
  }

  public void setEBranchChannelManagementPlanRetrieveActionTaskReference(String eBranchChannelManagementPlanRetrieveActionTaskReference) {
    this.eBranchChannelManagementPlanRetrieveActionTaskReference = eBranchChannelManagementPlanRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return eBranchChannelManagementPlanRetrieveActionTaskRecord
  **/

  @JsonProperty("eBranchChannelManagementPlanRetrieveActionTaskRecord")
  public Object getEBranchChannelManagementPlanRetrieveActionTaskRecord() {
    return eBranchChannelManagementPlanRetrieveActionTaskRecord;
  }

  public void setEBranchChannelManagementPlanRetrieveActionTaskRecord(Object eBranchChannelManagementPlanRetrieveActionTaskRecord) {
    this.eBranchChannelManagementPlanRetrieveActionTaskRecord = eBranchChannelManagementPlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return eBranchChannelManagementPlanRetrieveActionResponse
  **/

  @JsonProperty("eBranchChannelManagementPlanRetrieveActionResponse")
  public String getEBranchChannelManagementPlanRetrieveActionResponse() {
    return eBranchChannelManagementPlanRetrieveActionResponse;
  }

  public void setEBranchChannelManagementPlanRetrieveActionResponse(String eBranchChannelManagementPlanRetrieveActionResponse) {
    this.eBranchChannelManagementPlanRetrieveActionResponse = eBranchChannelManagementPlanRetrieveActionResponse;
  }


  /**
   * Get eBranchChannelManagementPlanInstanceReportRecord
   * @return eBranchChannelManagementPlanInstanceReportRecord
  **/

  @JsonProperty("eBranchChannelManagementPlanInstanceReportRecord")
  public CREBranchChannelManagementPlanRetrieveOutputModelEBranchChannelManagementPlanInstanceReportRecord getEBranchChannelManagementPlanInstanceReportRecord() {
    return eBranchChannelManagementPlanInstanceReportRecord;
  }

  public void setEBranchChannelManagementPlanInstanceReportRecord(CREBranchChannelManagementPlanRetrieveOutputModelEBranchChannelManagementPlanInstanceReportRecord eBranchChannelManagementPlanInstanceReportRecord) {
    this.eBranchChannelManagementPlanInstanceReportRecord = eBranchChannelManagementPlanInstanceReportRecord;
  }


  /**
   * Get eBranchChannelManagementPlanInstanceAnalysis
   * @return eBranchChannelManagementPlanInstanceAnalysis
  **/

  @JsonProperty("eBranchChannelManagementPlanInstanceAnalysis")
  public CREBranchChannelManagementPlanRetrieveOutputModelEBranchChannelManagementPlanInstanceAnalysis getEBranchChannelManagementPlanInstanceAnalysis() {
    return eBranchChannelManagementPlanInstanceAnalysis;
  }

  public void setEBranchChannelManagementPlanInstanceAnalysis(CREBranchChannelManagementPlanRetrieveOutputModelEBranchChannelManagementPlanInstanceAnalysis eBranchChannelManagementPlanInstanceAnalysis) {
    this.eBranchChannelManagementPlanInstanceAnalysis = eBranchChannelManagementPlanInstanceAnalysis;
  }


}

