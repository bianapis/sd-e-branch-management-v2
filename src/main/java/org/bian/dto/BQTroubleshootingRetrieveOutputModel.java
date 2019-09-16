package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTroubleshootingRetrieveOutputModelTroubleshootingInstanceAnalysis;
import org.bian.dto.BQTroubleshootingRetrieveOutputModelTroubleshootingInstanceReport;
import org.bian.dto.BQTroubleshootingUpdateInputModelTroubleshootingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingRetrieveOutputModel
 */
public class BQTroubleshootingRetrieveOutputModel   {
  private BQTroubleshootingUpdateInputModelTroubleshootingInstanceRecord troubleshootingInstanceRecord = null;

  private String troubleshootingRetrieveActionTaskReference = null;

  private Object troubleshootingRetrieveActionTaskRecord = null;

  private String troubleshootingRetrieveActionResponse = null;

  private BQTroubleshootingRetrieveOutputModelTroubleshootingInstanceReport troubleshootingInstanceReport = null;

  private BQTroubleshootingRetrieveOutputModelTroubleshootingInstanceAnalysis troubleshootingInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Troubleshooting instance retrieve service call 
   * @return troubleshootingRetrieveActionTaskReference
  **/

  public String getTroubleshootingRetrieveActionTaskReference() {
    return troubleshootingRetrieveActionTaskReference;
  }

  public void setTroubleshootingRetrieveActionTaskReference(String troubleshootingRetrieveActionTaskReference) {
    this.troubleshootingRetrieveActionTaskReference = troubleshootingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return troubleshootingRetrieveActionTaskRecord
  **/

  public Object getTroubleshootingRetrieveActionTaskRecord() {
    return troubleshootingRetrieveActionTaskRecord;
  }

  public void setTroubleshootingRetrieveActionTaskRecord(Object troubleshootingRetrieveActionTaskRecord) {
    this.troubleshootingRetrieveActionTaskRecord = troubleshootingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return troubleshootingRetrieveActionResponse
  **/

  public String getTroubleshootingRetrieveActionResponse() {
    return troubleshootingRetrieveActionResponse;
  }

  public void setTroubleshootingRetrieveActionResponse(String troubleshootingRetrieveActionResponse) {
    this.troubleshootingRetrieveActionResponse = troubleshootingRetrieveActionResponse;
  }


  /**
   * Get troubleshootingInstanceReport
   * @return troubleshootingInstanceReport
  **/

  public BQTroubleshootingRetrieveOutputModelTroubleshootingInstanceReport getTroubleshootingInstanceReport() {
    return troubleshootingInstanceReport;
  }

  public void setTroubleshootingInstanceReport(BQTroubleshootingRetrieveOutputModelTroubleshootingInstanceReport troubleshootingInstanceReport) {
    this.troubleshootingInstanceReport = troubleshootingInstanceReport;
  }


  /**
   * Get troubleshootingInstanceAnalysis
   * @return troubleshootingInstanceAnalysis
  **/

  public BQTroubleshootingRetrieveOutputModelTroubleshootingInstanceAnalysis getTroubleshootingInstanceAnalysis() {
    return troubleshootingInstanceAnalysis;
  }

  public void setTroubleshootingInstanceAnalysis(BQTroubleshootingRetrieveOutputModelTroubleshootingInstanceAnalysis troubleshootingInstanceAnalysis) {
    this.troubleshootingInstanceAnalysis = troubleshootingInstanceAnalysis;
  }


}

