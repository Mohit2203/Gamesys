package com.gamesys.test.GamesysSpringBootUserRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GamesysSpringBootUserRegistrationApplication {
	
	  @RequestMapping("/hello") public String sayHello() { return
	  "Hello Java Code Geeks!"; }
	 

	public static void main(String[] args) {
		SpringApplication.run(GamesysSpringBootUserRegistrationApplication.class, args);
	}

}
