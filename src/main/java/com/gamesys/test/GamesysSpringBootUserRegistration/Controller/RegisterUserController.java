/**
 * 
 */
package com.gamesys.test.GamesysSpringBootUserRegistration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gamesys.test.GamesysSpringBootUserRegistration.Model.UserDetails;
import com.gamesys.test.GamesysSpringBootUserRegistration.Service.RegistrationUserService;
 


/**
 * @author Mohit
 *
 */
@RestController

public class RegisterUserController {
	
	@Autowired
	private RegistrationUserService registarService;
	
	@RequestMapping(path = "/register")
	    public String register(@Validated@RequestBody UserDetails users) {
		registarService.register();
	    }

}
