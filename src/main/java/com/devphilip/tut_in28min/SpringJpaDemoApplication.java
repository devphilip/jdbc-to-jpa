package com.devphilip.tut_in28min;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devphilip.tut_in28min.entity.Person;
import com.devphilip.tut_in28min.jpa.PersonJpaRepository;

@SpringBootApplication
public class SpringJpaDemoApplication implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(SpringJpaDemoApplication.class);
 
	@Autowired
	PersonJpaRepository personJpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("User id 10001 -> {}", personJpaRepository.findById(10001));
		log.info("Inserting 10004 -> {}", personJpaRepository.insert(new Person(
				10004, "Tiwa", "Lagos", new Date())));
		log.info("Updating 10003 -> {}", personJpaRepository.update(new Person(
				10003, "Paul", "Lagos Island", new Date())));
		personJpaRepository.deleteById(10002);
		log.info("All users -> {}", personJpaRepository.findAll());
	}

}
