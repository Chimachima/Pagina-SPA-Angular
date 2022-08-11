package com.database.bancoDeDados.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TB_MOVIES")
@Data
public class MoviesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    private String name;
    private Integer durationInMinutes;
    private String genre;
    private String url;


    public MoviesModel(){}
    public MoviesModel(String name, Integer durationInMinutes, String genre, String url) {
        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.genre = genre;
        this.url = url;
    }
}
