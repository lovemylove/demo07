package com.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class Demo03Application {
private DataSource dataSource;
	public static void main(String[] args) {
		SpringApplication.run(Demo03Application.class, args);
	}
}
