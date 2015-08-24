package com.project.transportMK.web.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.transportMK.model.Line;
import com.project.transportMK.model.Station;
import com.project.transportMK.repository.StationRepository;
import com.project.transportMK.service.LineService;
import com.project.transportMK.service.StationService;

@RestController
@RequestMapping("/data/rest/lines")
public class LineResource extends CrudResource<Line, LineService> {

	@Autowired
	private LineService lineService;
	
	@Autowired
	private StationRepository stationRepo;

	@Override
	public LineService getService() {
		return lineService;
	}

	@RequestMapping(value = "/schedulesByStations", method = RequestMethod.POST)
	public String getSchedulesByLine(@RequestParam String startStation,
			@RequestParam String endStation) throws UnsupportedEncodingException {
		startStation = URLDecoder.decode(startStation, "UTF-8");
		endStation = URLDecoder.decode(endStation, "UTF-8");
		return startStation + " "+endStation;
		//return lineService.findLineByStations(startStation, endStation);
	}

}
