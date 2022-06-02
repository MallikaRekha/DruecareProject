package com.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Been.Employee;
import com.Employee.Been.FetchEmployeeDetailsDto;
import com.Employee.Been.FetchEmployeeRequest;
import com.Employee.Service.EmployeeService;

@RestController("/Empolyee")
public class EmployeeController {
		    @Autowired
		    EmployeeService employeeService;
			
			@PostMapping("/insertEmployeeDetailsUsingMap")
			Boolean insertEmployeeDetailsUsingMap(@RequestBody Employee insertEmployeeRequest){
				 return employeeService.insertEmployeeDetailsUsingMap(insertEmployeeRequest);	
			}
			@PostMapping("/insertEmployeeDetailsUsingSqlParameterSource")
			Boolean insertEmployeeDetailsUsingSqlParameterSource(@RequestBody Employee insertEmployeeRequest){
				return employeeService.insertEmployeeDetailsUsingSqlParameterSource(insertEmployeeRequest);
		}
			@PostMapping("/insertEmployeeDetailssingBeanPropertySqlParameterSource")
			Boolean insertEmployeeDetailssingBeanPropertySqlParameterSource(@RequestBody Employee insertEmployeeRequest) {
				return employeeService.insertEmployeeDetailssingBeanPropertySqlParameterSource(insertEmployeeRequest);
			}
			@PutMapping("/updateEmployeeDetailsUsingMap")
			Boolean updateEmployeeDetailsUsingMap(@RequestBody Employee updateEmployeeRequest, Long empId) {
				return employeeService.updateEmployeeDetailsUsingMap(updateEmployeeRequest, empId);
			}
			
			@PutMapping("/updateEmployeeDetailsUsingSqlParameterSource")
			Boolean updateEmployeeDetailsUsingSqlParameterSource(@RequestBody Employee updateEmployeeRequest, Long empId) {
				return employeeService.updateEmployeeDetailsUsingSqlParameterSource(updateEmployeeRequest,empId);
			}
			@PutMapping("/updateEmployeeDetailssingBeanPropertySqlParameterSource")
			Boolean updateEmployeeDetailssingBeanPropertySqlParameterSource(@RequestBody Employee updateEmployeeRequest) {
				return employeeService.updateEmployeeDetailssingBeanPropertySqlParameterSource(updateEmployeeRequest);	
			}
			@GetMapping("/insertEmployeeInBatch")
			public Boolean insertEmployeeInBatch(@RequestBody Employee insertEmployeeRequest) {
				return employeeService.insertEmployeeInBatch(insertEmployeeRequest);
			}
			
			@GetMapping("/EmployeesDetailsinBatch")
			public Boolean EmployeesDetailsinBatch(@RequestBody List<Employee> insertEmployeeRequestList) {
				return employeeService.EmployeesDetailsinBatch(insertEmployeeRequestList);
			}
						
			@GetMapping("/fetchEmployeeNameByEmpIdUsingObject")
			public String fetchEmployeeNameByEmpIdUsingObject(@RequestBody FetchEmployeeRequest fetchEmployeeRequest) {
				return employeeService.fetchEmployeeNameByEmpIdUsingObject(fetchEmployeeRequest);
			}
			@GetMapping("/fetchEmployeeNameByEmpIdUsingMap")
			public FetchEmployeeDetailsDto fetchEmployeeNameByEmpIdUsingMap(@RequestBody FetchEmployeeRequest fetchEmployeeRequest) {
				return employeeService.fetchEmployeeNameByEmpIdUsingMap(fetchEmployeeRequest);
			}
			@GetMapping("/fetchAllEmployeesUsingList")
			 public List<FetchEmployeeDetailsDto> fetchAllEmployeesUsingList(@RequestBody FetchEmployeeDetailsDto fetchEmployeeRequest){
				 return employeeService.fetchAllEmployeesUsingList(fetchEmployeeRequest);
			 }
			@GetMapping("/fetchAllEmployeeDetails")
			 public List<FetchEmployeeDetailsDto> fetchAllEmployeeDetails(@RequestBody FetchEmployeeDetailsDto fetchEmployeeRequest){
				 return employeeService.fetchAllEmployeeDetails(fetchEmployeeRequest);
			 }
	}	