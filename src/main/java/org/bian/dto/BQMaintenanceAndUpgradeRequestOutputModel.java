package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradeRequestOutputModel
 */
public class BQMaintenanceAndUpgradeRequestOutputModel   {
  private String maintenanceAndUpgradeRequestActionTaskReference = null;

  private Object maintenanceAndUpgradeRequestActionTaskRecord = null;

  private String maintenanceAndUpgradeRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Maintenance And Upgrade instance request service call 
   * @return maintenanceAndUpgradeRequestActionTaskReference
  **/

  public String getMaintenanceAndUpgradeRequestActionTaskReference() {
    return maintenanceAndUpgradeRequestActionTaskReference;
  }

  public void setMaintenanceAndUpgradeRequestActionTaskReference(String maintenanceAndUpgradeRequestActionTaskReference) {
    this.maintenanceAndUpgradeRequestActionTaskReference = maintenanceAndUpgradeRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return maintenanceAndUpgradeRequestActionTaskRecord
  **/

  public Object getMaintenanceAndUpgradeRequestActionTaskRecord() {
    return maintenanceAndUpgradeRequestActionTaskRecord;
  }

  public void setMaintenanceAndUpgradeRequestActionTaskRecord(Object maintenanceAndUpgradeRequestActionTaskRecord) {
    this.maintenanceAndUpgradeRequestActionTaskRecord = maintenanceAndUpgradeRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Maintenance And Upgrade service request record 
   * @return maintenanceAndUpgradeRequestRecordReference
  **/

  public String getMaintenanceAndUpgradeRequestRecordReference() {
    return maintenanceAndUpgradeRequestRecordReference;
  }

  public void setMaintenanceAndUpgradeRequestRecordReference(String maintenanceAndUpgradeRequestRecordReference) {
    this.maintenanceAndUpgradeRequestRecordReference = maintenanceAndUpgradeRequestRecordReference;
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

