package com.Employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Employee.Been.Employee;
import com.Employee.Been.FetchEmployeeDetailsDto;
import com.Employee.Been.FetchEmployeeRequest;
import com.Employee.Dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao service;

	@Override
	public Boolean insertEmployeeDetailsUsingMap(Employee insertEmployeeRequest) {
		
		return service.insertEmployeeDetailsUsingMap(insertEmployeeRequest);
	}

	@Override
	public Boolean insertEmployeeDetailsUsingSqlParameterSource(Employee insertEmployeeRequest) {
	
		return service.insertEmployeeDetailsUsingSqlParameterSource(insertEmployeeRequest);
	}

	@Override
	public Boolean insertEmployeeDetailssingBeanPropertySqlParameterSource(Employee insertEmployeeRequest) {
		
		return service.insertEmployeeDetailssingBeanPropertySqlParameterSource(insertEmployeeRequest);
	}

	@Override
	public Boolean updateEmployeeDetailsUsingMap(Employee updateEmployeeRequest, Long empId) {
		
		return service.updateEmployeeDetailsUsingMap(updateEmployeeRequest,empId);
	}

	@Override
	public Boolean updateEmployeeDetailsUsingSqlParameterSource(Employee updateEmployeeRequest, Long empId) {
		
		return service.updateEmployeeDetailsUsingSqlParameterSource(updateEmployeeRequest,empId);
	}

	@Override
	public Boolean updateEmployeeDetailssingBeanPropertySqlParameterSource(Employee updateEmployeeRequest) {
		
		return service.updateEmployeeDetailssingBeanPropertySqlParameterSource(updateEmployeeRequest);
	}

	@Override
	public Boolean insertEmployeeInBatch(Employee insertEmployeeRequest) {
		// TODO Auto-generated method stub
		return service.insertEmployeeInBatch(insertEmployeeRequest);
	}

	@Override
	public Boolean EmployeesDetailsinBatch(List<Employee> insertEmployeeRequestList) {
		// TODO Auto-generated method stub
		return service.EmployeesDetailsinBatch(insertEmployeeRequestList);
	}
	
	@Override
	 public String fetchEmployeeNameByEmpIdUsingObject(FetchEmployeeRequest fetchEmployeeRequest) {
		 return service.fetchEmployeeNameByEmpIdUsingObject(fetchEmployeeRequest);
	 }
	@Override
	 public FetchEmployeeDetailsDto fetchEmployeeNameByEmpIdUsingMap(@RequestBody FetchEmployeeRequest fetchEmployeeRequest) {
		 return service.fetchEmployeeNameByEmpIdUsingMap(fetchEmployeeRequest);
	 }
	@Override
	 public List<FetchEmployeeDetailsDto> fetchAllEmployeesUsingList(@RequestBody FetchEmployeeDetailsDto fetchEmployeeRequest) {
		 return service.fetchAllEmployeesUsingList(fetchEmployeeRequest);
	 }
	
	@Override
	public List<FetchEmployeeDetailsDto> fetchAllEmployeeDetails(@RequestBody FetchEmployeeDetailsDto fetchEmployeeRequest) {
		return service.fetchAllEmployeeDetails(fetchEmployeeRequest);
	}
}
	
