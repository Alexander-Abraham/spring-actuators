package com.effectivejava.actuators.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.effectivejava.actuators.properties.ActuatorConfig;

@RestController
public class ActruatorController {

	@Autowired
	private ActuatorConfig actuatorConfig;
	
	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String getGreeting() {
		return actuatorConfig.getGreeting();
	}
}
