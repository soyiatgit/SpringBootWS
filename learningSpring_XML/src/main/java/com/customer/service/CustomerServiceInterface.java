package com.customer.service;

import java.util.List;

import com.customer.model.Customer;

public interface CustomerServiceInterface {

	public abstract List<Customer> findAll();

}