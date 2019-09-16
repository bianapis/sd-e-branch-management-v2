package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingRetrieveInputModelTroubleshootingInstanceReport
 */
public class BQTroubleshootingRetrieveInputModelTroubleshootingInstanceReport   {
  private String troubleshootingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return troubleshootingInstanceReportReference
  **/

  public String getTroubleshootingInstanceReportReference() {
    return troubleshootingInstanceReportReference;
  }

  public void setTroubleshootingInstanceReportReference(String troubleshootingInstanceReportReference) {
    this.troubleshootingInstanceReportReference = troubleshootingInstanceReportReference;
  }


}

