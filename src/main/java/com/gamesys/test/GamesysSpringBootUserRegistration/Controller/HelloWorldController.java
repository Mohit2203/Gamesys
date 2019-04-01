/**
 * 
 */
package com.gamesys.test.GamesysSpringBootUserRegistration.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 


/**
 * @author Mohit
 *
 */
@RestController
@RequestMapping(path = "/hello")
public class HelloWorldController {
	 @GetMapping("/")
	    public String sayHello() {
	        return "Hello Java Code Geeks!";
	    }

}
