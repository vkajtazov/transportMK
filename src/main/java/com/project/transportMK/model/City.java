package com.project.transportMK.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
public class City extends BaseEntity {

	private String cityName;
	private double cityLatitude;
	private double cityLongitude;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public double getCityLatitude() {
		return cityLatitude;
	}

	public void setCityLatitude(double cityLatitude) {
		this.cityLatitude = cityLatitude;
	}

	public double getCityLongitude() {
		return cityLongitude;
	}

	public void setCityLongitude(double cityLongitude) {
		this.cityLongitude = cityLongitude;
	}
}
