package com.requisitions.util;


import java.util.HashMap;
import java.util.Map;

import com.requisitions.domain.PlantillaWIP;

public class WIPMapper {

	public Map<String, Object> getMap(PlantillaWIP wip) {
		Map<String, Object> answer = new HashMap<String, Object>();
		answer.put("LOAD_TYPE", wip.getLOAD_TYPE());
		answer.put("ALLOW_EXPLOSION", wip.getALLOW_EXPLOSION());
		answer.put("GROUP_ID", wip.getGROUP_ID());
		answer.put("HEADER_ID", wip.getHEADER_ID());
		answer.put("PROCESS_PHASE", wip.getPROCESS_PHASE());
		answer.put("PROCESS_STATUS", wip.getPROCESS_STATUS());
		answer.put("SCHEDULING_METHOD", wip.getSCHEDULING_METHOD());
		answer.put("STATUS_TYPE", wip.getSTATUS_TYPE());
		answer.put("CLASS_CODE", wip.getCLASS_CODE());
		answer.put("INTERFACE_ID", wip.getINTERFACE_ID());
		answer.put("LAST_UPDATED_BY", wip.getLAST_UPDATED_BY());
		return answer;
	}

}
