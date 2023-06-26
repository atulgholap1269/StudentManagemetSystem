package com.Controller;

import java.util.InputMismatchException;
import java.util.Scanner;


import com.service.NotFoundException;
import com.service.StudentManagement;
import com.serviceImplementation.StudentManagemetImplementation;

public class StudentController {
	Scanner sc = new Scanner(System.in);
	private StudentManagement manage;
    public StudentController()
    {
    	this.manage=new StudentManagemetImplementation();
    }
    public void perfromOperation(int option)
    {
    	switch(option)
	    {
	     case 1:
	    	
	        manage.addStudent(); 
	        break;
	     case 2:
	    	 try {
	    		 manage.listStudent();
	    	 }
	    	catch(NotFoundException e)
	    	 {
	    		System.out.println(e.getMessage());
	    	 }
    	
	    	 break;
	     case 3:
	    	 System.out.println("Enter course name to show all student in that course");
	    	 String cname=sc.next();
	    	 try {
	    	 manage.displayStudentByCourse(cname);
	    	 }
	    	 catch(NotFoundException e)
	    	 {
	    		 System.out.println(e.getMessage());
	    	 }
	    	 break;
	     case 4: 
	    	
	    	 try
	    	 {
	    		 System.out.println("Enter student id that you want remove");
		    	 int id=sc.nextInt();
	    		 manage.removeStudent(id);
	    	}
	    	catch(NotFoundException e)
	    	 {
	    		System.out.println("Enter id is not present in system\nPlease enter id which is present in system");
	    	 }
	    	 break;
	     case 5:
   	    	 
	    	 try
	    	 {
	    		 System.out.println("Enter student name you want search");
		    	 String s1=sc.next();
	    		 manage.searchStudent(s1);
	    	 }
	    	 catch(NotFoundException e)
	    	 {
	    		System.out.println(e.getMessage());
	    	 }
	    	 break;
	    case 6:
	    	
	    	manage.displayAllStudentByCourse();
	    
	    	break;
	     default:
	    	 System.out.println("Invalid choice. Please try again");
	         break;
    }
    	
}
    
}