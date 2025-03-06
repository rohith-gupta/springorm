package com.spring.orm.dao;

import java.util.List;

import com.spring.orm.entities.Users;

public interface UserDao {
	
	public int insert(Users user);
	public List<Users> fetch(Users user);
	

}
