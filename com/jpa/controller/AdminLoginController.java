package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jpa.AdminLogin;
import com.jpa.UserRegister;
import com.jpa.UserLogin;
import com.jpa.dao.admindaoimpl;

@Controller
public class AdminLoginController {
	
	@Autowired
	private admindaoimpl selectone;
	
	@GetMapping("/index")
	public String loginpage(Model m)
	{
		m.addAttribute("adminlogin",new AdminLogin());
		m.addAttribute("userregister", new UserRegister());
		m.addAttribute("Userlogin", new UserLogin());
		return "Index";
	}
	
	@PostMapping("/login")
    public String login(@ModelAttribute("adminlogin") AdminLogin adminLogin, Model model) {
        AdminLogin adminUser = selectone.getUsername(adminLogin.getUsername());

        if (adminUser != null && adminUser.getPassword().equals(adminLogin.getPassword())) {
            return "redirect:/adminDashboard"; 
        } else {
            return "Index";
        }
    }
	
	
}

