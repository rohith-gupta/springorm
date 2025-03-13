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
		
		/*
		 * Users user1 = new Users();
		 * 
		 * user1.setUserId(101); user1.setName("rohith");
		 * 
		 * int result = userdao.insert(user1);
		 * 
		 * System.out.println(result);
		 */
		
		
		Users user = userdao.fetch(101);
		
		System.out.println(user);
		
		
	}
}
