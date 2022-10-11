package mail;


import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class MainApp {
	
    public static void main(String[] args) {
//        Properties props = new Properties();
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.user", "franco@watea.com.ar");
//        props.put("mail.smtp.clave", "**");
//        props.put("mail.smtp.starttls.enable", "true");
//        javax.mail.Session s = javax.mail.Session.getDefaultInstance(props);
//        MimeMessage mensaje = new MimeMessage(s);
//        
//       try {
//        mensaje.addRecipient(Message.RecipientType.TO,new InternetAddress("manuel@watea.com.ar"));
//        mensaje.setSubject("HOLA");
//        mensaje.setText("hola, este es un mail de prueba.");
//        Transport transport = s.getTransport("smtp");
//        transport.connect("smtp.gmail.com", "franco@watea.com.ar", "**");
//        transport.sendMessage(mensaje, mensaje.getAllRecipients());
//        transport.close();
//        System.out.println("enviado");
//    } catch (AddressException e) {
//        // TODO Auto-generated catch block
//        e.printStackTrace();
//    } catch (MessagingException e) {
//        // TODO Auto-generated catch block
//        e.printStackTrace();
//    }
        
        SimpleRouteBuilder routeBuilder = new SimpleRouteBuilder();
        CamelContext ctx = new DefaultCamelContext();
        try {
            ctx.addRoutes(routeBuilder);
            ctx.start();
            ctx.stop();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
