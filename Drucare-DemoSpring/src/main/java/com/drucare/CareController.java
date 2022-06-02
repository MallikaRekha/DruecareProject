package com.drucare;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CareController {
//	@RequestMapping("/hello")
//	public String sayHello() {
//	return "Good Morning";
//	}
	
	@RequestMapping("/hello")
	public List<String> sayHello() {
	return Arrays.asList("good morning","good afternoon");
	}

}
