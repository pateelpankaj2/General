package com.sacksoft.org.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sacksoft.org.entity.Student;

@Service
public interface StudentService {
	
	  // Save operation
    Student saveStudent(Student student);
 
    // Read operation
    List<Student> fetchStudentList();
 
    // Update operation
    Student updateStudent(Student student,
                                Long studentId);
 
    // Delete operation
    void deleteStudentId(Long StudentId);


}
