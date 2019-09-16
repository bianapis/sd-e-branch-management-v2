package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREBranchChannelManagementPlanExchangeOutputModel
 */
public class CREBranchChannelManagementPlanExchangeOutputModel   {
  private String eBranchChannelManagementPlanExchangeActionTaskReference = null;

  private Object eBranchChannelManagementPlanExchangeActionTaskRecord = null;

  private String eBranchChannelManagementPlanExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a E-Branch Channel Management Plan instance exchange service call 
   * @return eBranchChannelManagementPlanExchangeActionTaskReference
  **/

  @JsonProperty("eBranchChannelManagementPlanExchangeActionTaskReference")
  public String getEBranchChannelManagementPlanExchangeActionTaskReference() {
    return eBranchChannelManagementPlanExchangeActionTaskReference;
  }

  public void setEBranchChannelManagementPlanExchangeActionTaskReference(String eBranchChannelManagementPlanExchangeActionTaskReference) {
    this.eBranchChannelManagementPlanExchangeActionTaskReference = eBranchChannelManagementPlanExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return eBranchChannelManagementPlanExchangeActionTaskRecord
  **/

  @JsonProperty("eBranchChannelManagementPlanExchangeActionTaskRecord")
  public Object getEBranchChannelManagementPlanExchangeActionTaskRecord() {
    return eBranchChannelManagementPlanExchangeActionTaskRecord;
  }

  public void setEBranchChannelManagementPlanExchangeActionTaskRecord(Object eBranchChannelManagementPlanExchangeActionTaskRecord) {
    this.eBranchChannelManagementPlanExchangeActionTaskRecord = eBranchChannelManagementPlanExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return eBranchChannelManagementPlanExchangeActionResponse
  **/

  @JsonProperty("eBranchChannelManagementPlanExchangeActionResponse")
  public String getEBranchChannelManagementPlanExchangeActionResponse() {
    return eBranchChannelManagementPlanExchangeActionResponse;
  }

  public void setEBranchChannelManagementPlanExchangeActionResponse(String eBranchChannelManagementPlanExchangeActionResponse) {
    this.eBranchChannelManagementPlanExchangeActionResponse = eBranchChannelManagementPlanExchangeActionResponse;
  }


}

