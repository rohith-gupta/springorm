package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.UserDaoImpl;
import com.spring.orm.entities.Users;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!!");
		
		ApplicationContext context  = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
		
		UserDaoImpl userdao = (UserDaoImpl)context.getBean("userDao");
		
		Users user = new Users();
		
		user.setUserId(101);
		user.setName("rohith");
		
		
		int id = userdao.insert(user);
		
		System.out.println(id);
	}
}
