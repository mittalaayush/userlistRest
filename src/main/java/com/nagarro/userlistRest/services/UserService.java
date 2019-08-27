package com.nagarro.userlistRest.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.userlistRest.models.User;

@Service
public class UserService {
	
private static UserService instance;
	
	private List <User> list;
	
	public UserService(){
		
		list = new LinkedList<User>();
		list.add(new User("Aayush",24,"3255/236, Tri Nagar, Delhi - 110035"));
		list.add(new User("Raj",26,"46/B, Sector 25, Udyog Vihar, Gurgaon, Harayana - 220013"));
		
	}
	
	public static UserService getInstance(){
		if(instance == null){
			instance = new UserService();
		}
		return instance;		
	}
	
	public List<User> getUsers(){
		return list;
	}
	
	public List<User> addUser(User user){
		list.add(user);
		return list;
	}


}
