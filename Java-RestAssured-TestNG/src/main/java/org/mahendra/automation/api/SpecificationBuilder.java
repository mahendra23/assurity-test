package org.mahendra.automation.api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.mahendra.automation.utils.ConfigProperties;


public class SpecificationBuilder {

    public static RequestSpecification getRequestSpecification(){
        String baseUri = ConfigProperties.getBaseUri();
        return new RequestSpecBuilder().setBaseUri(baseUri).build();
    }

    public static ResponseSpecification getResponseSpecification(){
        return new ResponseSpecBuilder().
                log(LogDetail.ALL).
                build();
    }
}