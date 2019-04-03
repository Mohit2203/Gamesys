/**
 * 
 */
package com.gamesys.test.GamesysSpringBootUserRegistration.Validator;

import java.util.Arrays;
import java.util.Set;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/**
 * @author Mohit
 *
 */
public class DateValidatorImpl implements ConstraintValidator<DateValueMatch, String>{

	private ISO validDaysFormat;
	

    public void initialize(DateTimeFormat constraint) {
    	validDaysFormat = constraint.iso();
    }
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if (value == null)return false;
		
		return false;
	}

}
