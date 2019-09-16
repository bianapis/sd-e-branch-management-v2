package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelManagementPlanCreateOutputModelEBranchChannelManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CREBranchChannelManagementPlanCreateOutputModel
 */
public class CREBranchChannelManagementPlanCreateOutputModel   {
  private String eBranchChannelManagementPlanInstanceReference = null;

  private String eBranchChannelManagementPlanCreateActionReference = null;

  private Object eBranchChannelManagementPlanCreateActionRecord = null;

  private String eBranchChannelManagementPlanInstanceStatus = null;

  private CREBranchChannelManagementPlanCreateOutputModelEBranchChannelManagementPlanInstanceRecord eBranchChannelManagementPlanInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the E-Branch Channel Management Plan instance 
   * @return eBranchChannelManagementPlanInstanceReference
  **/

  @JsonProperty("eBranchChannelManagementPlanInstanceReference")
  public String getEBranchChannelManagementPlanInstanceReference() {
    return eBranchChannelManagementPlanInstanceReference;
  }

  public void setEBranchChannelManagementPlanInstanceReference(String eBranchChannelManagementPlanInstanceReference) {
    this.eBranchChannelManagementPlanInstanceReference = eBranchChannelManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return eBranchChannelManagementPlanCreateActionReference
  **/

  @JsonProperty("eBranchChannelManagementPlanCreateActionReference")
  public String getEBranchChannelManagementPlanCreateActionReference() {
    return eBranchChannelManagementPlanCreateActionReference;
  }

  public void setEBranchChannelManagementPlanCreateActionReference(String eBranchChannelManagementPlanCreateActionReference) {
    this.eBranchChannelManagementPlanCreateActionReference = eBranchChannelManagementPlanCreateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return eBranchChannelManagementPlanCreateActionRecord
  **/

  @JsonProperty("eBranchChannelManagementPlanCreateActionRecord")
  public Object getEBranchChannelManagementPlanCreateActionRecord() {
    return eBranchChannelManagementPlanCreateActionRecord;
  }

  public void setEBranchChannelManagementPlanCreateActionRecord(Object eBranchChannelManagementPlanCreateActionRecord) {
    this.eBranchChannelManagementPlanCreateActionRecord = eBranchChannelManagementPlanCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the E-Branch Channel Management Plan instance (e.g. initialised, pending, active) 
   * @return eBranchChannelManagementPlanInstanceStatus
  **/

  @JsonProperty("eBranchChannelManagementPlanInstanceStatus")
  public String getEBranchChannelManagementPlanInstanceStatus() {
    return eBranchChannelManagementPlanInstanceStatus;
  }

  public void setEBranchChannelManagementPlanInstanceStatus(String eBranchChannelManagementPlanInstanceStatus) {
    this.eBranchChannelManagementPlanInstanceStatus = eBranchChannelManagementPlanInstanceStatus;
  }


  /**
   * Get eBranchChannelManagementPlanInstanceRecord
   * @return eBranchChannelManagementPlanInstanceRecord
  **/

  @JsonProperty("eBranchChannelManagementPlanInstanceRecord")
  public CREBranchChannelManagementPlanCreateOutputModelEBranchChannelManagementPlanInstanceRecord getEBranchChannelManagementPlanInstanceRecord() {
    return eBranchChannelManagementPlanInstanceRecord;
  }

  public void setEBranchChannelManagementPlanInstanceRecord(CREBranchChannelManagementPlanCreateOutputModelEBranchChannelManagementPlanInstanceRecord eBranchChannelManagementPlanInstanceRecord) {
    this.eBranchChannelManagementPlanInstanceRecord = eBranchChannelManagementPlanInstanceRecord;
  }


}

