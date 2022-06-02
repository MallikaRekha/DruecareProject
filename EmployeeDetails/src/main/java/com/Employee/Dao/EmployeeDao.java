package com.Employee.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.Employee.Been.Employee;
import com.Employee.Been.FetchEmployeeDetailsDto;
import com.Employee.Been.FetchEmployeeRequest;
//import com.Employee.Been.InsertEmployeeRequest;

@Repository
public interface EmployeeDao {


	Boolean insertEmployeeDetailsUsingMap(Employee insertEmployeeRequest);
	Boolean insertEmployeeDetailsUsingSqlParameterSource(Employee insertEmployeeRequest);
	Boolean insertEmployeeDetailssingBeanPropertySqlParameterSource(Employee insertEmployeeRequest);
	
	Boolean updateEmployeeDetailsUsingMap(Employee updateEmployeeRequest, Long empId);
	Boolean updateEmployeeDetailsUsingSqlParameterSource(Employee updateEmployeeRequest, Long empId);
	Boolean updateEmployeeDetailssingBeanPropertySqlParameterSource(Employee updateEmployeeRequest);
	
	Boolean insertEmployeeInBatch(Employee insertEmployeeRequest);
	Boolean EmployeesDetailsinBatch(List<Employee> insertEmployeeRequestList);
		
	public String fetchEmployeeNameByEmpIdUsingObject(FetchEmployeeRequest fetchEmployeeRequest);
	 public FetchEmployeeDetailsDto fetchEmployeeNameByEmpIdUsingMap( FetchEmployeeRequest fetchEmployeeRequest);
	 public List<FetchEmployeeDetailsDto> fetchAllEmployeesUsingList( FetchEmployeeDetailsDto fetchEmployeeRequest);
	 public List<FetchEmployeeDetailsDto> fetchAllEmployeeDetails(FetchEmployeeDetailsDto fetchEmployeeRequest);
	}