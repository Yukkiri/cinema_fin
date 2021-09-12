package ru.puchkova.restcinemahometask.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.puchkova.restcinemahometask.DTO.CinemaEventsDto;
import ru.puchkova.restcinemahometask.data.entity.EventEntity;
import ru.puchkova.restcinemahometask.data.entity.HallEntity;
import ru.puchkova.restcinemahometask.data.repository.EventRepository;
import ru.puchkova.restcinemahometask.service.EventService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<EventEntity> getAllEvents() {
        return eventRepository.findAll();
    }


    public EventEntity findEventById(Long id) {
        return null;
    }

    @Override
    public EventEntity addEvent(EventEntity event) {
        return null;
    }

    public Set<CinemaEventsDto> getCinemaEvents(HallEntity hallEntity) {
        Set<EventEntity> setEntity = hallEntity.getEvents();
        Set<CinemaEventsDto> eventSet = new HashSet<>();
        for (EventEntity eventEntity : setEntity) {
            CinemaEventsDto cinemaEventsDto = new CinemaEventsDto(eventEntity.getMovie().getName(), eventEntity.getTime());
            eventSet.add(cinemaEventsDto);
        }
        return eventSet;
    }

    public void deleteEventById(Long id) {

    }
}
