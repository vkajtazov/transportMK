package com.project.transportMK.web.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.transportMK.model.City;
import com.project.transportMK.service.CityService;

@RestController
@RequestMapping("/data/rest/cities")
public class CityResource extends CrudResource<City, CityService>{

	@Autowired
	private CityService cityService;
	
	@Override
	public CityService getService() {
		return cityService;
	}

}
