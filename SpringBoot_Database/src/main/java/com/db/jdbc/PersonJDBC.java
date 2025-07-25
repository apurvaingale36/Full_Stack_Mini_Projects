package com.db.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.db.entity.Person;
@Repository
public class PersonJDBC {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public int insert(Person person) {
		return jdbctemplate.update("insert into person(id,name,age) "
				+"values(?,?,?)", new Object[] {person.getId(),person.getName(),person.getAge()});		
	}
	
	public int update(Person person) {
		return jdbctemplate.update("update person set name=?, age=? where id=?)",new Object[] {person.getName(),person.getAge()});
		}
	
	public List<Person> findAll(){
		return jdbctemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
	}
	
//	public Person findById(int id){
//		return jdbctemplate.queryForObject("select * from person where id=?", new Object[]{id}, new BeanPropertyRowMapper<Person>(Person.class));
//	}
}
