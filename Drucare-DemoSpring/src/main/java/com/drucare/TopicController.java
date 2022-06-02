package com.drucare;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/hello")
	public String getHello() {
		return "Hello Good morning";
	}
	@RequestMapping("/hi")
	public String getHi() {
		return "Hello Good morning,good evening,hello";
	}
}
