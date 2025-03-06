package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {

	@Id
	@Column(name="userId")
	private int UserId;
	@Column(name = "username")
	private String name;

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Users(int userId, String name) {
		super();
		UserId = userId;
		this.name = name;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Users [UserId=" + UserId + ", name=" + name + "]";
	}

}
