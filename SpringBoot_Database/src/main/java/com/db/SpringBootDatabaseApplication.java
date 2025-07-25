package com.db;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.db.entity.Person;
import com.db.jdbc.PersonJDBC;

@SpringBootApplication
public class SpringBootDatabaseApplication implements CommandLineRunner {

	private org.slf4j.Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJDBC personjdbc;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//logger.info("All  -> {}",personjdbc.findAll());
		logger.info("insert  -> {}",personjdbc.insert(new Person(101,"apurva",22)));
		logger.info("insert  -> {}",personjdbc.insert(new Person(102,"amit",23)));
		logger.info("insert  -> {}",personjdbc.insert(new Person(103,"aditya",23)));
		logger.info("All  -> {}",personjdbc.findAll());


	}

}
