package com.StudentService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Student.ResponseData;
@Service
public interface StudentService {
	
	public ResponseEntity<ResponseData> getStudent(Long studentId);
	
}