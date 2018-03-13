package com.springboot;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp {
private static final Logger logger = LogManager.getLogger(MainApp.class);
public static void main(String[] args) {
		logger.info("This is first logging message");
	      SpringApplication.run(MainApp.class, args);
	      
	   }
}
