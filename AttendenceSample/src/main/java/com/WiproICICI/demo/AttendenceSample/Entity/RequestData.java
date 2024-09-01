package com.WiproICICI.demo.AttendenceSample.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import lombok.Data;
import lombok.ToString;

@Entity
//@NamedStoredProcedureQuery(name="findByVendorIdUsingSP",
//							procedureName="TESTING", 
//							parameters= {@StoredProcedureParameter(
//											mode=ParameterMode.IN,
//											name="vendor_id_in",
//											type=/*Integer.class*/Integer.class )	}	) 
//@NamedStoredProcedureQuery(name="findByIdSP",
//							procedureName="FIND_DATA_BY_ID", 
//							parameters= {@StoredProcedureParameter(
//											mode=ParameterMode.IN,
//											name="id_in",
//											type=/*Integer.class*/ String.class) }  )
@NamedStoredProcedureQuery(name="GET_MONTH_BY_MONTH_NO",
procedureName="GET_MONTH_BY_MONTH_NO", 
parameters= {@StoredProcedureParameter(
				mode=ParameterMode.IN,
				name="month_no_in",
				type=String.class),
			@StoredProcedureParameter(
					mode=ParameterMode.OUT,
					name="month_in",
					type=String.class )}	) 
public class RequestData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
//	private Integer id;

//	private int id;
	private String vendorId;
	private String year;
	private String month;
	private String department;
	private String vendorName;
	
	private String resourceType;
	private String poNumber;
	private String deliveryHeadId;
	private String deliveryHeadName;
	private String monthNo;
	private String yearNo;
	private String isApprove;
	private String approveId;
	private String apporveName;
	
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public String getPoNumber() {
		return poNumber;
	}
	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}
	public String getDeliveryHeadId() {
		return deliveryHeadId;
	}
	public void setDeliveryHeadId(String deliveryHeadId) {
		this.deliveryHeadId = deliveryHeadId;
	}
	public String getDeliveryHeadName() {
		return deliveryHeadName;
	}
	public void setDeliveryHeadName(String deliveryHeadName) {
		this.deliveryHeadName = deliveryHeadName;
	}
	public String getMonthNo() {
		return monthNo;
	}
	public void setMonthNo(String monthNo) {
		this.monthNo = monthNo;
	}
	public String getYearNo() {
		return yearNo;
	}
	public void setYearNo(String yearNo) {
		this.yearNo = yearNo;
	}
	public String getIsApprove() {
		return isApprove;
	}
	public void setIsApprove(String isApprove) {
		this.isApprove = isApprove;
	}
	public String getApproveId() {
		return approveId;
	}
	public void setApproveId(String approveId) {
		this.approveId = approveId;
	}
	public String getApporveName() {
		return apporveName;
	}
	public void setApporveName(String apporveName) {
		this.apporveName = apporveName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/*
	 * This is commented because I was trying to use Integer class according to
	 * https://www.baeldung.com/spring-data-jpa-stored-procedures
	 */
	
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
	
	@Override
	public String toString() {
		return "RequestData [id=" + id + ", vendorId=" + vendorId + ", year=" + year + ", month=" + month
				+ ", department=" + department + ", vendorName=" + vendorName + ", resourceType=" + resourceType
				+ ", poNumber=" + poNumber + ", deliveryHeadId=" + deliveryHeadId + ", deliveryHeadName="
				+ deliveryHeadName + ", monthNo=" + monthNo + ", yearNo=" + yearNo + ", isApprove=" + isApprove
				+ ", approveId=" + approveId + ", apporveName=" + apporveName + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
