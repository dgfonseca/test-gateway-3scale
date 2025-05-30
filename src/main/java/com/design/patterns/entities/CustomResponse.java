package com.design.patterns.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomResponse {

    public String invoiceId;

    public String state;

    public String paidAt;

    public double cost;

    public String currency;
    
}
