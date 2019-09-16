package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingUpdateInputModelTroubleshootingInstanceRecord
 */
public class BQTroubleshootingUpdateInputModelTroubleshootingInstanceRecord   {
  private Object eBranchChannelProductionIssueRecord = null;

  private String eBranchChannelIssueAnalysisAndRecommendedResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: A record of any production issues arising during the session (see E-Branch Operations for detailed content) 
   * @return eBranchChannelProductionIssueRecord
  **/

  @JsonProperty("eBranchChannelProductionIssueRecord")
  public Object getEBranchChannelProductionIssueRecord() {
    return eBranchChannelProductionIssueRecord;
  }

  public void setEBranchChannelProductionIssueRecord(Object eBranchChannelProductionIssueRecord) {
    this.eBranchChannelProductionIssueRecord = eBranchChannelProductionIssueRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A record of the root cause analysis for recurring issues and suggested remedial action 
   * @return eBranchChannelIssueAnalysisAndRecommendedResponse
  **/

  @JsonProperty("eBranchChannelIssueAnalysisAndRecommendedResponse")
  public String getEBranchChannelIssueAnalysisAndRecommendedResponse() {
    return eBranchChannelIssueAnalysisAndRecommendedResponse;
  }

  public void setEBranchChannelIssueAnalysisAndRecommendedResponse(String eBranchChannelIssueAnalysisAndRecommendedResponse) {
    this.eBranchChannelIssueAnalysisAndRecommendedResponse = eBranchChannelIssueAnalysisAndRecommendedResponse;
  }


}

