package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelManagementPlanCreateInputModelEBranchChannelManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CREBranchChannelManagementPlanCreateInputModel
 */
public class CREBranchChannelManagementPlanCreateInputModel   {
  private String eBranchManagementServicingSessionReference = null;

  private Object eBranchChannelManagementPlanCreateActionRecord = null;

  private String eBranchChannelManagementPlanInstanceStatus = null;

  private CREBranchChannelManagementPlanCreateInputModelEBranchChannelManagementPlanInstanceRecord eBranchChannelManagementPlanInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return eBranchManagementServicingSessionReference
  **/

  public String getEBranchManagementServicingSessionReference() {
    return eBranchManagementServicingSessionReference;
  }

  public void setEBranchManagementServicingSessionReference(String eBranchManagementServicingSessionReference) {
    this.eBranchManagementServicingSessionReference = eBranchManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return eBranchChannelManagementPlanCreateActionRecord
  **/

  public Object getEBranchChannelManagementPlanCreateActionRecord() {
    return eBranchChannelManagementPlanCreateActionRecord;
  }

  public void setEBranchChannelManagementPlanCreateActionRecord(Object eBranchChannelManagementPlanCreateActionRecord) {
    this.eBranchChannelManagementPlanCreateActionRecord = eBranchChannelManagementPlanCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the E-Branch Channel Management Plan instance (e.g. initialised, pending, active) 
   * @return eBranchChannelManagementPlanInstanceStatus
  **/

  public String getEBranchChannelManagementPlanInstanceStatus() {
    return eBranchChannelManagementPlanInstanceStatus;
  }

  public void setEBranchChannelManagementPlanInstanceStatus(String eBranchChannelManagementPlanInstanceStatus) {
    this.eBranchChannelManagementPlanInstanceStatus = eBranchChannelManagementPlanInstanceStatus;
  }


  /**
   * Get eBranchChannelManagementPlanInstanceRecord
   * @return eBranchChannelManagementPlanInstanceRecord
  **/

  public CREBranchChannelManagementPlanCreateInputModelEBranchChannelManagementPlanInstanceRecord getEBranchChannelManagementPlanInstanceRecord() {
    return eBranchChannelManagementPlanInstanceRecord;
  }

  public void setEBranchChannelManagementPlanInstanceRecord(CREBranchChannelManagementPlanCreateInputModelEBranchChannelManagementPlanInstanceRecord eBranchChannelManagementPlanInstanceRecord) {
    this.eBranchChannelManagementPlanInstanceRecord = eBranchChannelManagementPlanInstanceRecord;
  }


}

