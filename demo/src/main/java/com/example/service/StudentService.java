package com.example.service;

import java.util.List;
import com.example.model.Student;

public interface StudentService {
	Student getStudentById(long id);
	List<Student> getAllStudents();
	//Student getStudentByFirstName(String name);
	Student save(Student stud);
}
