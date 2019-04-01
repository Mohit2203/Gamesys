/**
 * 
 */
package com.gamesys.test.GamesysSpringBootUserRegistration.Service;

import com.gamesys.test.GamesysSpringBootUserRegistration.Model.UserDetails;

/**
 * @author Mohit
 *
 */
public interface RegistrationUserService {

	void register(UserDetails users);
	
	UserDetails findByUsername(String username);
}
