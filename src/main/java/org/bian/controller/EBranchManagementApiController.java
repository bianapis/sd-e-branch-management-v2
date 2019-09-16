/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Manage;

@BianRestController
public class EBranchManagementApiController {

	@Autowired
	EBranchManagementApiService service;
	
	@Manage.Activate
	public BianResponse<SDEBranchManagementActivateOutputModel> activate(@RequestBody BianRequest<SDEBranchManagementActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Manage.Configure
	public BianResponse<SDEBranchManagementConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDEBranchManagementConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Manage.Create
	public BianResponse<CREBranchChannelManagementPlanCreateOutputModel> create(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CREBranchChannelManagementPlanCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.create(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("maintenanceandupgrade")
	@Manage.Create
	public BianResponse<BQMaintenanceAndUpgradeCreateOutputModel> createMaintenanceandupgrade(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQMaintenanceAndUpgradeCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.createMaintenanceandupgrade(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Exchange
	public BianResponse<CREBranchChannelManagementPlanExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CREBranchChannelManagementPlanExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Feedback
	public BianResponse<SDEBranchManagementFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDEBranchManagementFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("capacityplanning")
	@Manage.Request
	public BianResponse<BQCapacityPlanningRequestOutputModel> requestCapacityplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCapacityPlanningRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestCapacityplanning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("maintenanceandupgrade")
	@Manage.Request
	public BianResponse<BQMaintenanceAndUpgradeRequestOutputModel> requestMaintenanceandupgrade(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMaintenanceAndUpgradeRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestMaintenanceandupgrade(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("troubleshooting")
	@Manage.Request
	public BianResponse<BQTroubleshootingRequestOutputModel> requestTroubleshooting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTroubleshootingRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestTroubleshooting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Manage.Request
	public BianResponse<CREBranchChannelManagementPlanRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CREBranchChannelManagementPlanRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("capacityplanning")
	@Manage.Retrieve
	public BianResponse<BQCapacityPlanningRetrieveOutputModel> retrieveCapacityplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCapacityplanning(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("maintenanceandupgrade")
	@Manage.Retrieve
	public BianResponse<BQMaintenanceAndUpgradeRetrieveOutputModel> retrieveMaintenanceandupgrade(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMaintenanceandupgrade(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("troubleshooting")
	@Manage.Retrieve
	public BianResponse<BQTroubleshootingRetrieveOutputModel> retrieveTroubleshooting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTroubleshooting(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Manage.Retrieve
	public BianResponse<CREBranchChannelManagementPlanRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Manage.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Manage.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Manage.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Manage.RetrieveSD
	public BianResponse<SDEBranchManagementRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Manage.Update
	public BianResponse<CREBranchChannelManagementPlanUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CREBranchChannelManagementPlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("capacityplanning")
	@Manage.Update
	public BianResponse<BQCapacityPlanningUpdateOutputModel> updateCapacityplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCapacityPlanningUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCapacityplanning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("maintenanceandupgrade")
	@Manage.Update
	public BianResponse<BQMaintenanceAndUpgradeUpdateOutputModel> updateMaintenanceandupgrade(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMaintenanceAndUpgradeUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateMaintenanceandupgrade(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("troubleshooting")
	@Manage.Update
	public BianResponse<BQTroubleshootingUpdateOutputModel> updateTroubleshooting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTroubleshootingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTroubleshooting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
