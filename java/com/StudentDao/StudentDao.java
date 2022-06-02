package com.StudentDao;
import org.springframework.http.ResponseEntity;

import com.Student.ResponseData;

public interface StudentDao {
	
	public ResponseEntity<ResponseData> getStudent(Long studentId);
}