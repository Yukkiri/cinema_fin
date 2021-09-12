package ru.puchkova.restcinemahometask.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.puchkova.restcinemahometask.data.entity.*;
import ru.puchkova.restcinemahometask.data.repository.CinemaRepository;
import ru.puchkova.restcinemahometask.data.repository.EventRepository;
import ru.puchkova.restcinemahometask.data.repository.HallRepository;
import ru.puchkova.restcinemahometask.data.repository.MovieRepository;
import ru.puchkova.restcinemahometask.service.impl.CinemaServiceImpl;
import ru.puchkova.restcinemahometask.service.impl.HallServiceImpl;
import ru.puchkova.restcinemahometask.service.impl.MovieServiceImpl;

import java.util.HashSet;
import java.util.Set;


@Configuration
public class DatabaseInit {

    private static final Logger log = LoggerFactory.getLogger(DatabaseInit.class);
    private static final int SMALL_HALL_SEATS = 10;
    private static final int SMALL_HALL_ROWS = 20;
    private static final int MEDIUM_HALL_SEATS = 15;
    private static final int MEDIUM_HALL_ROWS = 25;
    private static final int LARGE_HALL_SEATS = 25;
    private static final int LARGE_HALL_ROWS = 40;

    @Bean
    CommandLineRunner initMovies(MovieRepository repository) {

        return args -> {
            log.info("Insert " + repository.save(
                    new MovieEntity("The Lord of the Rings: The Fellowship of the Ring", "First movie", "2001", "New Zealand, USA")
            ));
            log.info("Insert " + repository.save(
                    new MovieEntity("The Lord of the Rings: The Two Towers", "Second movie", "2002", "New Zealand, USA")
            ));
            log.info("Insert " + repository.save(
                    new MovieEntity("The Lord of the Rings: The Return of the King", "Third movie", "2003", "New Zealand, USA")
            ));
        };
    }

    @Bean
    CommandLineRunner initCinemas(CinemaRepository repository) {

        return args -> {
            log.info("Insert " + repository.save(
                    new CinemaEntity("Film Forum", "209 W Houston St, New York City, NY 10014-4885", "+12127278110")
            ));
            log.info("Insert " + repository.save(
                    new CinemaEntity("The Ziegfeld", "141 W 54th St, New York City, NY 10019-5302", "+12127657600")
            ));
            log.info("Insert " + repository.save(
                    new CinemaEntity("The Lord of the Rings: The Return of the King", "Third movie", "2003")
            ));
        };
    }

    @Bean
    CommandLineRunner initHalls(HallRepository repository, CinemaServiceImpl cinemaService) {

        return args -> {
            log.info("Insert " + repository.save(
                    new HallEntity("blue", cinemaService.searchCinemaByID(4L), hallsRows(SMALL_HALL_ROWS, SMALL_HALL_SEATS))
            ));
            log.info("Insert " + repository.save(
                    new HallEntity("red", cinemaService.searchCinemaByID(4L), hallsRows(MEDIUM_HALL_ROWS, MEDIUM_HALL_SEATS))
            ));
            log.info("Insert " + repository.save(
                    new HallEntity("first", cinemaService.searchCinemaByID(5L), hallsRows(SMALL_HALL_ROWS, SMALL_HALL_SEATS))
            ));
            log.info("Insert " + repository.save(
                    new HallEntity("second", cinemaService.searchCinemaByID(5L), hallsRows(LARGE_HALL_ROWS, LARGE_HALL_SEATS))
            ));
        };
    }

    @Bean
    CommandLineRunner initEvents(EventRepository repository, MovieServiceImpl movieService, HallServiceImpl hallService) {

        return args -> {
            log.info("Insert " + repository.save(
                    new EventEntity("23.12.2021 10:30", movieService.findMovieByID(1L), hallService.searchHallByID(7L))
            ));
            log.info("Insert " + repository.save(
                    new EventEntity("23.12.2021 21:00", movieService.findMovieByID(2L), hallService.searchHallByID(8L))
            ));
            log.info("Insert " + repository.save(
                    new EventEntity("23.12.2021 15:10", movieService.findMovieByID(3L), hallService.searchHallByID(9L))
            ));
            log.info("Insert " + repository.save(
                    new EventEntity("23.12.2021 18:15", movieService.findMovieByID(1L), hallService.searchHallByID(10L))
            ));
        };
    }

    private Set<RowEntity> hallsRows(int rows, int seats) {
        Set<RowEntity> rowSet = new HashSet<>();
        for (int i = 1; i < rows + 1; i++) {
            RowEntity rowEntity = new RowEntity(i, seats);
            rowSet.add(rowEntity);
        }
        return rowSet;
    }
}
