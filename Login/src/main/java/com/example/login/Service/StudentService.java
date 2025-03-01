package com.example.login.Service;

import java.util.List;

import com.example.login.entity.Student;

public interface StudentService {
	
	List<Student>getAllStudent();
		
	Student saveStudent(Student student);
		
	Student getStudentById(Long id);
		
	Student updateStudent(Student student);
		
	void deletStudentById(Long id);
		

}
