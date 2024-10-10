package com.ecodex.client.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface SendMessageToMiddleware {
	
    @WebMethod
    String callRunJob01 (String message);

}
