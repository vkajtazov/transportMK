package com.project.transportMK.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.transportMK.model.City;

public interface CityRepository extends JpaRepository<City, Long>{

	City findByCityLatitudeAndCityLongitude(double latitude, double longitude);
}
