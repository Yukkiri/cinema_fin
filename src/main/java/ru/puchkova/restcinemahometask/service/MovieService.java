package ru.puchkova.restcinemahometask.service;

import ru.puchkova.restcinemahometask.data.entity.MovieEntity;

import java.util.List;

public interface MovieService {

    List<MovieEntity> getAllMovies();

    MovieEntity findMovieByID(Long id);

    MovieEntity findMovieByName(String name);

    MovieEntity addMovie(MovieEntity movie);

    void deleteFilmByID(Long id);

}
