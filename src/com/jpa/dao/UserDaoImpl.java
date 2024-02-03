package com.jpa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.dao.UserDao;

import jakarta.transaction.Transactional;

import com.jpa.AdminLogin;
import com.jpa.UserRegister;

@Service
@Transactional
public class UserDaoImpl {
	
	@Autowired
	private UserDao userdao;
	
	public UserRegister getUsername(String username)
	{
		return userdao.findByUsername(username);
	}
	
	public void insert(UserRegister u)
	{
		userdao.save(u);
	}
	
	public List<UserRegister> getalldata()
	{
		return userdao.findAll();
	}
	
	

}
