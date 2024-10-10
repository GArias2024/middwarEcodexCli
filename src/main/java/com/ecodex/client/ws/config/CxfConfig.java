package com.ecodex.client.ws.config;

import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.Bus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ecodex.client.ws.service.SendMessageToMiddleware;
import com.ecodex.client.ws.service.impl.SendMessageToMiddlewareCallbackImpl;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {

	
    private final Bus bus;
    private final SendMessageToMiddleware sendMessageToMiddleware;

    public CxfConfig(Bus bus, SendMessageToMiddleware sendMessageToMiddleware) {
        this.bus = bus;
        this.sendMessageToMiddleware = sendMessageToMiddleware;
    }
    
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, sendMessageToMiddleware);
        endpoint.publish("/calljob01");  // Publica el servicio SOAP
        System.out.println("<<<OBTENER WSDL>>>     http://localhost:8081/services/calljob01?wsdl");
        return endpoint;
    }
    
    @Bean
    public Endpoint callback() {
        EndpointImpl endpoint = new EndpointImpl(bus, new SendMessageToMiddlewareCallbackImpl());
        endpoint.publish("/callback"); // Exponer el servicio en /callback
        System.out.println("<<<callback>>>     http://localhost:8081/services/callback?wsdl");
        return endpoint;
    }

}

