package com.project.transportMK.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="stations")
public class Station extends BaseEntity{

	private String stationName;
	
	private double stationLatitude;
	
	private double stationLongitude;
	
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

	public double getStationLatitude() {
		return stationLatitude;
	}

	public void setStationLatitude(double stationLatitude) {
		this.stationLatitude = stationLatitude;
	}

	public double getStationLongitude() {
		return stationLongitude;
	}

	public void setStationLongitude(double stationLongitude) {
		this.stationLongitude = stationLongitude;
	}
	
}
