package com.dilos.qa.tests;

import com.dilos.qa.BaseTest;
import com.dilos.qa.models.Post;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdatePostTest extends BaseTest {

    @Test
    public void updateExistingPost_put_shouldReturn200() {

        Post updatedPost = new Post(
                "Updated title",
                "Updated body",
                1
        );

        Response response =
                given()
                        .spec(spec)
                        .contentType(ContentType.JSON)
                        .body(updatedPost)
                        .when()
                        .put("/posts/1");

        Assert.assertEquals(response.statusCode(), 200, "PUT should return 200 for existing post");

        // JSONPlaceholder bazen payload'ı aynen döner, bazen farklı davranabilir.
        // En stabil kontrol: status code + response body boş değil mi?
        Assert.assertTrue(response.getBody().asString().length() > 0, "Response body should not be empty");
    }
}

