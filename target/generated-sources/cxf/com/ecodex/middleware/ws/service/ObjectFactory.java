
package com.ecodex.middleware.ws.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ecodex.middleware.ws.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RunJob01_QNAME = new QName("http://service.ws.middleware.ecodex.com/", "runJob01");
    private final static QName _RunJob01Response_QNAME = new QName("http://service.ws.middleware.ecodex.com/", "runJob01Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ecodex.middleware.ws.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RunJob01 }
     * 
     */
    public RunJob01 createRunJob01() {
        return new RunJob01();
    }

    /**
     * Create an instance of {@link RunJob01Response }
     * 
     */
    public RunJob01Response createRunJob01Response() {
        return new RunJob01Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunJob01 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RunJob01 }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.middleware.ecodex.com/", name = "runJob01")
    public JAXBElement<RunJob01> createRunJob01(RunJob01 value) {
        return new JAXBElement<RunJob01>(_RunJob01_QNAME, RunJob01 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunJob01Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RunJob01Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.middleware.ecodex.com/", name = "runJob01Response")
    public JAXBElement<RunJob01Response> createRunJob01Response(RunJob01Response value) {
        return new JAXBElement<RunJob01Response>(_RunJob01Response_QNAME, RunJob01Response.class, null, value);
    }

}
