package com.practice.utils;

import io.restassured.http.Cookies;
import org.openqa.selenium.Cookie;
import org.picocontainer.lifecycle.LifecycleState;

import java.util.ArrayList;
import java.util.List;

public class CookieUtils {


    public List<Cookie> convertRestCookiesToSeleniumCookie(Cookies cookies){
        List<io.restassured.http.Cookie> restassuredCookies=cookies.asList();
        List<Cookie> seleniumCookies= new ArrayList<>();
        for(io.restassured.http.Cookie cookie:restassuredCookies){
            seleniumCookies.add(new Cookie(cookie.getName(),cookie.getValue(),cookie.getDomain(),cookie.getPath(),
                    cookie.getExpiryDate(),cookie.isSecured(),cookie.isHttpOnly(),cookie.getSameSite()));
        }
        return seleniumCookies;
    }
}
