package com.Employee.Been;

public class EmployeeDesignationXref {
	
	private Long empDesignId;
    private Long designationId;
    private Long empId;
    private Long orgId;
    private Boolean isactive;
	public Long getEmpDesignId() {
		return empDesignId;
	}
	public void setEmpDesignId(Long empDesignId) {
		this.empDesignId = empDesignId;
	}
	public Long getDesignationId() {
		return designationId;
	}
	public void setDesignationId(Long designationId) {
		this.designationId = designationId;
	}
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
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
