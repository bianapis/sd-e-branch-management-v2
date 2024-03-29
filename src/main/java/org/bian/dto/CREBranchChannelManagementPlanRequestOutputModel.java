package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREBranchChannelManagementPlanRequestOutputModel
 */
public class CREBranchChannelManagementPlanRequestOutputModel   {
  private String eBranchChannelManagementPlanRequestActionTaskReference = null;

  private Object eBranchChannelManagementPlanRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a E-Branch Channel Management Plan instance request service call 
   * @return eBranchChannelManagementPlanRequestActionTaskReference
  **/

  @JsonProperty("eBranchChannelManagementPlanRequestActionTaskReference")
  public String getEBranchChannelManagementPlanRequestActionTaskReference() {
    return eBranchChannelManagementPlanRequestActionTaskReference;
  }

  public void setEBranchChannelManagementPlanRequestActionTaskReference(String eBranchChannelManagementPlanRequestActionTaskReference) {
    this.eBranchChannelManagementPlanRequestActionTaskReference = eBranchChannelManagementPlanRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return eBranchChannelManagementPlanRequestActionTaskRecord
  **/

  @JsonProperty("eBranchChannelManagementPlanRequestActionTaskRecord")
  public Object getEBranchChannelManagementPlanRequestActionTaskRecord() {
    return eBranchChannelManagementPlanRequestActionTaskRecord;
  }

  public void setEBranchChannelManagementPlanRequestActionTaskRecord(Object eBranchChannelManagementPlanRequestActionTaskRecord) {
    this.eBranchChannelManagementPlanRequestActionTaskRecord = eBranchChannelManagementPlanRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

