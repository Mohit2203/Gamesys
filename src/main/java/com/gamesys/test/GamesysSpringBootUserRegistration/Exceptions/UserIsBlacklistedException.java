/**
 * 
 */
package com.gamesys.test.GamesysSpringBootUserRegistration.Exceptions;

/**
 * @author Mohit
 *
 */

/**
 *  
 *UserIsBlacklistedException class represents if a user is in Black List 
 *than the method will throw an exception user is in Black List.
 */
public class UserIsBlacklistedException extends RuntimeException {

	private static final long serialVersionUID = 4878395967765743496L;

	public UserIsBlacklistedException(String errorMessage) {
		super(errorMessage);
	}
}
