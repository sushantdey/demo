package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cg.DOM.Customer;

@Service
@Qualifier("customerServices")
public interface CustomerServices {
	public String registerCustomer(Customer customer);
	public Customer findCustomerByUserName(String userName);
	public List<Customer> findCustomerByFirstName(String firstName);
	public Customer findCustomerByContactNo(String contactNo);
}
