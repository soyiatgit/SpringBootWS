package com.customer.repository;

import java.util.List;

import com.customer.model.Customer;

public interface CustomerRepositoryInterface {

	public abstract List<Customer> findAll();

}