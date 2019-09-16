package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradeRetrieveOutputModelMaintenanceAndUpgradeInstanceAnalysis
 */
public class BQMaintenanceAndUpgradeRetrieveOutputModelMaintenanceAndUpgradeInstanceAnalysis   {
  private Object maintenanceAndUpgradeInstanceAnalysisRecord = null;

  private String maintenanceAndUpgradeInstanceAnalysisReportType = null;

  private String maintenanceAndUpgradeInstanceAnalysisParameters = null;

  private Object maintenanceAndUpgradeInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return maintenanceAndUpgradeInstanceAnalysisRecord
  **/

  public Object getMaintenanceAndUpgradeInstanceAnalysisRecord() {
    return maintenanceAndUpgradeInstanceAnalysisRecord;
  }

  public void setMaintenanceAndUpgradeInstanceAnalysisRecord(Object maintenanceAndUpgradeInstanceAnalysisRecord) {
    this.maintenanceAndUpgradeInstanceAnalysisRecord = maintenanceAndUpgradeInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return maintenanceAndUpgradeInstanceAnalysisReportType
  **/

  public String getMaintenanceAndUpgradeInstanceAnalysisReportType() {
    return maintenanceAndUpgradeInstanceAnalysisReportType;
  }

  public void setMaintenanceAndUpgradeInstanceAnalysisReportType(String maintenanceAndUpgradeInstanceAnalysisReportType) {
    this.maintenanceAndUpgradeInstanceAnalysisReportType = maintenanceAndUpgradeInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return maintenanceAndUpgradeInstanceAnalysisParameters
  **/

  public String getMaintenanceAndUpgradeInstanceAnalysisParameters() {
    return maintenanceAndUpgradeInstanceAnalysisParameters;
  }

  public void setMaintenanceAndUpgradeInstanceAnalysisParameters(String maintenanceAndUpgradeInstanceAnalysisParameters) {
    this.maintenanceAndUpgradeInstanceAnalysisParameters = maintenanceAndUpgradeInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return maintenanceAndUpgradeInstanceAnalysisReport
  **/

  public Object getMaintenanceAndUpgradeInstanceAnalysisReport() {
    return maintenanceAndUpgradeInstanceAnalysisReport;
  }

  public void setMaintenanceAndUpgradeInstanceAnalysisReport(Object maintenanceAndUpgradeInstanceAnalysisReport) {
    this.maintenanceAndUpgradeInstanceAnalysisReport = maintenanceAndUpgradeInstanceAnalysisReport;
  }


}

