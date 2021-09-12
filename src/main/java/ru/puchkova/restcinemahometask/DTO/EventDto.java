package ru.puchkova.restcinemahometask.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import ru.puchkova.restcinemahometask.data.entity.HallEntity;
import ru.puchkova.restcinemahometask.data.entity.MovieEntity;

import java.util.Objects;

public class EventDto {

    @Autowired
    private ModelMapper modelMapper;

    @JsonProperty("date")
    private String time;
    @JsonProperty("movie")
    private MovieDto movie;
    @JsonProperty("hall")
    private HallEntity hall;

    public EventDto() {
        super();
    }

    public EventDto(String time, MovieEntity movie, HallEntity hall) {
        super();
        this.time = time;
        this.movie = new MovieDto(movie.getId(), movie.getName(), movie.getDescription(), movie.getReleaseYear(), movie.getCountry());
        this.hall = hall;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EventDto)) return false;
        EventDto eventDto = (EventDto) o;
        return getTime().equals(eventDto.getTime()) && getMovie().equals(eventDto.getMovie()) && hall.equals(eventDto.hall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTime(), getMovie(), hall);
    }

    @Override
    public String toString() {
        return "EventDto{" +
                "time='" + time + '\'' +
                ", movie=" + movie +
                ", hall=" + hall +
                '}';
    }
}
