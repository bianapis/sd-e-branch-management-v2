package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradeUpdateInputModel
 */
public class BQMaintenanceAndUpgradeUpdateInputModel   {
  private String eBranchChannelManagementPlanInstanceReference = null;

  private String maintenanceAndUpgradeInstanceReference = null;

  private Object maintenanceAndUpgradeUpdateActionTaskRecord = null;

  private String maintenanceAndUpgradeUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Maintenance And Upgrade instance 
   * @return maintenanceAndUpgradeInstanceReference
  **/

  public String getMaintenanceAndUpgradeInstanceReference() {
    return maintenanceAndUpgradeInstanceReference;
  }

  public void setMaintenanceAndUpgradeInstanceReference(String maintenanceAndUpgradeInstanceReference) {
    this.maintenanceAndUpgradeInstanceReference = maintenanceAndUpgradeInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return maintenanceAndUpgradeUpdateActionRequest
  **/

  public String getMaintenanceAndUpgradeUpdateActionRequest() {
    return maintenanceAndUpgradeUpdateActionRequest;
  }

  public void setMaintenanceAndUpgradeUpdateActionRequest(String maintenanceAndUpgradeUpdateActionRequest) {
    this.maintenanceAndUpgradeUpdateActionRequest = maintenanceAndUpgradeUpdateActionRequest;
  }


}

