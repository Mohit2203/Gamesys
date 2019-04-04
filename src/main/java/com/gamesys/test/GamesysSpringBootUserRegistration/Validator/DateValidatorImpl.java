/**
 * 
 */
package com.gamesys.test.GamesysSpringBootUserRegistration.Validator;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Mohit
 *
 */
public class DateValidatorImpl implements ConstraintValidator<DateValueMatch, String>{

	private static String isovalidDaysFormat = "yyyy-MM-dd'T'";

	
	
	private static String getISO8601StringForDate(String date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(isovalidDaysFormat);
		return dateFormat.format(date);
}
	 
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		try {
		if (value == null)
			throw new DateFormatNotValidException("Please enter the date in yyyy-MM-dd format");
		//Implement The Simple Date Format
		isovalidDaysFormat=getISO8601StringForDate(value);
		if(!value.isEmpty() && value.equalsIgnoreCase(isovalidDaysFormat)) {
			return true;
		}
		
		else{
		//Need to write the custom Exceptions
			
		}
		}
		catch(Exception ex) {
			throw new DateFormatNotValidException("Please enter the date in yyyy-MM-dd format");
		}
			return true;
			
		
	}

}
