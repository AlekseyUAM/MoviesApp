package com.example.movies;

import com.google.gson.annotations.SerializedName;

public class ServerResponseTrailers {
    @SerializedName("videos")
    private TrailersList trailersList;

    public ServerResponseTrailers(TrailersList trailersList) {
        this.trailersList = trailersList;
    }

    public TrailersList getTrailersList() {
        return trailersList;
    }

    @Override
    public String toString() {
        return "ServerResponseTrailers{" +
                "trailersList=" + trailersList +
                '}';
    }
}
