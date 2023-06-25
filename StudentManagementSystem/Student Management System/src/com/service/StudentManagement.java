package com.service;

import java.util.ArrayList;

public interface StudentManagement {
       public void addStudent();
       public void removeStudent(int s); 
       public void searchStudent(String s);
       public void listStudent();
       public void displayStudentByCourse(String cname);
       public void displayAllStudentByCourse();
       
}
