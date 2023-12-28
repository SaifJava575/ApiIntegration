package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.service.ApiIntegrationServiceLayer;

@RestController
@RequestMapping("/api")
public class ApiIntegrationController {

	@Autowired
	private ApiIntegrationServiceLayer apiIntegrationServiceLayer;

	@RequestMapping(value = "/translate", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String translate() {
		try {
			return apiIntegrationServiceLayer.translateText();
		} catch (Exception e) {
			e.printStackTrace();
			return "Translation error";
		}
	}
}
