package com.devsuperior.dsclient.services.exceptions;

public class DataBaseException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DataBaseException() {
		
	}
	
	public DataBaseException(String msg) {
		
		super(msg);
	}

}