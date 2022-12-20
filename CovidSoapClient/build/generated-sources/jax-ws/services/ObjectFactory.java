
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _FindCovidByIDResponse_QNAME = new QName("http://services/", "findCovidByIDResponse");
    private final static QName _Covidtables_QNAME = new QName("http://services/", "covidtables");
    private final static QName _FindCovidByID_QNAME = new QName("http://services/", "findCovidByID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindCovidByID }
     * 
     */
    public FindCovidByID createFindCovidByID() {
        return new FindCovidByID();
    }

    /**
     * Create an instance of {@link FindCovidByIDResponse }
     * 
     */
    public FindCovidByIDResponse createFindCovidByIDResponse() {
        return new FindCovidByIDResponse();
    }

    /**
     * Create an instance of {@link Covidtables }
     * 
     */
    public Covidtables createCovidtables() {
        return new Covidtables();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCovidByIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCovidByIDResponse")
    public JAXBElement<FindCovidByIDResponse> createFindCovidByIDResponse(FindCovidByIDResponse value) {
        return new JAXBElement<FindCovidByIDResponse>(_FindCovidByIDResponse_QNAME, FindCovidByIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Covidtables }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "covidtables")
    public JAXBElement<Covidtables> createCovidtables(Covidtables value) {
        return new JAXBElement<Covidtables>(_Covidtables_QNAME, Covidtables.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCovidByID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCovidByID")
    public JAXBElement<FindCovidByID> createFindCovidByID(FindCovidByID value) {
        return new JAXBElement<FindCovidByID>(_FindCovidByID_QNAME, FindCovidByID.class, null, value);
    }

}
