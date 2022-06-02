package com.CollegeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.College.CollegeDetails;
import com.CollegeDao.CollegeDao;



@Service
public class CollegeServiceImpl implements CollegeService{
	
	@Autowired
	CollegeDao collegeDao;

	@Override
	public ResponseEntity<CollegeDetails> getCollege(Long collegeId) {
		return collegeDao.getCollege(collegeId);
	}

}