package com.wip.router;

import org.apache.camel.builder.RouteBuilder;

public class WIPRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	
    	//ejecuto las queries una por una loggeando un insert luego de cada una  
    	
        from("direct:insert1").bean("WIPMapper", "getMap")
            .to("sqlComponent:{{sql.WIP1}}").log("insert1");

        
    }

}