package com.arun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arun.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer>
{

}
