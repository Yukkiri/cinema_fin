package ru.puchkova.restcinemahometask.data.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;


@Entity
public class CinemaEntity extends BaseEntity {

    private String name;
    private String address;
    private String phone;

    public CinemaEntity() {
        super();
    }

    public CinemaEntity(String name, String address, String phone) {
        super();
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @OneToMany(mappedBy = "cinema")
    private Set<HallEntity> halls;

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

    public Set<HallEntity> getHalls() {
        return halls;
    }

    public void setHalls(Set<HallEntity> halls) {
        this.halls = halls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CinemaEntity that = (CinemaEntity) o;
        return name.equals(that.name) && address.equals(that.address) && phone.equals(that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, phone);
    }

    @Override
    public String toString() {
        StringBuilder cinemaInfo = new StringBuilder("CinemaEntity{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' );

        return cinemaInfo.toString();
    }
}
