package com.nagarro.userlistRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.nagarro.userlistRest.models.User;
import com.nagarro.userlistRest.services.UserService;

@CrossOrigin
@RestController
public class UserListController {
	
	
	private UserService service;
	
	public UserListController() {
		this.service = new UserService();
	}

	@GetMapping("/users")
	public List<User> getAll() {
		
		List<User> list = service.getUsers();
		return list;
	}
	
	@PostMapping("/user")
	public void addCustomer(@RequestBody User user){		
		List<User> list = service.addUser(user);
		
	}

	
}
