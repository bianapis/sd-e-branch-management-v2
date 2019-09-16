package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTroubleshootingUpdateInputModelTroubleshootingInstanceRecord;
import org.bian.dto.CREBranchChannelManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingRequestInputModel
 */
public class BQTroubleshootingRequestInputModel   {
  private String eBranchChannelManagementPlanInstanceReference = null;

  private String troubleshootingInstanceReference = null;

  private BQTroubleshootingUpdateInputModelTroubleshootingInstanceRecord troubleshootingInstanceRecord = null;

  private Object troubleshootingRequestActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Troubleshooting instance 
   * @return troubleshootingInstanceReference
  **/

  public String getTroubleshootingInstanceReference() {
    return troubleshootingInstanceReference;
  }

  public void setTroubleshootingInstanceReference(String troubleshootingInstanceReference) {
    this.troubleshootingInstanceReference = troubleshootingInstanceReference;
  }


  /**
   * Get troubleshootingInstanceRecord
   * @return troubleshootingInstanceRecord
  **/

  public BQTroubleshootingUpdateInputModelTroubleshootingInstanceRecord getTroubleshootingInstanceRecord() {
    return troubleshootingInstanceRecord;
  }

  public void setTroubleshootingInstanceRecord(BQTroubleshootingUpdateInputModelTroubleshootingInstanceRecord troubleshootingInstanceRecord) {
    this.troubleshootingInstanceRecord = troubleshootingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return troubleshootingRequestActionTaskRecord
  **/

  public Object getTroubleshootingRequestActionTaskRecord() {
    return troubleshootingRequestActionTaskRecord;
  }

  public void setTroubleshootingRequestActionTaskRecord(Object troubleshootingRequestActionTaskRecord) {
    this.troubleshootingRequestActionTaskRecord = troubleshootingRequestActionTaskRecord;
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

