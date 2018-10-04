package com.example.model;

/**
 * Example model class
 * 
 * @author Administrador
 *
 */
public class ExampleResponse {

	private String status;
	private Integer code;

	public ExampleResponse(String status, Integer code) {
		super();
		this.status = status;
		this.code = code;
	}

	/*
	 * Getters and Setters
	 */
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

}
