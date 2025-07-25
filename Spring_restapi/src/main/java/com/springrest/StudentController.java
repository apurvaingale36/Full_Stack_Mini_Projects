package com.springrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentRepository studrepo;
	
	@PostMapping
	public Student createStud(@RequestBody @Valid Student student)
	{		
		return studrepo.save(student);
	}
	
	@GetMapping
	public List<Student> getAllStudents(){
		return studrepo.findAll();
	}
	
	@GetMapping("/find/{id}")
	public Student findByStudId(@PathVariable Integer id) {
		return studrepo.findById(id).orElseThrow(()-> new StudentNotFound("not found!"));
	}
	
	@GetMapping("/{id}")
	public Student updateStudent(@PathVariable Integer id,@RequestBody Student upStud){
		if(studrepo.existsById(id)) {
			upStud.setId(id);
			return studrepo.save(upStud);
		}
		else {
			return null;
	}
	}
	
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable Integer id) {
		studrepo.deleteById(id);
	}
	
	
}
