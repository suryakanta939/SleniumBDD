package com.practice.domainobjects;

public class BillingDetails {
    public BillingDetails(String billingfirstName, String billingLastName, String billingAdDress, String billingCity, String billingState, String billingZip, String billingEmail) {
        this.billingfirstName = billingfirstName;
        this.billingLastName = billingLastName;
        this.billingAdDress = billingAdDress;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.billingEmail = billingEmail;
    }

    public String getBillingfirstName() {
        return billingfirstName;
    }

    public void setBillingfirstName(String billingfirstName) {
        this.billingfirstName = billingfirstName;
    }

    public String getBillingLastName() {
        return billingLastName;
    }

    public void setBillingLastName(String billingLastName) {
        this.billingLastName = billingLastName;
    }

    public String getBillingAdDress() {
        return billingAdDress;
    }

    public void setBillingAdDress(String billingAdDress) {
        this.billingAdDress = billingAdDress;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    public String getBillingEmail() {
        return billingEmail;
    }

    public void setBillingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
    }

    private String billingfirstName;
    private String billingLastName;
    private String billingAdDress;
    private String billingCity;
    private String billingState;
    private String billingZip;
    private String billingEmail;
}
