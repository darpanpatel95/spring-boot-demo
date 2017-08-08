package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@Service("studentService")
public class StudentSeviceImpl implements StudentService{
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student getStudentById(long id) {
		return studentRepository.findOne(id);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	//@Override
	//public Student getStudentByFirstName(String name) {
	//	return studentRepository.findStudentByFirstName(name);
	//}

	@Override
	public Student save(Student stud) {
		return studentRepository.save(stud);
	}
}
