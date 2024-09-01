package com.WiproICICI.demo.AttendenceSample.GenerateBillService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WiproICICI.demo.AttendenceSample.Entity.Employee;
import com.WiproICICI.demo.AttendenceSample.Entity.RequestData;
import com.WiproICICI.demo.AttendenceSample.Repo.BillRepoInterface;
import com.WiproICICI.demo.AttendenceSample.Repo.BillRepoInterfaceTest;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class GenerateBillServiceImpl implements GenerateBillServiceInterface{

	@Autowired
	BillRepoInterface billRepo;
	
	@Autowired
	BillRepoInterfaceTest test;
	
//	@Override
//	public /*List<Map<String, String>>*/ RequestData getByGenerateInvoice(String flag, String month, String year, String vendorId,
//			String vendorName, String dept, String resourceType, String poNumber) {
//		List<RequestData> data= billRepo.findByGenerateInvoice(flag,month, year, vendorId, vendorName,dept, resourceType, poNumber);
//		return data;
//	}

	@Override
	public RequestData getByVendorId(String vid) {
		System.out.println(vid+ "Here at Service Layer in getByVendorId");
		System.out.println("Hello calling repo"+billRepo.findByVendorIdUsingSP(vid));
		
		return billRepo.findByVendorIdUsingSP(vid) ;
	}
	
	@Override
	public List<RequestData> getByVendorNameJPAFun(String vendorName) {
		System.out.println("here inside repo call::"+ billRepo.findByVendorName(vendorName));
		return billRepo.findByVendorName(vendorName) ;
	}
	
	@Override
	public RequestData setByJPAFun(RequestData rd) {
		billRepo.save(rd);
		return rd;
	}
	
	@Override
	public RequestData updateByJPAFun(RequestData rd1) {
//		RequestData rd = billRepo.findById(rd1.getId()).orElse(new RequestData());
		RequestData rd = billRepo.findById(rd1.getId());

		
		rd.setVendorId(rd1.getVendorId());
		rd.setApporveName(rd1.getApporveName());
		rd.setApproveId(rd1.getApporveName());
		rd.setDeliveryHeadId(rd1.getDeliveryHeadId());
		rd.setDeliveryHeadName(rd1.getDeliveryHeadName());
		rd.setDepartment(rd1.getDepartment());
		rd.setIsApprove(rd1.getIsApprove());
		rd.setMonth(rd1.getMonth());
		rd.setMonthNo(rd1.getMonthNo());
		rd.setPoNumber(rd1.getMonthNo());
		rd.setResourceType(rd1.getResourceType());
		rd.setVendorId(rd1.getVendorId());
		rd.setVendorName(rd.getVendorName());
		rd.setYear(rd.getYear());
		rd.setYearNo(rd1.getYearNo());
		
		
		billRepo.save(rd);
		return rd;
	}
	
	@Override
	public List<RequestData> findAllByJPAFun() {
		return billRepo.findAll();
	}

	@Override
	public RequestData getById(/*int   Integer*/ int id) {
		RequestData rd= billRepo.findByIdSP(id);
		System.out.println("Inside getById in SErvice  "+ rd);
		return rd;
	}


	/* 
	 * EMPLOYEE_TBL 
	 * */
	@Override
	public String getEmployeeByIdSP(String id) {
		System.out.println("id at service layer"+ id);
		String temp=test.getEmployeeById(id);
		return temp;
	}
	
	
	

	/*
	 * String
	 * getEmployeeByOrganisation
	 * 
	 */	
	
//	@Override
//	public String getEmployeeByOrganisationSP(String organisation ) {
//		String emp= test.getEmployeeByOrganisation(organisation);
//		System.out.println("org in service "+organisation+"emp :"+emp);
//
//		return emp;
//	}
	
	
	
	
	/*
	 * List<String>
	 * getEmployeeByOrganisation
	 * gets me null object
	 */	
	
	@Override
	public List<String> getEmployeeByOrganisationSP(String organisation ) {
		List<String> emp= test.getEmployeeByOrganisation(organisation);
		System.out.println("org in service "+organisation+"emp :"+emp);

		return emp;
	}
	
	
	/*
	 * List<Employee>
	 * getEmployeeByOrganisation1
	 * No converter found capable of converting from type [java.lang.String] to type [com.WiproICICI.demo.AttendenceSample.Entity.Employee]
	 */	
	
	
	@Override
	public List<Employee> getEmployeeByOrganisationSP1(String organisation ) {
		List<Employee> emp= test.getEmployeeByOrganisation1(organisation);
		System.out.println("organisation in service "+organisation+"emp :"+emp);

		return emp;
	}
	
	
	
	
	
	
	/*
	 * Didn't work yet
	 */
	
	@Override
	public List<String> findMonthByMonthNoSP(String mn) {
		List<String > month= billRepo.GET_MONTH_BY_MONTH_NO(mn);
		return month;
	}
}
