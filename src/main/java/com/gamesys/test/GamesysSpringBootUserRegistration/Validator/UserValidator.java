/**
 * 
 */
package com.gamesys.test.GamesysSpringBootUserRegistration.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.gamesys.test.GamesysSpringBootUserRegistration.Model.UserDetails;
import com.gamesys.test.GamesysSpringBootUserRegistration.Service.RegistrationUserService;

/**
 * @author Mohit
 *
 */
@Component
public class UserValidator implements Validator {
	
	@Autowired
	private RegistrationUserService registrationUserService;

	@Override
	public boolean supports(Class<?> aClass) {
		// TODO Auto-generated method stub
		 return UserDetails.class.equals(aClass);
	}

	@Override
	public void validate(Object o, Errors errors) {
		// TODO Auto-generated method stub
		UserDetails userDetails = (UserDetails) o;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
		if (registrationUserService.findByUsername(userDetails.getUserName()) != null) {
            errors.rejectValue("username", "User Name Already in Use");
        }
		
	}

}
