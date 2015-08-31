package com.project.transportMK.service;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;

import com.project.transportMK.model.Station;
import com.project.transportMK.model.VehicleType;

public interface StationService extends BaseEntityCrudService<Station> {

	List<Station> findAllArrivingStations(long id);

	List<Station> findAllArrivingStationsByType(long id, VehicleType type);

	List<Station> findAllStartingStationsByType(VehicleType type);

	void setStationsName();
	
	void setStationLocation() throws IOException, JSONException;
}
