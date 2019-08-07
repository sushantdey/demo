package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.DOM.Customer;
import com.cg.services.CustomerServices;

@RestController
public class DemoController {
	@Autowired
	CustomerServices customerServices;
	@PostMapping("/register")
	public String registerCustomer(@RequestBody Customer customer) {
		String status=customerServices.registerCustomer(customer);
		return status;
	}
}
