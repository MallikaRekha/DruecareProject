package com.CollegeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.College.CollegeDetails;
import com.CollegeService.CollegeService;



@RestController
@RequestMapping("/college")
public class CollegeController {
     
	@Autowired
	CollegeService collegeService;
	
	@GetMapping("/{collegeId}")
	public ResponseEntity<CollegeDetails> getCollege(@PathVariable("collegeId") Long collegeId){
		return collegeService.getCollege(collegeId);
	}
}