package ru.puchkova.restcinemahometask.data.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Objects;
import java.util.Set;

@Entity
public class HallEntity extends BaseEntity{

    private String name;


    public HallEntity() {
        super();
    }

    public HallEntity(String name, CinemaEntity cinema, Set<RowEntity> rows) {
        super();
        this.name = name;
        this.cinema = cinema;
        this.rows = rows;
    }

    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private CinemaEntity cinema;

    @JsonProperty("rows")
    @OneToMany(mappedBy = "hall")
    private Set<RowEntity> rows;

    @JsonProperty("events")
    @OneToMany(mappedBy = "hall")
    private Set<EventEntity> events;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CinemaEntity getCinema() {
        return cinema;
    }

    public void setCinema(CinemaEntity cinema) {
        this.cinema = cinema;
    }

    public Set<RowEntity> getRows() {
        return rows;
    }

    public void setRows(Set<RowEntity> rows) {
        this.rows = rows;
    }

    public Set<EventEntity> getEvents() {
        return events;
    }

    public void setEvents(Set<EventEntity> events) {
        this.events = events;
    }

}
