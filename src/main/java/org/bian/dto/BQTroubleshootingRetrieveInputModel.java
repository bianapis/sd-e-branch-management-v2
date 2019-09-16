package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTroubleshootingRetrieveInputModelTroubleshootingInstanceAnalysis;
import org.bian.dto.BQTroubleshootingRetrieveInputModelTroubleshootingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingRetrieveInputModel
 */
public class BQTroubleshootingRetrieveInputModel   {
  private Object troubleshootingRetrieveActionTaskRecord = null;

  private String troubleshootingRetrieveActionRequest = null;

  private BQTroubleshootingRetrieveInputModelTroubleshootingInstanceReport troubleshootingInstanceReport = null;

  private BQTroubleshootingRetrieveInputModelTroubleshootingInstanceAnalysis troubleshootingInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return troubleshootingRetrieveActionRequest
  **/

  public String getTroubleshootingRetrieveActionRequest() {
    return troubleshootingRetrieveActionRequest;
  }

  public void setTroubleshootingRetrieveActionRequest(String troubleshootingRetrieveActionRequest) {
    this.troubleshootingRetrieveActionRequest = troubleshootingRetrieveActionRequest;
  }


  /**
   * Get troubleshootingInstanceReport
   * @return troubleshootingInstanceReport
  **/

  public BQTroubleshootingRetrieveInputModelTroubleshootingInstanceReport getTroubleshootingInstanceReport() {
    return troubleshootingInstanceReport;
  }

  public void setTroubleshootingInstanceReport(BQTroubleshootingRetrieveInputModelTroubleshootingInstanceReport troubleshootingInstanceReport) {
    this.troubleshootingInstanceReport = troubleshootingInstanceReport;
  }


  /**
   * Get troubleshootingInstanceAnalysis
   * @return troubleshootingInstanceAnalysis
  **/

  public BQTroubleshootingRetrieveInputModelTroubleshootingInstanceAnalysis getTroubleshootingInstanceAnalysis() {
    return troubleshootingInstanceAnalysis;
  }

  public void setTroubleshootingInstanceAnalysis(BQTroubleshootingRetrieveInputModelTroubleshootingInstanceAnalysis troubleshootingInstanceAnalysis) {
    this.troubleshootingInstanceAnalysis = troubleshootingInstanceAnalysis;
  }


}

