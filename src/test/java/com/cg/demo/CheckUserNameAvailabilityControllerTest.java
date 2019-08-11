package com.cg.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.controller.DemoController;
import com.cg.exceptions.UserNameAlreadyExistsException;
import com.cg.services.CustomerServices;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CheckUserNameAvailabilityControllerTest {
	@MockBean
	CustomerServices customerServices;
	@Autowired
	DemoController demoController;
	@Test
	public void checkUserNameAvailabilityTest() throws UserNameAlreadyExistsException {
		Mockito.when(customerServices.checkUserNameAvailability("sushant")).thenReturn("UserName Available. Continue to register.");
		assertEquals("UserName Available. Continue to register.", demoController.checkUserNameAvailability("sushant"));
	}
	@Test(expected = UserNameAlreadyExistsException.class)
	public void checkUserNameUnAvailabilityTest() throws UserNameAlreadyExistsException {
		Mockito.when(customerServices.checkUserNameAvailability("sushant")).thenThrow(new UserNameAlreadyExistsException());
		demoController.checkUserNameAvailability("sushant");
	}
}
