package com.cursoreact.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoreact.dsmovie.entities.Score;
import com.cursoreact.dsmovie.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {

}
