package ru.puchkova.restcinemahometask.data.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class RowEntity extends BaseEntity{

    private int row;
    private int seats;

    public RowEntity() {
    }

    public RowEntity(int row, int seats) {
        this.row = row;
        this.seats = seats;
    }

    @ManyToOne
    @JoinColumn(name = "hall_id")
    private HallEntity hall;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public HallEntity getHall() {
        return hall;
    }

    public void setHall(HallEntity hall) {
        this.hall = hall;
    }
}
