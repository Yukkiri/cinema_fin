package ru.puchkova.restcinemahometask.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class EventDto {

    @JsonProperty("date")
    private LocalDateTime date;
    @JsonProperty("movie")
    private MovieDto movie;
    @JsonProperty("hall")
    private HallDto hall;


    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public MovieDto getMovie() {
        return movie;
    }

    public void setMovie(MovieDto movie) {
        this.movie = movie;
    }

    public HallDto getHall() {
        return hall;
    }

    public void setHall(HallDto hall) {
        this.hall = hall;
    }
}
