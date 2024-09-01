package com.WiproICICI.demo.AttendenceSample.GenerateBillService;

import java.util.List;
import java.util.Map;

import com.WiproICICI.demo.AttendenceSample.Entity.Employee;
import com.WiproICICI.demo.AttendenceSample.Entity.RequestData;

public interface GenerateBillServiceInterface {

//	List<Map<String, String>> getByGenerateInvoice(String flag, String month, String year, String vendorId,
//			String vendorName, String dept, String resourceType, String poNumber);

	RequestData getByVendorId(String vid); // FIND BY VENDOR ID
	List<RequestData> getByVendorNameJPAFun(String vendorName);  // FIND BY VENDOR NAME
	RequestData setByJPAFun(RequestData rd);  // SET 
	List<RequestData> findAllByJPAFun();  // FIND ALL
	RequestData updateByJPAFun(RequestData rd1); // SET
	RequestData getById(int id); // GET BY ID USING STORED PROCEDURE

	//DIDN'T WORK
	List<String> findMonthByMonthNoSP(String mn); // GET MONTH BY MONTH_ NO SP
	
	
	/*
	 * EMPLOYEE_TBL
	 */	
	
	String getEmployeeByIdSP(String id); // GET EMPLOYEE NAME FROM ORGANISATION 
		
	//WIP
	List<Employee> getEmployeeByOrganisationSP1(String organisation); // GET EMPLOYEE FROM ORGANISATION 

	
	List<String> getEmployeeByOrganisationSP(String organisation); // GET EMPLOYEE FROM ORGANISATION ALERT! DB IS LOCAL
	
//	String getEmployeeByOrganisationSP(String organisation); // GET EMPLOYEE FROM ORGANISATION ALERT! DB IS LOCAL
	
	
	
	
	
	
	
	
	
//	RequestData updateByJPAFun(RequestData rd, String vendorId); // UPDATE BY STRING
	
//	RequestData getById(int id); // GET BY ID USING STORED PROCEDURE // USed to comment this if I use Integer class
//	RequestData getById(Integer id); // When I am trying to use integer class for the stored procedure type

}
