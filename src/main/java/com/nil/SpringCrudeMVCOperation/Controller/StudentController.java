package com.nil.SpringCrudeMVCOperation.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nil.SpringCrudeMVCOperation.Model.Student;
import com.nil.SpringCrudeMVCOperation.Service.StudentServiceI;
@Controller
public class StudentController {	
	@Autowired
	private StudentServiceI studentServiceI;
	
	@GetMapping("/wel")
	public String preGeg() {		
		return "regform";
		
	}
	
	@GetMapping("/saveStudent")
	public ModelAndView saveStu(Student stu) {
		System.out.println(stu);
		Student saveStu = studentServiceI.saveStu(stu);
		ModelAndView mvc= new ModelAndView();
		mvc.addObject("prime", saveStu);
		mvc.setViewName("maven");
		return mvc;
		
	}
	
	public ModelAndView getAllStu() {
		List<Student> allStudent = studentServiceI.getAllStudent();
		ModelAndView mvc= new ModelAndView();
		mvc.addObject("stu1",allStudent );
		mvc.setViewName("raje");
		return null;
		
	}
	
	public ModelAndView DeleteAllstu() {
		Boolean deleteAllstu = studentServiceI.DeleteAllstu();
		if(deleteAllstu) {			
			String msg="record delete Succefull";
			ModelAndView mvc= new ModelAndView();
			mvc.addObject("bhailok", mvc);
			mvc.setViewName("kiran");			
			return mvc;
		}else {
			String msg = "Record not deleted Successfully";
			ModelAndView mav = new ModelAndView();
			mav.addObject("bhailok2", msg);
			mav.setViewName("Asha");
			return mav;	
		}
	}
}
