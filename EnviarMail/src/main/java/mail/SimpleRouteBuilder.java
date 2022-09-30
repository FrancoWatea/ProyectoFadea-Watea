package mail;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {
	//https://support.google.com/a/answer/176600?hl=en
	@Override
	public void configure() throws Exception {
		from("file:C:\\Users\\folan\\Desktop\\ProyectoFadea-Watea\\EnviarMail\\inputFolder?noop=true").doTry()
				.setHeader("subject", simple("Enviar mail con camel"))
				.setHeader("to", simple("franco@watea.com.ar,folano06@gmail.com"))
				.to("smtps://smtp-relay.gmail.com:465?username=franco@watea.com.ar&password=******");
	}
}
