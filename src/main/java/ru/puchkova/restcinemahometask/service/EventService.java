package ru.puchkova.restcinemahometask.service;

import ru.puchkova.restcinemahometask.DTO.EventDto;
import ru.puchkova.restcinemahometask.data.entity.EventEntity;

import java.util.List;

public interface EventService {

    List<EventEntity> getAllEvents();

    EventEntity findEventById(Long id);

    EventEntity addEvent(EventEntity event);

    void deleteEventById(Long id);

}
