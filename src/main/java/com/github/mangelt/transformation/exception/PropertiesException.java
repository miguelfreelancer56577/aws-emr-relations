package com.github.mangelt.transformation.exception;

/**
 * Wraps all the exceptions triggered by the {@link #Properties}
 * 
 * @author mangelt
 *
 */
public class PropertiesException extends RuntimeException {
	
	private static final long serialVersionUID = 19565839L;

	public PropertiesException(String msg, Throwable e){
		super(msg, e);
	}
	
	public PropertiesException(Exception e){
		super(e);
	}
	
}