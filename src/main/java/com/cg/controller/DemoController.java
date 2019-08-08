package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.DOM.Customer;
import com.cg.exceptions.UserNameAlreadyExistsException;
import com.cg.services.CustomerServices;

@RestController
@CrossOrigin
public class DemoController {
	@Autowired
	CustomerServices customerServices;
	@GetMapping("/checkUserNameAvailability")
	public String checkUserNameAvailability(@RequestParam("userName") String userName) throws UserNameAlreadyExistsException {
		String status=customerServices.checkUserNameAvailability(userName);
		return status;
	}
	@PostMapping("/register")
	public Customer registerCustomer(@RequestBody Customer customer) {
		return customerServices.registerCustomer(customer);
	}
}
