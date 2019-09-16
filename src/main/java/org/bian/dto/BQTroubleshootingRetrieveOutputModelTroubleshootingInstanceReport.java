package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingRetrieveOutputModelTroubleshootingInstanceReport
 */
public class BQTroubleshootingRetrieveOutputModelTroubleshootingInstanceReport   {
  private Object troubleshootingInstanceReportRecord = null;

  private String troubleshootingInstanceReportType = null;

  private String troubleshootingInstanceReportParameters = null;

  private Object troubleshootingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return troubleshootingInstanceReportRecord
  **/

  public Object getTroubleshootingInstanceReportRecord() {
    return troubleshootingInstanceReportRecord;
  }

  public void setTroubleshootingInstanceReportRecord(Object troubleshootingInstanceReportRecord) {
    this.troubleshootingInstanceReportRecord = troubleshootingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return troubleshootingInstanceReportType
  **/

  public String getTroubleshootingInstanceReportType() {
    return troubleshootingInstanceReportType;
  }

  public void setTroubleshootingInstanceReportType(String troubleshootingInstanceReportType) {
    this.troubleshootingInstanceReportType = troubleshootingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return troubleshootingInstanceReportParameters
  **/

  public String getTroubleshootingInstanceReportParameters() {
    return troubleshootingInstanceReportParameters;
  }

  public void setTroubleshootingInstanceReportParameters(String troubleshootingInstanceReportParameters) {
    this.troubleshootingInstanceReportParameters = troubleshootingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return troubleshootingInstanceReport
  **/

  public Object getTroubleshootingInstanceReport() {
    return troubleshootingInstanceReport;
  }

  public void setTroubleshootingInstanceReport(Object troubleshootingInstanceReport) {
    this.troubleshootingInstanceReport = troubleshootingInstanceReport;
  }


}

