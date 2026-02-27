package com.dilos.qa.tests;

import com.dilos.qa.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.greaterThan;

public class PostTest extends BaseTest {

    @Test
    public void getPostsTest() {

        Response response = RestAssured.given()
                .spec(spec)
                .when()
                .get("/posts");

        response.then().statusCode(200);
        response.then().body("size()", greaterThan(0));
        response.then().body("[0].userId", greaterThan(0));
    }
}