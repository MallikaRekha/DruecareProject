package com.Employee.Been;

public class EmployeeDepartmentsXref {
	
	private Long empDeptId;
	private String deptId;
	private Long orgId;
	private Boolean isactive;
	public Long getEmpDeptId() {
		return empDeptId;
	}
	public void setEmpDeptId(Long empDeptId) {
		this.empDeptId = empDeptId;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public Long getOrgId() {
		return orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	public Boolean getIsactive() {
		return isactive;
	}
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

}
