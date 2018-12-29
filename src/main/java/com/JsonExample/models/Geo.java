package com.JsonExample.models;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Geo {

public String lat;
public String lng;



public Geo() {
	super();
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "Geo [lat=" + lat + ", lng=" + lng + "]";
}




}