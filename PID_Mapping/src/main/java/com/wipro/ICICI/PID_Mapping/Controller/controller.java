package com.wipro.ICICI.PID_Mapping.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.wipro.ICICI.PID_Mapping.Entity.TechLeadPID;

@Controller
public class controller {
	
	@Autowired
	PID_ServiceImpl pidService;
	
	// Get two attributes Tech Lead ID and PID from TechLeadID in tables TBL_TECH_LEAD_PID_GENERATE and TBL_SDG_USER_MASTER
	@GetMapping("/GetPID/TechLead/{techLeadId} ")
	public  List<Map<String,String>> getPIDFromTechLeadUserID(@PathVariable )

	// Get two attributes Tech Lead ID and  from TechLeadID in tables  TECH_LEAD_SDG  sp FLAG "GET_TECH_LEAD_DRP"
	@GetMapping("/GetTechLead//{techLeadId} ")
	public @ResponseEntity TechLeadPID getPIDFromTechLeadUserID(@PathVariable )
	
	
	// SAVE   from TechLeadID in tables  TECH_LEAD_SDG  sp FLAG "SAVE_PID_DETAILS"
	@PostMapping("/GetTechLead//{techLeadId} ")
	public TechLeadPID getPIDFromTechLeadUserID(@PathVariable )

}
