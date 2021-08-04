package ru.puchkova.restcinemahometask.service;

import ru.puchkova.restcinemahometask.DTO.CinemaDetailedDto;
import ru.puchkova.restcinemahometask.data.entity.CinemaEntity;

import java.util.List;

public interface CinemaService {

    List<CinemaEntity> getAllCinemas();

    CinemaDetailedDto findCinemaByID(Long id);

    void addCinema(CinemaEntity cinema);

    void deleteCinemaByID(Long id);

}
