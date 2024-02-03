package com.jpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.List;

import com.jpa.AdminLogin;

@Service
@Transactional
public class admindaoimpl {
	
	@Autowired
	private adminDao adminDao;
	
	public AdminLogin getUsername(String username)
	{
		return adminDao.findByUsername(username);
	}
}
