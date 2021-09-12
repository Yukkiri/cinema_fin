package ru.puchkova.restcinemahometask.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.puchkova.restcinemahometask.DTO.CinemaDetailedDto;
import ru.puchkova.restcinemahometask.DTO.CinemaDto;
import ru.puchkova.restcinemahometask.service.impl.CinemaServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CinemaController {


    private final CinemaServiceImpl cinemaService;
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    public CinemaController(CinemaServiceImpl cinemaService) {
        this.cinemaService = cinemaService;
    }

    @RequestMapping(value = "/cinemas", method = RequestMethod.GET)
    List<CinemaDto> all() {
        var cinemas = cinemaService.getAllCinemas();
        return cinemas.stream().map(cinemaEntity -> modelMapper.map(cinemaEntity, CinemaDto.class)
        ).collect(Collectors.toList());
    }

    @RequestMapping(value = "/cinemas/{id}", method = RequestMethod.GET)
    public CinemaDetailedDto searchCinema(@PathVariable Long id) {
        var cinemaEntity = cinemaService.findCinemaByID(id);
        return modelMapper.map(cinemaEntity, CinemaDetailedDto.class);
    }
}
