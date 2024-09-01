package com.WiproICICI.demo.AttendenceSample.Repo;

import java.util.List;
import java.util.Map;

//import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.WiproICICI.demo.AttendenceSample.Entity.RequestData;


@Repository
public interface BillRepoInterface extends JpaRepository<RequestData, Integer> {

	@Procedure(procedureName ="TESTING")
	RequestData findByVendorIdUsingSP(@Param("vendor_id_in")String vendor_id_in);  

//	RequestData findByVendorIdUsingSP(@Param("vendor_id_in")String vendor_id_in);  // False(This had no impact): don't use @param if you used annotation @NamedStoredProcedure

//	RequestData findByVendorIdUsingSP(@Param("vendor_id_in")String vendorId);    // Data truncation: Data too long for column 'vendor_id' at row 1. Solution :I actually had forgotten that it was 255 in varchar length not 25 inside stored procedure.



	
	List<RequestData> findByVendorName(String vendorName);

	RequestData findByVendorId(String vendorId);
	RequestData findById(int id);

	@Procedure("FIND_DATA_BY_ID") // Same response as query language  in Post man 404 but hitting db
	RequestData findByIdSP(Integer id_in);
//	RequestData findByIdSP(@Param("id_in")Integer id_in);

	/*(procedureName = "")*/
	@Procedure //(outputParameterName = "month_in")
//	@Query(nativeQuery = true, value="{CALL GET_MONTH_BY_MONTH_NO(:month_no_in) }")
	List<String> GET_MONTH_BY_MONTH_NO(@Param("month_no_in")String month_no_in);

	
	
	
	
	
	
	

	
//	@Procedure("FIND_DATA_BY_ID") // Same response as query language  in Post man 404 but hitting db
	
//	@Query(nativeQuery=true, value="CALL FIND_DATA_BY_ID(:id_in);") // Syntax at baeldung Getting red line syntax error from IDE SQL:
//	no viable alternative at input 'CALL FIND_DATA_BY_ID(:id_in'
	
//	@Query(nativeQuery=true, value="SELECT * FROM request_data WHERE id= @id_in") // Can look for Graph ql  but not hitting the db

//	RequestData findByVendorName(String vendorName);
}



////@Query(nativeQuery = true, value ="{CALL USP_Attendence_Generate_Report_NEW(:FLAG, :MONTH_NUMBER,:VENDOR_NAME,: VENDOR_ID, : DEPARTMENT, :RESOURCE_TYPE, PO_NUMBER)}")
//@Procedure(" SET_DATA")
//RequestData findByGenerateInvoice(String flag, String month, String year, String vendorId,
//	String vendorName, String dept, String resourceType, String poNumber);

//@Query(nativeQuery= true, value="{CALL Testing(:VENDORID)}")
