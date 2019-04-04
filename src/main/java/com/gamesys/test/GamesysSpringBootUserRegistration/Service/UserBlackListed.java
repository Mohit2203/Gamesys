/**
 * 
 */
package com.gamesys.test.GamesysSpringBootUserRegistration.Service;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author Mohit
 *
 */

public interface UserBlackListed {

	List<String> blackListusers();
}
