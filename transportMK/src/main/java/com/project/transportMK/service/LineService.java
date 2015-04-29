package com.project.transportMK.service;

import com.project.transportMK.model.Line;

public interface LineService extends BaseEntityCrudService<Line>{
	
	public Line findByLineName (String lineName);
}
