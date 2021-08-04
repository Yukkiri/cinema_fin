package ru.puchkova.restcinemahometask.DTO;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import ru.puchkova.restcinemahometask.data.entity.HallEntity;

import java.util.Objects;

public class HallDto {

    @Autowired
    private ModelMapper modelMapper;

    @JsonProperty("id")
    private long id;
    @JsonProperty("name")
    private String name;

    public HallDto(){}

    public HallDto(long id, String name) {
        this.id = id;
        this.name = name;
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
                '}';
    }
}
