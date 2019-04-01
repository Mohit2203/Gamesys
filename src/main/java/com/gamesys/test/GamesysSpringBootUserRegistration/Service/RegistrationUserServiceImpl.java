package com.gamesys.test.GamesysSpringBootUserRegistration.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamesys.test.GamesysSpringBootUserRegistration.Model.UserDetails;
import com.gamesys.test.GamesysSpringBootUserRegistration.Repository.UserRepository;

@Service
public class RegistrationUserServiceImpl implements RegistrationUserService{

	@Autowired
    private UserRepository userRepository;
	
	
	@Override
	public void register(UserDetails users) {
		// TODO Auto-generated method stub
		users.setUserName(users.getUserName());
		users.setPasswords(users.getPasswords());
		users.setSsn(users.getSsn());
		users.setDateOfBirth(users.getDateOfBirth());
        userRepository.save(users);
	}
	
	 @Override
	    public UserDetails findByUsername(String username) {
	        return userRepository.findByUsername(username);
	    }

}
