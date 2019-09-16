package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingRetrieveInputModelTroubleshootingInstanceAnalysis
 */
public class BQTroubleshootingRetrieveInputModelTroubleshootingInstanceAnalysis   {
  private String troubleshootingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return troubleshootingInstanceAnalysisReference
  **/

  public String getTroubleshootingInstanceAnalysisReference() {
    return troubleshootingInstanceAnalysisReference;
  }

  public void setTroubleshootingInstanceAnalysisReference(String troubleshootingInstanceAnalysisReference) {
    this.troubleshootingInstanceAnalysisReference = troubleshootingInstanceAnalysisReference;
  }


}

