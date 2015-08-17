package com.project.transportMK.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.transportMK.model.Station;

public interface StationRepository extends JpaRepository<Station, Long> {
	
	public Station findByStationName (String stationName);
	
	public Station findById (Long id);
}
