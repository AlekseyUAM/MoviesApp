package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("movie?token=P5A6Z05-G8RMEBY-PEWQWMC-1R20MD1&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=30")
    Single<ServerResponseMovie> loadMovies(@Query("page") int page);

    @GET("movie?token=P5A6Z05-G8RMEBY-PEWQWMC-1R20MD1&field=id")
    Single<ServerResponseTrailers> loadTrailers(@Query("search") int id);
}
