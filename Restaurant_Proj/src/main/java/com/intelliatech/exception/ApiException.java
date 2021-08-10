package com.intelliatech.exception;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;

public class ApiException {

	String massege;
	List<String> deatils;
	HttpStatus status;
	LocalDateTime timestemp;
	public String getMassege() {
		return massege;
	}
	public void setMassege(String massege) {
		this.massege = massege;
	}
	public List<String> getDeatils() {
		return deatils;
	}
	public void setDeatils(List<String> deatils) {
		this.deatils = deatils;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public LocalDateTime getTimestemp() {
		return timestemp;
	}
	public void setTimestemp(LocalDateTime timestemp) {
		this.timestemp = timestemp;
	}
	public ApiException(String massege, List<String> deatils, HttpStatus status, LocalDateTime timestemp) {
		super();
		this.massege = massege;
		this.deatils = deatils;
		this.status = status;
		this.timestemp = timestemp;
	}
	public ApiException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
