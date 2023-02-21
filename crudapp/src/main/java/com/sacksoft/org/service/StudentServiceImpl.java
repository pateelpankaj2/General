package com.sacksoft.org.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacksoft.org.entity.Student;
import com.sacksoft.org.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepository;

	@Override
	public List<Student> fetchStudentList() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Student student, Long studentId) {
		Student studentdb = studentRepository.findById(studentId).get();

		if (Objects.nonNull(student.getFname()) && !"".equalsIgnoreCase(student.getFname())) {
			studentdb.setFname(student.getFname());
		}
		if (Objects.nonNull(student.getLname()) && !"".equalsIgnoreCase(student.getLname())) {
			studentdb.setLname(student.getLname());
		}
		if (Objects.nonNull(student.getEmailId()) && !"".equalsIgnoreCase(student.getEmailId())) {
			studentdb.setEmailId(student.getEmailId());
		}

		if (Objects.nonNull(student.getAge())) {
			studentdb.setAge(student.getAge());
		}

		return studentRepository.save(studentdb);

	}

	@Override
	public void deleteStudentId(Long StudentId) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(StudentId);

	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

}
