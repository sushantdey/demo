package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cg.DAO.CustomerDAO;
import com.cg.DOM.Customer;
import com.cg.exceptions.UserNameAlreadyExistsException;

@Service
@Qualifier("customerServices")
public class CustomerServicesImpl implements CustomerServices {
	@Autowired
	CustomerDAO customerDAO;
	@Autowired
	CustomerServices customerServices;
	@Override
	public String checkUserNameAvailability(String userName) throws UserNameAlreadyExistsException {
		if(customerServices.findCustomerByUserName(userName)!=null)
			throw new UserNameAlreadyExistsException();
		else
			return "UserName available. Continue to register.";
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
