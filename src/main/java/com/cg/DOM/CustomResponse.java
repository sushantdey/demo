package com.cg.DOM;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component("customResponse")
@Data
public class CustomResponse {
	private int httpStatusCode;
	private String responseMessage;
	public CustomResponse() {
		super();
	}
	public CustomResponse(String responseMessage) {
		super();
		this.responseMessage = responseMessage;
	}	
}
