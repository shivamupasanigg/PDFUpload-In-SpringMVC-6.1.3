package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.AdminLogin;

@Repository
public interface adminDao  extends JpaRepository<AdminLogin, Integer>
{
	AdminLogin findByUsername(String Username);
}
