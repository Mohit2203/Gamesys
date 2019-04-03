/**
 * 
 */
package com.gamesys.test.GamesysSpringBootUserRegistration.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Mohit
 *
 */
public class DateValidator implements ConstraintValidator<DateValueMatch, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return false;
	}

}
