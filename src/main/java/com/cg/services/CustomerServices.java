package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cg.DOM.Customer;
import com.cg.exceptions.UserNameAlreadyExistsException;

public interface CustomerServices {
	public String checkUserNameAvailability(String userName) throws UserNameAlreadyExistsException;
	public Customer registerCustomer(Customer customer);
	public Customer findCustomerByUserName(String userName);
	public List<Customer> findCustomerByFirstName(String firstName);
	public Customer findCustomerByContactNo(String contactNo);
}
