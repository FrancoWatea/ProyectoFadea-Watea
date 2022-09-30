package com.requisitions.main;


import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.requisitions.domain.PlantillaWIP;



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
	   PlantillaWIP wipasd = new PlantillaWIP();
	   wipasd.setLAST_UPDATED_BY(1318);
	return wipasd;
   }
    
}