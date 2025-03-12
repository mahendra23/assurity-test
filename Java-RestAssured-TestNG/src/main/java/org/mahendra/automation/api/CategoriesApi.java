package org.mahendra.automation.api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.mahendra.automation.api.ApiRoutes.CATEGORIES_PATH;
import static org.mahendra.automation.api.SpecificationBuilder.getRequestSpecification;
import static org.mahendra.automation.api.SpecificationBuilder.getResponseSpecification;

public class CategoriesApi {
    public static Response getCategory(String categoryId) {
        return given(getRequestSpecification())
                .pathParam("categoryId", categoryId)
                .when().get(CATEGORIES_PATH)
                .then().spec(getResponseSpecification()).extract().response();
    }
}
