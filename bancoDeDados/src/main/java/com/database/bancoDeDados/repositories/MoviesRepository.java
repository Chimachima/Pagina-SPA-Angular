package com.database.bancoDeDados.repositories;

import com.database.bancoDeDados.models.MoviesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends JpaRepository<MoviesModel, Integer> {
}
