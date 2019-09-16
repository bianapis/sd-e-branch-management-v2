package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTroubleshootingUpdateInputModelTroubleshootingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingUpdateInputModel
 */
public class BQTroubleshootingUpdateInputModel   {
  private String eBranchChannelManagementPlanInstanceReference = null;

  private String troubleshootingInstanceReference = null;

  private BQTroubleshootingUpdateInputModelTroubleshootingInstanceRecord troubleshootingInstanceRecord = null;

  private Object troubleshootingUpdateActionTaskRecord = null;

  private String troubleshootingUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return troubleshootingUpdateActionTaskRecord
  **/

  public Object getTroubleshootingUpdateActionTaskRecord() {
    return troubleshootingUpdateActionTaskRecord;
  }

  public void setTroubleshootingUpdateActionTaskRecord(Object troubleshootingUpdateActionTaskRecord) {
    this.troubleshootingUpdateActionTaskRecord = troubleshootingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return troubleshootingUpdateActionRequest
  **/

  public String getTroubleshootingUpdateActionRequest() {
    return troubleshootingUpdateActionRequest;
  }

  public void setTroubleshootingUpdateActionRequest(String troubleshootingUpdateActionRequest) {
    this.troubleshootingUpdateActionRequest = troubleshootingUpdateActionRequest;
  }


}

