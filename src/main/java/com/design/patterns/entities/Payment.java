package com.design.patterns.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RegisterForReflection
@JsonIgnoreProperties(ignoreUnknown = true)
public class Payment implements Serializable{

    public String currency;

    public double cost;

    public String token;

    public int invoiceId;

    public int userId;

    public String gateway;
    
}
