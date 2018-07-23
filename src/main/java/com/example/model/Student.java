package com.example.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {

	private String id;
	private String name;
	private List<Score> scores;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Score> getScores() {
		return scores;
	}

	public void setScores(List<Score> scores) {
		this.scores = scores;
	}

	public static void data(Student s) {
		System.out.println("Nombre: " + s.getName());
	}

}
