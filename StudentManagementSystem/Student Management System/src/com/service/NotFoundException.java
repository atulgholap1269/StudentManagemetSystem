package com.service;
import java.lang.*;
public class NotFoundException extends RuntimeException{
	static String mesg="Student not found in system";
    public NotFoundException()
    {
    	super(mesg);
    }
    public NotFoundException(String mesg)
    {
    	super(mesg);
    }
}
