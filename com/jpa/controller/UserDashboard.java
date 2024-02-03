package com.jpa.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.AdminPDF;
import com.jpa.dao.adminpdfdaoimpl;

@Controller
public class UserDashboard {
	
	@Autowired
	private adminpdfdaoimpl Getpdf;
	
	// get the data from database
	@GetMapping("/UserDashboard")
	public String UserDashboardpage(Model m) {
		List<AdminPDF> getpdf = Getpdf.getdata();
		m.addAttribute("getpdf", getpdf);
		return "userShow";
	}
	
	// view pdf
	@GetMapping("/ViewPdf")
	public String ViewPdfpage(@RequestParam(name="id") int id,Model m)
	{
		AdminPDF getpdfid = Getpdf.getbyid(id);
		m.addAttribute("getpdf",Base64.getEncoder().encodeToString(getpdfid.getPdf()));
		return "ViewPdf";
	}
	
	// logout link
		@GetMapping("/logoutuser")
		public String logoutpage(Model m)
		{
			return "redirect:/index";
			
		}
}
