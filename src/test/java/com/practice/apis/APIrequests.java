package com.practice.apis;

import io.restassured.http.Cookies;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class APIrequests extends Specbuilder{

    public static Response post(String endPoint, Headers header, HashMap<String, Object> formparam, Cookies cookies){
        return given(getrequestSpecification()).
                headers(header).
                formParams(formparam).
                cookies(cookies).
                when().
                  post(endPoint).then().spec(getResponseSpec()).extract().response();
    }
    public static Response get(String endPoint,  Cookies cookies){
        return given(getrequestSpecification()).
                cookies(cookies).
                when().
                get(endPoint).
                then().
                spec(getResponseSpec()).
                extract().response();
    }

}
