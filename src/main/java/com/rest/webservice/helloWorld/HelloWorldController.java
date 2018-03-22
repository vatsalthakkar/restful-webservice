package com.rest.webservice.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	//GET
	//URI- /hello-world
	//method-"Hello World"
	@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	public String greet() {
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean greetBean() {
		return new HelloWorldBean("Hello World");
	}
	@GetMapping(path="/hello-world/{name}")
	public HelloWorldBean helloWorldName(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello world, %s", name));
	}
}
