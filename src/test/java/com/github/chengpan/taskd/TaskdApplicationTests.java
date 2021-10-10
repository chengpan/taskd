package com.github.chengpan.taskd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class TaskdApplicationTests {
	private final DataSource dataSource;

	@Autowired
	TaskdApplicationTests(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Test
	void contextLoads() throws SQLException {
		System.out.println(dataSource.getConnection());
	}

}
