package com.ExceptionalHandling;

public class InvalidAgeException extends Exception {
	
//defaultconstr
	
	public InvalidAgeException()
	{
		super();
	}

	
	InvalidAgeException(String message)
	{
		super(message);
	}
	
}
