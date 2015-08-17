package com.project.transportMK.service;

import java.util.List;

import com.project.transportMK.model.Station;
import com.project.transportMK.model.VehicleType;

public interface StationService extends BaseEntityCrudService<Station> {

	List<Station> findAllArrivingStations(long id);

	List<Station> findAllArrivingStationsByType(long id, VehicleType type);

	List<Station> findAllStartingStationsByType(VehicleType type);
}
