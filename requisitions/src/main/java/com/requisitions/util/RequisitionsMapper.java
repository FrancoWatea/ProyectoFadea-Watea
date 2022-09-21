package com.requisitions.util;


import java.util.HashMap;
import java.util.Map;

import com.requisitions.domain.REQUISITIONS;

public class RequisitionsMapper {

	public Map<String, Object> getMap(REQUISITIONS requisition) {
		Map<String, Object> answer = new HashMap<String, Object>();
		answer.put("interfaceSorceCode", requisition.getInterfaceSorceCode());
		answer.put("batchId", requisition.getBatchId());
		answer.put("transactionId", requisition.getTransactionId());
		answer.put("orgId", requisition.getOrgId());
		answer.put("destinationTypeCode", requisition.getDestinationTypeCode());
		answer.put("authorizationStatus", requisition.getAuthorizationStatus());
		answer.put("preparerId", requisition.getPreparerId());
		answer.put("chargeAccountId", requisition.getChargeAccountId());
		answer.put("accrualAccountId", requisition.getAccrualAccountId());
		answer.put("varianceAccountId", requisition.getVarianceAccountId());
		answer.put("sourceTypeCode", requisition.getSourceTypeCode());
		answer.put("sourceOrganizationId", requisition.getSourceOrganizationId());
		answer.put("unitOfMeasure", requisition.getUnitOfMeasure());
		answer.put("lineTypeId", requisition.getLineTypeId());
		answer.put("categoryId", requisition.getCategoryId());
		answer.put("unitPrice", requisition.getUnitPrice());
		answer.put("quantity", requisition.getQuantity());
		answer.put("destinationOrganizationId", requisition.getDestinationOrganizationId());
		answer.put("deliverToLocationId", requisition.getDeliverToLocationId());
		answer.put("deliverToRequestorId", requisition.getDeliverToRequestorId());
		answer.put("itemId", requisition.getItemId());
		answer.put("multiDistributions", requisition.getMultiDistributions());
		answer.put("reqDistSequenceId", requisition.getReqDistSequenceId());
		answer.put("itemDescription", requisition.getItemDescription());
		answer.put("needByDate", requisition.getNeedByDate());
		answer.put("distributionNumber", requisition.getDistributionNumber());
		answer.put("distSequenceId", requisition.getDistSequenceId());
		return answer;
	}

}
