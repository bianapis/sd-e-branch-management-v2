package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceAndUpgradeRetrieveOutputModelMaintenanceAndUpgradeInstanceAnalysis;
import org.bian.dto.BQMaintenanceAndUpgradeRetrieveOutputModelMaintenanceAndUpgradeInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradeRetrieveOutputModel
 */
public class BQMaintenanceAndUpgradeRetrieveOutputModel   {
  private String maintenanceAndUpgradeRetrieveActionTaskReference = null;

  private Object maintenanceAndUpgradeRetrieveActionTaskRecord = null;

  private String maintenanceAndUpgradeRetrieveActionResponse = null;

  private BQMaintenanceAndUpgradeRetrieveOutputModelMaintenanceAndUpgradeInstanceReport maintenanceAndUpgradeInstanceReport = null;

  private BQMaintenanceAndUpgradeRetrieveOutputModelMaintenanceAndUpgradeInstanceAnalysis maintenanceAndUpgradeInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Maintenance And Upgrade instance retrieve service call 
   * @return maintenanceAndUpgradeRetrieveActionTaskReference
  **/

  public String getMaintenanceAndUpgradeRetrieveActionTaskReference() {
    return maintenanceAndUpgradeRetrieveActionTaskReference;
  }

  public void setMaintenanceAndUpgradeRetrieveActionTaskReference(String maintenanceAndUpgradeRetrieveActionTaskReference) {
    this.maintenanceAndUpgradeRetrieveActionTaskReference = maintenanceAndUpgradeRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return maintenanceAndUpgradeRetrieveActionResponse
  **/

  public String getMaintenanceAndUpgradeRetrieveActionResponse() {
    return maintenanceAndUpgradeRetrieveActionResponse;
  }

  public void setMaintenanceAndUpgradeRetrieveActionResponse(String maintenanceAndUpgradeRetrieveActionResponse) {
    this.maintenanceAndUpgradeRetrieveActionResponse = maintenanceAndUpgradeRetrieveActionResponse;
  }


  /**
   * Get maintenanceAndUpgradeInstanceReport
   * @return maintenanceAndUpgradeInstanceReport
  **/

  public BQMaintenanceAndUpgradeRetrieveOutputModelMaintenanceAndUpgradeInstanceReport getMaintenanceAndUpgradeInstanceReport() {
    return maintenanceAndUpgradeInstanceReport;
  }

  public void setMaintenanceAndUpgradeInstanceReport(BQMaintenanceAndUpgradeRetrieveOutputModelMaintenanceAndUpgradeInstanceReport maintenanceAndUpgradeInstanceReport) {
    this.maintenanceAndUpgradeInstanceReport = maintenanceAndUpgradeInstanceReport;
  }


  /**
   * Get maintenanceAndUpgradeInstanceAnalysis
   * @return maintenanceAndUpgradeInstanceAnalysis
  **/

  public BQMaintenanceAndUpgradeRetrieveOutputModelMaintenanceAndUpgradeInstanceAnalysis getMaintenanceAndUpgradeInstanceAnalysis() {
    return maintenanceAndUpgradeInstanceAnalysis;
  }

  public void setMaintenanceAndUpgradeInstanceAnalysis(BQMaintenanceAndUpgradeRetrieveOutputModelMaintenanceAndUpgradeInstanceAnalysis maintenanceAndUpgradeInstanceAnalysis) {
    this.maintenanceAndUpgradeInstanceAnalysis = maintenanceAndUpgradeInstanceAnalysis;
  }


}

