package com.customer.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.customer.service.CustomerServiceInterface;

public class CustomerApplication {

	public static void main(String[] args) {
		/**
		 * below is the way to fetch the application Context out of the AppConfig
		 */
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerServiceInterface customerServiceInterface = appContext.getBean("customerServiceInterface", CustomerServiceInterface.class);
		System.out.println(customerServiceInterface.findAll().get(0).getfName());
	}

}
 