package ru.puchkova.restcinemahometask.data.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class EventEntity extends BaseEntity {

    private String time;
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private MovieEntity movie;
    @ManyToOne
    @JoinColumn(name = "hall_id")
    private HallEntity hall;
    @OneToMany(mappedBy = "event")
    private Set<OrderEntity> orders;

    public EventEntity() {
        super();
    }

    public EventEntity(String time, MovieEntity movie, HallEntity hall) {
        super();
        this.time = time;
        this.movie = movie;
        this.hall = hall;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public MovieEntity getMovie() {
        return movie;
    }

    public void setMovie(MovieEntity movie) {
        this.movie = movie;
    }

    public HallEntity getHall() {
        return hall;
    }

    public void setHall(HallEntity hall) {
        this.hall = hall;
    }

    public Set<OrderEntity> getOrders() {
        return orders;
    }

    public void setOrders(Set<OrderEntity> orders) {
        this.orders = orders;
    }
}
