package com.practice.custometypes;

import com.practice.domainobjects.Product;
import io.cucumber.java.ParameterType;

public class CustomeParameterType {

    @ParameterType(".*")
    public Product product(String name){
        return new Product(name.replace("\"",""));
        }
    }

