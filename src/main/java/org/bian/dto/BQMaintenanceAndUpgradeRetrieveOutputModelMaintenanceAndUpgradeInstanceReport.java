package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradeRetrieveOutputModelMaintenanceAndUpgradeInstanceReport
 */
public class BQMaintenanceAndUpgradeRetrieveOutputModelMaintenanceAndUpgradeInstanceReport   {
  private Object maintenanceAndUpgradeInstanceReportRecord = null;

  private String maintenanceAndUpgradeInstanceReportType = null;

  private String maintenanceAndUpgradeInstanceReportParameters = null;

  private Object maintenanceAndUpgradeInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return maintenanceAndUpgradeInstanceReportRecord
  **/

  public Object getMaintenanceAndUpgradeInstanceReportRecord() {
    return maintenanceAndUpgradeInstanceReportRecord;
  }

  public void setMaintenanceAndUpgradeInstanceReportRecord(Object maintenanceAndUpgradeInstanceReportRecord) {
    this.maintenanceAndUpgradeInstanceReportRecord = maintenanceAndUpgradeInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return maintenanceAndUpgradeInstanceReportType
  **/

  public String getMaintenanceAndUpgradeInstanceReportType() {
    return maintenanceAndUpgradeInstanceReportType;
  }

  public void setMaintenanceAndUpgradeInstanceReportType(String maintenanceAndUpgradeInstanceReportType) {
    this.maintenanceAndUpgradeInstanceReportType = maintenanceAndUpgradeInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return maintenanceAndUpgradeInstanceReportParameters
  **/

  public String getMaintenanceAndUpgradeInstanceReportParameters() {
    return maintenanceAndUpgradeInstanceReportParameters;
  }

  public void setMaintenanceAndUpgradeInstanceReportParameters(String maintenanceAndUpgradeInstanceReportParameters) {
    this.maintenanceAndUpgradeInstanceReportParameters = maintenanceAndUpgradeInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return maintenanceAndUpgradeInstanceReport
  **/

  public Object getMaintenanceAndUpgradeInstanceReport() {
    return maintenanceAndUpgradeInstanceReport;
  }

  public void setMaintenanceAndUpgradeInstanceReport(Object maintenanceAndUpgradeInstanceReport) {
    this.maintenanceAndUpgradeInstanceReport = maintenanceAndUpgradeInstanceReport;
  }


}

