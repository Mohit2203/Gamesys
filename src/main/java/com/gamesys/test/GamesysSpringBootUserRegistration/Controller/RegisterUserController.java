/**
 * 
 */
package com.gamesys.test.GamesysSpringBootUserRegistration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.gamesys.test.GamesysSpringBootUserRegistration.Service.RegistrationUserService;
import com.gamesys.test.GamesysSpringBootUserRegistration.model.UserDetails;

/**
 * @author Mohit
 *
 */
@RestController
public class RegisterUserController {

	@Autowired
	private RegistrationUserService registarService;

	@PostMapping("/register")
	public ResponseEntity<String> register(@Validated @RequestBody UserDetails users) {
		UserDetails endUser = registarService.register(users);
		if (endUser != null) {
			String resp = new String("user Successfully registered");
			return new ResponseEntity<String>(resp, HttpStatus.CREATED);
		} else {
			String error = new String("error registering user");
			return new ResponseEntity<String>(error, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
