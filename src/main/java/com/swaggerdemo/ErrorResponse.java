package com.swaggerdemo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(description = "Error Response Model")
public class ErrorResponse {
	
	@ApiModelProperty(notes = "Error code", name = "code", value = "200")
	private int code;
	
	@ApiModelProperty(notes = "Status", name = "message", value = "Success")
	private String status;
	
	@ApiModelProperty(notes = "message", name = "message", value = "Invalid field")
	private String message;
	
	
	
    //Getters and Setters
	public int getCode() { return code; }

	public void setCode(int code) {
		this.code = code;
	}

	public String getStatus() { return status; }

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() { return message; }

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
