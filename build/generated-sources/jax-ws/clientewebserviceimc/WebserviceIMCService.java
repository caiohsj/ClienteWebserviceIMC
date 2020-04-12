
package clientewebserviceimc;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WebserviceIMCService", targetNamespace = "http://webserviceimc/", wsdlLocation = "http://localhost:8000/imcws?wsdl")
public class WebserviceIMCService
    extends Service
{

    private final static URL WEBSERVICEIMCSERVICE_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICEIMCSERVICE_EXCEPTION;
    private final static QName WEBSERVICEIMCSERVICE_QNAME = new QName("http://webserviceimc/", "WebserviceIMCService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8000/imcws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICEIMCSERVICE_WSDL_LOCATION = url;
        WEBSERVICEIMCSERVICE_EXCEPTION = e;
    }

    public WebserviceIMCService() {
        super(__getWsdlLocation(), WEBSERVICEIMCSERVICE_QNAME);
    }

    public WebserviceIMCService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICEIMCSERVICE_QNAME, features);
    }

    public WebserviceIMCService(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICEIMCSERVICE_QNAME);
    }

    public WebserviceIMCService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICEIMCSERVICE_QNAME, features);
    }

    public WebserviceIMCService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebserviceIMCService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebserviceIMC
     */
    @WebEndpoint(name = "WebserviceIMCPort")
    public WebserviceIMC getWebserviceIMCPort() {
        return super.getPort(new QName("http://webserviceimc/", "WebserviceIMCPort"), WebserviceIMC.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebserviceIMC
     */
    @WebEndpoint(name = "WebserviceIMCPort")
    public WebserviceIMC getWebserviceIMCPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webserviceimc/", "WebserviceIMCPort"), WebserviceIMC.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICEIMCSERVICE_EXCEPTION!= null) {
            throw WEBSERVICEIMCSERVICE_EXCEPTION;
        }
        return WEBSERVICEIMCSERVICE_WSDL_LOCATION;
    }

}
