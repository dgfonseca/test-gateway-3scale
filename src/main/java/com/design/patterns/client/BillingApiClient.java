package com.design.patterns.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.design.patterns.entities.Invoice;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
@RegisterRestClient(configKey = "com.example.client.InvoiceClient")
@Produces(MediaType.APPLICATION_XML)
public interface BillingApiClient {

    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("/invoice/{id}/state.xml")
    @PUT
    public Invoice getInvoiceById(@PathParam("id") int id, @FormParam("access_token") String accessToken, @FormParam("state")String status);
    
}
