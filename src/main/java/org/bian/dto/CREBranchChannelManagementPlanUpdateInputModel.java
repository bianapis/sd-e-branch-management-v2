package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREBranchChannelManagementPlanUpdateInputModel
 */
public class CREBranchChannelManagementPlanUpdateInputModel   {
  private String eBranchManagementServicingSessionReference = null;

  private String eBranchChannelManagementPlanInstanceReference = null;

  private Object eBranchChannelManagementPlanUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the E-Branch Channel Management Plan instance 
   * @return eBranchChannelManagementPlanInstanceReference
  **/

  public String getEBranchChannelManagementPlanInstanceReference() {
    return eBranchChannelManagementPlanInstanceReference;
  }

  public void setEBranchChannelManagementPlanInstanceReference(String eBranchChannelManagementPlanInstanceReference) {
    this.eBranchChannelManagementPlanInstanceReference = eBranchChannelManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return eBranchChannelManagementPlanUpdateActionTaskRecord
  **/

  public Object getEBranchChannelManagementPlanUpdateActionTaskRecord() {
    return eBranchChannelManagementPlanUpdateActionTaskRecord;
  }

  public void setEBranchChannelManagementPlanUpdateActionTaskRecord(Object eBranchChannelManagementPlanUpdateActionTaskRecord) {
    this.eBranchChannelManagementPlanUpdateActionTaskRecord = eBranchChannelManagementPlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

