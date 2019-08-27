package com.nagarro.userlistRest.controller;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.nagarro.userlistRest.models.User;
import com.nagarro.userlistRest.services.UserService;


@RunWith(MockitoJUnitRunner.class)
public class UserListControllerTest {

	@InjectMocks
	private UserListController handler;
	
	@Test
	public void shouldReturnUsers(){
		
		List<User> list = handler.getAll();
		
		assertEquals(2,list.size());
		assertEquals("Aayush",list.get(0).getName());
		
	}
	
	@Test
	public void shouldAddNewCustomer(){
		
		User u = new User();
		u.setName("Test");
		u.setAge(20);
		u.setAddress("Delhi");
		
		handler.addCustomer(u);
		List<User> list = handler.getAll();
		assertEquals(3,list.size());
		assertEquals("Test",list.get(list.size()-1).getName());
		
	}
	

	
}