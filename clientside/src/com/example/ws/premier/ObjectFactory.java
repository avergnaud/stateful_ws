
package com.example.ws.premier;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.ws.premier package. 
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

    private final static QName _MetAJourHistoriqueResponse_QNAME = new QName("http://www.example.com/ws/Premier", "metAJourHistoriqueResponse");
    private final static QName _MetAJourHistorique_QNAME = new QName("http://www.example.com/ws/Premier", "metAJourHistorique");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.ws.premier
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MetAJourHistoriqueResponse }
     * 
     */
    public MetAJourHistoriqueResponse createMetAJourHistoriqueResponse() {
        return new MetAJourHistoriqueResponse();
    }

    /**
     * Create an instance of {@link MetAJourHistorique }
     * 
     */
    public MetAJourHistorique createMetAJourHistorique() {
        return new MetAJourHistorique();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetAJourHistoriqueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/ws/Premier", name = "metAJourHistoriqueResponse")
    public JAXBElement<MetAJourHistoriqueResponse> createMetAJourHistoriqueResponse(MetAJourHistoriqueResponse value) {
        return new JAXBElement<MetAJourHistoriqueResponse>(_MetAJourHistoriqueResponse_QNAME, MetAJourHistoriqueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetAJourHistorique }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/ws/Premier", name = "metAJourHistorique")
    public JAXBElement<MetAJourHistorique> createMetAJourHistorique(MetAJourHistorique value) {
        return new JAXBElement<MetAJourHistorique>(_MetAJourHistorique_QNAME, MetAJourHistorique.class, null, value);
    }

}
