package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelManagementPlanExchangeInputModelEBranchChannelManagementPlanExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CREBranchChannelManagementPlanExchangeInputModel
 */
public class CREBranchChannelManagementPlanExchangeInputModel   {
  private String eBranchManagementServicingSessionReference = null;

  private String eBranchChannelManagementPlanInstanceReference = null;

  private Object eBranchChannelManagementPlanExchangeActionTaskRecord = null;

  private CREBranchChannelManagementPlanExchangeInputModelEBranchChannelManagementPlanExchangeActionRequest eBranchChannelManagementPlanExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return eBranchChannelManagementPlanExchangeActionTaskRecord
  **/

  public Object getEBranchChannelManagementPlanExchangeActionTaskRecord() {
    return eBranchChannelManagementPlanExchangeActionTaskRecord;
  }

  public void setEBranchChannelManagementPlanExchangeActionTaskRecord(Object eBranchChannelManagementPlanExchangeActionTaskRecord) {
    this.eBranchChannelManagementPlanExchangeActionTaskRecord = eBranchChannelManagementPlanExchangeActionTaskRecord;
  }


  /**
   * Get eBranchChannelManagementPlanExchangeActionRequest
   * @return eBranchChannelManagementPlanExchangeActionRequest
  **/

  public CREBranchChannelManagementPlanExchangeInputModelEBranchChannelManagementPlanExchangeActionRequest getEBranchChannelManagementPlanExchangeActionRequest() {
    return eBranchChannelManagementPlanExchangeActionRequest;
  }

  public void setEBranchChannelManagementPlanExchangeActionRequest(CREBranchChannelManagementPlanExchangeInputModelEBranchChannelManagementPlanExchangeActionRequest eBranchChannelManagementPlanExchangeActionRequest) {
    this.eBranchChannelManagementPlanExchangeActionRequest = eBranchChannelManagementPlanExchangeActionRequest;
  }


}

