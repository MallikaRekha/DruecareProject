package com.CollegeDao;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.College.CollegeDetails;

@Repository
public class CollegeDaoImpl implements CollegeDao {
	
	@Override
	public ResponseEntity<CollegeDetails> getCollege(Long collegeId) {
		
		CollegeDetails collegeDetails =new CollegeDetails();
		collegeDetails.setCollegeId(101l);
		collegeDetails.setCollegeNm("reka");
		collegeDetails.setCollegeCityNm("Vijayawada");
		collegeDetails.setCollegeStateNm("AP");
		collegeDetails.setPincode(521212);
		collegeDetails.setAddress("2-48,nunna");
	

	return new ResponseEntity<CollegeDetails>(collegeDetails,HttpStatus.OK);
}
}