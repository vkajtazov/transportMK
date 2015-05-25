package com.project.transportMK.web.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.transportMK.model.Line;
import com.project.transportMK.service.LineService;

@RestController
@RequestMapping("/data/rest/lines")
public class LineResource extends CrudResource<Line, LineService>{

	@Autowired
	private LineService lineService;
	
	@Override
	public LineService getService() {
		return lineService;
	}

}
