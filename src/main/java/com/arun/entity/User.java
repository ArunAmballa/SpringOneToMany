package com.arun.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User 
{
	@Id
	private Integer userId;
	
	private String userName;
	
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<Post> posts;
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", posts=" + posts + "]";
	}
	public User(Integer userId, String userName, List<Post> posts) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.posts = posts;
	}
	
	public User()
	{
		
	}
	
	
}
