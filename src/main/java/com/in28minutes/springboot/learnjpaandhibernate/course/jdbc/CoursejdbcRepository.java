package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CoursejdbcRepository {

	@Autowired
	private JdbcTemplate springjdbcTemplate;
	
	private static String INSERT_QUERY =
			
			"""
				insert into course(id, name, author)
				values(1, 'Learn AWS', 'in28minutes');
			
			""";
	
	public void insert() {
		springjdbcTemplate.update(INSERT_QUERY);
	}	
}
