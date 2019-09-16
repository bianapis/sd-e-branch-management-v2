package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelManagementPlanCreateOutputModelEBranchChannelManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradeCreateInputModel
 */
public class BQMaintenanceAndUpgradeCreateInputModel   {
  private CREBranchChannelManagementPlanCreateOutputModelEBranchChannelManagementPlanInstanceRecord eBranchChannelManagementPlanInstanceRecord = null;

  private String eBranchChannelManagementPlanInstanceReference = null;

  private Object maintenanceAndUpgradeInitiateActionRecord = null;


  /**
   * Get eBranchChannelManagementPlanInstanceRecord
   * @return eBranchChannelManagementPlanInstanceRecord
  **/

  public CREBranchChannelManagementPlanCreateOutputModelEBranchChannelManagementPlanInstanceRecord getEBranchChannelManagementPlanInstanceRecord() {
    return eBranchChannelManagementPlanInstanceRecord;
  }

  public void setEBranchChannelManagementPlanInstanceRecord(CREBranchChannelManagementPlanCreateOutputModelEBranchChannelManagementPlanInstanceRecord eBranchChannelManagementPlanInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return maintenanceAndUpgradeInitiateActionRecord
  **/

  public Object getMaintenanceAndUpgradeInitiateActionRecord() {
    return maintenanceAndUpgradeInitiateActionRecord;
  }

  public void setMaintenanceAndUpgradeInitiateActionRecord(Object maintenanceAndUpgradeInitiateActionRecord) {
    this.maintenanceAndUpgradeInitiateActionRecord = maintenanceAndUpgradeInitiateActionRecord;
  }


}

