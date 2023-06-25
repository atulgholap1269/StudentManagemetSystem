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
	    	 manage.listStudent();
	    	 break;
	     case 3:
	    	 System.out.println("Enter course name to show all student in that course");
	    	 String cname=sc.next();
	    	 manage.displayStudentByCourse(cname);
	    	 break;
	     case 4: 
	    	 System.out.println("Enter student id that you want remove");
	    	 int id=sc.nextInt();
	    	 try
	    	 {
	    		 manage.removeStudent(id);
	    	}
	    	catch(NotFoundException e)
	    	 {
	    		System.out.println("Enter id is not present in system\nPlease enter id which is present in system");
	    	 }
	    	 break;
	     case 5:
   	    	 System.out.println("Enter student name you want search");
	    	 String s1=sc.next();
	    	 try
	    	 {
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