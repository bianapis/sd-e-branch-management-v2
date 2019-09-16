package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradeRequestInputModel
 */
public class BQMaintenanceAndUpgradeRequestInputModel   {
  private String eBranchChannelManagementPlanInstanceReference = null;

  private String maintenanceAndUpgradeInstanceReference = null;

  private Object maintenanceAndUpgradeRequestActionTaskRecord = null;

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

