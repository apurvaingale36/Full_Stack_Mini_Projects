package com.spring;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class CourseController {
		
	@RequestMapping(value="/course", method = RequestMethod.GET)
	public List<Course> getAllCourse(){
		
		return Arrays.asList(
				new Course(1,"Core JAVA", "Nandini"),
				new Course(2,"Full Stack", "Raza")
				);
	}
}
