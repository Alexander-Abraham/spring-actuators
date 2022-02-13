package com.effectivejava.actuators.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "actuator.demo")
public class ActuatorConfig {
	
	private String greeting;
	
	private String url;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "ActuatorConfig [greeting=" + greeting + ", url=" + url + "]";
	}

}
