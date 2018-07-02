package com.customer.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.Customer;
import com.customer.service.CustomerServiceInterface;

@RestController
@RequestMapping(value="customerService")
public class CustomerWebService {
	
	@Autowired
	private CustomerServiceInterface customerService;
	
	@RequestMapping(value="/{id}", method= RequestMethod.GET)
	public List<Customer> getAllCustomers(@PathVariable("id") Integer customerId) {
		return customerService.findAll();	
	}

}
