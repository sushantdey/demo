package com.cg.DOM;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Address {
	private String houseNo;
	private String streetNo;
	private String locality;
	private String city;
	private String state;
	private int pincode;
	@Column(unique = true, nullable = false)
	private String contactNo;
	private String emailId;
}
