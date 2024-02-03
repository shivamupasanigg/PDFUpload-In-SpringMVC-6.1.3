package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.AdminPDF;

@Repository
public interface adminpdfdao extends JpaRepository<AdminPDF,Integer>{
	
	@Modifying
	@Query("UPDATE AdminPDF p SET p.pdfname = :pdfname, p.pdf = :pdf WHERE p.id = :id")
	void updatepdf(@Param("id") int id,@Param("pdfname") String pdfname,@Param("pdf") byte[] pdf);

}
