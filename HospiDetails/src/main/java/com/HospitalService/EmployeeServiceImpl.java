package com.HospitalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.HospitalEntity.Employee;
import com.HospitalEntity.FetchEmployeeRequest;



	@Service
	public class EmployeeServiceImpl{
	@Autowired
	RestTemplate restTemplate;
	EmployeeServiceImpl(RestTemplateBuilder restTemplateBuilder){
	this.restTemplate=restTemplateBuilder.build();
	}

	public Employee fetchEmployeeNameByEmpIdUsingMap(FetchEmployeeRequest fetchEmployeeRequest) {
	Employee  employee=restTemplate.getForObject("http://localhost:9095/fetchEmployeeNameByEmpIdUsingMap",Employee.class,fetchEmployeeRequest);
	return employee;
	}
	public Boolean insertEmployeeDetailsUsingMap(Employee insertEmployeeRequest) {
	Boolean employee=restTemplate.postForObject("http://localhost:9095/insertEmployeeDetailsUsingMap",insertEmployeeRequest,Boolean.class);
	return employee;
	}
	public String fetchEmployeeNameByEmpIdUsingObject(@RequestBody FetchEmployeeRequest fetchEmployeeRequest) {
	String employee=restTemplate.getForObject("http://localhost:9095/fetchEmployeeNameByEmpIdUsingObject",String.class, fetchEmployeeRequest);
	return employee;
	}

	public Employee fetchAllEmployeeDetails( @RequestBody FetchEmployeeRequest fetchEmployeeRequest){
	Employee employee=restTemplate.getForObject("http://localhost:9095/fetchAllEmployeesUsingList",Employee.class,fetchEmployeeRequest);

	return employee;
	}
	}
