package com.digit.hibernate.Servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.digit.hibernate.Servlet.bean.AdminDetails;
import com.digit.hibernate.Servlet.model.HibernateManager;


@WebServlet("/delete")
public class delete extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
	String id=req.getParameter("aadhar_no");

	
	AdminDetails ad=new AdminDetails();
	ad.setAadhar_no(id);
	

	
	HibernateManager hm =new HibernateManager(); 
	boolean b =hm.delete(id);
	
	
	if(b==true) {
		resp.sendRedirect("/ServletHibernate/DeleteSuccess.jsp");
	}
	else {
		resp.sendRedirect("/ServletHibernate/DeleteFail.html");
	}

}

}
