package com.mydata.jpa.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mydata.jpa.bean.User;

import jakarta.persistence.EntityManager;
@Repository
public class UserRepositoryImpl implements UserRepository
{
	@Autowired
	EntityManager em;
	public void setEm(EntityManager em) 
	{
		this.em = em;
	}

	@Override
	public void saveUser(User u) 
	{
		Session s= em.unwrap(Session.class);
		s.persist(u);
		
	}

	@Override
	public void updateUser(int id, String pass, String mail) 
	{
		Session s=em.unwrap(Session.class);
		User u=s.get(User.class, id);
		u.setPassword(pass);
		u.setMailid(mail);
		s.merge(u);
		
	}

	@Override
	public void deleteUser(int id)
	{
	   Session s=em.unwrap(Session.class);
	   User u=s.get(User.class, id);
	   s.remove(u);
	}

	@Override
	public User viewUser(int id)
	{
	   Session s=em.unwrap(Session.class);
	   User u=s.get(User.class, id);
	   return u;
	   
	}

	@Override
	public List<User> viewAllUser() 
	{
	   Session s=em.unwrap(Session.class);
       Query q=s.createQuery("from User");
       List <User> allUser=q.list();
       return allUser;
	}
}
