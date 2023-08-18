package com.digit.hibernate.Servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
	
@WebServlet("/login")
public class login extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int aadhar_no = Integer.parseInt(req.getParameter("cust_id"));
		int pin = Integer.parseInt(req.getParameter("pin"));
		
	}

}
