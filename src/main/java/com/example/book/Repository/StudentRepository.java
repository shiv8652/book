package com.example.book.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.book.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

	
}
