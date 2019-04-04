package com.gamesys.test.GamesysSpringBootUserRegistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamesys.test.GamesysSpringBootUserRegistration.model.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, String>{
	
	
	UserDetails findByUsername(String userName);

}
