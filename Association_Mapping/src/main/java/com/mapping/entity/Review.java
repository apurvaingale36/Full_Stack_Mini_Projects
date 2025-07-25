package com.mapping.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="review")

public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rating_id;
	private String description;
	private String rating;
	
	@ManyToMany
	@JoinTable(name="course_review",
	joinColumns=@JoinColumn(name="courseid"),
	inverseJoinColumns = @JoinColumn(name="rating_id"))
	private List<Course> course;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getRating_id() {
		return rating_id;
	}
	public Review(int rating_id, String description, String rating) {
		super();
		this.rating_id = rating_id;
		this.description = description;
		this.rating = rating;
	}
	public Review() {
		super();
	}
	@Override
	public String toString() {
		return "Review [rating_id=" + rating_id + ", description=" + description + ", rating=" + rating + "]";
	}
	
	
}
