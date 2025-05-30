package com.design.patterns.apis;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.design.patterns.client.BillingApiClient;
import com.design.patterns.entities.Invoice;
import com.design.patterns.entities.Payment;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
@Path("/pay")
public class SingletonPaymentResource {

    
    @RestClient
    @Inject
    BillingApiClient client;

    @ConfigProperty(name="ACCESS_TOKEN")
    private String accessToken;


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_XML)
    @Transactional
    public Response pay(Payment payment){
        Invoice invoice = client.getInvoiceById(payment.invoiceId, accessToken, "paid");
        return Response.ok(invoice).build();
    }

    
}
