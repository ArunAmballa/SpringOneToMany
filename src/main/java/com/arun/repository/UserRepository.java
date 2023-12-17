package com.arun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arun.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
