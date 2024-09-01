package com.WiproICICI.demo.AttendenceSample.Controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.WiproICICI.demo.AttendenceSample.Entity.Employee;
import com.WiproICICI.demo.AttendenceSample.Entity.RequestData;
import com.WiproICICI.demo.AttendenceSample.GenerateBillService.GenerateBillServiceImpl;
import com.WiproICICI.demo.AttendenceSample.Repo.BillRepoInterfaceTest;

import jakarta.transaction.Transactional;
@Transactional
@org.springframework.stereotype.Controller
@RequestMapping(value = "/api")
public class Controller {
	
	@Autowired
	GenerateBillServiceImpl service;
	@Autowired
	BillRepoInterfaceTest test;
	
//	@PostMapping("/generateInvoice")
//	public RequestData generateInvoice(@RequestBody RequestData requestData){
//		
//		String flag = "GET_REPORT";
//		String month= requestData.getMonth();
//		String year= requestData.getYear();
//		String vendorName= requestData.getVendorName();
//		String vendorId= requestData.getVendorId();
//
//		String dept= requestData.getDepartment();
//		String resourceType= requestData.getResourceType();
//		String poNumber= requestData.getPoNumber();
//		
//		RequestData generateInvoiceData = service.getByGenerateInvoice(flag, month, year, vendorId, vendorName, dept, resourceType, poNumber );
//		
//				return generateInvoiceData;
//		}
	
//	@GetMapping("/getByVendorId/{vid}")
//	public @ResponseBody RequestData getDataByVendorId(@RequestBody String vendorId){
//		System.out.println(vendorId);
//		RequestData requestData= service.getByVendorId( vendorId);
//		System.out.println(requestData);
//		
//				return requestData;
//		}
	
	@GetMapping("/getById")
	public @ResponseBody RequestData getDataById(@RequestBody RequestData rqstdata ){
		
		System.out.println(rqstdata.getId());
		
		
		RequestData requestData= service.getById(rqstdata.getId());
		
		System.out.println(requestData + " Here after service function is called");

				return requestData;
		}
	
	@GetMapping("/getByVendorId")
	public @ResponseBody RequestData getDataByVendorId(@RequestBody RequestData rqstdata ){
		
		String vendorId= rqstdata.getVendorId();
		System.out.println(vendorId);
		
		
		RequestData requestData= service.getByVendorId( vendorId);
		
		
		System.out.println(requestData + " Here after service function is called");

		return requestData;
		}
	
	@GetMapping("/getByVendorName")
	public @ResponseBody List<RequestData> getDataByVendorName(@RequestBody String vendorName)/*(@RequestParam String vendorName) (@RequestBody String vendorName)*/{
			System.out.println("Endpoiny hitted  "+ vendorName);
			List<RequestData> requestData= service.getByVendorNameJPAFun(vendorName);
				System.out.println("Print::"+requestData);
				return requestData;
		}
	
	@PostMapping("/setRequestData")
	public @ResponseBody RequestData setDataByJPAFun(@RequestBody RequestData requestData){
			System.out.println("Endpoiny hitted");
			RequestData rd= service.setByJPAFun(requestData);
				System.out.println("Print::"+rd);
				return rd;
		}
	
		@PutMapping("/updateRequestData"			/* "/updateRequestData/{id}" */)
		public @ResponseBody RequestData updateByJPAFun( @RequestBody RequestData requestData/* , @RequestBody int id */){
			System.out.println("Endpoiny hitted");
			RequestData rd = service.updateByJPAFun(requestData/* , id */);
				System.out.println("Print::"+rd);
				return rd;
		}
	
	@GetMapping("/allRequestData")
	public @ResponseBody List<RequestData> findAll(){
			System.out.println("Endpoiny hitted RequestAll");
			List<RequestData> rd= service.findAllByJPAFun();
				System.out.println("Print::"+rd);
				return rd;
		}
	@GetMapping("/monthNo/{mn}/month")
	public @ResponseBody List<String> getMonthByMonthNo(@RequestBody RequestData rd){
			System.out.println("Endpoiny hitted getMonthByMonthNo");
			String mn= rd.getMonthNo();
			List<String> month= service.findMonthByMonthNoSP(mn);
				System.out.println("Print::"+month);
				return month;
		}
	// 	@PostMapping("/test") gives employee name of id 1

	@GetMapping("/test")
	public @ResponseBody String getmonth(@RequestBody String id) {
		System.out.println("\n@@@@@   NEW CALL    @@@@@@\nid"+id);
		String temp=service.getEmployeeByIdSP(id);
		System.out.println("temp:"+temp);
		return temp;
	}

	
	/* Return type string
	 * 
	 *  service.getEmployeeByOrganisationSP
	 *  
	 *  */
	
//	@PostMapping("/getEmployeeByOrganisation")
//	public @ResponseBody String getEmployeeByOrganisation(@RequestParam("org") String organisation) {
//		String temp=service.getEmployeeByOrganisationSP(organisation);
//		System.out.println("org  "+organisation+"temp:"+temp);
//		return temp;
//	}
	
	
	
	
	
	
//	/* Return type List<string>
//	 * 
//	 *  service.getEmployeeByOrganisationSP
//	 *  
//	 *  */
//	
//	@PostMapping("/getEmployeeByOrganisation")
//	public @ResponseBody List<String> getEmployeeByOrganisation(@RequestBody String organisation) {
//		List<String> temp=service.getEmployeeByOrganisationSP(organisation);
//		System.out.println("org  "+organisation+"temp:"+temp);
//		return temp;
//	}
	
	@PostMapping("/getEmployeeByOrganisation")
	public @ResponseBody List<String> getEmployeeByOrganisation(@RequestParam("org") String organisation) {
		List<String> temp=service.getEmployeeByOrganisationSP(organisation);
		System.out.println("org  "+organisation+"temp:"+temp);
		return temp;
	}
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * Return type List<employee>
	 * 
	 * test.getEmployeeByOrganisation1
	 * 
	 */
	@PostMapping("/getEmployeeByOrganisation1")
	public @ResponseBody List<Employee> getEmployeeByOrganisation1(@RequestBody String organisation) {
		List<Employee> temp=test.getEmployeeByOrganisation1("ICICI");
		System.out.println("organisation  "+organisation+"temp:"+temp);
		return temp;
	}
}
