package com.exception.bll;

public class EmptyException extends Exception 
{
	
	public EmptyException() {
		super();
	}
	
	public EmptyException(String msg)
	{
		super(msg);
	}
}
