package com.swaggerdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiParam;




@RestController

@RequestMapping("/profile/v1/employee")

public class EmployeeCantroller {
	
	
	
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Suceess|OK", response = Employee.class),
			@ApiResponse(code = 401, message = "not authorized!", response = ErrorResponse.class), 
			@ApiResponse(code = 403, message = "forbidden!!!", response = ErrorResponse.class),
			@ApiResponse(code = 404, message = "not found!!!", response = ErrorResponse.class) })
	
	
	@ApiOperation(value = " Check the System ")
	@GetMapping
	public String returnValue() { return "Hi,Welcome to the employee Section"; }
	
	
	
	
	List<Employee> employee = new ArrayList<Employee>();
	{
		employee.add(new Employee("101","Jack", "IT"));
		employee.add(new Employee("102", "Rock", "TSG"));
		employee.add(new Employee("103", "Sam", "Accounts"));
		employee.add(new Employee("104", "Jhon", "HR"));
	}
			
	
	@ApiOperation(value = "Get list of all employee in the System ", response = Iterable.class)
	@GetMapping(value = "/all")
	public List<Employee> fetchAllEmployee(){return employee;}
	
	
	

	@ApiOperation(value = "Get specific employee by name in the System ",response = Employee.class)
	@GetMapping(value = "/fetch/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployeeByName(@ApiParam(value = "Employee Name")@PathVariable(value = "name") String name) {
		List<Employee> employeeByName = employee.stream().filter(x -> x.getName().equalsIgnoreCase(name))
				.collect(Collectors.toList());
		return employeeByName;
	
		}
	
	
	
	@ApiOperation(value = "insert a employee  in the System ", response = Iterable.class)
	@PostMapping("/insert")
	public Employee insertEmployee(@ApiParam(value = "Employee")@RequestBody Employee employee) {
		return employee;
	}
	
	@ApiOperation(value = "Update a employee in the System ", response = Iterable.class)
	@PutMapping("/update")
	public Employee updateEmployee(@ApiParam(value = "Employee")@RequestBody Employee employee) {
		return employee;
	}
	
	@ApiOperation(value = "delete a employee in the System ", response = Iterable.class)
	@DeleteMapping("/delete")
	public Employee deleteEmployee(@ApiParam(value = "Employee")@RequestBody Employee employee) {
		return employee;
	}
	
	@ApiOperation(value = "Partial update a specific employee in the System ", response = Iterable.class)
	@PatchMapping("/patch")
	public Object patchEmployee(@ApiParam(value = "Employee")@RequestBody Map<String, Object> partialUpdate) {
		return partialUpdate;
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	

}
