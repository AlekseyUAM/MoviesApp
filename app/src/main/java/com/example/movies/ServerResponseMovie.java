package com.example.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ServerResponseMovie {
    @SerializedName("docs")
    private List<Movie> movies;

    public ServerResponseMovie(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    @Override
    public String toString() {
        return "ServerResponse{" +
                "movies=" + movies +
                '}';
    }
}
