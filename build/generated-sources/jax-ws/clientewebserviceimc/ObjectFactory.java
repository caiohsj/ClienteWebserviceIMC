
package clientewebserviceimc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientewebserviceimc package. 
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

    private final static QName _GetIMC_QNAME = new QName("http://webserviceimc/", "getIMC");
    private final static QName _GetIMCResponse_QNAME = new QName("http://webserviceimc/", "getIMCResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientewebserviceimc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetIMC }
     * 
     */
    public GetIMC createGetIMC() {
        return new GetIMC();
    }

    /**
     * Create an instance of {@link GetIMCResponse }
     * 
     */
    public GetIMCResponse createGetIMCResponse() {
        return new GetIMCResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIMC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserviceimc/", name = "getIMC")
    public JAXBElement<GetIMC> createGetIMC(GetIMC value) {
        return new JAXBElement<GetIMC>(_GetIMC_QNAME, GetIMC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIMCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserviceimc/", name = "getIMCResponse")
    public JAXBElement<GetIMCResponse> createGetIMCResponse(GetIMCResponse value) {
        return new JAXBElement<GetIMCResponse>(_GetIMCResponse_QNAME, GetIMCResponse.class, null, value);
    }

}
