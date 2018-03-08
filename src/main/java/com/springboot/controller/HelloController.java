package com.springboot.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	//It is specialized version of @RequestMapping annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.POST). 
	//@PostMapping annotated methods handle the HTTP POST requests matched with given URI expression. e.g.
	
	 @PostMapping("/hello")
	   public String sayHello(@RequestParam("name") String name, Model model) {
	      model.addAttribute("name", name);
	      return "hello";
	   }
}
