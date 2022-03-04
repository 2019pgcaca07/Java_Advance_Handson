package com.org.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootJdbcController {
	@Autowired
	JdbcTemplate jdbc;
	
	@RequestMapping("/feedData")
	public String idx() {
		jdbc.execute("insert into batch7 value(101,'Animesh')");
		jdbc.execute("insert into batch7 value(102,'Nihal')");
		jdbc.execute("insert into batch7 value(103,'Suresh')");
		jdbc.execute("insert into batch7 value(104,'Nishant')");
		return "Data stored";
	}
	
		@RequestMapping("/getData")
		public String getData() {
			jdbc.execute("select * from batch7");
			return "data is here";
		}
	
}
