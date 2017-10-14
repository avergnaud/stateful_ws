
package com.example.ws.second;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.ws.second package. 
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

    private final static QName _Size_QNAME = new QName("http://www.example.com/ws/Second", "size");
    private final static QName _SizeResponse_QNAME = new QName("http://www.example.com/ws/Second", "sizeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.ws.second
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Size }
     * 
     */
    public Size createSize() {
        return new Size();
    }

    /**
     * Create an instance of {@link SizeResponse }
     * 
     */
    public SizeResponse createSizeResponse() {
        return new SizeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Size }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/ws/Second", name = "size")
    public JAXBElement<Size> createSize(Size value) {
        return new JAXBElement<Size>(_Size_QNAME, Size.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SizeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/ws/Second", name = "sizeResponse")
    public JAXBElement<SizeResponse> createSizeResponse(SizeResponse value) {
        return new JAXBElement<SizeResponse>(_SizeResponse_QNAME, SizeResponse.class, null, value);
    }

}
