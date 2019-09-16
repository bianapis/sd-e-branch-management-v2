package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradeUpdateOutputModel
 */
public class BQMaintenanceAndUpgradeUpdateOutputModel   {
  private String maintenanceAndUpgradeUpdateActionTaskReference = null;

  private Object maintenanceAndUpgradeUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return maintenanceAndUpgradeUpdateActionTaskReference
  **/

  public String getMaintenanceAndUpgradeUpdateActionTaskReference() {
    return maintenanceAndUpgradeUpdateActionTaskReference;
  }

  public void setMaintenanceAndUpgradeUpdateActionTaskReference(String maintenanceAndUpgradeUpdateActionTaskReference) {
    this.maintenanceAndUpgradeUpdateActionTaskReference = maintenanceAndUpgradeUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return maintenanceAndUpgradeUpdateActionTaskRecord
  **/

  public Object getMaintenanceAndUpgradeUpdateActionTaskRecord() {
    return maintenanceAndUpgradeUpdateActionTaskRecord;
  }

  public void setMaintenanceAndUpgradeUpdateActionTaskRecord(Object maintenanceAndUpgradeUpdateActionTaskRecord) {
    this.maintenanceAndUpgradeUpdateActionTaskRecord = maintenanceAndUpgradeUpdateActionTaskRecord;
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

