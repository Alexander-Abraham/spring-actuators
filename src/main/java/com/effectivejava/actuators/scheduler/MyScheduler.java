package com.effectivejava.actuators.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduler {
	
	@Scheduled(fixedRate = 5000)
	public void nyTask() {
		System.out.println("RUNNING!!!!!");
	}

}
