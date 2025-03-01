package com.example.login.StudentController;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.login.Service.StudentService;
import com.example.login.entity.Student;

	@Controller
	public class studentController {
		
	private StudentService studentServicve;
	
	public studentController(StudentService studentServicve) {
		
		super();
		this.studentServicve = studentServicve;
	}
	
	
	public String ListStudent(Model model) {
		
		model.addAttribute("students",studentServicve.getAllStudent());
		
		return "students";
		
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		Student student = new Student();
		model.addAttribute("students",student);
		return "create_student";
	}


	
	

}
