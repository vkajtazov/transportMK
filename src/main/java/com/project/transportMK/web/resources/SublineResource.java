package com.project.transportMK.web.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.transportMK.model.Subline;
import com.project.transportMK.service.SublineService;

@RestController
@RequestMapping("/data/rest/sublines")
public class SublineResource extends CrudResource<Subline, SublineService>{

	@Autowired
	private SublineService sublineService;
	
	@Override
	public SublineService getService() {
		return sublineService;
	}

}
