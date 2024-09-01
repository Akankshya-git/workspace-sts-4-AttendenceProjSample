package com.wipro.ICICI.PID_Mapping.Entity;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table("TBL_TECH_LEAD_PID_GENERATE")
public class TechLeadPID {
	
	@Id
	private String pidNumber;
	private String techLeadUserID;
	private String userID;
	private Date createdDate;
	private int isActive;

}
