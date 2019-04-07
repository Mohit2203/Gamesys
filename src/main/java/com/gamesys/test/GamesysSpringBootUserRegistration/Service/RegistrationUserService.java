/**
 * 
 */
package com.gamesys.test.GamesysSpringBootUserRegistration.Service;

import com.gamesys.test.GamesysSpringBootUserRegistration.model.UserDetails;

/**
 * @author Mohit
 *
 */
public interface RegistrationUserService {

	UserDetails register(UserDetails users);
	
	UserDetails findByUsername(String userName);
}
