package com.JsonExample.models;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Company {

public String name;
public String catchPhrase;
public String bs;




public Company() {
	super();
	// TODO Auto-generated constructor stub
}



@Override
public String toString() {
	return "Company [name=" + name + ", catchPhrase=" + catchPhrase + ", bs=" + bs + "]";
}






}