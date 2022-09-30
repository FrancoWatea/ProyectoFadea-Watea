package com.requisitions.router;

import org.apache.camel.builder.RouteBuilder;

public class RequisitionsRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	
    	//ejecuto las queries una por una loggeando un insert luego de cada una  
    	
        from("direct:insert1").bean("requisitionsMapper", "getMap")
            .to("sqlComponent:{{sql.insert1}}").log("insert1");
        
        from("direct:insert2").bean("requisitionsMapper", "getMap")
            .to("sqlComponent:{{sql.insert2}}").log("insert2");
        
        from("direct:insert3").bean("requisitionsMapper", "getMap")
            .to("sqlComponent:{{sql.insert3}}").log("insert3");
        
        from("direct:insert3-2").bean("requisitionsMapper", "getMap")
            .to("sqlComponent:{{sql.insert3-2}}").log("insert3-2");
        
        from("direct:insert4").bean("requisitionsMapper", "getMap")
            .to("sqlComponent:{{sql.insert4}}").log("insert4");
        
        from("direct:insert4-2").bean("requisitionsMapper", "getMap")
            .to("sqlComponent:{{sql.insert4-2}}").log("insert4-2");
        
        from("direct:insert4-3").bean("requisitionsMapper", "getMap")
            .to("sqlComponent:{{sql.insert4-3}}").log("insert4-3");
        
        from("direct:insert5").bean("requisitionsMapper", "getMap")
            .to("sqlComponent:{{sql.insert5}}").log("insert5");

        
    }

}