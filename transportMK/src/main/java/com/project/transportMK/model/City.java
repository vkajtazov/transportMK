package com.project.transportMK.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
public class City extends BaseEntity {

	private String cityName;

	private double cityLat;

	private double cityLon;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public double getCityLat() {
		return cityLat;
	}

	public void setCityLat(double cityLat) {
		this.cityLat = cityLat;
	}

	public double getCityLon() {
		return cityLon;
	}

	public void setCityLon(double cityLon) {
		this.cityLon = cityLon;
	}

	public void setCityLat(float cityLat) {
		this.cityLat = cityLat;
	}

	public void setCityLon(float cityLon) {
		this.cityLon = cityLon;
	}

}
