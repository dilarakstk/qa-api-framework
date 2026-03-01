package com.dilos.qa.tests;

import org.testng.annotations.BeforeClass;
import static org.hamcrest.Matchers.greaterThan;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.containsString;
public class FirstApiTest {
    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }
    @Test(groups = {"smoke"})
    public void getUsersTest() {


        Response response = RestAssured.get("/users");
        response.then().statusCode(200);

        // Liste boş değil mi kontrol et
        response.then().body("size()", org.hamcrest.Matchers.greaterThan(0));
        response.then().body("[0].id", greaterThan(0));
        response.then().body("[0].email", containsString("@"));

    }

    }






