package ru.puchkova.restcinemahometask.service;

import ru.puchkova.restcinemahometask.DTO.HallDto;
import ru.puchkova.restcinemahometask.data.entity.HallEntity;

import java.util.Set;

public interface HallService {

    Set<HallDto> getAllHall();

    HallDto findHallByID(Long id);

    void deleteHallByID(Long id);

    HallEntity addHall(HallEntity hall);

}
