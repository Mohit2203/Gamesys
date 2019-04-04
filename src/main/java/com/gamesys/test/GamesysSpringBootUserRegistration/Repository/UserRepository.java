package com.gamesys.test.GamesysSpringBootUserRegistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamesys.test.GamesysSpringBootUserRegistration.model.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, String>{
	
	
	UserDetails findByUserName(String userName);

}
