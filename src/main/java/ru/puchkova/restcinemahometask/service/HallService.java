package ru.puchkova.restcinemahometask.service;

import ru.puchkova.restcinemahometask.DTO.HallDto;
import ru.puchkova.restcinemahometask.data.entity.HallEntity;

import java.util.List;
import java.util.Set;

public interface HallService {

    List<HallEntity> getAllHall();

    Set<HallDto> findHallByID(Set<HallEntity> hallEntitySet);

    void deleteHallByID(Long id);

    HallEntity addHall(HallEntity hall);

}
