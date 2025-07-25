package com.mapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mapping.entity.Course;
import com.mapping.entity.Passport;
import com.mapping.entity.Student;
import com.mapping.repository.CourseRepo;
import com.mapping.repository.PassportRepo;
import com.mapping.repository.ReviewRepo;
import com.mapping.repository.StudentRepo;

@SpringBootApplication
public class AssociationMappingApplication implements CommandLineRunner {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	StudentRepo stud_repo;
	
	@Autowired
	CourseRepo course_repo;
	
	@Autowired
	PassportRepo pass_repo;
	
	@Autowired
	ReviewRepo review_repo;
	
	public static void main(String[] args) {
		SpringApplication.run(AssociationMappingApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		Student student=new Student(1,"apurva",new Passport(177,"s56jbc"));
		
		
		stud_repo.save(student);
		
//		logger.info("inserting into student -> {}",pass_repo.save(new Passport(177,"sjbc")));

		//logger.info("inserting into student -> {}",);
//		logger.info("inserting into student -> {}",stud_repo.save(new Student(2,"anjali")));
//		logger.info("inserting into student -> {}",stud_repo.save(new Student(3,"jaya")));

		//logger.info("inserting into course -> {}",course_repo.save(new Course(1001,"core java")));

	}

}
