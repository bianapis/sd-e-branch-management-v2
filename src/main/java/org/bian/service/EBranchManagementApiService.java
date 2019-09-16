/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface EBranchManagementApiService {

	SDEBranchManagementActivateOutputModel activate(SDEBranchManagementActivateInputModel request);
	
	SDEBranchManagementConfigureOutputModel configure(String sdReferenceId, SDEBranchManagementConfigureInputModel request);
	
	CREBranchChannelManagementPlanCreateOutputModel create(String sdReferenceId, CREBranchChannelManagementPlanCreateInputModel request);
	
	BQMaintenanceAndUpgradeCreateOutputModel createMaintenanceandupgrade(String sdReferenceId, String crReferenceId, BQMaintenanceAndUpgradeCreateInputModel request);
	
	CREBranchChannelManagementPlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CREBranchChannelManagementPlanExchangeInputModel request);
	
	SDEBranchManagementFeedbackOutputModel feedback(String sdReferenceId, SDEBranchManagementFeedbackInputModel request);
	
	BQCapacityPlanningRequestOutputModel requestCapacityplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCapacityPlanningRequestInputModel request);
	
	BQMaintenanceAndUpgradeRequestOutputModel requestMaintenanceandupgrade(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceAndUpgradeRequestInputModel request);
	
	BQTroubleshootingRequestOutputModel requestTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingRequestInputModel request);
	
	CREBranchChannelManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CREBranchChannelManagementPlanRequestInputModel request);
	
	BQCapacityPlanningRetrieveOutputModel retrieveCapacityplanning(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQMaintenanceAndUpgradeRetrieveOutputModel retrieveMaintenanceandupgrade(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTroubleshootingRetrieveOutputModel retrieveTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CREBranchChannelManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDEBranchManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CREBranchChannelManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CREBranchChannelManagementPlanUpdateInputModel request);
	
	BQCapacityPlanningUpdateOutputModel updateCapacityplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCapacityPlanningUpdateInputModel request);
	
	BQMaintenanceAndUpgradeUpdateOutputModel updateMaintenanceandupgrade(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceAndUpgradeUpdateInputModel request);
	
	BQTroubleshootingUpdateOutputModel updateTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingUpdateInputModel request);
	
}
