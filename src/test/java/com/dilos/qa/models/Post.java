package com.dilos.qa.models;

public class Post {

    private int id;          // <-- EKLENDİ
    private String title;
    private String body;
    private int userId;

    public Post() {
        // Default constructor gerekli (deserialization için)
    }

    public Post(String title, String body, int userId) {
        this.title = title;
        this.body = body;
        this.userId = userId;
    }

    public int getId() {     // <-- EKLENDİ
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public int getUserId() {
        return userId;
    }
}










