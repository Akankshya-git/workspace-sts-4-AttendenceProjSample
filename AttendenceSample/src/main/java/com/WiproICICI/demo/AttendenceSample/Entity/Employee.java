package com.WiproICICI.demo.AttendenceSample.Entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Transactional
@Data
@AllArgsConstructor
@Table(name="EMPLOYEE_TBL")
//@AttributeOverride(name="empId", column=@Column(name="E_ID"))
public class Employee {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private String empId;
//	@Column(name="E_NAME")
	private String empName;
//	@Column(name="E_ORGANISATION")
	private String empOrganisation;
//	@Column(name="E_PANNO")
	private String empPanNo;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpOrganisation() {
		return empOrganisation;
	}
	public void setEmpOrganisation(String empOrganisation) {
		this.empOrganisation = empOrganisation;
	}
	public String getEmpPanNo() {
		return empPanNo;
	}
	public void setEmpPanNo(String empPanNo) {
		this.empPanNo = empPanNo;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empOrganisation=" + empOrganisation
				+ ", empPanNo=" + empPanNo + "]";
	}
	
	

}
