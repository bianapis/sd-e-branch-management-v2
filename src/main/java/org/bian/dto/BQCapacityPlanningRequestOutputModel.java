package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCapacityPlanningUpdateInputModelCapacityPlanningInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCapacityPlanningRequestOutputModel
 */
public class BQCapacityPlanningRequestOutputModel   {
  private BQCapacityPlanningUpdateInputModelCapacityPlanningInstanceRecord capacityPlanningInstanceRecord = null;

  private String capacityPlanningRequestActionTaskReference = null;

  private Object capacityPlanningRequestActionTaskRecord = null;

  private String capacityPlanningRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Capacity Planning instance request service call 
   * @return capacityPlanningRequestActionTaskReference
  **/

  public String getCapacityPlanningRequestActionTaskReference() {
    return capacityPlanningRequestActionTaskReference;
  }

  public void setCapacityPlanningRequestActionTaskReference(String capacityPlanningRequestActionTaskReference) {
    this.capacityPlanningRequestActionTaskReference = capacityPlanningRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Capacity Planning service request record 
   * @return capacityPlanningRequestRecordReference
  **/

  public String getCapacityPlanningRequestRecordReference() {
    return capacityPlanningRequestRecordReference;
  }

  public void setCapacityPlanningRequestRecordReference(String capacityPlanningRequestRecordReference) {
    this.capacityPlanningRequestRecordReference = capacityPlanningRequestRecordReference;
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

