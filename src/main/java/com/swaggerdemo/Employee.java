package com.swaggerdemo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

//import java.io.Serializable;

@ApiModel(description = "Employee Model")
public class Employee   {

	
	//private static final long serialVersionUID = 1L;

	@ApiModelProperty(notes = "ID Of the employee", name = "id", required= true, value = "100" )
	private String id;
	
	@ApiModelProperty(notes = "Name Of the employee", name = "name", required= true, value = "John" )
	private String name; 
	
	
	@ApiModelProperty(notes = "Department Of the employee", name = "department", required= true, value = "IT" )
	private String department;

	public Employee(String id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		
		
		
	}

	public String getId() { return id; }

	public void setId(String id) { this.id = id; }

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public String getDepartment() { return department; }

	public void setDepartment(String department) { this.department = department; }

	
	
	
	
	
	

	
	
	


}
