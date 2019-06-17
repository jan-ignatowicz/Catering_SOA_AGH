
package pl.agh.kis.soa.server.soap.implementations;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DishSoapServiceImplService", targetNamespace = "http://implementations.soap.server.soa.kis.agh.pl/", wsdlLocation = "http://localhost:8080/service?wsdl")
public class DishSoapServiceImplService
    extends Service
{

    private final static URL DISHSOAPSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException DISHSOAPSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName DISHSOAPSERVICEIMPLSERVICE_QNAME = new QName("http://implementations.soap.server.soa.kis.agh.pl/", "DishSoapServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/service?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DISHSOAPSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        DISHSOAPSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public DishSoapServiceImplService() {
        super(__getWsdlLocation(), DISHSOAPSERVICEIMPLSERVICE_QNAME);
    }

    public DishSoapServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DISHSOAPSERVICEIMPLSERVICE_QNAME, features);
    }

    public DishSoapServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, DISHSOAPSERVICEIMPLSERVICE_QNAME);
    }

    public DishSoapServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DISHSOAPSERVICEIMPLSERVICE_QNAME, features);
    }

    public DishSoapServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DishSoapServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DishSoapService
     */
    @WebEndpoint(name = "DishSoapServiceImplPort")
    public DishSoapService getDishSoapServiceImplPort() {
        return super.getPort(new QName("http://implementations.soap.server.soa.kis.agh.pl/", "DishSoapServiceImplPort"), DishSoapService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DishSoapService
     */
    @WebEndpoint(name = "DishSoapServiceImplPort")
    public DishSoapService getDishSoapServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://implementations.soap.server.soa.kis.agh.pl/", "DishSoapServiceImplPort"), DishSoapService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DISHSOAPSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw DISHSOAPSERVICEIMPLSERVICE_EXCEPTION;
        }
        return DISHSOAPSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
