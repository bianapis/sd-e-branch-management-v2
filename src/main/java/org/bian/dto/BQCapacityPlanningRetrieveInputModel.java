package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCapacityPlanningRetrieveInputModelCapacityPlanningInstanceAnalysis;
import org.bian.dto.BQCapacityPlanningRetrieveInputModelCapacityPlanningInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCapacityPlanningRetrieveInputModel
 */
public class BQCapacityPlanningRetrieveInputModel   {
  private Object capacityPlanningRetrieveActionTaskRecord = null;

  private String capacityPlanningRetrieveActionRequest = null;

  private BQCapacityPlanningRetrieveInputModelCapacityPlanningInstanceReport capacityPlanningInstanceReport = null;

  private BQCapacityPlanningRetrieveInputModelCapacityPlanningInstanceAnalysis capacityPlanningInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return capacityPlanningRetrieveActionTaskRecord
  **/

  public Object getCapacityPlanningRetrieveActionTaskRecord() {
    return capacityPlanningRetrieveActionTaskRecord;
  }

  public void setCapacityPlanningRetrieveActionTaskRecord(Object capacityPlanningRetrieveActionTaskRecord) {
    this.capacityPlanningRetrieveActionTaskRecord = capacityPlanningRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return capacityPlanningRetrieveActionRequest
  **/

  public String getCapacityPlanningRetrieveActionRequest() {
    return capacityPlanningRetrieveActionRequest;
  }

  public void setCapacityPlanningRetrieveActionRequest(String capacityPlanningRetrieveActionRequest) {
    this.capacityPlanningRetrieveActionRequest = capacityPlanningRetrieveActionRequest;
  }


  /**
   * Get capacityPlanningInstanceReport
   * @return capacityPlanningInstanceReport
  **/

  public BQCapacityPlanningRetrieveInputModelCapacityPlanningInstanceReport getCapacityPlanningInstanceReport() {
    return capacityPlanningInstanceReport;
  }

  public void setCapacityPlanningInstanceReport(BQCapacityPlanningRetrieveInputModelCapacityPlanningInstanceReport capacityPlanningInstanceReport) {
    this.capacityPlanningInstanceReport = capacityPlanningInstanceReport;
  }


  /**
   * Get capacityPlanningInstanceAnalysis
   * @return capacityPlanningInstanceAnalysis
  **/

  public BQCapacityPlanningRetrieveInputModelCapacityPlanningInstanceAnalysis getCapacityPlanningInstanceAnalysis() {
    return capacityPlanningInstanceAnalysis;
  }

  public void setCapacityPlanningInstanceAnalysis(BQCapacityPlanningRetrieveInputModelCapacityPlanningInstanceAnalysis capacityPlanningInstanceAnalysis) {
    this.capacityPlanningInstanceAnalysis = capacityPlanningInstanceAnalysis;
  }


}

