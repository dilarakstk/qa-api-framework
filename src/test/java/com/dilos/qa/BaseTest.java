package com.dilos.qa;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected RequestSpecification spec;

    @BeforeClass
    public void setup() {
        spec = new RequestSpecBuilder()
                .setBaseUri("https://jsonplaceholder.typicode.com")
                .build();
    }
}

