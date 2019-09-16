package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelManagementPlanRetrieveInputModelEBranchChannelManagementPlanInstanceAnalysis;
import org.bian.dto.CREBranchChannelManagementPlanRetrieveInputModelEBranchChannelManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CREBranchChannelManagementPlanRetrieveInputModel
 */
public class CREBranchChannelManagementPlanRetrieveInputModel   {
  private Object eBranchChannelManagementPlanRetrieveActionTaskRecord = null;

  private String eBranchChannelManagementPlanRetrieveActionRequest = null;

  private CREBranchChannelManagementPlanRetrieveInputModelEBranchChannelManagementPlanInstanceReportRecord eBranchChannelManagementPlanInstanceReportRecord = null;

  private CREBranchChannelManagementPlanRetrieveInputModelEBranchChannelManagementPlanInstanceAnalysis eBranchChannelManagementPlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return eBranchChannelManagementPlanRetrieveActionTaskRecord
  **/

  public Object getEBranchChannelManagementPlanRetrieveActionTaskRecord() {
    return eBranchChannelManagementPlanRetrieveActionTaskRecord;
  }

  public void setEBranchChannelManagementPlanRetrieveActionTaskRecord(Object eBranchChannelManagementPlanRetrieveActionTaskRecord) {
    this.eBranchChannelManagementPlanRetrieveActionTaskRecord = eBranchChannelManagementPlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return eBranchChannelManagementPlanRetrieveActionRequest
  **/

  public String getEBranchChannelManagementPlanRetrieveActionRequest() {
    return eBranchChannelManagementPlanRetrieveActionRequest;
  }

  public void setEBranchChannelManagementPlanRetrieveActionRequest(String eBranchChannelManagementPlanRetrieveActionRequest) {
    this.eBranchChannelManagementPlanRetrieveActionRequest = eBranchChannelManagementPlanRetrieveActionRequest;
  }


  /**
   * Get eBranchChannelManagementPlanInstanceReportRecord
   * @return eBranchChannelManagementPlanInstanceReportRecord
  **/

  public CREBranchChannelManagementPlanRetrieveInputModelEBranchChannelManagementPlanInstanceReportRecord getEBranchChannelManagementPlanInstanceReportRecord() {
    return eBranchChannelManagementPlanInstanceReportRecord;
  }

  public void setEBranchChannelManagementPlanInstanceReportRecord(CREBranchChannelManagementPlanRetrieveInputModelEBranchChannelManagementPlanInstanceReportRecord eBranchChannelManagementPlanInstanceReportRecord) {
    this.eBranchChannelManagementPlanInstanceReportRecord = eBranchChannelManagementPlanInstanceReportRecord;
  }


  /**
   * Get eBranchChannelManagementPlanInstanceAnalysis
   * @return eBranchChannelManagementPlanInstanceAnalysis
  **/

  public CREBranchChannelManagementPlanRetrieveInputModelEBranchChannelManagementPlanInstanceAnalysis getEBranchChannelManagementPlanInstanceAnalysis() {
    return eBranchChannelManagementPlanInstanceAnalysis;
  }

  public void setEBranchChannelManagementPlanInstanceAnalysis(CREBranchChannelManagementPlanRetrieveInputModelEBranchChannelManagementPlanInstanceAnalysis eBranchChannelManagementPlanInstanceAnalysis) {
    this.eBranchChannelManagementPlanInstanceAnalysis = eBranchChannelManagementPlanInstanceAnalysis;
  }


}

