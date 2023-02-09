package com.example.movies;

import com.google.gson.annotations.SerializedName;

public class Review {

    public static final String TYPE_NEI = "Нейтральный";
    public static final String TYPE_POS = "Позитивный";
    public static final String TYPE_NEG = "Негативный";

    @SerializedName("author")
    private String author;
    @SerializedName("review")
    private String text;

    @SerializedName("type")
    private String type;

    public Review(String author, String text, String type) {
        this.author = author;
        this.text = text;
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }
}
