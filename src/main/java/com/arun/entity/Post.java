package com.arun.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Post 
{
	@Id
	private Integer postd;
	
	private String postDesc;
	
	@ManyToOne
	private User user;

	public Integer getPostd() {
		return postd;
	}

	public void setPostd(Integer postd) {
		this.postd = postd;
	}

	public String getPostDesc() {
		return postDesc;
	}

	public void setPostDesc(String postDesc) {
		this.postDesc = postDesc;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Post [postd=" + postd + ", postDesc=" + postDesc + ", user=" + user + "]";
	}

	public Post(Integer postd, String postDesc, User user) {
		super();
		this.postd = postd;
		this.postDesc = postDesc;
		this.user = user;
	}
	
	public Post()
	{
		
	}
	

}
