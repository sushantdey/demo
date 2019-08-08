package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.DAO.CustomerDAO;
import com.cg.DOM.Customer;
import com.cg.exceptions.UserNameAlreadyExistsException;

public class CustomerServicesImpl implements CustomerServices {
	@Autowired
	CustomerDAO customerDAO;
	@Autowired
	Customer customer;
	@Override
	public String checkUserNameAvailability(String userName) throws UserNameAlreadyExistsException {
		CustomerServices customerServices = new CustomerServicesImpl();
		if(customerServices.findCustomerByUserName(userName)!=null)
			throw new UserNameAlreadyExistsException();
		else
			return "Registration successful. Login to continue.";
	}
	@Override
	public Customer registerCustomer(Customer customer) {
		return customerDAO.save(customer);
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
