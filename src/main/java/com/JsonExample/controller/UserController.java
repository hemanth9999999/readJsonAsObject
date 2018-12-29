package com.JsonExample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.JsonExample.UserService.UserService;
import com.JsonExample.models.User;

@RestController
public class UserController {
	@Autowired
	UserService service ; 
	
	@GetMapping(path="/User")
	List<User> alluser()
	{ 
		return service.getAllUsers() ; 
	}
	
	@GetMapping(path="/User/{Id}")
	User getuser(@PathVariable int Id)
	{ 
		return service.getUserbyId(Id) ; 
	}
	

}
