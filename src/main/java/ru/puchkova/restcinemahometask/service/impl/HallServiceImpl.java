package ru.puchkova.restcinemahometask.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ru.puchkova.restcinemahometask.DTO.HallDto;
import ru.puchkova.restcinemahometask.controller.exceptions.MovieNotFoundException;
import ru.puchkova.restcinemahometask.data.entity.HallEntity;
import ru.puchkova.restcinemahometask.data.repository.HallRepository;
import ru.puchkova.restcinemahometask.service.HallService;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HallServiceImpl implements HallService {

    private final HallRepository hallRepository;

    @Autowired
    public HallServiceImpl(HallRepository hallRepository){
        this.hallRepository = hallRepository;
    }

    public List<HallEntity> getAllHall() {
        return null;
    }

    public Set<HallDto> findHallByID(Set<HallEntity> hallEntitySet) {
        Set<HallDto> hallDtoSet = new HashSet<>();
        Iterator iter = hallEntitySet.iterator();
        while (iter.hasNext()) {
            HallEntity hallEntity = (HallEntity) iter.next();
            HallDto hallDto = new HallDto(hallEntity.getId(), hallEntity.getName());
            hallDtoSet.add(hallDto);
        }
        return hallDtoSet;
    }

    public void deleteHallByID(Long id) {

    }

    public HallEntity addHall(HallEntity hall) {
        return null;
    }
}
