package ru.puchkova.restcinemahometask.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Set;

public class CinemaEventsDto {
    @JsonProperty("movie")
    private String movie;
    @JsonProperty("time")
    private String time;

    public CinemaEventsDto() {
    }

    public CinemaEventsDto(String movie, String time) {
        this.movie = movie;
        this.time = time;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "CinemaEventsDto{" +
                "movie='" + movie + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
