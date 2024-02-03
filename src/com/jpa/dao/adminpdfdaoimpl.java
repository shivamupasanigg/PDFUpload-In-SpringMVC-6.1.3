package com.jpa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.AdminPDF;
import com.jpa.dao.adminpdfdao;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class adminpdfdaoimpl {
	
	@Autowired
	private adminpdfdao dao;
	// insert
	public void insert(AdminPDF a)
	{
		dao.save(a);
	}
	// list
	public List<AdminPDF> getdata()
	{
		return dao.findAll();
	}
	// get id
	public AdminPDF getbyid(int id)
	{
		return dao.findById(id).get();
	}
	// delete
	public void delete(int id) {
			dao.deleteById(id);
	}
	
	// update
	public void update(int id,String pdfname,byte[] pdf)
	{
		dao.updatepdf(id, pdfname,pdf);
	}
			

}
