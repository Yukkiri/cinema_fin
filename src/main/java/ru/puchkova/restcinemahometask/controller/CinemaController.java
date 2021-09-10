package ru.puchkova.restcinemahometask.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import ru.puchkova.restcinemahometask.controller.dto.CinemaDto;
//import ru.puchkova.restcinemahometask.controller.dto.CinemaScheduleDto;
import ru.puchkova.restcinemahometask.DTO.CinemaDetailedDto;
import ru.puchkova.restcinemahometask.DTO.CinemaDto;
import ru.puchkova.restcinemahometask.DTO.MovieDto;
import ru.puchkova.restcinemahometask.data.entity.CinemaEntity;
import ru.puchkova.restcinemahometask.data.repository.CinemaRepository;
import ru.puchkova.restcinemahometask.service.impl.CinemaServiceImpl;
import ru.puchkova.restcinemahometask.service.impl.MovieServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CinemaController {


    private final CinemaServiceImpl cinemaService;

    @Autowired
    public CinemaController(CinemaServiceImpl cinemaService) {
        this.cinemaService = cinemaService;
    }

    @Autowired
    private ModelMapper modelMapper;

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
