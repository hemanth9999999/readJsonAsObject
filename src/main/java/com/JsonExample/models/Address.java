package com.JsonExample.models;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {




public String street;
public String suite;
public String city;
public String zipcode;

public Geo geo;



@Override
public String toString() {
	return "Address [street=" + street + ", suite=" + suite + ", city=" + city + ", zipcode=" + zipcode + ", geo=" + geo
			+ "]";
}

public Address() {
	super();
	// TODO Auto-generated constructor stub
}









}