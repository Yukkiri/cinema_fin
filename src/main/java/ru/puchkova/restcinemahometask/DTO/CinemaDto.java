package ru.puchkova.restcinemahometask.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class CinemaDto {

    @JsonProperty("id")
    private long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private String address;
    @JsonProperty("phone")
    private String phone;

    public CinemaDto(){}

    public CinemaDto(long id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CinemaDto cinemaDto = (CinemaDto) o;
        return id == cinemaDto.id && Objects.equals(name, cinemaDto.name) && Objects.equals(address, cinemaDto.address) && Objects.equals(phone, cinemaDto.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, phone);
    }

    @Override
    public String toString() {
        return "CinemaDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
