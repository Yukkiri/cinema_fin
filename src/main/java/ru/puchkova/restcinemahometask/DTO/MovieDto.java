package ru.puchkova.restcinemahometask.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class MovieDto {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("releaseYear")
    private String releaseYear;
    @JsonProperty("country")
    private String country;

    public MovieDto() {
    }

    public MovieDto(Long id, String name, String description, String releaseYear, String country) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.releaseYear = releaseYear;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieDto movieDto = (MovieDto) o;
        return Objects.equals(id, movieDto.id) &&
                Objects.equals(name, movieDto.name) &&
                Objects.equals(description, movieDto.description) &&
                Objects.equals(releaseYear, movieDto.releaseYear) &&
                Objects.equals(country, movieDto.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, releaseYear, country);
    }

    @Override
    public String toString() {
        return "MovieDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                ", country='" + country + '\'' +
                '}';
    }


}
