package com.example.movies;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class FavoritesViewModel extends AndroidViewModel{

    private final MoviesDao moviesDao;

    public FavoritesViewModel(@NonNull Application application) {
        super(application);
        moviesDao = MovieDatabase.getInstance(application).moviesDao();
    }

    public LiveData<List<Movie>> getMovies(){
        return moviesDao.getAllFavoriteMovies();
    }
}
