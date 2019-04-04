package com.gamesys.test.GamesysSpringBootUserRegistration.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserBlackListedImpl implements UserBlackListed {

	public List<String> blackListusers() {
		// TODO Auto-generated method stub
		return new ArrayList<String>();
	}

}
