package com.practice.apis;

import com.practice.constants.EndPoints;
import io.restassured.http.Cookies;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import java.util.HashMap;

public class CartAPI {

    public CartAPI(Cookies cookies) {
        this.cookies=cookies;
    }

    public Cookies getCookies() {
        return cookies;
    }

    public void setCookies(Cookies cookies) {
        this.cookies = cookies;
    }

    private Cookies cookies;

    public Response addToCart(int productId,int quantity){
        Header headrer =new Header("content-type","application/x-www-form-urlencoded");
        Headers headers=new Headers(headrer);
        HashMap<String,Object> formparms=new HashMap<>();
        formparms.put("product_sku","");
        formparms.put("product_id",productId);
        formparms.put("quantity",quantity);
        Response response=APIrequests.post(EndPoints.ADD_TO_CART.url, headers,formparms,cookies);
        if(response.getStatusCode()!=200){
            throw new RuntimeException("Failed to add producyt"+ productId+" to the cart");
        }
        this.cookies=response.getDetailedCookies();
        return response;

    }

}
