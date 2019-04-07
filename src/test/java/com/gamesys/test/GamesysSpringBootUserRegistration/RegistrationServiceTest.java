package com.gamesys.test.GamesysSpringBootUserRegistration;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.gamesys.test.GamesysSpringBootUserRegistration.Exceptions.UserAlreadyExistException;
import com.gamesys.test.GamesysSpringBootUserRegistration.Exceptions.UserIsBlacklistedException;
import com.gamesys.test.GamesysSpringBootUserRegistration.Repository.UserRepository;
import com.gamesys.test.GamesysSpringBootUserRegistration.Service.RegistrationUserService;
import com.gamesys.test.GamesysSpringBootUserRegistration.Service.RegistrationUserServiceImpl;
import com.gamesys.test.GamesysSpringBootUserRegistration.Service.UserBlackListed;
import com.gamesys.test.GamesysSpringBootUserRegistration.model.UserDetails;

@RunWith(MockitoJUnitRunner.class)
public class RegistrationServiceTest extends AbstractTestClass {

	@InjectMocks
	private RegistrationUserService service = new RegistrationUserServiceImpl();

	@Mock
	private UserRepository userRepository;
	@Mock
	private UserBlackListed usersBlackList;

	private UserDetails userDetails;

	@Before
	public void setUp() {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = simpleDateFormat.parse("2018-03-22");
			userDetails = new UserDetails("Mohit", "MohitM13", date, "12345");
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void ResgitrationSuccessTest() {
		Mockito.when(usersBlackList.blackListusers()).thenReturn(new ArrayList<String>());
		Mockito.when(userRepository.save(Mockito.any())).thenReturn(new UserDetails());
		UserDetails user = service.register(userDetails);
		assertTrue(user != null);
	}

	@Test(expected = UserIsBlacklistedException.class)
	public void RegistrationFailedWithBlackList() {
		List<String> list = new ArrayList<String>();
		list.add("12345");
		Mockito.when(usersBlackList.blackListusers()).thenReturn(list);
		service.register(userDetails);
	}
	
	@Test(expected = UserAlreadyExistException.class)
	public void RegistrationFailedWithExistingUser() {
		Mockito.when(usersBlackList.blackListusers()).thenReturn(new ArrayList<String>());
		Mockito.when(userRepository.findByUserName(Mockito.any())).thenReturn(userDetails);
		service.register(userDetails);		
	}


}
