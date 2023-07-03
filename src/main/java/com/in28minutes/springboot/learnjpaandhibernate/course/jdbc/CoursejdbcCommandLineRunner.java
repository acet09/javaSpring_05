package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.course.Course;

@Component
public class CoursejdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CoursejdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn AWS Now!" ,"in28minutes"));		
		repository.insert(new Course(2, "Learn Azure Now!" ,"in28minutes"));		
		repository.insert(new Course(3, "Learn DevOps Now!" ,"in28minutes"));		
	
		repository.deleteById(1);
	}
}
