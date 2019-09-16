package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingRetrieveOutputModelTroubleshootingInstanceAnalysis
 */
public class BQTroubleshootingRetrieveOutputModelTroubleshootingInstanceAnalysis   {
  private Object troubleshootingInstanceAnalysisRecord = null;

  private String troubleshootingInstanceAnalysisReportType = null;

  private String troubleshootingInstanceAnalysisParameters = null;

  private Object troubleshootingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return troubleshootingInstanceAnalysisRecord
  **/

  public Object getTroubleshootingInstanceAnalysisRecord() {
    return troubleshootingInstanceAnalysisRecord;
  }

  public void setTroubleshootingInstanceAnalysisRecord(Object troubleshootingInstanceAnalysisRecord) {
    this.troubleshootingInstanceAnalysisRecord = troubleshootingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return troubleshootingInstanceAnalysisReportType
  **/

  public String getTroubleshootingInstanceAnalysisReportType() {
    return troubleshootingInstanceAnalysisReportType;
  }

  public void setTroubleshootingInstanceAnalysisReportType(String troubleshootingInstanceAnalysisReportType) {
    this.troubleshootingInstanceAnalysisReportType = troubleshootingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return troubleshootingInstanceAnalysisParameters
  **/

  public String getTroubleshootingInstanceAnalysisParameters() {
    return troubleshootingInstanceAnalysisParameters;
  }

  public void setTroubleshootingInstanceAnalysisParameters(String troubleshootingInstanceAnalysisParameters) {
    this.troubleshootingInstanceAnalysisParameters = troubleshootingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return troubleshootingInstanceAnalysisReport
  **/

  public Object getTroubleshootingInstanceAnalysisReport() {
    return troubleshootingInstanceAnalysisReport;
  }

  public void setTroubleshootingInstanceAnalysisReport(Object troubleshootingInstanceAnalysisReport) {
    this.troubleshootingInstanceAnalysisReport = troubleshootingInstanceAnalysisReport;
  }


}

