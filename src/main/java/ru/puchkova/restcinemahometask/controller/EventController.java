package ru.puchkova.restcinemahometask.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.puchkova.restcinemahometask.DTO.EventDto;
import ru.puchkova.restcinemahometask.service.impl.EventServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EventController {

    private final EventServiceImpl eventService;

    @Autowired
    public EventController(EventServiceImpl eventService) {
        this.eventService = eventService;
    }

    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping(value = "/events", method = RequestMethod.GET)
    public List<EventDto> all() {
        var events = eventService.getAllEvents();
        return events.stream().map(eventEntity -> modelMapper.map(eventEntity, EventDto.class)
        ).collect(Collectors.toList());
    }
}
