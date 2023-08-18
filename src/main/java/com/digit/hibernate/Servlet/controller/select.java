package com.digit.hibernate.Servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.digit.hibernate.Servlet.bean.AdminDetails;
import com.digit.hibernate.Servlet.model.HibernateManager;

@WebServlet("/select")
public class select extends HttpServlet{
	private HttpSession session;

	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, java.io.IOException {


		HibernateManager hm=new HibernateManager();
		HttpSession session = req.getSession();
		
		AdminDetails ad = hm.select(req.getParameter("aadhar_no"));
		
        session.setAttribute("ad",ad );
        
        
//        session.setAttribute("phoneNo", ad.getPhoneNo());
//        session.setAttribute("education", ad.getEducation());
//        session.setAttribute("address", ad.getAddress());
//
//        session.setAttribute("fatherName", ad.getFatherName());
       
		

			resp.sendRedirect("/ServletHibernate/viewAll.jsp");

		}
	}


