
package com.rest.webservice.user;

import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<User>();
	int userCount=users.size();
	static {
		users.add(new User(1,"Rachel",new Date()));
		users.add(new User(2,"Kathy",new Date()));
		users.add(new User(3,"Rajjo",new Date()));
		users.add(new User(4,"Vatsal",new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	public User save(User user) {
		if(user.getId()==null) {
			
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
	
	
}
