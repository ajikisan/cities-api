package com.github.ajikisan.citiesapi.cities.resources;


import com.github.ajikisan.citiesapi.cities.entities.City;
import com.github.ajikisan.citiesapi.cities.repositories.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cities")
public class CityResource {

    private final CityRepository repository;

    public CityResource(final CityRepository repository) {
        this.repository = repository;
    }

    @GetMapping     //Pageable
    public Page<City> cities(final Pageable page) {
        return repository.findAll(page);
    }
/*
   @GetMapping
   public List<City> cities() {
        return repository.findAll();
  }
*/

}
