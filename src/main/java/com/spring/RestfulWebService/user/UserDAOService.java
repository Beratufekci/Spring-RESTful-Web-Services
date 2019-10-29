package com.spring.RestfulWebService.user;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UserDAOService {
	
	private static List<User> users = new ArrayList<>();
	
	private static int  usersCount = 3;
	
	static {
		
		users.add(new User(1,"Berat","Tüfekçi"));
		users.add(new User(2,"Alaattin","Eriş"));
		users.add(new User(3,"Dogan","Eriş"));
		
	}
	
	//public List<User> findAll()
	public List<User> findAll(){
		
		return users;
		
	}
	
	//public User findOne(int id)
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	

	//public User save(User user)
	public User save(User user) {
		
		if(user.getId() == null) {
			
			user.setId(++usersCount);
			
		}
		
		users.add(user);
		
		return user;
	}


	//public User findOne(int id)
	public User deleteById(int id) {
		
		Iterator<User> iterator = users.iterator();
		
		while(iterator.hasNext()) {
			
			User user = iterator.next();
			
			if(user.getId() == id) {
				
			   iterator.remove();
			   
			   return user;
				
			}
		}
		
		return null;
		
	}
	
	


}