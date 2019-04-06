package com.gamesys.test.GamesysSpringBootUserRegistration.Service;

/**
 * This Class will implement the RegistrationUserService interface and return the new instance of
 * the user who trying to register itself first time.
 * Also it will return an exception if the user already exists or a part of the
 * blacklist 
 * 
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamesys.test.GamesysSpringBootUserRegistration.Exceptions.UserAlreadyExistException;
import com.gamesys.test.GamesysSpringBootUserRegistration.Exceptions.UserIsBlacklistedException;
import com.gamesys.test.GamesysSpringBootUserRegistration.Repository.UserRepository;
import com.gamesys.test.GamesysSpringBootUserRegistration.model.UserDetails;

@Service
public class RegistrationUserServiceImpl implements RegistrationUserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserBlackListed usersBlackList;

	@Override
	public void register(UserDetails users) {

		List<String> blacklisted = usersBlackList.blackListusers();
		if (blacklisted.contains(users.getSsn())) {
			throw new UserIsBlacklistedException("Cannot resgitered a BlackList Users");
		} else if (findByUsername(users.getUserName()) != null) {
			throw new UserAlreadyExistException("User already Exist");
		} else {
			userRepository.save(users);
		}
	}

	@Override
	public UserDetails findByUsername(String userName) {
		return userRepository.findByUserName(userName);
	}

}
