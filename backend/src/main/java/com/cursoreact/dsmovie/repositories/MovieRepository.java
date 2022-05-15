package com.cursoreact.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoreact.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
