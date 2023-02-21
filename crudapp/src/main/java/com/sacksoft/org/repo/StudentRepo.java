package com.sacksoft.org.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sacksoft.org.entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {
	

}
