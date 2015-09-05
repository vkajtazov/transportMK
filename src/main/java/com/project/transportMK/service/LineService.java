package com.project.transportMK.service;

import java.util.List;

import com.project.transportMK.model.Line;
import com.project.transportMK.model.Schedule;
import com.project.transportMK.model.Station;

public interface LineService extends BaseEntityCrudService<Line> {

	public Line findByLineName(String lineName);

	public Line findByStartingStationAndArrivingStation(
			Station startingStation, Station arrivingStation);

	public List<Schedule> findSchedulesByLine(long startStation, long endStation);

	public Line findLineByStations(Long startId, Long endId);
	
	public Line findLineByStationsAndType(Long startId, Long endId, String type);
}
