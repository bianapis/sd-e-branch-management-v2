package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCapacityPlanningRetrieveOutputModelCapacityPlanningInstanceAnalysis;
import org.bian.dto.BQCapacityPlanningRetrieveOutputModelCapacityPlanningInstanceReport;
import org.bian.dto.BQCapacityPlanningUpdateInputModelCapacityPlanningInstanceRecord;
import org.bian.dto.CREBranchChannelManagementPlanCreateOutputModelEBranchChannelManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCapacityPlanningRetrieveOutputModel
 */
public class BQCapacityPlanningRetrieveOutputModel   {
  private CREBranchChannelManagementPlanCreateOutputModelEBranchChannelManagementPlanInstanceRecord eBranchChannelManagementPlanInstanceRecord = null;

  private BQCapacityPlanningUpdateInputModelCapacityPlanningInstanceRecord capacityPlanningInstanceRecord = null;

  private String capacityPlanningRetrieveActionTaskReference = null;

  private Object capacityPlanningRetrieveActionTaskRecord = null;

  private String capacityPlanningRetrieveActionResponse = null;

  private BQCapacityPlanningRetrieveOutputModelCapacityPlanningInstanceReport capacityPlanningInstanceReport = null;

  private BQCapacityPlanningRetrieveOutputModelCapacityPlanningInstanceAnalysis capacityPlanningInstanceAnalysis = null;


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
   * Get capacityPlanningInstanceRecord
   * @return capacityPlanningInstanceRecord
  **/

  public BQCapacityPlanningUpdateInputModelCapacityPlanningInstanceRecord getCapacityPlanningInstanceRecord() {
    return capacityPlanningInstanceRecord;
  }

  public void setCapacityPlanningInstanceRecord(BQCapacityPlanningUpdateInputModelCapacityPlanningInstanceRecord capacityPlanningInstanceRecord) {
    this.capacityPlanningInstanceRecord = capacityPlanningInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Capacity Planning instance retrieve service call 
   * @return capacityPlanningRetrieveActionTaskReference
  **/

  public String getCapacityPlanningRetrieveActionTaskReference() {
    return capacityPlanningRetrieveActionTaskReference;
  }

  public void setCapacityPlanningRetrieveActionTaskReference(String capacityPlanningRetrieveActionTaskReference) {
    this.capacityPlanningRetrieveActionTaskReference = capacityPlanningRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return capacityPlanningRetrieveActionTaskRecord
  **/

  public Object getCapacityPlanningRetrieveActionTaskRecord() {
    return capacityPlanningRetrieveActionTaskRecord;
  }

  public void setCapacityPlanningRetrieveActionTaskRecord(Object capacityPlanningRetrieveActionTaskRecord) {
    this.capacityPlanningRetrieveActionTaskRecord = capacityPlanningRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return capacityPlanningRetrieveActionResponse
  **/

  public String getCapacityPlanningRetrieveActionResponse() {
    return capacityPlanningRetrieveActionResponse;
  }

  public void setCapacityPlanningRetrieveActionResponse(String capacityPlanningRetrieveActionResponse) {
    this.capacityPlanningRetrieveActionResponse = capacityPlanningRetrieveActionResponse;
  }


  /**
   * Get capacityPlanningInstanceReport
   * @return capacityPlanningInstanceReport
  **/

  public BQCapacityPlanningRetrieveOutputModelCapacityPlanningInstanceReport getCapacityPlanningInstanceReport() {
    return capacityPlanningInstanceReport;
  }

  public void setCapacityPlanningInstanceReport(BQCapacityPlanningRetrieveOutputModelCapacityPlanningInstanceReport capacityPlanningInstanceReport) {
    this.capacityPlanningInstanceReport = capacityPlanningInstanceReport;
  }


  /**
   * Get capacityPlanningInstanceAnalysis
   * @return capacityPlanningInstanceAnalysis
  **/

  public BQCapacityPlanningRetrieveOutputModelCapacityPlanningInstanceAnalysis getCapacityPlanningInstanceAnalysis() {
    return capacityPlanningInstanceAnalysis;
  }

  public void setCapacityPlanningInstanceAnalysis(BQCapacityPlanningRetrieveOutputModelCapacityPlanningInstanceAnalysis capacityPlanningInstanceAnalysis) {
    this.capacityPlanningInstanceAnalysis = capacityPlanningInstanceAnalysis;
  }


}

