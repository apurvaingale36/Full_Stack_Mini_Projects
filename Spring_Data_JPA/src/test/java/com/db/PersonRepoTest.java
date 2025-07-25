package com.db;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.db.entity.Person;
import com.db.repository.PersonRepository;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringDataJpaApplication.class)
class PersonRepoTest {
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonRepository repository;
	@Autowired
	Person person;
	
	@Test
	public void contextLoads() {
		repository.findById(302);
		assertEquals("apurva",person.getName());
	}

}
