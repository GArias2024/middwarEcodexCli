package com.ecodex.client.ws.service.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.ecodex.client.ws.service.SendMessageToMiddleware;
import com.ecodex.client.wsdlautogen.ExecJobTestService;
import com.ecodex.client.wsdlautogen.ExecJobTestServiceImplService;


@WebService(endpointInterface = "com.ecodex.client.ws.service.SendMessageToMiddleware")
@Service
public class SendMessageToMiddlewareImpl implements SendMessageToMiddleware {
	
	
	@Override
	public String callRunJob01(String message) {

	    // Crear una instancia del servicio generado a partir del WSDL
		ExecJobTestServiceImplService service = new ExecJobTestServiceImplService();

	    // Obtener el puerto (el endpoint que expone el servicio)
		ExecJobTestService port = service.getExecJobTestServiceImplPort();

	    // Llamar a un método del servicio SOAP
	    String response = port.runJob01(">>> (wsclient) texto desde cliente");
	    
	    System.out.println("Response from SOAP Service: " + response);
	    
		return response;
	}

 
}