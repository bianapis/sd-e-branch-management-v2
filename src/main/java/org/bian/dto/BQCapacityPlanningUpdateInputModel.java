package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCapacityPlanningUpdateInputModelCapacityPlanningInstanceRecord;
import org.bian.dto.BQCapacityPlanningUpdateInputModelEBranchChannelManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCapacityPlanningUpdateInputModel
 */
public class BQCapacityPlanningUpdateInputModel   {
  private BQCapacityPlanningUpdateInputModelEBranchChannelManagementPlanInstanceRecord eBranchChannelManagementPlanInstanceRecord = null;

  private String eBranchChannelManagementPlanInstanceReference = null;

  private String capacityPlanningInstanceReference = null;

  private BQCapacityPlanningUpdateInputModelCapacityPlanningInstanceRecord capacityPlanningInstanceRecord = null;

  private Object capacityPlanningUpdateActionTaskRecord = null;

  private String capacityPlanningUpdateActionRequest = null;


  /**
   * Get eBranchChannelManagementPlanInstanceRecord
   * @return eBranchChannelManagementPlanInstanceRecord
  **/

  public BQCapacityPlanningUpdateInputModelEBranchChannelManagementPlanInstanceRecord getEBranchChannelManagementPlanInstanceRecord() {
    return eBranchChannelManagementPlanInstanceRecord;
  }

  public void setEBranchChannelManagementPlanInstanceRecord(BQCapacityPlanningUpdateInputModelEBranchChannelManagementPlanInstanceRecord eBranchChannelManagementPlanInstanceRecord) {
    this.eBranchChannelManagementPlanInstanceRecord = eBranchChannelManagementPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent E-Branch Channel Management Plan instance 
   * @return eBranchChannelManagementPlanInstanceReference
  **/

  public String getEBranchChannelManagementPlanInstanceReference() {
    return eBranchChannelManagementPlanInstanceReference;
  }

  public void setEBranchChannelManagementPlanInstanceReference(String eBranchChannelManagementPlanInstanceReference) {
    this.eBranchChannelManagementPlanInstanceReference = eBranchChannelManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Capacity Planning instance 
   * @return capacityPlanningInstanceReference
  **/

  public String getCapacityPlanningInstanceReference() {
    return capacityPlanningInstanceReference;
  }

  public void setCapacityPlanningInstanceReference(String capacityPlanningInstanceReference) {
    this.capacityPlanningInstanceReference = capacityPlanningInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return capacityPlanningUpdateActionRequest
  **/

  public String getCapacityPlanningUpdateActionRequest() {
    return capacityPlanningUpdateActionRequest;
  }

  public void setCapacityPlanningUpdateActionRequest(String capacityPlanningUpdateActionRequest) {
    this.capacityPlanningUpdateActionRequest = capacityPlanningUpdateActionRequest;
  }


}

