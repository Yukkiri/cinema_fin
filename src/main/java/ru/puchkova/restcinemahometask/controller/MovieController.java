package ru.puchkova.restcinemahometask.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
//
//    @Autowired
//    private MovieRepository repository;

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

//    @GetMapping("/movies")
//    List<MovieDto> all() {
//        var movies = repository.findAll();
//
//        return movies.stream().map(movieEntity ->
//                modelMapper.map(movieEntity, MovieDto.class)
//        ).collect(Collectors.toList());
//    }
//
//    @GetMapping("/movies/{id}")
//    MovieDetailsDto one(@PathVariable Long id) {
//        var movieEntity = repository.findById(id)
//                .orElseThrow(() -> new MovieNotFoundException(id));
//        return modelMapper.map(movieEntity, MovieDetailsDto.class);
//    }
//
//    @GetMapping("/movies/{id}/cinemas")
//    List<CinemaDto> cinemas(@PathVariable Long id) {
//        throw new UnsupportedOperationException("Not implemented yet");
//    }
}
