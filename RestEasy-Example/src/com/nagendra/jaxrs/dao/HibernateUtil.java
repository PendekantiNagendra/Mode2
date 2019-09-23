package com.nagendra.jaxrs.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public SessionFactory getSessionFactory() {
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		System.out.println("SessionFactory returned from HibernateUtil");
		return sf;
		
	}
	
}
