/**
 * 
 */
package com.gamesys.test.GamesysSpringBootUserRegistration.Exceptions;

/**
 * @author Mohit
 *
 */
public class UserIsBlacklistedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4878395967765743496L;

	public UserIsBlacklistedException(String errorMessage) {
		super(errorMessage);
	}
}
