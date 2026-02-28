package com.practice.utils;

import com.practice.constants.EnvType;

import java.util.Properties;

public class ConfigLoader {

    private final Properties properties;
    private static ConfigLoader configLoader;

    private ConfigLoader(){
       String env= System.getProperty("env",String.valueOf(EnvType.STAGE));
       System.out.println("the given env is-------------> "+env);
       switch (EnvType.valueOf(env)){
           case STAGE -> properties=PropertyUtils.propertyLoader("src/test/resources/stageconfig.properties");
           case PROD ->  properties=PropertyUtils.propertyLoader("src/test/resources/prodconfig.properties");
           default -> throw new IllegalStateException("invalid env "+env);
       }

    }

    public static ConfigLoader getInstance(){
        if(configLoader==null){
            configLoader=new ConfigLoader();
        }
        return configLoader;
    }

    public String getBaseUrl(){
        String prop=properties.getProperty("baseUrl");
        if(prop!=null){
            return prop;
        }else{
            throw new RuntimeException("property baseurl is not specified in the properties file");
        }
    }
}
