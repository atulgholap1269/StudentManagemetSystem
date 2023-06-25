package com.service;

public class Student {
    int  sid;
    String sname;
    Double grade;
    Course c;
    public Student()
    {
    	
    }
	public Student(int sid, String sname, Double grade, Course c) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.grade = grade;
		this.c = c;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Double getGrade() {
		return grade;
	}
	public void setGrade(Double grade) {
		this.grade = grade;
	}
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", grade=" + grade + ", c=" + c + "]";
	}
    
}
