package com.database.bancoDeDados.services;

import com.database.bancoDeDados.models.MoviesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class InitialMoviesService implements CommandLineRunner {

    @Autowired
    MoviesService moviesService;

    MoviesModel moviesModel = new MoviesModel();
    MoviesModel moviesModel2 = new MoviesModel();

    @Override
    public void run(String... args) throws Exception {
        moviesModel.setID(1);
        moviesModel.setGenre("Ação");
        moviesModel.setName("Top Gun: Maverick");
        moviesModel.setDurationInMinutes(130);
        moviesModel.setUrl("https://upload.wikimedia.org/wikipedia/pt/d/d2/Top_Gun_Maverick.jpg");

        moviesModel2.setID(2);
        moviesModel2.setGenre("Aventura");
        moviesModel2.setName("Doutor Estranho no Multiverso da Loucura");
        moviesModel2.setDurationInMinutes(126);
        moviesModel2.setUrl("https://upload.wikimedia.org/wikipedia/pt/0/08/Doctor_Strange_in_the_Multiverse_of_Madness_poster.jpeg");

        moviesService.save(moviesModel);
        moviesService.save(moviesModel2);

    }
}
