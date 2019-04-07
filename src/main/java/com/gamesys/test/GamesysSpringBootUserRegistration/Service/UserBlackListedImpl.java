package com.gamesys.test.GamesysSpringBootUserRegistration.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserBlackListedImpl implements UserBlackListed {

	public List<String> blackListusers() {		
		return new ArrayList<String>();
	}

}
