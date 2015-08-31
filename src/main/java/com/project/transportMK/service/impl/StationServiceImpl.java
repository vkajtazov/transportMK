package com.project.transportMK.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.transportMK.model.Line;
import com.project.transportMK.model.Schedule;
import com.project.transportMK.model.Station;
import com.project.transportMK.model.VehicleType;
import com.project.transportMK.repository.LineRepository;
import com.project.transportMK.repository.RenameStationName;
import com.project.transportMK.repository.StationRepository;
import com.project.transportMK.service.StationService;

@Service
public class StationServiceImpl extends
		SimpleBaseEntityCrudServiceImpl<Station, StationRepository> implements
		StationService {

	@Autowired
	private StationRepository repository;

	@Autowired
	private LineRepository lineRepository;

	@Autowired
	private RenameStationName renameRepository;

	@Override
	protected StationRepository getRepository() {
		return repository;
	}

	@Override
	public List<Station> findAllArrivingStations(long id) {
		Station startingStation = repository.findById(id);
		List<Line> lineList = lineRepository
				.findByStartingStation(startingStation);
		List<Station> stationList = new ArrayList<Station>();
		for (Line line : lineList) {
			stationList.add(line.getArrivingStation());
		}
		return stationList;
	}

	@Override
	public List<Station> findAllArrivingStationsByType(long id, VehicleType type) {
		Station startingStation = repository.findById(id);
		List<Line> lineList = lineRepository
				.findByStartingStation(startingStation);
		List<Station> stationList = new ArrayList<Station>();
		for (Line line : lineList) {
			List<Schedule> scheduleList = line.getScheduleList();
			for (Schedule schedule : scheduleList) {
				if (schedule.getVehicleType().equals(type)) {
					stationList.add(line.getArrivingStation());
					break;
				}
			}
		}
		return stationList;
	}

	@Override
	public List<Station> findAllStartingStationsByType(VehicleType type) {
		List<Line> lineList = lineRepository.findAll();
		HashSet<Station> stationSet = new HashSet<Station>();
		List<Station> stationList = new ArrayList<Station>();
		for (Line line : lineList) {
			List<Schedule> scheduleList = line.getScheduleList();
			for (Schedule schedule : scheduleList) {
				if (schedule.getVehicleType().equals(type)) {
					if (!stationSet.contains(line.getStartingStation())) {
						stationList.add(line.getStartingStation());
						stationSet.add(line.getStartingStation());
					}
					break;
				}
			}
		}
		return stationList;
	}

	@Override
	public void setStationsName() {
		List<Station> stationList = repository.findAll();
		for (int i = 0; i < stationList.size(); i++) {
			Station temp = stationList.get(i);
			String enName = renameRepository.getRenamedField(temp
					.getStationName());
			temp.setStationName_en(enName);
			repository.saveAndFlush(temp);
		}
	}
}
