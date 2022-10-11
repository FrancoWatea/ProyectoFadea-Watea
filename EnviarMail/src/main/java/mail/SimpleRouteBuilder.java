package mail;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {
	//https://support.google.com/a/answer/176600?hl=en
	@Override
	public void configure() throws Exception {
		from("direct:mail")
		.setHeader("To", simple("franco@watea.com.ar"))
		.setHeader("Subject", simple("Camel is cool"))
		.to("smtp://franco@watea.com.ar?password=**")
		.log("mail enviado");
	}
}
