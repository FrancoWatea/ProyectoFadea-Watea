package com.requisitions.main;


import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.requisitions.domain.REQUISITIONS;



public class CamelMain {

	
    public static void main(String[] args) {
    	
        try {
            ApplicationContext springCtx = new ClassPathXmlApplicationContext("aplication.xml");
            
            
            CamelContext context = springCtx.getBean("requisitionsContext", CamelContext.class);

            context.start();

            ProducerTemplate producerTemplate = context.createProducerTemplate();
           

//         Insert requisition 1
           REQUISITIONS req = getRequisition1();
           String resp = producerTemplate.requestBody("direct:insert1", req, String.class);
           
//         Insert requisition 2
           REQUISITIONS req2 = getRequisition2();
           String resp2 = producerTemplate.requestBody("direct:insert2", req2, String.class);

//         Insert requisition 3
           REQUISITIONS req3 = getRequisition3();
           String resp3 = producerTemplate.requestBody("direct:insert3", req3, String.class);

//         Insert requisition 3_2
           REQUISITIONS req3_2 = getRequisition3_2();
           String resp3_2 = producerTemplate.requestBody("direct:insert3-2", req3_2, String.class);

//         Insert requisition 4 - ORA-00001
//           REQUISITIONS req4 = getRequisition4();
//           String resp4 = producerTemplate.requestBody("direct:insert4", req4, String.class);

//         Insert requisition 4_2
           REQUISITIONS req4_2 = getRequisition4_2();
           String resp4_2 = producerTemplate.requestBody("direct:insert4-2", req4_2, String.class);
           
//         Insert requisition 4_3
           REQUISITIONS req4_3 = getRequisition4_3();
           String resp4_3 = producerTemplate.requestBody("direct:insert4-3", req4_3, String.class);

//         Insert requisition 5
           REQUISITIONS req5 = getRequisition5();
           String resp5 = producerTemplate.requestBody("direct:insert5", req5, String.class);

        }
        catch (Exception e) {

            e.printStackTrace();

        }
    }

    private static REQUISITIONS getRequisition1() {

    	REQUISITIONS req = new REQUISITIONS();
    	req.setInterfaceSorceCode("IMPORT_INV");//interfaceSorceCode
    	req.setOrgId(204);//orgId
    	req.setDestinationTypeCode("INVENTORY");//destinationTypeCode
    	req.setAuthorizationStatus("INCOMPLETE");//authorizationStatus
    	req.setPreparerId(29);//preparerId
    	req.setChargeAccountId(13185);//chargeAccountId
    	req.setSourceTypeCode("VENDOR");//sourceTypeCode
    	req.setUnitOfMeasure("Each");//unitOfMeasure
    	req.setLineTypeId(1);//lineTypeId
    	req.setQuantity(25);//quantity
    	req.setDestinationOrganizationId(204);//destinationOrganizationId
    	req.setDeliverToLocationId(204);//deliverToLocationId
    	req.setDeliverToRequestorId(149);//deliverToRequestorId
    	req.setItemId(149);//itemId
        return req;
    }
    
    private static REQUISITIONS getRequisition2() {

    	REQUISITIONS req = new REQUISITIONS();
    	req.setInterfaceSorceCode("IMPORT_EXP");//interfaceSorceCode
    	req.setOrgId(204);//orgId
    	req.setDestinationTypeCode("EXPENSE");//destinationTypeCode
    	req.setAuthorizationStatus("INCOMPLETE");//authorizationStatus
    	req.setPreparerId(29);//preparerId
    	req.setChargeAccountId(13185);//chargeAccountId
    	req.setSourceTypeCode("VENDOR");//sourceTypeCode
    	req.setUnitOfMeasure("Each");//unitOfMeasure
    	req.setLineTypeId(1);//lineTypeId
    	req.setCategoryId(1);//categoryId
    	req.setUnitPrice(12);//unitPrice
    	req.setQuantity(25);//quantity
    	req.setDestinationOrganizationId(204);//destinationOrganizationId
    	req.setDeliverToLocationId(204);//deliverToLocationId
    	req.setDeliverToRequestorId(29);//deliverToRequestorId
    	req.setItemDescription("Expense Item");//itemDescription
        return req;
    }
    
