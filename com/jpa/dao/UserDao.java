package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.AdminLogin;
import com.jpa.UserRegister;

@Repository
public interface UserDao extends JpaRepository<UserRegister, Integer> {
	
	UserRegister findByUsername(String Username);

}
