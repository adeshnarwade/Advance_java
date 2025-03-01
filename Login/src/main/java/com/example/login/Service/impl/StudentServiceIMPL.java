package com.example.login.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.login.Service.StudentService;
import com.example.login.entity.Student;
import com.example.login.repository.StudentRepository;

@Service
public class StudentServiceIMPL  implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceIMPL(StudentRepository studentRepository ) {
		super();
		this.studentRepository = studentRepository;
	}
	
	
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public void deletStudentById(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		
	}
	
	

}