    private static REQUISITIONS getRequisition3() {

    	REQUISITIONS req = new REQUISITIONS();
    	req.setInterfaceSorceCode("IMPORT_MULTI");//interfaceSorceCode
    	req.setBatchId(98);//batchId
    	req.setTransactionId(99);//transactionId
    	req.setOrgId(204);//orgId
    	req.setDestinationTypeCode("EXPENSE");//destinationTypeCode
    	req.setAuthorizationStatus("INCOMPLETE");//authorizationStatus
    	req.setPreparerId(29);//preparerId
    	req.setSourceTypeCode("VENDOR");//sourceTypeCode
    	req.setUnitOfMeasure("Each");//unitOfMeasure
    	req.setLineTypeId(1);//lineTypeId
    	req.setUnitPrice(10);//unitPrice
    	req.setQuantity(10);//quantity
    	req.setDestinationOrganizationId(204);//destinationOrganizationId
    	req.setDeliverToLocationId(204);//deliverToLocationId
    	req.setDeliverToRequestorId(29);//deliverToRequestorId
    	req.setMultiDistributions("Y");//multiDistributions
    	req.setReqDistSequenceId(97);//reqDistSequenceId
    	req.setCategoryId(1);//categoryId
    	req.setItemDescription("Testing Multi");//itemDescription
        return req;
    }
    
    private static REQUISITIONS getRequisition3_2() {

    	REQUISITIONS req = new REQUISITIONS();
    	req.setInterfaceSorceCode("IMPORT_MULTI");//interfaceSorceCode
    	req.setBatchId(98);//batchId
    	req.setTransactionId(99);//transactionId
    	req.setChargeAccountId(13185);//chargeAccountId
    	req.setDistributionNumber(1);//distributionNumber
    	req.setDistSequenceId(97);//distSequenceId
    	req.setQuantity(5);//quantity
        return req;
    }

    private static REQUISITIONS getRequisition4() {

    	REQUISITIONS req = new REQUISITIONS();
    	req.setInterfaceSorceCode("IMPORT_INV");//interfaceSorceCode
    	req.setTransactionId(99);//transactionId
    	req.setBatchId(98);//batchId
    	req.setOrgId(204);//orgId
    	req.setDestinationTypeCode("INVENTORY");//destinationTypeCode
    	req.setAuthorizationStatus("INCOMPLETE");//authorizationStatus
    	req.setPreparerId(29);//preparerId
    	req.setChargeAccountId(13185);//chargeAccountId
    	req.setSourceTypeCode("VENDOR");//sourceTypeCode
    	req.setUnitOfMeasure("Each");//unitOfMeasure
    	req.setLineTypeId(1);//lineTypeId
    	req.setQuantity(20);//quantity
    	req.setDestinationOrganizationId(204);//destinationOrganizationId
    	req.setDeliverToLocationId(204);//deliverToLocationId
    	req.setDeliverToRequestorId(29);//deliverToRequestorId
    	req.setItemId(149);//itemId
    	req.setReqDistSequenceId(98);//reqDistSequenceId
        return req;
    }
    
    private static REQUISITIONS getRequisition4_2() {

    	REQUISITIONS req = new REQUISITIONS();
    	req.setInterfaceSorceCode("IMPORT_MULTI");//interfaceSorceCode
    	req.setBatchId(98);//batchId
    	req.setTransactionId(99);//transactionId
    	req.setChargeAccountId(13185);//chargeAccountId
    	req.setAccrualAccountId(13185);//accrualAccountId
    	req.setVarianceAccountId(13185);//varianceAccountId
    	req.setDistributionNumber(1);//distributionNumber
    	req.setDistSequenceId(98);//distSequenceId
    	req.setQuantity(10);//quantity
        return req;
    }
    
    private static REQUISITIONS getRequisition4_3() {

    	REQUISITIONS req = new REQUISITIONS();
    	req.setInterfaceSorceCode("IMPORT_MULTI");//interfaceSorceCode
    	req.setBatchId(98);//batchId
    	req.setTransactionId(99);//transactionId
    	req.setChargeAccountId(13185);//chargeAccountId
    	req.setAccrualAccountId(13185);//accrualAccountId
    	req.setVarianceAccountId(13185);//varianceAccountId
    	req.setDistributionNumber(2);//distributionNumber
    	req.setDistSequenceId(98);//distSequenceId
    	req.setQuantity(10);//quantity
        return req;
    }

    private static REQUISITIONS getRequisition5() {

    	REQUISITIONS req = new REQUISITIONS();
    	req.setInterfaceSorceCode("IMPORT_MULTI");//interfaceSorceCode
    	req.setOrgId(204);//orgId
    	req.setDestinationTypeCode("EXPENSE");//destinationTypeCode
    	req.setAuthorizationStatus("INCOMPLETE");//authorizationStatus
    	req.setPreparerId(29);//preparerId
    	req.setChargeAccountId(13185);//chargeAccountId
    	req.setSourceTypeCode("VENDOR");//sourceTypeCode
    	req.setSourceOrganizationId(0);//sourceOrganizationId
    	req.setUnitOfMeasure("Each");//unitOfMeasure
    	req.setLineTypeId(1);//lineTypeId
    	req.setQuantity(10);//quantity
    	req.setDestinationOrganizationId(204);//destinationOrganizationId
    	req.setDeliverToLocationId(204);//deliverToLocationId
    	req.setDeliverToRequestorId(29);//deliverToRequestorId
    	req.setItemId(149);//itemId
        return req;
    }
}