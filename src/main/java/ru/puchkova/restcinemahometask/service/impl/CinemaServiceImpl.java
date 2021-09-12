package ru.puchkova.restcinemahometask.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.puchkova.restcinemahometask.DTO.CinemaDetailedDto;
import ru.puchkova.restcinemahometask.DTO.CinemaDto;
import ru.puchkova.restcinemahometask.DTO.HallDto;
import ru.puchkova.restcinemahometask.controller.exceptions.MovieNotFoundException;
import ru.puchkova.restcinemahometask.data.entity.CinemaEntity;
import ru.puchkova.restcinemahometask.data.repository.CinemaRepository;
import ru.puchkova.restcinemahometask.service.CinemaService;

import java.util.List;
import java.util.Set;

@Service
public class CinemaServiceImpl implements CinemaService {

    private final CinemaRepository cinemaRepository;

    @Autowired
    private HallServiceImpl hallService;


    @Autowired
    public CinemaServiceImpl(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }


    public List<CinemaEntity> getAllCinemas() {
        List<CinemaEntity> cinemas = cinemaRepository.findAll();
        return cinemas;
    }

    public CinemaDetailedDto findCinemaByID(Long id) {
        CinemaEntity cinemaEntity = cinemaRepository.findById(id)
                .orElseThrow(() -> new MovieNotFoundException(id));
        Set<HallDto> halls = hallService.findHalls(cinemaEntity.getHalls());
        CinemaDetailedDto cinemaDetailed = new CinemaDetailedDto(cinemaEntity.getId(), cinemaEntity.getName(), cinemaEntity.getAddress(),
                cinemaEntity.getPhone(), halls);
        return cinemaDetailed;
    }

    public CinemaEntity searchCinemaByID(Long id) {
        return cinemaRepository.findById(id)
                .orElseThrow(() -> new MovieNotFoundException(id));
    }

    public void addCinema(CinemaEntity cinema) {

    }

    public void deleteCinemaByID(Long id) {
        cinemaRepository.deleteById(id);
    }

    public CinemaDto cinemaEntityToDto(CinemaEntity cinemaEntity) {
        return new CinemaDto(cinemaEntity.getId(), cinemaEntity.getName(), cinemaEntity.getAddress(), cinemaEntity.getPhone());
    }
}
