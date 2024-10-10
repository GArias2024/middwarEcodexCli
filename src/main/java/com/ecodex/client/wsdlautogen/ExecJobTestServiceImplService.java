package com.ecodex.client.wsdlautogen;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2024-10-10T21:51:17.013+02:00
 * Generated source version: 3.5.0
 *
 */
@WebServiceClient(name = "ExecJobTestServiceImplService",
                  wsdlLocation = "http://localhost:8080/services/job01?wsdl",
                  targetNamespace = "http://impl.service.ws.middleware.ecodex.com/")
public class ExecJobTestServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.service.ws.middleware.ecodex.com/", "ExecJobTestServiceImplService");
    public final static QName ExecJobTestServiceImplPort = new QName("http://impl.service.ws.middleware.ecodex.com/", "ExecJobTestServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/services/job01?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ExecJobTestServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/services/job01?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ExecJobTestServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ExecJobTestServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ExecJobTestServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ExecJobTestServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ExecJobTestServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ExecJobTestServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ExecJobTestService
     */
    @WebEndpoint(name = "ExecJobTestServiceImplPort")
    public ExecJobTestService getExecJobTestServiceImplPort() {
        return super.getPort(ExecJobTestServiceImplPort, ExecJobTestService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExecJobTestService
     */
    @WebEndpoint(name = "ExecJobTestServiceImplPort")
    public ExecJobTestService getExecJobTestServiceImplPort(WebServiceFeature... features) {
        return super.getPort(ExecJobTestServiceImplPort, ExecJobTestService.class, features);
    }

}
