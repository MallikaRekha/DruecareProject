package com.Employee.Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.Employee.Been.Employee;
import com.Employee.Been.EmployeeDepartmentsXref;
import com.Employee.Been.EmployeeDesignationXref;
import com.Employee.Been.FetchEmployeeDetailsDto;
import com.Employee.Been.FetchEmployeeRequest;

@Repository
public class EmployeeDAOImpl implements EmployeeDao {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Boolean insertEmployeeDetailsUsingMap(Employee insertEmployeeRequest) {

		String queryToInsertEmployeeDetails = "Insert into employees_info_ref(last_nm,first_nm,middle_nm,emp_code,mobile_no,state_nm,country_nm,org_id,isactive)"
				+ "values(:lastNm,:firstNm,:middleNm,:empCode,:mobileNo,:stateNm,:countryNm,:orgId,true)";
		Boolean result = false;
		Map<String, Object> map = new HashMap<>();

		map.put("lastNm", insertEmployeeRequest.getLastNm());
		map.put("firstNm", insertEmployeeRequest.getFirstNm());
		map.put("middleNm", insertEmployeeRequest.getMiddleNm());
		map.put("empCode", insertEmployeeRequest.getEmpCode());

		map.put("mobileNo", insertEmployeeRequest.getMobileNo());
		map.put("stateNm", insertEmployeeRequest.getStateNm());
		map.put("countryNm", insertEmployeeRequest.getCountryNm());
		map.put("orgId", insertEmployeeRequest.getOrgId());
//		map.put("isactive", insertEmployeeRequest.getIsactive());

