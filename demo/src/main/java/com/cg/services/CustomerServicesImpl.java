package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.DAO.CustomerDAO;
import com.cg.DOM.Customer;

public class CustomerServicesImpl implements CustomerServices {
	@Autowired
	CustomerDAO customerDAO;
	@Override
	public String registerCustomer(Customer customer) {
		CustomerServices customerServices = new CustomerServicesImpl();
		if(customerServices.findCustomerByUserName(customer.getUserName())!=null)
			return "UserName already exists. Please try again with different username.";
		customerDAO.save(customer);
		return "Registration successful. Login to continue.";
	}

	@Override
	public Customer findCustomerByUserName(String userName) {
		return customerDAO.findCustomerByUserName(userName);
	}

	@Override
	public List<Customer> findCustomerByFirstName(String firstName) {
		return customerDAO.findCustomerByFirstName(firstName);
	}

	@Override
	public Customer findCustomerByContactNo(String contactNo) {
		return customerDAO.findCustomerByContactNo(contactNo);
	}

}
