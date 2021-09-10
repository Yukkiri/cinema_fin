package ru.puchkova.restcinemahometask.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.puchkova.restcinemahometask.DTO.CinemaEventsDto;
import ru.puchkova.restcinemahometask.DTO.HallDto;
import ru.puchkova.restcinemahometask.controller.exceptions.MovieNotFoundException;
import ru.puchkova.restcinemahometask.data.entity.HallEntity;
import ru.puchkova.restcinemahometask.data.repository.HallRepository;
import ru.puchkova.restcinemahometask.service.HallService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class HallServiceImpl implements HallService {

    private final HallRepository hallRepository;

    @Autowired
    private EventServiceImpl eventService;

    @Autowired
    public HallServiceImpl(HallRepository hallRepository){
        this.hallRepository = hallRepository;
    }


    public Set<HallDto> getAllHall() {
        return null;
    }

    public Set<HallDto> findHalls(Set<HallEntity> hallEntitySet) {
        Set<HallDto> hallDtoSet = new HashSet();
        for (HallEntity hallEntity : hallEntitySet) {
            HallDto hallDto = new HallDto(hallEntity.getId(), hallEntity.getName(), eventService.getCinemaEvents(hallEntity));
            hallDtoSet.add(hallDto);
        }
        return hallDtoSet;
    }

    public HallEntity searchHallByID(Long id){
        return hallRepository.findById(id)
                .orElseThrow(() -> new MovieNotFoundException(id));
    }

    public HallDto findHallByID(Long id) {
        HallEntity hallEntity = searchHallByID(id);
        HallDto hallDto = new HallDto(hallEntity.getId(), hallEntity.getName(), eventService.getCinemaEvents(hallEntity));
        return hallDto;
    }

    public void deleteHallByID(Long id) {

    }

    public HallEntity addHall(HallEntity hall) {
        return null;
    }
}
