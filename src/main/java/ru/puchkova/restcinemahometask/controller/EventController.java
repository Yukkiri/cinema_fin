package ru.puchkova.restcinemahometask.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.puchkova.restcinemahometask.DTO.CinemaDetailedDto;
import ru.puchkova.restcinemahometask.DTO.CinemaDto;
import ru.puchkova.restcinemahometask.DTO.EventDto;
import ru.puchkova.restcinemahometask.service.impl.CinemaServiceImpl;
import ru.puchkova.restcinemahometask.service.impl.EventServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

public class EventController {

    private final EventServiceImpl eventService;

    @Autowired
    public EventController(EventServiceImpl eventService) {
        this.eventService = eventService;
    }

    @Autowired
    private ModelMapper modelMapper;

//    @RequestMapping(value = "/events/", method = RequestMethod.GET)
//    List<EventDto> all() {
//        var cinemas = cinemaService.getAllCinemas();
//        return cinemas.stream().map(cinemaEntity -> modelMapper.map(cinemaEntity, CinemaDto.class)
//        ).collect(Collectors.toList());
//    }
//
////    @RequestMapping(value = "/cinemas/{id}", method = RequestMethod.GET)
////    public CinemaEntity searchMovie(@PathVariable Long id) {
////        return cinemaService.findCinemaByID(id);
////    }
//
//    @RequestMapping(value = "/cinemas/{id}", method = RequestMethod.GET)
//    public CinemaDetailedDto searchMovie(@PathVariable Long id) {
//        var cinemaEntity = cinemaService.findCinemaByID(id);
//        return modelMapper.map(cinemaEntity, CinemaDetailedDto.class);
//    }
}
