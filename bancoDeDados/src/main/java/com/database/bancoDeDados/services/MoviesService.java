package com.database.bancoDeDados.services;

import com.database.bancoDeDados.models.MoviesModel;
import com.database.bancoDeDados.repositories.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoviesService {

    @Autowired
    MoviesRepository moviesRepository;

    public MoviesModel save(MoviesModel moviesModel){
        return moviesRepository.save(moviesModel);
    }

    public Optional<MoviesModel> findByID (Integer ID){
        return moviesRepository.findById(ID);
    }

    public List<MoviesModel> findAll(){
        return  moviesRepository.findAll();
    }

    public void delete(MoviesModel moviesModel){moviesRepository.delete(moviesModel);}

    public void atualizar(Integer id, MoviesModel moviesModel){
        if(moviesRepository.findById(id).isPresent()){
            moviesRepository.save(moviesModel);
        }
    }



}
