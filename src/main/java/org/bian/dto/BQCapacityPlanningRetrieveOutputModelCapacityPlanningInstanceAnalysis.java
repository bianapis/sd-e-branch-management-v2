package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCapacityPlanningRetrieveOutputModelCapacityPlanningInstanceAnalysis
 */
public class BQCapacityPlanningRetrieveOutputModelCapacityPlanningInstanceAnalysis   {
  private Object capacityPlanningInstanceAnalysisRecord = null;

  private String capacityPlanningInstanceAnalysisReportType = null;

  private String capacityPlanningInstanceAnalysisParameters = null;

  private Object capacityPlanningInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return capacityPlanningInstanceAnalysisRecord
  **/

  public Object getCapacityPlanningInstanceAnalysisRecord() {
    return capacityPlanningInstanceAnalysisRecord;
  }

  public void setCapacityPlanningInstanceAnalysisRecord(Object capacityPlanningInstanceAnalysisRecord) {
    this.capacityPlanningInstanceAnalysisRecord = capacityPlanningInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return capacityPlanningInstanceAnalysisReportType
  **/

  public String getCapacityPlanningInstanceAnalysisReportType() {
    return capacityPlanningInstanceAnalysisReportType;
  }

  public void setCapacityPlanningInstanceAnalysisReportType(String capacityPlanningInstanceAnalysisReportType) {
    this.capacityPlanningInstanceAnalysisReportType = capacityPlanningInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return capacityPlanningInstanceAnalysisParameters
  **/

  public String getCapacityPlanningInstanceAnalysisParameters() {
    return capacityPlanningInstanceAnalysisParameters;
  }

  public void setCapacityPlanningInstanceAnalysisParameters(String capacityPlanningInstanceAnalysisParameters) {
    this.capacityPlanningInstanceAnalysisParameters = capacityPlanningInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return capacityPlanningInstanceAnalysisReport
  **/

  public Object getCapacityPlanningInstanceAnalysisReport() {
    return capacityPlanningInstanceAnalysisReport;
  }

  public void setCapacityPlanningInstanceAnalysisReport(Object capacityPlanningInstanceAnalysisReport) {
    this.capacityPlanningInstanceAnalysisReport = capacityPlanningInstanceAnalysisReport;
  }


}

