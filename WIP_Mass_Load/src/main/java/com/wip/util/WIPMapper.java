package com.wip.util;


import java.util.HashMap;
import java.util.Map;

import com.wip.domain.PlantillaWIP;

public class WIPMapper {

	public Map<String, Object> getMap(PlantillaWIP wip) {
		Map<String, Object> answer = new HashMap<String, Object>();
		answer.put("LAST_UPDATE_DATE", wip.getLAST_UPDATE_DATE());
		answer.put("LAST_UPDATED_BY", wip.getLAST_UPDATED_BY());
		answer.put("CREATION_DATE", wip.getCREATION_DATE());
		answer.put("CREATED_BY", wip.getCREATED_BY());
		answer.put("LAST_UPDATE_LOGIN", wip.getLAST_UPDATE_LOGIN());
		answer.put("GROUP_ID", wip.getGROUP_ID());
		answer.put("ORGANIZATION_ID", wip.getORGANIZATION_ID());
		answer.put("LOAD_TYPE", wip.getLOAD_TYPE());
		answer.put("WIP_ENTITY_ID", wip.getWIP_ENTITY_ID());
		answer.put("PROCESS_PHASE", wip.getPROCESS_PHASE());
		answer.put("PROCESS_STATUS", wip.getPROCESS_STATUS());
		answer.put("HEADER_ID", wip.getHEADER_ID());
		answer.put("ALLOW_EXPLOSION", wip.getALLOW_EXPLOSION());
		answer.put("NET_QUANTITY", wip.getNET_QUANTITY());
		answer.put("START_QUANTITY", wip.getSTART_QUANTITY());
		answer.put("PRIMARY_ITEM_ID", wip.getPRIMARY_ITEM_ID());
		answer.put("COMPLETION_SUBINVENTORY", wip.getCOMPLETION_SUBINVENTORY());
		answer.put("CLASS_CODE", wip.getCLASS_CODE());
		answer.put("JOB_NAME", wip.getJOB_NAME());
		answer.put("FIRST_UNIT_START_DATE", wip.getFIRST_UNIT_START_DATE());
		answer.put("STATUS_TYPE", wip.getSTATUS_TYPE());
		return answer;
	}

}
