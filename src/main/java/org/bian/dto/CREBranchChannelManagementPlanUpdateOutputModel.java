package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREBranchChannelManagementPlanUpdateOutputModel
 */
public class CREBranchChannelManagementPlanUpdateOutputModel   {
  private String eBranchChannelManagementPlanUpdateActionTaskReference = null;

  private Object eBranchChannelManagementPlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return eBranchChannelManagementPlanUpdateActionTaskReference
  **/

  @JsonProperty("eBranchChannelManagementPlanUpdateActionTaskReference")
  public String getEBranchChannelManagementPlanUpdateActionTaskReference() {
    return eBranchChannelManagementPlanUpdateActionTaskReference;
  }

  public void setEBranchChannelManagementPlanUpdateActionTaskReference(String eBranchChannelManagementPlanUpdateActionTaskReference) {
    this.eBranchChannelManagementPlanUpdateActionTaskReference = eBranchChannelManagementPlanUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return eBranchChannelManagementPlanUpdateActionTaskRecord
  **/

  @JsonProperty("eBranchChannelManagementPlanUpdateActionTaskRecord")
  public Object getEBranchChannelManagementPlanUpdateActionTaskRecord() {
    return eBranchChannelManagementPlanUpdateActionTaskRecord;
  }

  public void setEBranchChannelManagementPlanUpdateActionTaskRecord(Object eBranchChannelManagementPlanUpdateActionTaskRecord) {
    this.eBranchChannelManagementPlanUpdateActionTaskRecord = eBranchChannelManagementPlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

