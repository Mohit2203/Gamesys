/**
 * 
 */
package com.gamesys.test.GamesysSpringBootUserRegistration.Exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.gamesys.test.GamesysSpringBootUserRegistration.Service.Message;

/**
 * @author Mohit
 *
 */
@ControllerAdvice
public class ControllerExceptionHandler {
	
	@ExceptionHandler(UserIsBlacklistedException.class)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Message UserIsBlacklistedException(UserIsBlacklistedException ex) {
	
		return new Message("User is Blacklisted","User Is Blacklisted");
		
	}

}
