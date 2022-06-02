package com.CollegeService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.College.CollegeDetails;



@Service
public interface CollegeService {
	
	public ResponseEntity<CollegeDetails> getCollege(Long collegeId);	
}