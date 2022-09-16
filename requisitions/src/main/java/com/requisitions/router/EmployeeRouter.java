package com.requisitions.router;

import org.apache.camel.builder.RouteBuilder;

public class EmployeeRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	
    	//ejecuto las queries una por una loggeando un insert luego de cada una  
    	
        from("direct:insert").bean("employeeMapper", "getMap")
            .to("sqlComponent:{{sql.insertDemo1}}").log("Inserted1")
            .to("sqlComponent:{{sql.insertDemo2}}").log("Inserted2")
            .to("sqlComponent:{{sql.insertDemo3}}").log("Inserted3")
            .to("sqlComponent:{{sql.insertDemo3-2}}").log("Inserted4")
            .to("sqlComponent:{{sql.insertDemo4}}").log("Inserted5")
            .to("sqlComponent:{{sql.insertDemo4-2}}").log("Inserted6")
            .to("sqlComponent:{{sql.insertDemo4-3}}").log("Inserted7")
            .to("sqlComponent:{{sql.insertDemo5}}").log("Inserted8");
//            .to("sqlComponent:{{sql.confirmar}}").log("Confirmado")
        

        from("direct:select").to("sqlComponent:{{sql.selectDemo}}")
            .bean("employeeMapper", "readEmployees").log("${body}");
    }

}