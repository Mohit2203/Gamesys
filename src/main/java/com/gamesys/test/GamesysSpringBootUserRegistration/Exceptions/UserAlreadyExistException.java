package com.gamesys.test.GamesysSpringBootUserRegistration.Exceptions;

public class UserAlreadyExistException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 487839596776574346L;

	public UserAlreadyExistException(String errorMessage) {
		super(errorMessage);
	}
}
