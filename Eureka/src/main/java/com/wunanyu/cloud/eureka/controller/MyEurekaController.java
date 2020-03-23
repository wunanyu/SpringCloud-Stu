package com.wunanyu.cloud.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("eureka-server")
public class MyEurekaController {
	
	@Value("${data.test}")
	private String testData;
	
	@GetMapping("test/{id}")
	public String testEurekaController(@PathVariable String id) {
		return testData + "-> "+ id;
	}
}
