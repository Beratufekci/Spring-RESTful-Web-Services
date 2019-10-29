package com.spring.RestfulWebService.exception;

import java.util.Date;

public class ExceptionResponse {
	
	private Date timestamp;
	private String message;
	private String details;
	
	public ExceptionResponse (Date timestamp, String message, String details) {
		
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
		
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public Date getTimeStamp() {
		return timestamp;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	
	public void setDetails(String details) {
		this.details = details;
	}
	public String getDetails() {
		return details;
	}
	
	
}