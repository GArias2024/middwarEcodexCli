package com.ecodex.client.ws.service.impl;

import javax.jws.WebService;
import javax.jws.WebMethod;



@WebService(targetNamespace = "http://wsclient.callback/job01")
public class SendMessageToMiddlewareCallbackImpl {
	
    // Método para recibir el objeto JobResponse
    public void processCallback(String jobResponse) {
        // Aquí puedes procesar el objeto JobResponse
        System.out.println("jobResponse : " + jobResponse);
    }

    @WebMethod
    public String onJobComplete(String jobId) {
        System.out.println("Callback recibido para el job: " + jobId);
        // Aquí puedes procesar lo que desees con la notificación
        return "ACK";
    }
}