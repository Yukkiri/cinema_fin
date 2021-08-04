package ru.puchkova.restcinemahometask.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.puchkova.restcinemahometask.controller.exceptions.MovieNotFoundException;
import ru.puchkova.restcinemahometask.data.entity.MovieEntity;
import ru.puchkova.restcinemahometask.data.repository.CinemaRepository;
import ru.puchkova.restcinemahometask.data.repository.MovieRepository;
import ru.puchkova.restcinemahometask.service.MovieService;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieEntity> getAllMovies() {
        return movieRepository.findAll();
    }

    public MovieEntity findMovieByID(Long id) {
        return movieRepository.findById(id)
                .orElseThrow(() -> new MovieNotFoundException(id));
    }

    public MovieEntity findMovieByName(String name) {
        return null;
    }

    public MovieEntity addMovie(MovieEntity movie) {
        return null;
    }

    public void deleteFilmByID(Long id) {
        movieRepository.deleteById(id);
    }
}
