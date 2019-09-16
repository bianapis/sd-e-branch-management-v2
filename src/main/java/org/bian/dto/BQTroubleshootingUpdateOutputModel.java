package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTroubleshootingUpdateInputModelTroubleshootingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingUpdateOutputModel
 */
public class BQTroubleshootingUpdateOutputModel   {
  private BQTroubleshootingUpdateInputModelTroubleshootingInstanceRecord troubleshootingInstanceRecord = null;

  private String troubleshootingUpdateActionTaskReference = null;

  private Object troubleshootingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return troubleshootingUpdateActionTaskReference
  **/

  public String getTroubleshootingUpdateActionTaskReference() {
    return troubleshootingUpdateActionTaskReference;
  }

  public void setTroubleshootingUpdateActionTaskReference(String troubleshootingUpdateActionTaskReference) {
    this.troubleshootingUpdateActionTaskReference = troubleshootingUpdateActionTaskReference;
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

