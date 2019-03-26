package com.techgig.weatherforecast;

public class GenericResponse<T> {

	private String responseCode;
	private String message;
	private T response;

	public GenericResponse() {

	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getResponse() {
		return response;
	}

	public void setResponse(T response) {
		this.response = response;
	}



}
