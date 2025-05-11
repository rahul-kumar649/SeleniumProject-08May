package com.OpenKart.utilities;

import java.io.FileInputStream;
import java.util.Properties;

//com.OpenKart.utilites.com

public class ReadConfig {
	
	Properties properties;

    String path = "C:\\Users\\DELL\\eclipse-workspace\\OpenCart\\Configuration\\config.properties";
    //C:\Users\DELL\eclipse-workspace\MyStoreV1 -- project level 

    // Constructor
    public ReadConfig() {
        try {
            properties = new Properties();

            FileInputStream fis = new FileInputStream(path);
            properties.load(fis);
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
    
    public String geturl() {
        String value = properties.getProperty("url");
        if (value != null)
            return value;
        else
            throw new RuntimeException("url not specified in config file.");
    }

    public String getbrowser() {
        String value = properties.getProperty("browser");
        if (value != null)
            return value;
        else
            throw new RuntimeException("url not specified in config file.");
    }

}


