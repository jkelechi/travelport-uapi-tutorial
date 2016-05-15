package com.travelport.service.universal_v35_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-05-08T13:24:27.005-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "ProviderReservationDisplayService", 
                  wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/universal_v35_0/UniversalRecord.wsdl",
                  targetNamespace = "http://www.travelport.com/service/universal_v35_0") 
public class ProviderReservationDisplayService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/universal_v35_0", "ProviderReservationDisplayService");
    public final static QName ProviderReservationDisplayServicePort = new QName("http://www.travelport.com/service/universal_v35_0", "ProviderReservationDisplayServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/universal_v35_0/UniversalRecord.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ProviderReservationDisplayService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/universal_v35_0/UniversalRecord.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ProviderReservationDisplayService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ProviderReservationDisplayService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProviderReservationDisplayService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ProviderReservationDisplayService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ProviderReservationDisplayService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ProviderReservationDisplayService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ProviderReservationDisplayServicePortType
     */
    @WebEndpoint(name = "ProviderReservationDisplayServicePort")
    public ProviderReservationDisplayServicePortType getProviderReservationDisplayServicePort() {
        return super.getPort(ProviderReservationDisplayServicePort, ProviderReservationDisplayServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProviderReservationDisplayServicePortType
     */
    @WebEndpoint(name = "ProviderReservationDisplayServicePort")
    public ProviderReservationDisplayServicePortType getProviderReservationDisplayServicePort(WebServiceFeature... features) {
        return super.getPort(ProviderReservationDisplayServicePort, ProviderReservationDisplayServicePortType.class, features);
    }

}