package com.project.transportMK.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.transportMK.model.Line;
import com.project.transportMK.model.Station;

public interface LineRepository extends JpaRepository<Line, Long> {

	public Line findByLineName(String lineName);

	public Line findByStartingStationAndArrivingStation(
			Station startingStation, Station arrivingStation);
}
