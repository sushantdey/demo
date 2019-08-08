package com.cg.DOM;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Customer {
	@Id
	private String userName;
	private String firstName;
	private String lastName;
	private String contactNo;
	private String emailId;
	@Embedded
	private Address address;
}
