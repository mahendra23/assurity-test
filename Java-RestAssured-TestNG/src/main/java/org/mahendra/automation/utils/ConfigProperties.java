package org.mahendra.automation.utils;

import java.util.Properties;

public final class ConfigProperties {
    private static final Properties properties = PropertiesUtils.propertyLoader("src/main/resources/config.properties");;

    public static String getBaseUri(){
        String prop = properties.getProperty("base_uri");
        if(prop != null) return prop;
        else throw new RuntimeException("property base_uri is not specified in the config.properties file");
    }
}
