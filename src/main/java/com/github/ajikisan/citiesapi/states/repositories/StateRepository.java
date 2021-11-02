package com.github.ajikisan.citiesapi.states.repositories;

import com.github.ajikisan.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}

