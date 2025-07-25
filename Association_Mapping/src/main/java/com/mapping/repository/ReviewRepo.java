package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.entity.Review;

public interface ReviewRepo extends JpaRepository<Review, Integer> {

}
