package com.mydata.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydata.jpa.bean.User;
import com.mydata.jpa.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService
{    
	@Autowired
    UserRepository ur;
	public void setUr(UserRepository ur)
	{
		this.ur = ur;
	}

	@Override 
	@Transactional
	public void saveUser(User u) 
	{
		ur.saveUser(u);
	}

	@Override
	@Transactional
	public void updateUser(int id, String pass, String mail) 
	{
		ur.updateUser(id, pass, mail);
		
	}

	@Override
	@Transactional
	public void deleteUser(int id) 
	{
		ur.deleteUser(id);
		
	}

	@Override
	public User viewUser(int id) 
	{
		return ur.viewUser(id);
	}

	@Override
	public List<User> viewAllUser()
	{
		return ur.viewAllUser();
		
	}
}
