/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class EBranchManagementApiServiceImpl implements EBranchManagementApiService {

	public SDEBranchManagementActivateOutputModel activate(SDEBranchManagementActivateInputModel request){
		return JsonReader.read("activate-SDEBranchManagementActivateOutputModel.json",new TypeReference<SDEBranchManagementActivateOutputModel>(){});
	}
	
	public SDEBranchManagementConfigureOutputModel configure(String sdReferenceId, SDEBranchManagementConfigureInputModel request){
		return JsonReader.read("configure-SDEBranchManagementConfigureOutputModel.json",new TypeReference<SDEBranchManagementConfigureOutputModel>(){});
	}
	
	public CREBranchChannelManagementPlanCreateOutputModel create(String sdReferenceId, CREBranchChannelManagementPlanCreateInputModel request){
		return JsonReader.read("create-CREBranchChannelManagementPlanCreateOutputModel.json",new TypeReference<CREBranchChannelManagementPlanCreateOutputModel>(){});
	}
	
	public BQMaintenanceAndUpgradeCreateOutputModel createMaintenanceandupgrade(String sdReferenceId, String crReferenceId, BQMaintenanceAndUpgradeCreateInputModel request){
		return JsonReader.read("create-BQMaintenanceAndUpgradeCreateOutputModel.json",new TypeReference<BQMaintenanceAndUpgradeCreateOutputModel>(){});
	}
	
	public CREBranchChannelManagementPlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CREBranchChannelManagementPlanExchangeInputModel request){
		return JsonReader.read("exchange-CREBranchChannelManagementPlanExchangeOutputModel.json",new TypeReference<CREBranchChannelManagementPlanExchangeOutputModel>(){});
	}
	
	public SDEBranchManagementFeedbackOutputModel feedback(String sdReferenceId, SDEBranchManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDEBranchManagementFeedbackOutputModel.json",new TypeReference<SDEBranchManagementFeedbackOutputModel>(){});
	}
	
	public BQCapacityPlanningRequestOutputModel requestCapacityplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCapacityPlanningRequestInputModel request){
		return JsonReader.read("request-BQCapacityPlanningRequestOutputModel.json",new TypeReference<BQCapacityPlanningRequestOutputModel>(){});
	}
	
	public BQMaintenanceAndUpgradeRequestOutputModel requestMaintenanceandupgrade(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceAndUpgradeRequestInputModel request){
		return JsonReader.read("request-BQMaintenanceAndUpgradeRequestOutputModel.json",new TypeReference<BQMaintenanceAndUpgradeRequestOutputModel>(){});
	}
	
	public BQTroubleshootingRequestOutputModel requestTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingRequestInputModel request){
		return JsonReader.read("request-BQTroubleshootingRequestOutputModel.json",new TypeReference<BQTroubleshootingRequestOutputModel>(){});
	}
	
	public CREBranchChannelManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CREBranchChannelManagementPlanRequestInputModel request){
		return JsonReader.read("request-CREBranchChannelManagementPlanRequestOutputModel.json",new TypeReference<CREBranchChannelManagementPlanRequestOutputModel>(){});
	}
	
	public BQCapacityPlanningRetrieveOutputModel retrieveCapacityplanning(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCapacityPlanningRetrieveOutputModel.json",new TypeReference<BQCapacityPlanningRetrieveOutputModel>(){});
	}
	
	public BQMaintenanceAndUpgradeRetrieveOutputModel retrieveMaintenanceandupgrade(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMaintenanceAndUpgradeRetrieveOutputModel.json",new TypeReference<BQMaintenanceAndUpgradeRetrieveOutputModel>(){});
	}
	
	public BQTroubleshootingRetrieveOutputModel retrieveTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTroubleshootingRetrieveOutputModel.json",new TypeReference<BQTroubleshootingRetrieveOutputModel>(){});
	}
	
	public CREBranchChannelManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CREBranchChannelManagementPlanRetrieveOutputModel.json",new TypeReference<CREBranchChannelManagementPlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDEBranchManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDEBranchManagementRetrieveOutputModel.json",new TypeReference<SDEBranchManagementRetrieveOutputModel>(){});
	}
	
	public CREBranchChannelManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CREBranchChannelManagementPlanUpdateInputModel request){
		return JsonReader.read("update-CREBranchChannelManagementPlanUpdateOutputModel.json",new TypeReference<CREBranchChannelManagementPlanUpdateOutputModel>(){});
	}
	
	public BQCapacityPlanningUpdateOutputModel updateCapacityplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCapacityPlanningUpdateInputModel request){
		return JsonReader.read("update-BQCapacityPlanningUpdateOutputModel.json",new TypeReference<BQCapacityPlanningUpdateOutputModel>(){});
	}
	
	public BQMaintenanceAndUpgradeUpdateOutputModel updateMaintenanceandupgrade(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceAndUpgradeUpdateInputModel request){
		return JsonReader.read("update-BQMaintenanceAndUpgradeUpdateOutputModel.json",new TypeReference<BQMaintenanceAndUpgradeUpdateOutputModel>(){});
	}
	
	public BQTroubleshootingUpdateOutputModel updateTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingUpdateInputModel request){
		return JsonReader.read("update-BQTroubleshootingUpdateOutputModel.json",new TypeReference<BQTroubleshootingUpdateOutputModel>(){});
	}
	
}
