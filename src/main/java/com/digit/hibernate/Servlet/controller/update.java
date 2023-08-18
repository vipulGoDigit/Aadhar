package com.digit.hibernate.Servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.digit.hibernate.Servlet.bean.AdminDetails;
import com.digit.hibernate.Servlet.model.HibernateManager;
@WebServlet("/update")
public class update extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("aadhar_no");
		String name=req.getParameter("name");
		
		AdminDetails ad=new AdminDetails();
		ad.setAadhar_no(id);
		ad.setName(name);

		
		HibernateManager hm =new HibernateManager(); 
		boolean b =hm.update(id,name);
		
		
		if(b==true) {
			resp.sendRedirect("/ServletHibernate/updateSuccess.jsp");
		}
		else {
			resp.sendRedirect("/ServletHibernate/updateFail.html");
		}

		
		
	}

}
