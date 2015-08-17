package com.project.transportMK.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.transportMK.model.City;
import com.project.transportMK.model.Line;
import com.project.transportMK.model.Schedule;
import com.project.transportMK.model.Station;
import com.project.transportMK.repository.CityRepository;
import com.project.transportMK.repository.LineRepository;
import com.project.transportMK.repository.ScheduleRepository;
import com.project.transportMK.repository.StationRepository;
import com.project.transportMK.service.LineService;

@Service
public class LineServiceImpl extends
		SimpleBaseEntityCrudServiceImpl<Line, LineRepository> implements
		LineService {

	@Autowired
	private LineRepository repository;

	@Autowired
	private StationRepository stationRepository;

	@Autowired
	private CityRepository cityRepository;

	@Autowired
	private ScheduleRepository scheduleRepository;

	@Override
	protected LineRepository getRepository() {
		return repository;
	}

	@Override
	public Line findByLineName(String lineName) {
		return repository.findByLineName(lineName);
	}

	@Override
	public Line findByStartingStationAndArrivingStation(
			Station startingStation, Station arrivingStation) {
		return repository.findByStartingStationAndArrivingStation(
				startingStation, arrivingStation);
	}

	@Override
	public Line save(Line entity) {
		Station startingStation = saveStation(entity.getStartingStation());
		Station arrivingStation = saveStation(entity.getArrivingStation());
		Line result = repository.findByStartingStationAndArrivingStation(
				startingStation, arrivingStation);

		if (result != null) {
			for (Schedule sc : entity.getScheduleList()) {
				Schedule temp = scheduleRepository.save(sc);
				result.getScheduleList().add(temp);

			}
			repository.save(result);
			return result;
		}
		entity.setStartingStation(startingStation);
		entity.setArrivingStation(arrivingStation);
		List<Schedule> scheduleList = new ArrayList<Schedule>();
		for (int i = 0; i < entity.getScheduleList().size(); i++) {
			Schedule temp = scheduleRepository.save(entity.getScheduleList()
					.get(i));
			scheduleList.add(temp);
		}
		entity.setScheduleList(scheduleList);
		repository.save(entity);
		return result;

	}

	private Station saveStation(Station station) {
		Station result = stationRepository.findByStationName(station
				.getStationName());
		if (result != null)
			return result;
		// station.setStationCity(saveCity(station.getStationCity()));
		return stationRepository.saveAndFlush(station);
	}

	private City saveCity(City city) {
		City result = cityRepository.findByCityName(city.getCityName());
		if (result != null)
			return result;
		return cityRepository.save(city);
	}

	@Override
	public List<Schedule> findSchedulesByLine(long startStation, long endStation) {
		Station startingStation = stationRepository.findById(startStation);
		Station arrivingStation = stationRepository.findById(endStation);

		Line line = repository.findByStartingStationAndArrivingStation(
				startingStation, arrivingStation);
		return line.getScheduleList();
	}
}
