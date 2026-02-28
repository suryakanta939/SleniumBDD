package com.practice.custometypes;

import com.practice.domainobjects.BillingDetails;
import io.cucumber.java.DataTableType;
import io.cucumber.java.it.Ma;

import java.util.Map;

public class CustomeDatatableType {

    @DataTableType
    public BillingDetails billingDetailsEntry(Map<String,String> entry){
         return new BillingDetails(entry.get("firstname"),
                 entry.get("lastname"),
                 entry.get("Address_line1"),
                 entry.get("city"),
                 entry.get("state"),
                 entry.get("zip"),
                 entry.get("email")
         );
    }
}
//billingfirstName=billingdeatils.get(0).get("firstname");
//billingLastName=billingdeatils.get(0).get("lastname");
//billingAdDress= billingdeatils.get(0).get("Address_line1");
//billingCity=billingdeatils.get(0).get("city");
//billingState=billingdeatils.get(0).get("state");
//billingZip=billingdeatils.get(0).get("zip");
//billingEmail=billingdeatils.get(0).get("email");