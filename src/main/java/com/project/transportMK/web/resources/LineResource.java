package com.project.transportMK.web.resources;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.transportMK.model.Line;
import com.project.transportMK.repository.StationRepository;
import com.project.transportMK.service.LineService;

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

	@RequestMapping(value = "/schedulesByStations", method = RequestMethod.POST, produces = "application/json")
	public Line getSchedulesByLine(
			@RequestParam("startStationId") Long startId,
			@RequestParam("endStationId") Long endId)
			throws UnsupportedEncodingException {
		return lineService.findLineByStations(startId, endId);
	}

}
