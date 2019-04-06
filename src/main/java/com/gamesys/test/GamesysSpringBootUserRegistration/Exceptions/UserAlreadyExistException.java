package com.gamesys.test.GamesysSpringBootUserRegistration.Exceptions;

public class UserAlreadyExistException extends RuntimeException{

	/**
	 *  @author Mohit
	 *UserAlreadyExistException class represents if a record already existed 
     *than the method will throw an exception user already exits into system.
	 */
	private static final long serialVersionUID = 487839596776574346L;

	public UserAlreadyExistException(String errorMessage) {
		super(errorMessage);
	}
}
