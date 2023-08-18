package com.digit.hibernate.Servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.digit.hibernate.Servlet.bean.AdminDetails;
import com.digit.hibernate.Servlet.model.HibernateManager;


@WebServlet("/Register")
public class Register extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		AdminDetails ad=new AdminDetails();
		
		
	
		ad.setAadhar_no(req.getParameter("aadhar_no"));
		ad.setName(req.getParameter("name"));
		
		ad.setPhoneNo(req.getParameter("phoneNo"));
		
		

		ad.setEducation(req.getParameter("education"));



		ad.setAddress(req.getParameter("address"));

		

		ad.setFatherName(req.getParameter("fatherName"));

		HibernateManager hm =new HibernateManager(); 
		
		boolean b =hm.register(ad);
		
		
		if(b==true) {
			resp.sendRedirect("/ServletHibernate/RegisterSuccess.jsp");
		}
		else {
			resp.sendRedirect("/ServletHibernate/RegisterFail.html");
		}

		
	}

}
