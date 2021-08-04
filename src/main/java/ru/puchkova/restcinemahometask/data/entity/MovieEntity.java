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

    //    @Id
//    @GeneratedValue
//    private Long id;
//    private String name;
//    private String description;
//    private String releaseYear;
//
//    public MovieEntity() { }
//
//    public MovieEntity(String name, String releaseYear, String description) {
//        this.name = name;
//        this.releaseYear = releaseYear;
//        this.description = description;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getReleaseYear() {
//        return releaseYear;
//    }
//
//    public void setReleaseYear(String releaseYear) {
//        this.releaseYear = releaseYear;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        MovieEntity movieEntity = (MovieEntity) o;
//        return id.equals(movieEntity.id) &&
//                name.equals(movieEntity.name) &&
//                description.equals(movieEntity.description) &&
//                releaseYear.equals(movieEntity.releaseYear);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, description, releaseYear);
//    }
//
//    @Override
//    public String toString() {
//        return "Movie{" +
//                "name='" + name + '\'' +
//                ", releaseYear='" + releaseYear + '\'' +
//                ", description ='" + description + '\'' +
//                '}';
//    }
}
