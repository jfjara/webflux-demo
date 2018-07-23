package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Student;
import com.example.repository.StudentReactiveRepository;

import reactor.core.publisher.Flux;

@Controller
public class StudentListController {
	
    @Autowired
    private StudentReactiveRepository repository;

    @GetMapping("/get-students")
    public Flux<Student> listStudents(){
        Flux<Student> flux = repository.findAll(); 
        flux.subscribe(Student::data);
        return flux;
    }
}
