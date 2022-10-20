package com.exception.bll;

public class BookNotFoundException extends Exception
{
	public BookNotFoundException(String msg)
	{
		super(msg);
	}
}
