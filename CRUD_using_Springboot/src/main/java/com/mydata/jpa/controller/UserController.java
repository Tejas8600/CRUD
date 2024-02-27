package com.mydata.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mydata.jpa.bean.User;
import com.mydata.jpa.service.UserService;

@RestController
@RequestMapping(path="/user")
public class UserController
{
	@Autowired
	UserService us;

	public void setUs(UserService us)
	{
		this.us = us;
	}
	@GetMapping
	public List<User> viewAllUserRestAPI()
	{
		return us.viewAllUser();
    }
	@PostMapping
	public String saveUserRestAPT(@RequestBody User u)
	{
		us.saveUser(u);
		return "saved";
		
	}
	@GetMapping("/{id}")
	public User viewUserByIdRestAPI(@PathVariable int id)
	{
		return us.viewUser(id);
		
	}
	@PutMapping("/{id}/{pass}/{mail}")
	public String updateUserRestAPI(@PathVariable int id,@PathVariable String pass,@PathVariable String mail)
	{
		us.updateUser(id, pass, mail);
		return "updated";
		
	}
	@DeleteMapping("/{id}")
	public String deleteUserRestAPI(@PathVariable int id)
	{
		us.deleteUser(id);
		return "deleted";
		
	}
}
