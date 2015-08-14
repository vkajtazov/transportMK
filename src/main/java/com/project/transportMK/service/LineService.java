package com.project.transportMK.service;

import com.project.transportMK.model.Line;
import com.project.transportMK.model.Station;

public interface LineService extends BaseEntityCrudService<Line> {

	public Line findByLineName(String lineName);

	public Line findByStartingStationAndArrivingStation(
			Station startingStation, Station arrivingStation);
}
