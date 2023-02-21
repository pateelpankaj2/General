package com.sacksoft.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sacksoft.org.entity.Student;
import com.sacksoft.org.service.StudentService;

@RestController
public class StudentController {
	
	 @Autowired
	 private StudentService studentService;
	 
	    // Save operation
	    @PostMapping("/students")
	 
	    public Student saveStudent(
	         @RequestBody Student student)
	    {
	        return studentService.saveStudent(student);
	    }
	 
	    // Read operation
	    @GetMapping("/students")
	 
	    public List<Student> fetchDepartmentList()
	    {
	        return studentService.fetchStudentList();
	    }
	 
	    // Update operation
	    @PutMapping("/students/{id}")
	    public Student
	    updateDepartment(@RequestBody Student student,
	                     @PathVariable("id") Long studentId)
	    {
	        return studentService.updateStudent(
	            student, studentId);
	    }
	 
	    // Delete operation
	    @DeleteMapping("/Students/{id}")
	 
	    public String deleteDepartmentById(@PathVariable("id")
	                                       Long studentId)
	    {
	        studentService.deleteStudentId(
	            studentId);
	        return " Student Deleted Successfully";
	    }
	}


