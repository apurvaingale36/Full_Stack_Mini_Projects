package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer>{

}
