package com.nil.SpringCrudeMVCOperation.Service;

import java.util.List;

import com.nil.SpringCrudeMVCOperation.Model.Student;

public interface StudentServiceI {
	
	public Student saveStu(Student stu);
	
	public List<Student> getAllStudent();
	
	public Boolean DeleteAllstu();

}
