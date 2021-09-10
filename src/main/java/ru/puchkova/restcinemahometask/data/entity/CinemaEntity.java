package ru.puchkova.restcinemahometask.data.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Objects;
import java.util.Set;


@Entity
public class CinemaEntity extends BaseEntity {

    private String name;
    private String address;
    private String phone;
    @OneToMany(mappedBy = "cinema")
    private Set<HallEntity> halls;

    public CinemaEntity() {
        super();
    }

    public CinemaEntity(String name, String address, String phone) {
        super();
        this.name = name;
        this.address = address;
        this.phone = phone;
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

    public Set<HallEntity> getHalls() {
        return halls;
    }

    public void setHalls(Set<HallEntity> halls) {
        this.halls = halls;
    }

}
