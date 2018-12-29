package com.JsonExample.models;



import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

public Integer id;
public String name;
public String username;
public String email;

public Address address;
public String phone;
public String website;

public Company company;





public User() {
	super();
	// TODO Auto-generated constructor stub
}



@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", address=" + address
			+ ", phone=" + phone + ", website=" + website + ", company=" + company + "]";
}







}