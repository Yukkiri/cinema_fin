package ru.puchkova.restcinemahometask.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Set;

public class CinemaDetailedDto {

    @JsonProperty("id")
    private long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private String address;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("halls")
    private Set<HallDto> halls;

    public CinemaDetailedDto() {
    }

    public CinemaDetailedDto(long id, String name, String address, String phone, Set<HallDto> halls) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.halls = halls;
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

    public Set<HallDto> getHalls() {
        return halls;
    }

    public void setHalls(Set<HallDto> halls) {
        this.halls = halls;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CinemaDetailedDto that = (CinemaDetailedDto) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(phone, that.phone) && Objects.equals(halls, that.halls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, phone, halls);
    }

    @Override
    public String toString() {
        return "CinemaDetailedDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", halls='" + '\'' +
                '}';
    }
}
