package com.serviceImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.service.Course;
import com.service.NotFoundException;
import com.service.Student;
import com.service.StudentManagement;

public class StudentManagemetImplementation  implements StudentManagement
{
    Scanner sc = new Scanner(System.in);
    static int no=0;
    static ArrayList<Student>arr=new ArrayList<>();
	
    @Override
	public void addStudent() {
		System.out.println("Enter number of student want to add");
		int student=sc.nextInt();
		
		for(int i=0;i<student;i++)
		{
		   System.out.println("Enter Studnet id");
		   int sid=sc.nextInt();
		   System.out.println("Enter student name");
		   String sname=sc.next();
		   System.out.println("Enter student grade");
		   double grade=sc.nextDouble();
		   System.out.println("Enter course Id");
		   int cid=sc.nextInt();
		   System.out.println("Enter course name");
		   String cname=sc.next();
		   Student s=new Student(sid,sname,grade, new Course(cid,cname));
		  arr.add(s);
		}
		
	}

	@Override
	public void listStudent() {
		if(arr.isEmpty())
		{
			throw new NotFoundException("list is empty");
		}
		else
		{
		System.out.println("Student name\tId\tGrade\tCorse Id\tCourse name");
		for(Student s1:arr)
		{
			
		System.out.println(s1.getSname()+"\t\t" +s1.getSid()+"\t"+s1.getGrade()+"\t"+s1.getC().getCid()+"\t\t"+s1.getC().getCname());
			
		}
		}
	}

	@Override
	public void displayStudentByCourse(String name) {
		
		if (arr.isEmpty()) 
		{
			throw new NotFoundException("list is empty");
		}
		Iterator<Student> itr =arr.iterator();
		System.out.println("Student name\tId\tGrade\tCorse Id\tCourse name");
		boolean isPresent =false;
		while(itr.hasNext())
		{
			 Student s=itr.next();
			 if(s.getC().getCname().equalsIgnoreCase(name))
			   {
				  isPresent =true;
			   }
			  
		}
		if(isPresent==true)
		{
		  Iterator<Student> itr1 =arr.iterator();
		  while(itr.hasNext())
		   {
			 Student s=itr.next();
			 if(s.getC().getCname().equalsIgnoreCase(name))
			   {
				 System.out.println(s.getSname()+"\t\t" +s.getSid()+"\t"+s.getGrade()+"\t"+s.getC().getCid()+"\t\t"+s.getC().getCname());
			   }
		   }
		}
		else
		{
			throw new NotFoundException("Corse name is not present in list");
		}
	}

    @Override
	public void removeStudent(int id) {
		if (arr.isEmpty()) 
		{
			throw new NotFoundException("list is empty");
		} 
		else
		{
			Iterator<Student> i = arr.iterator();
			boolean isPresent = false;

			while (i.hasNext()) {

				Student s1 = i.next();
				if (s1.getSid() == id) {
					isPresent = true;
				}
			}

			if (isPresent == true) {
				Iterator<Student> itr = arr.iterator();
				while (itr.hasNext()) {
					Student s1 = itr.next();
					if (s1.getSid() == id) {
						itr.remove();
						System.out.println("Student remove from system");
					}

				}
			} 
			else 
			{
				throw new NotFoundException("Id is not present in system");
			}

		}
	}

    @Override
	public void searchStudent(String s) {
    	if (arr.isEmpty()) 
		{
			throw new NotFoundException("List is empty");
		}
    	 
		System.out.println("Student name\tId\tGrade\tCorse Id\tCourse name");
		boolean isPresent=false;
		Iterator<Student> i=arr.iterator();
	    while(i.hasNext())
	    {
	    	Student s1=i.next();
	    	
	    	String c1=s.toLowerCase();
	    	int l=c1.length();
	    	String c2=s1.getSname().toLowerCase();
	    	if(c2.substring(0,l/2).equals(c1.substring(0,l/2)))
	    	{
	    		isPresent=true;
	    	}
	    
	    }
	    if(isPresent==true)
	    {
	    	Iterator<Student> ite=arr.iterator();
            Student s1=i.next();
	    	
	    	String c1=s.toLowerCase();
	    	int l=c1.length();
	    	String c2=s1.getSname().toLowerCase();
	    	if(c2.substring(0,l/2).equals(c1.substring(0,l/2)))
	    	{
	    		System.out.println(s1.getSname()+"\t\t" +s1.getSid()+"\t"+s1.getGrade()+"\t"+s1.getC().getCid()+"\t\t"+s1.getC().getCname());
	    	}  
	    }
	    else
	    {
	    	throw new NotFoundException("Student name is not present in system");
	    }
	    
	  
	}

	@Override
	public void displayAllStudentByCourse() {
		
		if (arr.isEmpty()) 
		{
			throw new NotFoundException("List is empty");
		}
		HashMap<String, ArrayList<Student>> hs=new HashMap<>();
		Iterator<Student> itr=arr.iterator();
		
		while(itr.hasNext())
		{
			Student s=itr.next();
			String cname=s.getC().getCname();
			String sname=s.getSname();
			if(hs.containsKey(cname))
			{
				ArrayList<Student>ar=hs.get(cname);
				ar.add(s);
				hs.put(cname,ar);
			}
			else
			{
				ArrayList<Student> ar=new ArrayList<>();
				ar.add(s);
				hs.put(cname, ar);
			}
		}
		Set<Entry<String, ArrayList<Student>>>se=hs.entrySet();
		Iterator<Entry<String, ArrayList<Student>>>itr1 = se.iterator();
		while(itr1.hasNext())
		{
			Entry<String, ArrayList<Student>>en=itr1.next();
			System.out.println("Department : "+en.getKey());
			ArrayList<Student> al=en.getValue();
			Iterator<Student> it=al.iterator();
			System.out.println("Student name\tId\tGrade\tCorse Id\tCourse name");
			while(it.hasNext())
			{
				Student s=it.next();
				System.out.println(s.getSname()+"\t\t" +s.getSid()+"\t"+s.getGrade()+"\t"+s.getC().getCid()+"\t\t"+s.getC().getCname());
			}
		}
	}

}
