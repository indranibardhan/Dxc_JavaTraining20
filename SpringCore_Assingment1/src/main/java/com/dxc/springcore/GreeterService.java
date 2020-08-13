package com.dxc.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreeterService {
	
	@Autowired
	@Qualifier("greeterservice")
	Greeting greeting;
	
	void printGreeting()
	{
		System.out.println(greeting.greet());
	}
	/*public GreeterService() {}
	
	public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}*/
	
}
