package com.gamesys.test.GamesysSpringBootUserRegistration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		} else {
			userRepository.save(users);
		}
	}

	@Override
	public UserDetails findByUsername(String userName) {
		return userRepository.findByUserName(userName);
	}

}
