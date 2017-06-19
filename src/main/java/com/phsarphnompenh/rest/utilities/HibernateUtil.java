package com.phsarphnompenh.rest.utilities;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.google.api.services.drive.model.User;
import com.phsarphnompenh.rest.models.Category;
import com.phsarphnompenh.rest.models.Product;
import com.phsarphnompenh.rest.models.Role;


public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	// hibernate.cfg.xml
	 /*private static SessionFactory buildSessionFactory(){
		try{
			Configuration configuration = new Configuration();
			return configuration
					.buildSessionFactory(new StandardServiceRegistryBuilder()
							.applySettings(configuration.getProperties())
							.build());
		}catch(Exception ex){
			ex.printStackTrace();
			throw new RuntimeException("There was an error building the factory.");
		}
 	}*/
	// hibernate.properties
	private static SessionFactory buildSessionFactory(){
		try{
			Configuration configuration = new Configuration();
			configuration.addAnnotatedClass(User.class);
			configuration.addAnnotatedClass(Role.class);
			configuration.addAnnotatedClass(Category.class);
			configuration.addAnnotatedClass(Product.class);
			//configuration.addPackage("com.phsarphnompenh.rest.models");
			return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
		}catch(Exception ex){
			ex.printStackTrace();
			throw new RuntimeException("There was an error building the factory.");
		}
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
