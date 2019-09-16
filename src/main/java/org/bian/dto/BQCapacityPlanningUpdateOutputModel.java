package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCapacityPlanningUpdateInputModelCapacityPlanningInstanceRecord;
import org.bian.dto.BQCapacityPlanningUpdateInputModelEBranchChannelManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCapacityPlanningUpdateOutputModel
 */
public class BQCapacityPlanningUpdateOutputModel   {
  private BQCapacityPlanningUpdateInputModelEBranchChannelManagementPlanInstanceRecord eBranchChannelManagementPlanInstanceRecord = null;

  private BQCapacityPlanningUpdateInputModelCapacityPlanningInstanceRecord capacityPlanningInstanceRecord = null;

  private String capacityPlanningUpdateActionTaskReference = null;

  private Object capacityPlanningUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get eBranchChannelManagementPlanInstanceRecord
   * @return eBranchChannelManagementPlanInstanceRecord
  **/

  @JsonProperty("eBranchChannelManagementPlanInstanceRecord")
  public BQCapacityPlanningUpdateInputModelEBranchChannelManagementPlanInstanceRecord getEBranchChannelManagementPlanInstanceRecord() {
    return eBranchChannelManagementPlanInstanceRecord;
  }

  public void setEBranchChannelManagementPlanInstanceRecord(BQCapacityPlanningUpdateInputModelEBranchChannelManagementPlanInstanceRecord eBranchChannelManagementPlanInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return capacityPlanningUpdateActionTaskReference
  **/

  public String getCapacityPlanningUpdateActionTaskReference() {
    return capacityPlanningUpdateActionTaskReference;
  }

  public void setCapacityPlanningUpdateActionTaskReference(String capacityPlanningUpdateActionTaskReference) {
    this.capacityPlanningUpdateActionTaskReference = capacityPlanningUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return capacityPlanningUpdateActionTaskRecord
  **/

  public Object getCapacityPlanningUpdateActionTaskRecord() {
    return capacityPlanningUpdateActionTaskRecord;
  }

  public void setCapacityPlanningUpdateActionTaskRecord(Object capacityPlanningUpdateActionTaskRecord) {
    this.capacityPlanningUpdateActionTaskRecord = capacityPlanningUpdateActionTaskRecord;
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

