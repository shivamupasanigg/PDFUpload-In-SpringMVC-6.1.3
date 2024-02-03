package com.jpa.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jpa.AdminPDF;
import com.jpa.dao.adminpdfdaoimpl;

@Controller
public class Admindashboardone {
	
	@Autowired
	private adminpdfdaoimpl insert;
	// show the form
	@GetMapping("/adminDashboard")
	public String adminDashboardpage(Model m)
	{
		m.addAttribute("adminpdf",new AdminPDF());
		return "adminDashboard";
	}
	// logout link
	@GetMapping("/logout")
	public String logoutpage(Model m)
	{
		return "redirect:/index";
		
	}
	// submit the all data and insert in database using jpa
	@PostMapping("/register")
	public String submitpage(@RequestParam("pdfname") String pdfname,@RequestParam("pdf") MultipartFile pdf,Model m) throws IOException
	{
		AdminPDF pdf1 = new AdminPDF();
		pdf1.setPdfname(pdfname);
		pdf1.setPdf(pdf.getBytes());
		insert.insert(pdf1);
		m.addAttribute("msg","inserted sucessfully");
		return "adminDashboard";
	}
	// get the all data from database
	@GetMapping("/getalldata")
	public String getalldatapage(Model m)
	{
		List<AdminPDF> listpdfname = insert.getdata();
		m.addAttribute("listpdfname", listpdfname);
		return "listpdf";
	}
	// delete the data from database
	@GetMapping("/delete")
	public String deletepage(@RequestParam(name="id") int id)
	{
		insert.delete(id);
		return "redirect:/getalldata";
	}
	// get the all data from database and filled in the field
	@GetMapping("/edit")
	public String editpage(@RequestParam(name="id") int id,Model m)
	{
		AdminPDF getid = insert.getbyid(id);
		m.addAttribute("getalldata", getid);
		return "editform";
	}
	// update the data in database
	@PostMapping("/update")
	public String updatepage(@RequestParam("id") int id, @RequestParam("pdfname") String pdfname,@RequestParam("pdf") MultipartFile pdf) throws IOException
	{
		insert.update(id, pdfname, pdf.getBytes());
		return "redirect:/getalldata";
	}

}
