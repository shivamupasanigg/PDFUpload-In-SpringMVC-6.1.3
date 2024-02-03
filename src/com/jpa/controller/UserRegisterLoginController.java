package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jpa.dao.UserDaoImpl;
import com.jpa.UserRegister;
import com.jpa.AdminLogin;
import com.jpa.UserLogin;

@Controller
public class UserRegisterLoginController {
	
	@Autowired
	private UserDaoImpl userinsert;
	
	
	@PostMapping("/UserRegister")
	public String UserRegister(@ModelAttribute("userregister") UserRegister user,Model m) {
		user.setName(user.getName());
		user.setUsername(user.getUsername());
		user.setPassword(user.getPassword());
		userinsert.insert(user);
		return "redirect:/index";
	}
	
	@PostMapping("userlogin")
	public String UserLogin(@ModelAttribute("Userlogin") UserLogin userlogin,Model m) {
		UserRegister UserUsername = userinsert.getUsername(userlogin.getUsername());

        if (UserUsername != null && UserUsername.getPassword().equals(userlogin.getPassword())) {
            return "redirect:/UserDashboard"; 
        } else {
            return "redirect:/index";
        }
	}

}
