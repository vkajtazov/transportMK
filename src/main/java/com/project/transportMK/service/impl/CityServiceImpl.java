package com.project.transportMK.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.transportMK.model.City;
import com.project.transportMK.repository.CityRepository;
import com.project.transportMK.service.CityService;

@Service
public class CityServiceImpl extends
		SimpleBaseEntityCrudServiceImpl<City, CityRepository> implements
		CityService {

	@Autowired
	private CityRepository repository;
	
	@Override
	public City findByLatitudeAndLongitude(double latitude, double longitude) {
		return repository.findByCityLatitudeAndCityLongitude(latitude, longitude);
	}

	@Override
	protected CityRepository getRepository() {
		return repository;
	}

}
