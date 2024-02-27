package com.mydata.jpa.bean;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity 
@Table(name="sb_User")
public class User implements Serializable
{
	@Id
	private int userid;
	private String name;
	private String username;
	private String password;
	private String mailid;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public User(int userid, String name, String username, String password, String mailid) {
		super();
		this.userid = userid;
		this.name = name;
		this.username = username;
		this.password = password;
		this.mailid = mailid;
	}
	public User() {}	
}
