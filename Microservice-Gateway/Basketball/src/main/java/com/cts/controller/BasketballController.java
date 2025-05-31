package com.cts.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sport-basketball")
public class BasketballController {

	
	@GetMapping("/display2")
	public String display()
	{
		return "This is basketball";
	}
}
