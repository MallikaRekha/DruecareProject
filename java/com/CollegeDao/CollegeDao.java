package com.CollegeDao;

import org.springframework.http.ResponseEntity;

import com.College.CollegeDetails;



public interface CollegeDao {
	
	public ResponseEntity<CollegeDetails> getCollege(Long collegeId);
}