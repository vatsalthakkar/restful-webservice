package com.rest.webservice.helloWorld;

public class HelloWorldBean  {

	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	HelloWorldBean(String greet){
		this.message=greet;
	}
	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
}
