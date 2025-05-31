package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.config.BadmintonFeignClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/sport-cricket")
public class CricketController {

	@Autowired
	BadmintonFeignClient badmintonFeignClient;
	
	
	@GetMapping("/display")
	public String display1()
	{
		return "Cricket controller";
	}

	
	@CircuitBreaker(name = "cricketService", fallbackMethod = "fallbackUserData")
	@GetMapping("/callbadmiton")
	public String display2()
	{
		return badmintonFeignClient.display();
	}
	
	
	
	 public String fallbackUserData(Throwable throwable) {
	        return "Default user data for user  due to service unavailability";
	    }
}
