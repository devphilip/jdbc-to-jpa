//package com.devphilip.tut_in28min;
//
//import java.util.Date;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import com.devphilip.tut_in28min.entity.Person;
//import com.devphilip.tut_in28min.jdbc.PersonJdbcDao;
//
//@SpringBootApplication
//public class SpringJdbcDemoApplication implements CommandLineRunner {
//	
//	private static final Logger log = LoggerFactory.getLogger(SpringJdbcDemoApplication.class);
// 
//	@Autowired
//	PersonJdbcDao dao;
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringJdbcDemoApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		log.info("All users -> {}", dao.findAll());
//		log.info("User id 10001 -> {}", dao.findById(10001));
//		log.info("Deleting 10002 -> Number of rows deleted - {}", dao.deleteById(10002));
//		log.info("Inserting 10004 -> {}", dao.insert(new Person(
//				10004, "Tiwa", "Lagos", new Date())));
//		log.info("Updating 10003 -> {}", dao.update(new Person(
//				10003, "Paul", "Lagos Island", new Date())));
//	}
//
//}
