package com.jpa;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="ADMINPDF")
public class AdminPDF {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="pdf_name")
	private String pdfname;
	@Column(name="pdf")
	@Lob
	private byte[] pdf;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPdfname() {
		return pdfname;
	}
	public void setPdfname(String pdfname) {
		this.pdfname = pdfname;
	}
	public byte[] getPdf() {
		return pdf;
	}
	public void setPdf(byte[] pdf) {
		this.pdf = pdf;
	}
	@Override
	public String toString() {
		return "AdminPDF [id=" + id + ", pdfname=" + pdfname + ", pdf=" + Arrays.toString(pdf) + "]";
	}
	public AdminPDF(int id, String pdfname, byte[] pdf) {
		super();
		this.id = id;
		this.pdfname = pdfname;
		this.pdf = pdf;
	}
	public AdminPDF() {
	}
	
	
	
	

}
