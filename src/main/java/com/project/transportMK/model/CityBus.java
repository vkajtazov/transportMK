package com.project.transportMK.model;

import java.sql.Time;

import com.project.transportMK.model.CityBus.REGULARITY;
import com.project.transportMK.model.CityBus.TYPE;

public class CityBus {

	public static enum REGULARITY {
		EveryDay, Saturday, Sunday

	}

	public static enum TYPE {

		Public, Private
	}

	private String lineNumber;
	private Time startTime;
	private TYPE type;
	private String startingStation;
	private String arrivingStation;
	private REGULARITY regularity;
	private String passingStreets;
	private String busNote;

	public String getPassingStreets() {
		return passingStreets;
	}

	public void setPassingStreets(String passingStreets) {
		this.passingStreets = passingStreets;
	}

	public String getBusNote() {
		return busNote;
	}

	public void setBusNote(String busNote) {
		this.busNote = busNote;
	}

	public String getStartingStation() {
		return startingStation;
	}

	public void setStartingStation(String startingStation) {
		this.startingStation = startingStation;
	}

	public String getArrivingStation() {
		return arrivingStation;
	}

	public void setArrivingStation(String arrivingStation) {
		this.arrivingStation = arrivingStation;
	}

	public String getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}

	public REGULARITY getRegularity() {
		return regularity;
	}

	public void setRegularity(REGULARITY regularity) {
		this.regularity = regularity;
	}

}
