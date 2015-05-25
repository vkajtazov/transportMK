package com.project.transportMK.web.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.transportMK.model.Station;
import com.project.transportMK.service.StationService;

@RestController
@RequestMapping("/data/rest/stations")
public class StationResource extends CrudResource<Station, StationService>{

	@Autowired
	private StationService stationService;
	
	@Override
	public StationService getService() {
		return stationService;
	}
}
