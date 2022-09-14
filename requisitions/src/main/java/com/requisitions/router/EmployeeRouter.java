package com.requisitions.router;

import org.apache.camel.builder.RouteBuilder;

public class EmployeeRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	
        from("direct:insert").log("Inserted new Employee").bean("employeeMapper", "getMap")
            .to("sqlComponent:{{sql.insertDemo}}");

        from("direct:select").to("sqlComponent:{{sql.selectDemo}}")
            .bean("employeeMapper", "readEmployees").log("${body}");
    }

}