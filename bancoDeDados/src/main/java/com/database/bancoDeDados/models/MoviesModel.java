package com.database.bancoDeDados.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TB_MOVIES")
@Getter
@Setter
public class MoviesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    private String name;
    private Integer durationInMinutes;
    private String genre;
    private String url;

}
