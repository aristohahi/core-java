package com.example.demo3;

import com.example.demo3.dao.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootTest
class Demo3ApplicationTests {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	private EmployeeRepository repository;

	@Test
	void contextLoads() {

		repository.updateEmployee("hello566",7369);
		System.out.println(jdbcTemplate.queryForObject("select count(*) from Employee ", Integer.class));

	}
}
