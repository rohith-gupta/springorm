package com.spring.orm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Users;

public class UserDaoImpl implements UserDao{
	
	
	private HibernateTemplate hibernate;

	public HibernateTemplate getHibernate() {
		return hibernate;
	}

	public void setHibernate(HibernateTemplate hibernate) {
		this.hibernate = hibernate;
	}

	@Override
	@Transactional
	public int insert(Users user) {
		
		int id = (Integer)this.hibernate.save(user);
		return id;
	}

	@Override
	public Users fetch(int userId) {
		// TODO Auto-generated method stub
		Users u = this.hibernate.get(Users.class, userId);
		return u; 
	}
	
	

}
