package com.springboot.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.MainApp;

@Controller
public class HelloController {
	private static final Logger logger = LogManager.getLogger(MainApp.class);
	@RequestMapping("/")
	public String index(){
		logger.info("inside controller index method");
		return "index";
	}
	
	//It is specialized version of @RequestMapping annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.POST). 
	//@PostMapping annotated methods handle the HTTP POST requests matched with given URI expression. e.g.
	
	 @PostMapping("/hello")
	   public String sayHello(@RequestParam("name") String name, Model model) {
		 logger.info("inside controller sayHello method");
	      model.addAttribute("name", name);
	      return "hello";
	   }
}
