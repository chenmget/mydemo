package com;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import telecom.mss.jt.cg_cgfz.Sicgfzsvrreturnmessageoutsyn;
import telecom.mss.jt.cg_cgfz.SicgfzsvrreturnmessageoutsynImpl;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus;




    /**
     * JAX-WS
     **/
    @Bean
    public Endpoint endpoint() {
        //http://localhost:8080/services/SI_CGFZSVR_RETURN_MESSAGE_OUT_Syn?wsdl
        EndpointImpl endpoint = new EndpointImpl(bus, new SicgfzsvrreturnmessageoutsynImpl());
        endpoint.publish("/SI_CGFZSVR_RETURN_MESSAGE_OUT_Syn");
        return endpoint;
    }
}
