package com.main;



import java.util.InputMismatchException;
import java.util.Scanner;

import com.Controller.StudentController;




public class Main {
    public static void main(String[] args) {
    	StudentController obj = new StudentController();
    	Scanner sc = new Scanner(System.in);
    	String option;
    	try {
    	System.out.println("Welcome to Student Management System.\nSelect the below option to continue");
    	
    	do
    	{
    		System.out.println("1.Add student");
    		System.out.println("2.List student");
    		System.out.println("3.Display student in course");
    		System.out.println("4.Remove student by name");
    		System.out.println("5.Search student");
    		System.out.println("6.Display all student by course");
    		
    		System.out.println("Enter choice");
    	    int choice=sc.nextInt();
    	    
    	    switch(choice)
    	    {
    	     case 1:
    	    	obj.perfromOperation(choice);
    	    	 break;
    	     case 2:
    	    	 obj.perfromOperation(choice);
    	    	 break;
    	     case 3:
    	    	 obj.perfromOperation(choice);
    	    	 break;
    	     case 4: 
    	    	 obj.perfromOperation(choice);
    	    	 break;
    	     case 5:
       	    	 obj.perfromOperation(choice);
    	    	 break;
    	     case 6:
    	    	 obj.perfromOperation(choice);
    	    	 break;
    	     default:
    	    	 System.out.println("Invalid choice. Please try again");
    	    	 break;
    	    }
    	    System.out.println("Do you want to continue:\nEnter Yes or No");
    	    option =sc.next();
    	}while(option.equalsIgnoreCase("yes"));
    	}
    	catch(InputMismatchException e)
    	{
    		System.out.println("enter input not match with datatype of attribute");
    		return;
    	}
    	sc.close();
	}
}
