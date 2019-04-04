/**
 * 
 */
package com.gamesys.test.GamesysSpringBootUserRegistration.Exceptions;

/**
 * @author Mohit
 *
 */
public class DateFormatNotValidException extends RuntimeException{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1275688316964842020L;

	public DateFormatNotValidException(String errorMessage) {
	        super(errorMessage);
	    }

}