		try {
			result = namedParameterJdbcTemplate.update(queryToInsertEmployeeDetails, map) > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Boolean insertEmployeeDetailsUsingSqlParameterSource(Employee insertEmployeeRequest) {
		String queryToInsertEmployeeDetails = "Insert into employees_info_ref(last_nm,first_nm,middle_nm,emp_code,mobile_no,state_nm,country_nm,org_id,isactive)"
				+ "values(:lastNm,:firstNm,:middleNm,:empCode,:mobileNo,:stateNm,:countryNm,:orgId,:isactive)";
		
		MapSqlParameterSource map = new MapSqlParameterSource();

		map.addValue("lastNm", insertEmployeeRequest.getLastNm());
		map.addValue("firstNm", insertEmployeeRequest.getFirstNm());
		map.addValue("middleNm", insertEmployeeRequest.getMiddleNm());
		map.addValue("empCode", insertEmployeeRequest.getEmpCode());
		map.addValue("mobileNo", insertEmployeeRequest.getMobileNo());
		map.addValue("stateNm", insertEmployeeRequest.getStateNm());
		map.addValue("countryNm", insertEmployeeRequest.getCountryNm());
		map.addValue("orgId", insertEmployeeRequest.getOrgId());
		map.addValue("isactive", insertEmployeeRequest.getIsactive());

		Boolean result = false;
		try {
			result = namedParameterJdbcTemplate.update(queryToInsertEmployeeDetails, map) > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Boolean insertEmployeeDetailssingBeanPropertySqlParameterSource(Employee insertEmployeeRequest) {
		String queryToInsertEmployeeDetails = "Insert into employees_info_ref(last_nm,first_nm,middle_nm,emp_code,mobile_no,state_nm,country_nm,org_id,isactive)"
				+ "values(:lastNm,:firstNm,:middleNm,:empCode,:mobileNo,:stateNm,:countryNm,:orgId,:isactive)";

		boolean result = false;
		try {
			result = namedParameterJdbcTemplate.update(queryToInsertEmployeeDetails,
					new BeanPropertySqlParameterSource(insertEmployeeRequest)) > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Boolean updateEmployeeDetailsUsingMap(Employee updateEmployeeRequest, Long empId) {

		String queryToUpdateEmployeeDetails = "update employees_info_ref set emp_id=:empId,first_nm=:firstNm, middle_nm=:middleNm,last_nm=:lastNm, mobile_no = :mobileNo where emp_id =:empId";
		Map<String, Object> map = new HashMap<>();
		map.put("empId", updateEmployeeRequest.getEmpId());
		map.put("lastNm", updateEmployeeRequest.getLastNm());
		map.put("firstNm", updateEmployeeRequest.getFirstNm());
		map.put("middleNm", updateEmployeeRequest.getMiddleNm());
		map.put("mobileNo", updateEmployeeRequest.getMobileNo());

		return namedParameterJdbcTemplate.update(queryToUpdateEmployeeDetails, map) > 0;
	}

	@Override
	public Boolean updateEmployeeDetailsUsingSqlParameterSource(Employee updateEmployeeRequest, Long empId) {

		String queryToUpdateEmployeeDetails = "update employees_info_ref set first_nm=:firstNm, middle_nm=:middleNm,last_nm=:lastNm, mobile_no = :mobileNo where emp_id =:empId";
		MapSqlParameterSource map = new MapSqlParameterSource();

		map.addValue("empId", updateEmployeeRequest.getEmpId());
		map.addValue("lastNm", updateEmployeeRequest.getLastNm());
		map.addValue("first_Nm", updateEmployeeRequest.getFirstNm());
		map.addValue("middleNm", updateEmployeeRequest.getMiddleNm());
		map.addValue("mobileNo", updateEmployeeRequest.getMobileNo());

		return namedParameterJdbcTemplate.update(queryToUpdateEmployeeDetails, map) > 0;
	}

	@Override
	public Boolean updateEmployeeDetailssingBeanPropertySqlParameterSource(Employee updateEmployeeRequest) {

		String queryToUpdateEmployeeDetails = "update employees_info_ref set first_nm=:firstNm, middle_nm=:middleNm,last_nm=:lastNm, mobile_no = :mobileNo where emp_id=:empId ";

		boolean result = false;
		try {
			result = namedParameterJdbcTemplate.update(queryToUpdateEmployeeDetails,
					new BeanPropertySqlParameterSource(updateEmployeeRequest)) > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Boolean insertEmployeeInBatch(Employee insertEmployeeRequest) {
		String queryToInsertEmployeeDetails = "Insert into employees_info_ref(last_nm,first_nm,middle_nm,emp_code,mobile_no,state_nm,country_nm,city_nm,org_id,isactive)"
				+ "values(:empId,:lastNm,:firstNm,:middleNm,:empCode,:mobileNo,:stateNm,:countryNm,:cityNm,:orgId,:isactive)";
		KeyHolder holder = new GeneratedKeyHolder();
		int count = namedParameterJdbcTemplate.update(queryToInsertEmployeeDetails,
				new BeanPropertySqlParameterSource(insertEmployeeRequest), holder, new String[] { "emp_id" });
		long empId = holder.getKey().longValue();
		Boolean result = false;
		if (count > 0) {
			String queryForInsertEmployeeDepartments = "insert into employee_dept_xref (dept_id,org_id,isactive) values(:empId,:deptId,:orgId,true)";
			if (insertEmployeeRequest.getDepartmentList() != null
					&& insertEmployeeRequest.getDepartmentList().size() > 0)
				for (EmployeeDepartmentsXref empDepartmentsxRef : insertEmployeeRequest.getDepartmentList()) {

					MapSqlParameterSource map = new MapSqlParameterSource();
					map.addValue("empId", empId);
					map.addValue("deptId", empDepartmentsxRef.getDeptId());
					map.addValue("orgId", empDepartmentsxRef.getOrgId());
					map.addValue("Isactive", empDepartmentsxRef.getIsactive());
					result = namedParameterJdbcTemplate.update(queryForInsertEmployeeDepartments, map) > 0;
				}
			String queryForInsertEmployeeDesignation = "insert into employee_designation_xref (emp_id,designation_id,org_id,isactive) values(:empId,:designationId,:orgId,true)";
			if (insertEmployeeRequest.getDesignationList() != null
					&& insertEmployeeRequest.getDesignationList().size() > 0)
				for (EmployeeDesignationXref empDesignationXref : insertEmployeeRequest.getDesignationList()) {
					MapSqlParameterSource map = new MapSqlParameterSource();
					map.addValue("empId", empId);
					map.addValue("designationId", empDesignationXref.getDesignationId());
					map.addValue("orgId", empDesignationXref.getDesignationId());
					map.addValue("Isactive", empDesignationXref.getDesignationId());
					result = namedParameterJdbcTemplate.update(queryForInsertEmployeeDesignation, map) > 0;
				}
		}
		return result;
	}

	@Override
	public Boolean EmployeesDetailsinBatch(List<Employee> insertEmployeeRequestList) {
		Boolean result = false;
		for (Employee employee : insertEmployeeRequestList) {
			int count = 0;
			KeyHolder holder = new GeneratedKeyHolder();
			String queryToInsertEmployeeDetails = "Insert into employees_info_ref(last_nm,first_nm,middle_nm,emp_code,mobile_no,state_nm,country_nm,city_nm,org_id,isactive)"
					+ "values(:empId,:lastNm,:firstNm,:middleNm,:empCode,:mobileNo,:stateNm,:countryNm,:cityNm,:orgId,:isactive)";
			if (employee.getEmpId() == null) {
				count = namedParameterJdbcTemplate.update(queryToInsertEmployeeDetails,
						new BeanPropertySqlParameterSource(employee), holder, new String[] { "emp_id" });
				Long key = holder.getKey().longValue();
				employee.setEmpId(key);

			} else {
				String queryForUpdateEmployeeData = "Update employees_info_ref set first_nm=:firstNm,last_nm=:lastNm,mobile_no=:mobileNo where emp_id=:empId";
				count = namedParameterJdbcTemplate.update(queryForUpdateEmployeeData,
						new BeanPropertySqlParameterSource(employee));
			}
			if (count > 0) {

				String queryToInsertEmpDeprtments = "insert into employees_departments_xref (dept_id,emp_id,org_id,isactive) values (:deptId,:empId,:orgId,true)";
				List<EmployeeDepartmentsXref> empDeptXrefSave = new ArrayList<>();
				if (employee.getDepartmentList() != null && employee.getDepartmentList().size() > 0)
					for (EmployeeDepartmentsXref employeeDeptXref : employee.getDepartmentList()) {
						employeeDeptXref.setEmpDeptId(holder.getKey().longValue());
						empDeptXrefSave.add(employeeDeptXref);
					}

				SqlParameterSource[] parameters = SqlParameterSourceUtils.createBatch(empDeptXrefSave.toArray());
				namedParameterJdbcTemplate.batchUpdate(queryToInsertEmpDeprtments, parameters);

				String queryToInsertEmpDesignations = "insert into employees_designation_xref (designation_id,emp_id,org_id,isactive) values (:designationId,:empId,:orgId,true)";
				List<EmployeeDesignationXref> empDesignationRefSave = new ArrayList<>();
				if (employee.getDesignationList() != null && employee.getDesignationList().size() > 0) {
					for (EmployeeDesignationXref employeeDesignationBean : employee.getDesignationList()) {
						employeeDesignationBean.setEmpId(holder.getKey().longValue());
						empDesignationRefSave.add(employeeDesignationBean);
						SqlParameterSource[] values = SqlParameterSourceUtils
								.createBatch(empDesignationRefSave.toArray());
						namedParameterJdbcTemplate.batchUpdate(queryToInsertEmpDesignations, values);

					}

				}

			}

		}
		return result;
	}

	@Override
	public String fetchEmployeeNameByEmpIdUsingObject(FetchEmployeeRequest fetchEmployeeRequest) {

		String queryForFetchEmployeeNmByEmpIdUsingObject = "SELECT concat(first_nm,' ',middle_nm,' ',last_nm) as emp_nm from employees_info_ref where emp_id=:empId ";

		return namedParameterJdbcTemplate.queryForObject(queryForFetchEmployeeNmByEmpIdUsingObject,
				new BeanPropertySqlParameterSource(fetchEmployeeRequest), String.class);

	}

	@Override
	public FetchEmployeeDetailsDto fetchEmployeeNameByEmpIdUsingMap(FetchEmployeeRequest fetchEmployeeRequest) {

		FetchEmployeeDetailsDto fetchEmployeeDeatilsDto = new FetchEmployeeDetailsDto();
		String queryForFetchEmployeeNmByEmpIdUsingMap = "SELECT emp_id,last_nm,first_nm,middle_nm,emp_code,mobile_no,state_nm,country_nm,org_id,isactive from employees_info_ref where emp_id=:empId and org_id=:orgId and isactive=:isactive ";
		Map<String, Object> map = namedParameterJdbcTemplate.queryForMap(queryForFetchEmployeeNmByEmpIdUsingMap,
				new BeanPropertySqlParameterSource(fetchEmployeeRequest));

		fetchEmployeeDeatilsDto.setEmpId((Long) map.get("emp_id"));
		fetchEmployeeDeatilsDto.setLastNm((String) map.get("last_nm"));
		fetchEmployeeDeatilsDto.setFirstNm((String) map.get("first_nm"));
		fetchEmployeeDeatilsDto.setMiddleNm((String) map.get("middle_nm"));
		fetchEmployeeDeatilsDto.setEmpCode((Long) map.get("emp_code"));
		fetchEmployeeDeatilsDto.setMobileNo((Long) map.get("mobile_no"));
		fetchEmployeeDeatilsDto.setStateNm((String) map.get("state_nm"));
		fetchEmployeeDeatilsDto.setCountryNm((String) map.get("country_nm"));
		fetchEmployeeDeatilsDto.setOrgId((Long) map.get("org_id"));
		fetchEmployeeDeatilsDto.setIsactive((Boolean) map.get("isactive"));
		return fetchEmployeeDeatilsDto;

	}

	@Override
	public List<FetchEmployeeDetailsDto> fetchAllEmployeesUsingList(FetchEmployeeDetailsDto fetchEmployeeRequest) {

		List<FetchEmployeeDetailsDto> fetchEmployeeList = new ArrayList<>();

		String queryForFetchEmployeeNmByEmpIdUsingList = "SELECT emp_id,last_nm,first_nm,middle_nm,emp_code,mobile_no,state_nm,country_nm,org_id,isactive from employees_info_ref where emp_id=:empId and org_id=:orgId and isactive=:isactive ";
		StringBuilder query = new StringBuilder(queryForFetchEmployeeNmByEmpIdUsingList);
		if (fetchEmployeeRequest.getEmpId() != null) {
			query.append(
					" AND concat(emp_id,last_nm,first_nm,middle_nm,emp_code,mobile_no,state_nm,country_nm,org_id,isactive) ilike '%' ||:empId||'%' ");

		}

		if (fetchEmployeeRequest.getMobileNo() != null) {
			query.append(" AND mobile_no=:mobileNo ");
		}
		query.append(" order by mobile_no desc ");

		List<Map<String, Object>> rows = namedParameterJdbcTemplate.queryForList(query.toString(),
				new BeanPropertySqlParameterSource(fetchEmployeeRequest));
		FetchEmployeeDetailsDto fetchEmployeeDeatilsDto = null;
		for (Map<String, Object> row : rows) {
			fetchEmployeeDeatilsDto = new FetchEmployeeDetailsDto();
			fetchEmployeeDeatilsDto.setEmpId((Long) row.get("emp_id"));
			fetchEmployeeDeatilsDto.setFirstNm((String) row.get("first_nm"));
			fetchEmployeeDeatilsDto.setMiddleNm((String) row.get("middle_nm"));
			fetchEmployeeDeatilsDto.setLastNm((String) row.get("last_nm"));
			fetchEmployeeDeatilsDto.setMobileNo((Long) row.get("mobile_no"));
			fetchEmployeeDeatilsDto.setCountryNm((String) row.get("country_nm"));
			fetchEmployeeDeatilsDto.setStateNm((String) row.get("state_nm"));
			// fetchEmployeeDeatilsDto.setOrgId((Long) row.get("org_id"));
			// fetchEmployeeDeatilsDto.setIsactive((Boolean) row.get("isactive"));

			fetchEmployeeList.add(fetchEmployeeDeatilsDto);

		}
		return fetchEmployeeList;

	}

	@Override
	public List<FetchEmployeeDetailsDto> fetchAllEmployeeDetails(FetchEmployeeDetailsDto fetchEmployeeRequest) {
		String fetchAllEmployeeDetails = "SELECT eir.emp_id,eir.first_nm,eir.middle_nm,eir.last_nm,eir.emp_code,eir.mobile_no,eir.country_nm,eir.state_nm,eir.org_id,eir.isactive,edp.emp_dept_id,edp.dept_id,edp.org_id,edp.isactive,eds.design_id,eds.emp_id,eds.org_id,eds.isactive,dr.dept_id,dr.dept_nm,dr.emp_id,dr.org_id,dr.isactive,dsr.designation_id,dsr.designation_nm,dsr.isactive FROM  employees_info_ref  eir INNER JOIN employee_departments_xref  edp ON  eir.emp_id = edp.emp_id  INNER JOIN employee_designation_xref  eds ON eir.emp_id = eds.emp_id INNER JOIN department_ref dr ON edp.dept_id =dr.dept_id INNER JOIN designation_ref dsr ON  eds.emp_id =dsr.emp_id ";
		FetchEmployeeDetailsDto fetchEmployeeDeatilsDto = null;

		List<Map<String, Object>> rows = namedParameterJdbcTemplate.queryForList(fetchAllEmployeeDetails,
				new BeanPropertySqlParameterSource(fetchEmployeeRequest));

		List<FetchEmployeeDetailsDto> fetchEmployeeDeatilsDtoList = new ArrayList<>();
		List<EmployeeDepartmentsXref> employeeDepartmentList = null;
		List<EmployeeDesignationXref> employeeDesignationList = null;
		Set<Long> set = new HashSet<>();
		int count = 0;
		for (Map<String, Object> row : rows) {
			count++;
			if (set.add((Long) row.get("emp_id"))) {
				if (fetchEmployeeDeatilsDto != null) {
								if (CollectionUtils.isNotEmpty(employeeDesignationList)) {
									fetchEmployeeDeatilsDto.setDesignationList(employeeDesignationList);
								}
								if (CollectionUtils.isNotEmpty(employeeDepartmentList)) {
									fetchEmployeeDeatilsDto.setDepartmentList(employeeDepartmentList);
								}
								fetchEmployeeDeatilsDtoList.add(fetchEmployeeDeatilsDto);
							}
							employeeDepartmentList = new ArrayList<>();
							employeeDesignationList = new ArrayList<>();
							fetchEmployeeDeatilsDto = new FetchEmployeeDetailsDto();
							fetchEmployeeDeatilsDto.setEmpId((Long) row.get("emp_id"));
							fetchEmployeeDeatilsDto.setFirstNm((String) row.get("first_nm"));
							fetchEmployeeDeatilsDto.setMiddleNm((String) row.get("middle_nm"));
							fetchEmployeeDeatilsDto.setEmpCode((Long) row.get("emp_code"));
							fetchEmployeeDeatilsDto.setLastNm((String) row.get("last_nm"));
							fetchEmployeeDeatilsDto.setMobileNo((Long) row.get("mobile_no"));
							fetchEmployeeDeatilsDto.setCountryNm((String) row.get("country_nm"));
							fetchEmployeeDeatilsDto.setStateNm((String) row.get("state_nm"));
							employeeDepartmentList = new ArrayList<>();
							employeeDesignationList = new ArrayList<>();
						}
						// add department details
						if (row.get("dept_id") != null) {
							EmployeeDepartmentsXref employeeDeptBean = new EmployeeDepartmentsXref();
							employeeDeptBean.setDeptId((String) row.get("dept_id"));

							EmployeeDepartmentsXref fechEmpDeptBean = new EmployeeDepartmentsXref();
							fechEmpDeptBean.setDeptId((String) row.get("dept_id"));
							fechEmpDeptBean.setEmpDeptId((Long) row.get("emp_dept_id"));
							fechEmpDeptBean.setIsactive((Boolean) row.get("isactive"));
							employeeDepartmentList.add(fechEmpDeptBean);
							employeeDepartmentList.add(employeeDeptBean);
						}
						// add designations details
						if (row.get("designation_id") != null) {
							EmployeeDesignationXref employeeDesignationBean = new EmployeeDesignationXref();
							employeeDesignationBean.setDesignationId((Long) row.get("designation_id"));
							EmployeeDesignationXref fetchEmpDesignationBean = new EmployeeDesignationXref();
							fetchEmpDesignationBean.setEmpDesignId((Long) row.get("emp_design_id"));
							fetchEmpDesignationBean.setDesignationId((Long) row.get("designation_id"));
							fetchEmpDesignationBean.setEmpId((Long) row.get("emp_id"));
							fetchEmpDesignationBean.setOrgId((Long) row.get("org_id"));
							fetchEmpDesignationBean.setIsactive((Boolean) row.get("isactive"));
							employeeDesignationList.add(fetchEmpDesignationBean);
						}
					
						//fetchEmployeeDeatilsDtoList.add(fetchEmployeeDeatilsDto);
					}
		if (fetchEmployeeDeatilsDto != null) {
			if (CollectionUtils.isNotEmpty(employeeDesignationList)) {
				fetchEmployeeDeatilsDto.setDesignationList(employeeDesignationList);
			}
			if (CollectionUtils.isNotEmpty(employeeDepartmentList)) {
				fetchEmployeeDeatilsDto.setDepartmentList(employeeDepartmentList);
			}
			fetchEmployeeDeatilsDtoList.add(fetchEmployeeDeatilsDto);
		}
					
		return fetchEmployeeDeatilsDtoList;
		}
}

