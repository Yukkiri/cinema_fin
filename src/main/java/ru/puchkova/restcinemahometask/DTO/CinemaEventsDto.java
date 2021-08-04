package ru.puchkova.restcinemahometask.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Set;

public class CinemaEventsDto {
    @JsonProperty("id")
    private long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private String address;
    @JsonProperty("phone")
    private String phone;

    @JsonProperty("events")
    private Set<EventDto> events;

    public CinemaEventsDto() {
    }

    public CinemaEventsDto(long id, String name, String address, String phone, Set<EventDto> events) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.events = events;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<EventDto> getEvents() {
        return events;
    }

    public void setEvents(Set<EventDto> events) {
        this.events = events;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CinemaEventsDto that = (CinemaEventsDto) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(phone, that.phone) && Objects.equals(events, that.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, phone, events);
    }

    @Override
    public String toString() {
        return "CinemaEventsDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", events='" +  '\'' +
                '}';
    }
}
