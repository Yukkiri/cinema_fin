package ru.puchkova.restcinemahometask.data.entity;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
class Seat {
    private int seat;

    @ManyToOne
    @JoinColumn(name = "row_id")
    private RowEntity row;



    public RowEntity getRow() {
        return row;
    }

    public void setRow(RowEntity row) {
        this.row = row;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}
