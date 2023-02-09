package com.wissen.response;

public class ErrorResponse {

	private String Status;
	private Integer errorcode;
	private String message;
	
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Integer getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(Integer errorcode) {
		this.errorcode = errorcode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ErrorResponse(String status, Integer errorcode, String message) {
		super();
		Status = status;
		this.errorcode = errorcode;
		this.message = message;
	}
	public ErrorResponse() {
		super();

	}
	
	
	
}
