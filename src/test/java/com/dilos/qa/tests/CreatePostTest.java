package com.dilos.qa.tests;



import com.dilos.qa.BaseTest;
import com.dilos.qa.models.Post;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreatePostTest extends BaseTest {

    @Test(groups = {"smoke"})
    public void createPostTest() {

        Post requestPost = new Post("Hello API", "This is a test post", 1);

        Response response =
                given()
                        .spec(spec)
                        .contentType(ContentType.JSON)
                        .body(requestPost)
                        .when()
                        .post("/posts");

        response.then().statusCode(201);

        Post responsePost = response.as(Post.class);

        Assert.assertEquals(responsePost.getTitle(), "Hello API");
        Assert.assertEquals(responsePost.getBody(), "This is a test post");
        Assert.assertEquals(responsePost.getUserId(), 1);
        Assert.assertTrue(responsePost.getId() > 0);
    }
}













