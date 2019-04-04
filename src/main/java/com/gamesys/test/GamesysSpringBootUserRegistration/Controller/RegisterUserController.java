/**
 * 
 */
package com.gamesys.test.GamesysSpringBootUserRegistration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gamesys.test.GamesysSpringBootUserRegistration.Model.UserDetails;
import com.gamesys.test.GamesysSpringBootUserRegistration.Service.RegistrationUserService;

import net.minidev.json.JSONObject;
 


/**
 * @author Mohit
 *
 */
@RestController

public class RegisterUserController {
	
	@Autowired
	private RegistrationUserService registarService;
	
	@RequestMapping(path = "/register")
	    public ResponseEntity<JSONObject> register(@Validated @RequestBody UserDetails users) {
		registarService.register(users);
		JSONObject resp = new JSONObject();
		resp.put("status", "user Successfully registered");
		return new ResponseEntity<JSONObject>(resp, HttpStatus.OK);
	    }

}
