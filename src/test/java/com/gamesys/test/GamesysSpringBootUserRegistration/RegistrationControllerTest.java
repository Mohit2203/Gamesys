
package com.gamesys.test.GamesysSpringBootUserRegistration;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.gamesys.test.GamesysSpringBootUserRegistration.Controller.RegisterUserController;
import com.gamesys.test.GamesysSpringBootUserRegistration.Service.RegistrationUserService;
import com.gamesys.test.GamesysSpringBootUserRegistration.model.UserDetails;

@WebMvcTest(value = RegisterUserController.class)
public class RegistrationControllerTest extends AbstractTestClass {

	private UserDetails userDetails;

	@MockBean
	private RegistrationUserService registarService;

	String uri = "/register";
	String inputJson;

	@Before
	public void setUp() {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = simpleDateFormat.parse("2018-03-22");
			userDetails = new UserDetails("Mohit", "MohitM13", date, "12345");
			inputJson = super.maptoJson(userDetails);
			mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void registerUserTest() throws Exception {
		Mockito.when(registarService.register(Mockito.any())).thenReturn(new UserDetails());
		MvcResult mvcResult = super.mvc.perform(
				MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(201, status);
		String response = mvcResult.getResponse().getContentAsString();
		assertEquals("user Successfully registered", response);
	}

	@Test
	public void registerUserTestWithFailure() throws Exception {
		Mockito.when(registarService.register(Mockito.any())).thenReturn(null);
		MvcResult mvcResult = super.mvc.perform(
				MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(500, status);
		String response = mvcResult.getResponse().getContentAsString();
		assertEquals("error registering user", response);
	}

}
