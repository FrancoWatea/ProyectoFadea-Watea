package com.requisitions.main;

import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.requisitions.domain.EmployeeDemo;



public class CamelMain {

	
    public static void main(String[] args) {

        try {
            ApplicationContext springCtx = new ClassPathXmlApplicationContext("aplication.xml");
            
            
            CamelContext context = springCtx.getBean("employeeContext", CamelContext.class);

            context.start();

            ProducerTemplate producerTemplate = context.createProducerTemplate();
           

//             Insert Employee 1
           EmployeeDemo emp1 = getEmployee1();
           String resp = producerTemplate.requestBody("direct:insert", emp1, String.class);


//            Get Employee of inserted employees
            List<EmployeeDemo> employees = producerTemplate.requestBody("direct:select", null, List.class);
            System.out.println("employees:" + employees);

        }
        catch (Exception e) {

            e.printStackTrace();

        }
    }

    private static EmployeeDemo getEmployee1() {

        EmployeeDemo emp = new EmployeeDemo();
        emp.setEmpAge("18");
        emp.setEmpName("Franco");
        return emp;

    }


}
