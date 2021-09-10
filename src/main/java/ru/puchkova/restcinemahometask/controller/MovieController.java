package ru.puchkova.restcinemahometask.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.puchkova.restcinemahometask.DTO.MovieDto;
import ru.puchkova.restcinemahometask.service.impl.MovieServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MovieController {

    private final MovieServiceImpl movieService;

    @Autowired
    public MovieController(MovieServiceImpl movieService) {
        this.movieService = movieService;
    }

    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public List<MovieDto> all() {
        var movies = movieService.getAllMovies();
        return movies.stream().map(movieEntity -> modelMapper.map(movieEntity, MovieDto.class)
        ).collect(Collectors.toList());
    }

    @RequestMapping(value = "/movies/{id}", method = RequestMethod.GET)
    public MovieDto searchMovie(@PathVariable Long id) {
        var movieEntity = movieService.findMovieByID(id);
        return modelMapper.map(movieEntity, MovieDto.class);
    }
}
