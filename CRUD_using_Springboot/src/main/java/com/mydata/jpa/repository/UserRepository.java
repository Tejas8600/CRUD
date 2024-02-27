package com.mydata.jpa.repository;

import java.util.List;

import com.mydata.jpa.bean.User;

public interface UserRepository 
{
 public void saveUser(User u);
 public void updateUser(int id,String pass,String mail);
 public void deleteUser(int id);
 public User viewUser(int id);
 public List<User> viewAllUser();
}
