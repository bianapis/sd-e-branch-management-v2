package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CREBranchChannelManagementPlanRequestInputModel
 */
public class CREBranchChannelManagementPlanRequestInputModel   {
  private String eBranchManagementServicingSessionReference = null;

  private String eBranchChannelManagementPlanInstanceReference = null;

  private Object eBranchChannelManagementPlanRequestActionTaskRecord = null;

  private CREBranchChannelManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return eBranchManagementServicingSessionReference
  **/

  public String getEBranchManagementServicingSessionReference() {
    return eBranchManagementServicingSessionReference;
  }

  public void setEBranchManagementServicingSessionReference(String eBranchManagementServicingSessionReference) {
    this.eBranchManagementServicingSessionReference = eBranchManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the E-Branch Channel Management Plan instance 
   * @return eBranchChannelManagementPlanInstanceReference
  **/

  public String getEBranchChannelManagementPlanInstanceReference() {
    return eBranchChannelManagementPlanInstanceReference;
  }

  public void setEBranchChannelManagementPlanInstanceReference(String eBranchChannelManagementPlanInstanceReference) {
    this.eBranchChannelManagementPlanInstanceReference = eBranchChannelManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return eBranchChannelManagementPlanRequestActionTaskRecord
  **/

  public Object getEBranchChannelManagementPlanRequestActionTaskRecord() {
    return eBranchChannelManagementPlanRequestActionTaskRecord;
  }

  public void setEBranchChannelManagementPlanRequestActionTaskRecord(Object eBranchChannelManagementPlanRequestActionTaskRecord) {
    this.eBranchChannelManagementPlanRequestActionTaskRecord = eBranchChannelManagementPlanRequestActionTaskRecord;
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

