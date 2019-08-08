package com.cg.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.DOM.Customer;

public interface CustomerDAO extends JpaRepository<Customer, String>{
	public Customer findCustomerByUserName(String userName);
	public List<Customer> findCustomerByFirstName(String userName);
	public Customer findCustomerByContactNo(String contactNo);
}
