package com.project.transportMK.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "schedules")
public class Schedule extends BaseEntity {
	
	@Enumerated(EnumType.STRING)
	@Column(name = "vehicleType", length = 20, nullable = false)
	private VehicleType vehicleType;
	
	private String transporter;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "regularityType", length = 20, nullable = false)
	private RegularityType regularityType;
	
	private Time departureTime;
	
	private Time arrivalTime;
	
	private int price;


	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getTransporter() {
		return transporter;
	}

	public void setTransporter(String transporter) {
		this.transporter = transporter;
	}

	public RegularityType getRegularityType() {
		return regularityType;
	}

	public void setRegularityType(RegularityType regularityType) {
		this.regularityType = regularityType;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public Time getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
