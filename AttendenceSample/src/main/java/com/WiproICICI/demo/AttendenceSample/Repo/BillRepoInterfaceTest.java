package com.WiproICICI.demo.AttendenceSample.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.WiproICICI.demo.AttendenceSample.Entity.Employee;
import com.WiproICICI.demo.AttendenceSample.Entity.RequestData;

@Repository
public interface BillRepoInterfaceTest extends JpaRepository<RequestData, Integer>{
	
//	 Unknown column 'id' in 'field list'  if you remove the :
	@Query(nativeQuery = true,value = "{call GetEmployeeById(:id)}")
	String getEmployeeById(@Param("id")String id);
	
	
	/* Return String 
	 * 
	 *  getEmployeeByOrganisation */
	
//	
//	@Query(nativeQuery = true,value = "{call GetEmployeeByOrganisation(:organisation)}")
////	@Procedure
//	String getEmployeeByOrganisation(@Param("organisation") String organisation); 
	
	
	
	
	/* Return List<String >
	 * 
	 *  getEmployeeByOrganisation */
	
	
	@Query(nativeQuery = true,value = "{call GetEmployeeByOrganisation(:organisation)}")
//	@Procedure
	List<String> getEmployeeByOrganisation(@Param("organisation") String organisation); 
	
	
	
	/*
	 * List<Employee> getEmployeeByOrganisation1
	 */
	
	
	@Query(nativeQuery = true,value = "{call GetEmployeeByOrganisation(:organisation)}")
//	@Procedure(procedureName ="GetEmployeeByOrganisation")
	List<Employee> getEmployeeByOrganisation1(@Param("organisation") String organisation); 
	
	
}
