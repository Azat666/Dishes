package com.example.student.dishesproject;

public class Model {
    private String imageUrl;
    private String name;
    private String story;
    private String calory;
    private String url;

    public Model(String imageUrl, String name, String story, String calory, String url) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.story = story;
        this.calory = calory;
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getStory() {
        return story;
    }

    public String getCalory() {
        return calory;
    }

    public String getUrl() {
        return url;
    }
}
