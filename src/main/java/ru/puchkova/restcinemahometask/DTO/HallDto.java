package ru.puchkova.restcinemahometask.DTO;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import ru.puchkova.restcinemahometask.data.entity.EventEntity;
import ru.puchkova.restcinemahometask.data.entity.HallEntity;

import java.util.Objects;
import java.util.Set;

public class HallDto {

    @Autowired
    private ModelMapper modelMapper;

    @JsonProperty("id")
    private long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("events")
    private Set<EventEntity> events;

    public HallDto(){}

    public HallDto(long id, String name, Set<EventEntity> eventDto) {
        this.id = id;
        this.name = name;
        this.events = eventDto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<EventEntity> getEvents() {
        return events;
    }

    public void setEvents(Set<EventEntity> events) {
        this.events = events;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HallDto hallDto = (HallDto) o;
        return id == hallDto.id && Objects.equals(name, hallDto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "HallDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", events='" + events + '\'' +
                '}';
    }
}
