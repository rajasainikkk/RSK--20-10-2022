package com.exception.bll;

public class Divide {
	public static void main(String[] args)
{
		System.out.println("Devision : "+divide(6,0));
	

	}

	public static int divide(int x, int y) 
	{
		int d=0;
		try {
			d = x/y;
			
	}   catch(ArithmeticException e)
		{
			System.out.println("Can not divide by zero");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return d;
	}

}
