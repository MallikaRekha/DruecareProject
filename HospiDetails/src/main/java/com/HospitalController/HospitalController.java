package com.HospitalController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HospitalEntity.Employee;
import com.HospitalService.EmployeeServiceImpl;

@RestController
@RequestMapping("/hospital")
public class HospitalController{
@Autowired
EmployeeServiceImpl empService;


@PostMapping("/insertEmployeeDetailsUsingMap")
Boolean insertEmployeeDetailsUsingMap(@RequestBody Employee insertEmployeeRequest) {
return empService.insertEmployeeDetailsUsingMap(insertEmployeeRequest);
}
}