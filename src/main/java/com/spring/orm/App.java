package com.spring.orm;

import java.util.List;

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
		
		List<Users> users = userdao.fetchAll();
		
		for(Users u : users) {
			
			System.out.println(u.getUserId()+" : "+u.getName());
			
		}
		
		// to delete the row from the table first need to fetch the data and then need to delete the data
		//delete command, insert, update commands are to use write access to database. hence we need to provide transactional annotation.
		Users ud = userdao.fetch(102);
		userdao.delete(ud);
		System.out.println("deleted the entity");
		System.out.println("The new Updated table is:");
		
List<Users> users1 = userdao.fetchAll();
		
		for(Users u : users1) {
				
			System.out.println(u.getUserId()+" : "+u.getName());
			
		}
		
		
	}
}
