package com.github.ajikisan.citiesapi.cities.services;

import com.github.ajikisan.citiesapi.cities.entities.City;
import com.github.ajikisan.citiesapi.cities.repositories.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;


@Service
public class DistanceService {

    private final CityRepository cityRepository;
    Logger log = LoggerFactory.getLogger(DistanceService.class);

    public DistanceService(final CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    /*
     Cálculo Point resultado em milhas - executado o código no terminal Ubuntu no banco de dados cities
     select ((select lat_lon from cidade where id = 4929) <@> (select lat_lon from cidade where id=5254)) as distance;
    */

    public Double distanceByPointsInMiles(final Long city1, final Long city2) {
        log.info("nativePostgresInMiles({}, {})", city1, city2);
        return cityRepository.distanceByPoints(city1, city2);
    }

    /*
     Cálculo Cube são resultados em metros - feito no terminal Ubuntu
          select earth_distance(
            ll_to_earth(-21.95840072631836,-47.98820114135742),
            ll_to_earth(-22.01740074157715,-47.88600158691406)) as distance;
    */

    public Double distanceByCubeInMeters(Long city1, Long city2) {
        log.info("distanceByCubeInMeters({}, {})", city1, city2);
        final List<City> cities = cityRepository.findAllById((Arrays.asList(city1, city2)));

        Point p1 = cities.get(0).getLocation();
        Point p2 = cities.get(1).getLocation();

        return cityRepository.distanceByCube(p1.getX(), p1.getY(), p2.getX(), p2.getY());

    }
}