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

	
	
	private static String getISO8601StringForDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(isovalidDaysFormat);
		return dateFormat.format(date);
}
	 
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if (value == null)return false;
		//Implement The Simple Date Format
		if(!value.isEmpty()) {
		}
		
		else{
			try {
				throw new Exception("Please enter the date in yyyy-MM-dd format");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
			return true;
			
		
	}

}
