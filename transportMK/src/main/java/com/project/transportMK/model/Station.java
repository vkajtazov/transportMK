package com.project.transportMK.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="stations")
public class Station extends BaseEntity{

	private String stationName;
	
	private double stationLat;
	
	private double stationLon;
	
	@ManyToOne
	private City stationCity;

	public City getStationCity() {
		return stationCity;
	}

	public void setStationCity(City stationCity) {
		this.stationCity = stationCity;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public double getStationLat() {
		return stationLat;
	}

	public void setStationLat(double stationLat) {
		this.stationLat = stationLat;
	}

	public double getStationLon() {
		return stationLon;
	}

	public void setStationLon(double stationLon) {
		this.stationLon = stationLon;
	}

	public void setStationLat(float stationLat) {
		this.stationLat = stationLat;
	}


	public void setStationLon(float stationLon) {
		this.stationLon = stationLon;
	}
	
	
}
