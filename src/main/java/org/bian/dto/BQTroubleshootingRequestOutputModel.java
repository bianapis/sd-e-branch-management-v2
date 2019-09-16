package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTroubleshootingUpdateInputModelTroubleshootingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingRequestOutputModel
 */
public class BQTroubleshootingRequestOutputModel   {
  private BQTroubleshootingUpdateInputModelTroubleshootingInstanceRecord troubleshootingInstanceRecord = null;

  private String troubleshootingRequestActionTaskReference = null;

  private Object troubleshootingRequestActionTaskRecord = null;

  private String troubleshootingRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Troubleshooting instance request service call 
   * @return troubleshootingRequestActionTaskReference
  **/

  public String getTroubleshootingRequestActionTaskReference() {
    return troubleshootingRequestActionTaskReference;
  }

  public void setTroubleshootingRequestActionTaskReference(String troubleshootingRequestActionTaskReference) {
    this.troubleshootingRequestActionTaskReference = troubleshootingRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Troubleshooting service request record 
   * @return troubleshootingRequestRecordReference
  **/

  public String getTroubleshootingRequestRecordReference() {
    return troubleshootingRequestRecordReference;
  }

  public void setTroubleshootingRequestRecordReference(String troubleshootingRequestRecordReference) {
    this.troubleshootingRequestRecordReference = troubleshootingRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

