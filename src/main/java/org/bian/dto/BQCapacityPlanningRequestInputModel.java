package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCapacityPlanningUpdateInputModelCapacityPlanningInstanceRecord;
import org.bian.dto.CREBranchChannelManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQCapacityPlanningRequestInputModel
 */
public class BQCapacityPlanningRequestInputModel   {
  private String eBranchChannelManagementPlanInstanceReference = null;

  private String capacityPlanningInstanceReference = null;

  private BQCapacityPlanningUpdateInputModelCapacityPlanningInstanceRecord capacityPlanningInstanceRecord = null;

  private Object capacityPlanningRequestActionTaskRecord = null;

  private CREBranchChannelManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return capacityPlanningRequestActionTaskRecord
  **/

  public Object getCapacityPlanningRequestActionTaskRecord() {
    return capacityPlanningRequestActionTaskRecord;
  }

  public void setCapacityPlanningRequestActionTaskRecord(Object capacityPlanningRequestActionTaskRecord) {
    this.capacityPlanningRequestActionTaskRecord = capacityPlanningRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CREBranchChannelManagementPlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CREBranchChannelManagementPlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

