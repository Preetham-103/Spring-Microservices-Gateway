package com.cts.config;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="Badminton")
public interface BadmintonFeignClient {

	@GetMapping("/sport-badminton/display1")
	public String display();
}
