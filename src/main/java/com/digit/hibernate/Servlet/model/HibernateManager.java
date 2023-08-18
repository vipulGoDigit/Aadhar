package com.digit.hibernate.Servlet.model;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

import com.digit.hibernate.Servlet.bean.AdminDetails;

public class HibernateManager {

	private Session session;

	public HibernateManager() {

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); // connects to cfg

		ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());

		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());

		session = sessionFactory.openSession();

		System.out.println("Connected to platform");
		

	}
	public boolean register(AdminDetails ad) {
		
		Transaction tran=session.beginTransaction();
		session.save(ad);
		tran.commit();
		System.out.println("object saved");
		
		
			
		return true;
	}
	public boolean update(String s ,String n) {

		Transaction tran=session.beginTransaction();
		AdminDetails ad=(AdminDetails)session.get(AdminDetails.class, s);
		
		ad.setAadhar_no(ad.getAadhar_no());
		ad.setName(n);
		session.update(ad);
		System.out.println("Update Success");
		tran.commit();	
		return true;
	}
	public boolean delete(String s) {
		Transaction tran=session.beginTransaction();
		AdminDetails ad=(AdminDetails)session.get(AdminDetails.class, s);
		

		session.delete(ad);
		System.out.println("Delete Success");
		tran.commit();	
		return true;
		
	}
	
	public AdminDetails select(String aadhar_no) {
		
		Transaction tran = session.beginTransaction();
		AdminDetails ad=(AdminDetails)session.get(AdminDetails.class, aadhar_no);
		return ad;
	}

}