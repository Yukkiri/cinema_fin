package ru.puchkova.restcinemahometask.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class MovieEntity extends BaseEntity {

    private String name;
    private String description;
    private String releaseYear;
    private String country;

    public MovieEntity() {
        super();
    }

    public MovieEntity(String name, String description, String releaseYear, String country) {
        super();
        this.name = name;
        this.description = description;
        this.releaseYear = releaseYear;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
