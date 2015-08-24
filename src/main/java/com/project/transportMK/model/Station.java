package com.project.transportMK.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result;
		result = prime 
				+ ((stationCity == null) ? 0 : stationCity.hashCode());
		long temp;
		temp = Double.doubleToLongBits(stationLatitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(stationLongitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((stationName == null) ? 0 : stationName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Station other = (Station) obj;
		if (stationCity == null) {
			if (other.stationCity != null)
				return false;
		} else if (!stationCity.equals(other.stationCity))
			return false;
		if (Double.doubleToLongBits(stationLatitude) != Double
				.doubleToLongBits(other.stationLatitude))
			return false;
		if (Double.doubleToLongBits(stationLongitude) != Double
				.doubleToLongBits(other.stationLongitude))
			return false;
		if (stationName == null) {
			if (other.stationName != null)
				return false;
		} else if (!stationName.equals(other.stationName))
			return false;
		return true;
	}
	
	
	
}
