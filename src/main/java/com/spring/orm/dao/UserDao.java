package com.spring.orm.dao;

import java.util.List;

import com.spring.orm.entities.Users;

public interface UserDao {
	
	public int insert(Users user);
	public Users fetch(int userId);
	public List<Users> fetchAll();
	

}
