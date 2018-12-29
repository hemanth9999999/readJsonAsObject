package com.JsonExample.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.JsonExample.models.User;

@Component
public class UserService {
	
	@Autowired
	@Qualifier("allUsers")
	public List<User> users ; 
	
	public List<User> getAllUsers(){ 
		
		return users ; 
		
	}
	
	public User getUserbyId( Integer id ) {
		for (User user1 : users) { 
			if ( user1.id == id ) 
			{ 
				return user1 ;
			}
		}
		return null ; 
		
	}
	
	public User putUser(User user1) { 
		users.add(user1) ; 
		return user1 ; 
		
	}

}
