package com.project.transportMK.service;

import com.project.transportMK.model.City;

public interface CityService extends BaseEntityCrudService<City>{

	City findByLatitudeAndLongitude(double latitude, double longitude);
}
