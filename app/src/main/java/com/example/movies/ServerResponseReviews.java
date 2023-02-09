package com.example.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ServerResponseReviews {

    @SerializedName("docs")
    private List<Review> reviews;

    public ServerResponseReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<Review> getReviews() {
        return reviews;
    }

}
