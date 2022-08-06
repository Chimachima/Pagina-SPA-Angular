package com.database.bancoDeDados.controllers;

import com.database.bancoDeDados.models.MoviesModel;
import com.database.bancoDeDados.services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(maxAge = 3600)
public class MoviesController {
    @Autowired
    MoviesService moviesService;

    @GetMapping("/")
    ResponseEntity<List<MoviesModel>> getMovies(){
        return ResponseEntity.status(HttpStatus.OK).body(moviesService.findAll());
    }

    @PostMapping("/")
    ResponseEntity<MoviesModel> postMovie(@RequestBody MoviesModel moviesModel){
        return ResponseEntity.status(HttpStatus.OK).body(moviesService.save(moviesModel));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Object> deleteMovie(@PathVariable(value = "id") Integer id){
        Optional<MoviesModel> moviesModelOptional = moviesService.findByID(id);
        if(moviesModelOptional.isPresent()){
            moviesService.delete(moviesModelOptional.get());
            return ResponseEntity.ok("Deleted Successfuly");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found");
    }

    @PutMapping("/{id}")
    void inserir(@PathVariable("id") Integer id, @RequestBody MoviesModel moviesModel){
        moviesService.atualizar(id, moviesModel);
    }

}
