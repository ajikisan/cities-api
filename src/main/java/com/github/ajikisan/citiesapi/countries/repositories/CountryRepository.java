package com.github.ajikisan.citiesapi.countries.repositories;

/*Ela representa uma interface do país e esta vai extender o spring data JPA repository com dois tipos de objetos*/

import com.github.ajikisan.citiesapi.countries.entities.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
    Page<Country> findAll(Pageable page);

}
