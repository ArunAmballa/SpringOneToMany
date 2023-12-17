package com.arun;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.arun.entity.Post;
import com.arun.entity.User;
import com.arun.repository.UserRepository;

@SpringBootApplication
public class SpringOneToManyApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(SpringOneToManyApplication.class, args);
		
//		User user1=new User();
//		user1.setUserId(1);
//		user1.setUserName("Arun");
//		
//		Post p1=new Post();
//		p1.setPostd(1000);
//		p1.setPostDesc("Hello Guys");
//		p1.setUser(user1);
//		
//		
//		Post p2=new Post();
//		p2.setPostd(1001);
//		p2.setPostDesc("Spring Boot Data Jpa");
//		p2.setUser(user1);
//		
//		List<Post> list=new ArrayList<>();
//		
//		list.add(p1);
//		list.add(p2);
//		
//		
//	    user1.setPosts(list);
	    
	    UserRepository userRepository=context.getBean(UserRepository.class);
	    
//	    userRepository.save(user1);
	    
	   User u1=userRepository.findById(1).get();
	   System.out.println(u1.getUserName());
	   
	   
	   
	   
	   
	    
	    
	    
	    
		
		
		
		
	}

}
