package ru.puchkova.restcinemahometask.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.puchkova.restcinemahometask.data.entity.HallEntity;
import ru.puchkova.restcinemahometask.data.entity.MovieEntity;

import java.util.Objects;
import java.util.Set;

public class EventDto {

    @JsonProperty("date")
    private String time;
    @JsonProperty("movie")
    private MovieDto movie;
    @JsonProperty("cinema")
    private CinemaDto cinema;

    public EventDto(String time, MovieEntity movie, HallEntity hall) {
        this.time = time;
        this.movie = new MovieDto(movie.getId(), movie.getName(), movie.getDescription(), movie.getReleaseYear(), movie.getCountry());
        this.cinema = new CinemaDto(hall.getCinema().getId(), hall.getCinema().getName(), hall.getCinema().getAddress(), hall.getCinema().getPhone());
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public MovieDto getMovie() {
        return movie;
    }

    public void setMovie(MovieDto movie) {
        this.movie = movie;
    }

    public CinemaDto getCinema() {
        return cinema;
    }

    public void setCinema(CinemaDto cinema) {
        this.cinema = cinema;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EventDto)) return false;
        EventDto eventDto = (EventDto) o;
        return getTime().equals(eventDto.getTime()) && getMovie().equals(eventDto.getMovie()) && getCinema().equals(eventDto.getCinema());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTime(), getMovie(), getCinema());
    }

    @Override
    public String toString() {
        return "EventDto{" +
                "time='" + time + '\'' +
                ", movie=" + movie +
                ", cinema=" + cinema +
                '}';
    }
}
