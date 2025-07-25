package com.jpa.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int course_id;
	private String course_name;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Student student;
	
	public Course(int course_id, String course_name) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	
	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", course_name=" + course_name + "]";
	}
	
	
}
