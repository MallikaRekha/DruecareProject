package com.Employee.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Employee.Been.Employee;
import com.Employee.Been.FetchEmployeeDetailsDto;
import com.Employee.Been.FetchEmployeeRequest;


@Service
public interface EmployeeService {

	Boolean insertEmployeeDetailsUsingMap(Employee insertEmployeeRequest);
	Boolean insertEmployeeDetailsUsingSqlParameterSource(Employee insertEmployeeRequest);
	Boolean insertEmployeeDetailssingBeanPropertySqlParameterSource(Employee insertEmployeeRequest);
	
	Boolean updateEmployeeDetailsUsingMap(Employee updateEmployeeRequest, Long empId);
	Boolean updateEmployeeDetailsUsingSqlParameterSource(Employee updateEmployeeRequest, Long empId);
	Boolean updateEmployeeDetailssingBeanPropertySqlParameterSource(Employee updateEmployeeRequest);
	
	Boolean insertEmployeeInBatch(Employee insertEmployeeRequest);
	Boolean EmployeesDetailsinBatch(List<Employee> insertEmployeeRequestList);
	
	public String fetchEmployeeNameByEmpIdUsingObject(@RequestBody FetchEmployeeRequest fetchEmployeeRequest);
	  
	  public FetchEmployeeDetailsDto fetchEmployeeNameByEmpIdUsingMap(@RequestBody FetchEmployeeRequest fetchEmployeeRequest);
	  
	  public List<FetchEmployeeDetailsDto> fetchAllEmployeesUsingList(@RequestBody FetchEmployeeDetailsDto fetchEmployeeRequest);
	  public List<FetchEmployeeDetailsDto> fetchAllEmployeeDetails(FetchEmployeeDetailsDto fetchEmployeeRequest);
	  
}