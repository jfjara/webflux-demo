package com.example.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Student;

@Repository
public interface StudentReactiveRepository extends ReactiveCrudRepository<Student,String> {
}
