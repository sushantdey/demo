package com.cg.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.DAO.CustomerDAO;
import com.cg.DOM.Address;
import com.cg.DOM.Customer;
import com.cg.demo.DemoApplication;
import com.cg.exceptions.UserNameAlreadyExistsException;
import com.cg.services.CustomerServices;

@RunWith(SpringRunner.class)
@EntityScan(basePackages="com.cg.DOM")
@SpringBootTest(classes = DemoApplication.class)
public class CheckUserNameAvailabilityServiceTest {
	Customer customer;
	@MockBean
	CustomerDAO customerDAO;
	@Autowired
	CustomerServices customerServices;
	@Test(expected = UserNameAlreadyExistsException.class)
	public void userNameUnAvailableTest() throws UserNameAlreadyExistsException{
		customer=new Customer("sushant", "Sushant", "Dey", "7004308409", "sushant.dey@gmail.com", new Address("228", "4", "Hata", "Jsr", "Jharkhand", "831002"));
		Mockito.when(customerDAO.findCustomerByUserName("sushant")).thenReturn(customer);
		customerServices.checkUserNameAvailability("sushant");
	}
	@Test
	public void userNameAvailableTest() throws UserNameAlreadyExistsException {
		Mockito.when(customerDAO.findCustomerByUserName("sushant")).thenReturn(null);
		customerServices.checkUserNameAvailability("sushant");
		assertEquals("UserName available. Continue to register.", customerServices.checkUserNameAvailability("sushant"));
	}
	
}
