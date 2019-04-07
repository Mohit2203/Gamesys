
package com.gamesys.test.GamesysSpringBootUserRegistration;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.gamesys.test.GamesysSpringBootUserRegistration.Controller.RegisterUserController;
import com.gamesys.test.GamesysSpringBootUserRegistration.Service.RegistrationUserService;
import com.gamesys.test.GamesysSpringBootUserRegistration.model.UserDetails;

@WebMvcTest(value = RegisterUserController.class)
public class RegistrationIntegrationTest extends AbstractTestClass {

	private UserDetails userDetails;
	
	@MockBean	
	private  RegistrationUserService service ;
	
	@Before
	public void setUp() {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = simpleDateFormat.parse("2018-09-09");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		userDetails = new UserDetails("TestUser", "TestPass", date, "ssnTest");
	}

	@Test
	public void registerUserTest() throws Exception {
		String uri = "/register";		
		String inputJson = super.maptoJson(userDetails); 
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		MvcResult mvcResult = super.mvc.perform(MockMvcRequestBuilders.post(uri)
			      .contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(201, status);
	}

}
