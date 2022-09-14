package com.requisitions.util;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.requisitions.domain.EmployeeDemo;

public class EmployeeMapper {

	public Map<String, Object> getMap(EmployeeDemo employee) {
		Map<String, Object> answer = new HashMap<String, Object>();
		answer.put("EMP_NAME", employee.getEmpName());
		answer.put("EMP_AGE", employee.getEmpAge());
		return answer;
	}

	public List<EmployeeDemo> readEmployees(List<Map<String, String>> dataList) {

		System.out.println("data:" + dataList);

		List<EmployeeDemo> employees = new ArrayList<EmployeeDemo>();

		for (Map<String, String> data : dataList) {

			EmployeeDemo employee = new EmployeeDemo();

			employee.setEmpName(data.get("EMP_NAME"));
			employee.setEmpAge(data.get("EMP_AGE"));

			employees.add(employee);
		}

		return employees;
	}
}
