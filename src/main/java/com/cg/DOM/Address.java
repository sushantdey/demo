package com.cg.DOM;

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
	private String pincode;
}
