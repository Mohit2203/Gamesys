/**
 * 
 */
/*
 * package com.gamesys.test.GamesysSpringBootUserRegistration.Validator;
 * 
 * import java.text.SimpleDateFormat;
 * 
 * import javax.validation.ConstraintValidator; import
 * javax.validation.ConstraintValidatorContext;
 * 
 * import com.gamesys.test.GamesysSpringBootUserRegistration.Constant.
 * UserRegistrationConstant; import
 * com.gamesys.test.GamesysSpringBootUserRegistration.Exceptions.
 * DateFormatNotValidException;
 * 
 *//**
	 * @author Mohit
	 *
	 *//*
		 * public class DateValidatorImpl implements ConstraintValidator<DateValueMatch,
		 * String> {
		 * 
		 * private static String getISO8601StringForDate(String date) { SimpleDateFormat
		 * dateFormat = new
		 * SimpleDateFormat(UserRegistrationConstant.isovalidDaysFormat); return
		 * dateFormat.format(date); }
		 * 
		 * @Override public boolean isValid(String value, ConstraintValidatorContext
		 * context) { try { if (value == null) throw new
		 * DateFormatNotValidException("Please enter the date in yyyy-MM-dd format");
		 * String formattedValue = getISO8601StringForDate(value); if (!value.isEmpty()
		 * && value.equalsIgnoreCase(formattedValue)) { return true; } else { throw new
		 * DateFormatNotValidException("Please enter the date in yyyy-MM-dd format"); }
		 * } catch (Exception ex) { throw new
		 * DateFormatNotValidException("Please enter the date in yyyy-MM-dd format"); }
		 * }
		 * 
		 * }
		 */