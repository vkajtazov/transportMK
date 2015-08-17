package com.project.transportMK.web.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.transportMK.model.Station;
import com.project.transportMK.model.VehicleType;
import com.project.transportMK.service.StationService;

@RestController
@RequestMapping("/data/rest/stations")
public class StationResource extends CrudResource<Station, StationService> {

	@Autowired
	private StationService stationService;

	@Override
	public StationService getService() {
		return stationService;
	}

	@RequestMapping(value = "/arriving/{id}", method = RequestMethod.GET)
	public List<Station> findAllArrivingStations(@PathVariable Long id) {
		return stationService.findAllArrivingStations(id);
	}

	@RequestMapping(value = "/arriving/{id}/{type}", method = RequestMethod.GET)
	public List<Station> findAllArrivingStationsByType(@PathVariable Long id,
			@PathVariable VehicleType type) {
		return stationService.findAllArrivingStationsByType(id, type);
	}

	@RequestMapping(value = "/starting/{type}", method = RequestMethod.GET)
	public List<Station> findAllStartingStationsByType(
			@PathVariable VehicleType type) {
		return stationService.findAllStartingStationsByType(type);
	}

}
