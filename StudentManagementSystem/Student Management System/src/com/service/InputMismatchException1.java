package com.service;

public class InputMismatchException1 extends RuntimeException{
	static String errMess="enter input not match datatype of attribute";
	public InputMismatchException1()
	{
	  super(errMess);	
	}
	public InputMismatchException1(String str)
	{
		errMess=str;
	}
	
}
