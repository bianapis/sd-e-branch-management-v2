package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelManagementPlanCreateInputModelEBranchChannelManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradeCreateOutputModel
 */
public class BQMaintenanceAndUpgradeCreateOutputModel   {
  private CREBranchChannelManagementPlanCreateInputModelEBranchChannelManagementPlanInstanceRecord eBranchChannelManagementPlanInstanceRecord = null;

  private String maintenanceAndUpgradeInstanceReference = null;

  private String maintenanceAndUpgradeInitiateActionReference = null;

  private Object maintenanceAndUpgradeInitiateActionRecord = null;

  private String maintenanceAndUpgradeInstanceStatus = null;


  /**
   * Get eBranchChannelManagementPlanInstanceRecord
   * @return eBranchChannelManagementPlanInstanceRecord
  **/

  @JsonProperty("eBranchChannelManagementPlanInstanceRecord")
  public CREBranchChannelManagementPlanCreateInputModelEBranchChannelManagementPlanInstanceRecord getEBranchChannelManagementPlanInstanceRecord() {
    return eBranchChannelManagementPlanInstanceRecord;
  }

  public void setEBranchChannelManagementPlanInstanceRecord(CREBranchChannelManagementPlanCreateInputModelEBranchChannelManagementPlanInstanceRecord eBranchChannelManagementPlanInstanceRecord) {
    this.eBranchChannelManagementPlanInstanceRecord = eBranchChannelManagementPlanInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return maintenanceAndUpgradeInitiateActionReference
  **/

  public String getMaintenanceAndUpgradeInitiateActionReference() {
    return maintenanceAndUpgradeInitiateActionReference;
  }

  public void setMaintenanceAndUpgradeInitiateActionReference(String maintenanceAndUpgradeInitiateActionReference) {
    this.maintenanceAndUpgradeInitiateActionReference = maintenanceAndUpgradeInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return maintenanceAndUpgradeInitiateActionRecord
  **/

  public Object getMaintenanceAndUpgradeInitiateActionRecord() {
    return maintenanceAndUpgradeInitiateActionRecord;
  }

  public void setMaintenanceAndUpgradeInitiateActionRecord(Object maintenanceAndUpgradeInitiateActionRecord) {
    this.maintenanceAndUpgradeInitiateActionRecord = maintenanceAndUpgradeInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Maintenance And Upgrade instance (e.g. initialised, pending, active) 
   * @return maintenanceAndUpgradeInstanceStatus
  **/

  public String getMaintenanceAndUpgradeInstanceStatus() {
    return maintenanceAndUpgradeInstanceStatus;
  }

  public void setMaintenanceAndUpgradeInstanceStatus(String maintenanceAndUpgradeInstanceStatus) {
    this.maintenanceAndUpgradeInstanceStatus = maintenanceAndUpgradeInstanceStatus;
  }


}

