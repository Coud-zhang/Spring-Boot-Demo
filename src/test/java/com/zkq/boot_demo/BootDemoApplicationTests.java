package com.zkq.boot_demo;

import com.zkq.boot_demo.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootDemoApplicationTests {

   @Autowired
    Person person;
    @Autowired
   DataSource datasource;
	@Test
	public void contextLoads() throws SQLException {
//        System.out.println(person);
        System.out.println(datasource.getClass());
	}

}

