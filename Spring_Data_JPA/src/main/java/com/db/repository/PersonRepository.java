package com.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
