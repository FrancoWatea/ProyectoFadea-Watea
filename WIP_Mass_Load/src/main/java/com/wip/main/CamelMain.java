package com.wip.main;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wip.domain.PlantillaWIP;



public class CamelMain {

	
    public static void main(String[] args) {
    	
        try {
            ApplicationContext springCtx = new ClassPathXmlApplicationContext("aplication.xml");
            
            
            CamelContext context = springCtx.getBean("WIPContext", CamelContext.class);

            context.start();

            ProducerTemplate producerTemplate = context.createProducerTemplate();
           

//         Insert requisition 1
           PlantillaWIP wip = getWIP1();
           String resp = producerTemplate.requestBody("direct:insert1", wip, String.class);
           


        }
        catch (Exception e) {

            e.printStackTrace();

        }
    }

   private static PlantillaWIP getWIP1(){
	   PlantillaWIP wip = new PlantillaWIP();
	   wip.setLAST_UPDATE_DATE(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyy")));
	   wip.setLAST_UPDATED_BY(1318);
	   wip.setCREATION_DATE(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyy")));
	   wip.setCREATED_BY(1318);
	   wip.setLAST_UPDATE_LOGIN(1318);
	   wip.setGROUP_ID(1318);
	   wip.setORGANIZATION_ID(207);
	   wip.setLOAD_TYPE(1);
	   wip.setPROCESS_PHASE(2);
	   wip.setPROCESS_STATUS(1);
	   wip.setHEADER_ID(1318);
	   wip.setALLOW_EXPLOSION("Y");
	   wip.setNET_QUANTITY(1);
	   wip.setSTART_QUANTITY(1);
	   wip.setPRIMARY_ITEM_ID(323963);
	   wip.setCOMPLETION_SUBINVENTORY("FGI");
	   wip.setCLASS_CODE("Discrete");
	   wip.setJOB_NAME("TESTKKWML3");
	   wip.setFIRST_UNIT_START_DATE(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyy")));
	   wip.setSTATUS_TYPE(1);
	   return wip;
   }
    
}