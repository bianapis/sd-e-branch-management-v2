package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceAndUpgradeRetrieveInputModelMaintenanceAndUpgradeInstanceAnalysis;
import org.bian.dto.BQMaintenanceAndUpgradeRetrieveInputModelMaintenanceAndUpgradeInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradeRetrieveInputModel
 */
public class BQMaintenanceAndUpgradeRetrieveInputModel   {
  private Object maintenanceAndUpgradeRetrieveActionTaskRecord = null;

  private String maintenanceAndUpgradeRetrieveActionRequest = null;

  private BQMaintenanceAndUpgradeRetrieveInputModelMaintenanceAndUpgradeInstanceReport maintenanceAndUpgradeInstanceReport = null;

  private BQMaintenanceAndUpgradeRetrieveInputModelMaintenanceAndUpgradeInstanceAnalysis maintenanceAndUpgradeInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return maintenanceAndUpgradeRetrieveActionTaskRecord
  **/

  public Object getMaintenanceAndUpgradeRetrieveActionTaskRecord() {
    return maintenanceAndUpgradeRetrieveActionTaskRecord;
  }

  public void setMaintenanceAndUpgradeRetrieveActionTaskRecord(Object maintenanceAndUpgradeRetrieveActionTaskRecord) {
    this.maintenanceAndUpgradeRetrieveActionTaskRecord = maintenanceAndUpgradeRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return maintenanceAndUpgradeRetrieveActionRequest
  **/

  public String getMaintenanceAndUpgradeRetrieveActionRequest() {
    return maintenanceAndUpgradeRetrieveActionRequest;
  }

  public void setMaintenanceAndUpgradeRetrieveActionRequest(String maintenanceAndUpgradeRetrieveActionRequest) {
    this.maintenanceAndUpgradeRetrieveActionRequest = maintenanceAndUpgradeRetrieveActionRequest;
  }


  /**
   * Get maintenanceAndUpgradeInstanceReport
   * @return maintenanceAndUpgradeInstanceReport
  **/

  public BQMaintenanceAndUpgradeRetrieveInputModelMaintenanceAndUpgradeInstanceReport getMaintenanceAndUpgradeInstanceReport() {
    return maintenanceAndUpgradeInstanceReport;
  }

  public void setMaintenanceAndUpgradeInstanceReport(BQMaintenanceAndUpgradeRetrieveInputModelMaintenanceAndUpgradeInstanceReport maintenanceAndUpgradeInstanceReport) {
    this.maintenanceAndUpgradeInstanceReport = maintenanceAndUpgradeInstanceReport;
  }


  /**
   * Get maintenanceAndUpgradeInstanceAnalysis
   * @return maintenanceAndUpgradeInstanceAnalysis
  **/

  public BQMaintenanceAndUpgradeRetrieveInputModelMaintenanceAndUpgradeInstanceAnalysis getMaintenanceAndUpgradeInstanceAnalysis() {
    return maintenanceAndUpgradeInstanceAnalysis;
  }

  public void setMaintenanceAndUpgradeInstanceAnalysis(BQMaintenanceAndUpgradeRetrieveInputModelMaintenanceAndUpgradeInstanceAnalysis maintenanceAndUpgradeInstanceAnalysis) {
    this.maintenanceAndUpgradeInstanceAnalysis = maintenanceAndUpgradeInstanceAnalysis;
  }


}

