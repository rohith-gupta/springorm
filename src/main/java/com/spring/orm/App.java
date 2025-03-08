package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.UserDaoImpl;
import com.spring.orm.entities.Users;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!!");
		
		ApplicationContext context  = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
		
		UserDaoImpl userdao = (UserDaoImpl)context.getBean("userDaoImpl");
		
		Users user = new Users();
		
		user.setUserId(101);
		user.setName("rohith");
		
		
		Users u1 = new Users();
		u1.setUserId(102);
		u1.setName("Gupta");
		
		System.out.println(user);
		int id = userdao.insert(user);
		
		int id2 = userdao.insert(u1);
		
		System.out.println(id);
		
		System.out.println(id2);
		
		
	}
}
