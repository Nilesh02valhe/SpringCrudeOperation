package com.nil.SpringCrudeMVCOperation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nil.SpringCrudeMVCOperation.Model.Student;
import com.nil.SpringCrudeMVCOperation.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceI {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStu(Student stu) {
		Student student = studentRepository.save(stu);
		
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> find = (List<Student>) studentRepository.findAll();
		
		return find;
	}

	@Override
	public Boolean DeleteAllstu() {
		List<Student> all = (List<Student>) studentRepository.findAll();
		if(all.isEmpty()) {
			return false;
		}else {
			studentRepository.deleteAll();
			return true;
		}
		
	}

}
