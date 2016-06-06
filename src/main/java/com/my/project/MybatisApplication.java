package com.my.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.my.project.mapper.CityMapper;

@SpringBootApplication
public class MybatisApplication implements CommandLineRunner {

	@Autowired
    private CityMapper cityMapper;

	public static void main(String[] args) {
		SpringApplication.run(MybatisApplication.class, args);
	}

	public void run(String... args) throws Exception {
		System.out.println(this.cityMapper.findByState("CA"));
	}

}
