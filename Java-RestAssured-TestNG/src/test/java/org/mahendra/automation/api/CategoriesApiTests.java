package org.mahendra.automation.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.mahendra.automation.pojos.Category;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CategoriesApiTests {
    Category category = new Category();

    @BeforeClass
    public void getCategoryTest() {
        Response response = CategoriesApi.getCategory("6327");
        assertThat(response.statusCode(), equalTo(200));
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            category = objectMapper.readValue(response.getBody().asString(), Category.class);
            assertThat(category.getCategoryId(), equalTo(6327));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getCategoryNameTest() {
        assertThat(category.getName(), equalTo("Carbon credits"));
    }

    @Test
    public void getCategoryCanRelistTest() {
        assertThat(category.isCanRelist(), equalTo(true));
    }
    
    @Test
    public void getPromotionTest() {
        assertThat(category.getPromotionByName("Gallery"), equalTo("Good position in category"));
    }
}