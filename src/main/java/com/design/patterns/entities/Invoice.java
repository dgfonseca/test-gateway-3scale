package com.design.patterns.entities;

import jakarta.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "invoice")
@XmlAccessorType(XmlAccessType.FIELD)
public class Invoice {

    @XmlAttribute
    private String version;

    private int id;

    @XmlElement(name = "friendly_id")
    private String friendlyId;

    @XmlElement(name = "creation_type")
    private String creationType;

    private String state;

    @XmlElement(name = "paid_at")
    private String paidAt;

    @XmlElement(name = "due_on")
    private String dueOn;

    @XmlElement(name = "issued_on")
    private String issuedOn;

    private String currency;
    private double cost;

    @XmlElement(name = "cost_without_vat")
    private double costWithoutVat;

    private Period period;
    private Party provider;
    private Party buyer;

    @XmlElement(name = "line-items")
    private LineItems lineItems;

    @XmlElement(name = "payment_transactions_count")
    private int paymentTransactionsCount;

    // Getters and setters
    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFriendlyId() { return friendlyId; }
    public void setFriendlyId(String friendlyId) { this.friendlyId = friendlyId; }

    public String getCreationType() { return creationType; }
    public void setCreationType(String creationType) { this.creationType = creationType; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getPaidAt() { return paidAt; }
    public void setPaidAt(String paidAt) { this.paidAt = paidAt; }

    public String getDueOn() { return dueOn; }
    public void setDueOn(String dueOn) { this.dueOn = dueOn; }

    public String getIssuedOn() { return issuedOn; }
    public void setIssuedOn(String issuedOn) { this.issuedOn = issuedOn; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }

    public double getCostWithoutVat() { return costWithoutVat; }
    public void setCostWithoutVat(double costWithoutVat) { this.costWithoutVat = costWithoutVat; }

    public Period getPeriod() { return period; }
    public void setPeriod(Period period) { this.period = period; }

    public Party getProvider() { return provider; }
    public void setProvider(Party provider) { this.provider = provider; }

    public Party getBuyer() { return buyer; }
    public void setBuyer(Party buyer) { this.buyer = buyer; }

    public LineItems getLineItems() { return lineItems; }
    public void setLineItems(LineItems lineItems) { this.lineItems = lineItems; }

    public int getPaymentTransactionsCount() { return paymentTransactionsCount; }
    public void setPaymentTransactionsCount(int paymentTransactionsCount) {
        this.paymentTransactionsCount = paymentTransactionsCount;
    }


@XmlAccessorType(XmlAccessType.FIELD)
public static class Period {

    @XmlElement(name = "from")
    private String fromDate;

    @XmlElement(name = "to")
    private String toDate;

    public String getFromDate() { return fromDate; }
    public void setFromDate(String fromDate) { this.fromDate = fromDate; }

    public String getToDate() { return toDate; }
    public void setToDate(String toDate) { this.toDate = toDate; }
}



@XmlAccessorType(XmlAccessType.FIELD)
public static class Party {

    private int id;

    @XmlElement(name = "org_name")
    private String orgName;

    private String address;
    private String city;
    private String state;
    private String country;
    private String phone;
    private String zip;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getOrgName() { return orgName; }
    public void setOrgName(String orgName) { this.orgName = orgName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getZip() { return zip; }
    public void setZip(String zip) { this.zip = zip; }
}


@XmlAccessorType(XmlAccessType.FIELD)
public static class LineItems {

    @XmlElement(name = "line-item")
    private List<LineItem> items;

    public List<LineItem> getItems() { return items; }
    public void setItems(List<LineItem> items) { this.items = items; }
}


@XmlAccessorType(XmlAccessType.FIELD)
public static class LineItem {

    private int id;
    private String name;
    private String description;
    private int quantity;
    private String type;

    @XmlElement(name = "metric_id")
    private String metricId;

    @XmlElement(name = "plan_id")
    private String planId;

    @XmlElement(name = "contract_id")
    private String contractId;

    @XmlElement(name = "contract_type")
    private String contractType;

    private double cost;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getMetricId() { return metricId; }
    public void setMetricId(String metricId) { this.metricId = metricId; }

    public String getPlanId() { return planId; }
    public void setPlanId(String planId) { this.planId = planId; }

    public String getContractId() { return contractId; }
    public void setContractId(String contractId) { this.contractId = contractId; }

    public String getContractType() { return contractType; }
    public void setContractType(String contractType) { this.contractType = contractType; }

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }
}




}
