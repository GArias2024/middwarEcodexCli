package com.ecodex.client.wsdlautogen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2024-10-10T21:51:16.977+02:00
 * Generated source version: 3.5.0
 *
 */
@WebService(targetNamespace = "http://service.ws.middleware.ecodex.com/", name = "ExecJobTestService")
@XmlSeeAlso({ObjectFactory.class})
public interface ExecJobTestService {

    @WebMethod
    @RequestWrapper(localName = "runJob01", targetNamespace = "http://service.ws.middleware.ecodex.com/", className = "com.ecodex.client.wsdlautogen.RunJob01")
    @ResponseWrapper(localName = "runJob01Response", targetNamespace = "http://service.ws.middleware.ecodex.com/", className = "com.ecodex.client.wsdlautogen.RunJob01Response")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String runJob01(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
