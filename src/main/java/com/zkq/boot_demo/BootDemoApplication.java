package com.zkq.boot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @Author zhangkaiqiang
 * @Description TODO
 * @Date 14:09 2019/2/12
 **/
//@MapperScan(value = "com.zkq.boot_demo.mapper")
@EnableJpaRepositories
@SpringBootApplication
public class BootDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(BootDemoApplication.class, args);
	}

}

