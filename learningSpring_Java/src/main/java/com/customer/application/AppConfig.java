package com.customer.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.customer.repository.CustomerRepositoryImpl;
import com.customer.repository.CustomerRepositoryInterface;
import com.customer.service.CustomerServiceImpl;
import com.customer.service.CustomerServiceInterface;


/**
 * @Configuration annotation makes this file as the central bean hub for spring
 * This is analogous to applicationContext.xml in Xml configuration mode
 */
@Configuration
public class AppConfig {

	
	/**
	 * this is declaring a bean, analogous to a bean tag in XML configuration mode
	 * @return
	 */
	@Bean(name="customerRepository")
	public CustomerRepositoryInterface getCustomerRepository() {
		return new CustomerRepositoryImpl();
	}
	
	
	/** Setter Injection:
	 * this is declaring another bean.
	 * here the dependency is injected at the time of declaring the bean,
	 * analogous to the property tag inserted for dependency in xml mode.
	 * Whenever an instance of CustomerServiceImpl will be required in the
	 * app, we will ask the appContext to fetch it using below method and
	 * it will have the correct dependencies injected.
	 * @return
	 */
//	@Bean(name="customerServiceInterface")
//	public CustomerServiceInterface getCustomerService() {
//		CustomerServiceImpl customerService = new CustomerServiceImpl();
//		customerService.setCustomerRepo(getCustomerRepository());
//		return customerService;
//	}
	
	
	/** Constructor Injection:
	 * this is declaring another bean.
	 * here the dependency is injected at the time of declaring the bean,
	 * analogous to the constructor-arg tag inserted for dependency in xml mode.
	 * Whenever an instance of CustomerServiceImpl will be required in the
	 * app, we will ask the appContext to fetch it using below method and
	 * it will have the correct dependencies injected.
	 * @return
	 */
	@Bean(name="customerServiceInterface")
	public CustomerServiceInterface getCustomerService() {
		/**
		 * instead of setting the dependency via setter, we will instantiate
		 * the instance and pass the dependency in the constructor itself
		 */
		CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
		
		return customerService;
	}
	
	
	/**
	 * Auto-wire Injection:
	 * Auto wiring is very powerful with Java Configuration 
	 * 
	 */
}
