package com.customer.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.customer.service.CustomerServiceInterface;

public class CustomerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerServiceInterface customerServiceInterface = appContext.getBean("customerServiceInterface", CustomerServiceInterface.class);
		System.out.println(customerServiceInterface.findAll().get(0).getfName());
	}

}
