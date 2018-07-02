package com.customer.service;

import java.util.List;

import com.customer.model.Customer;
import com.customer.repository.CustomerRepositoryInterface;

public class CustomerServiceImpl implements CustomerServiceInterface {
	
private CustomerRepositoryInterface customerRepo;

/**
 * the two methods with comments in this class represent the constructor injection 
 * and setter injection each. We do not generally need both of them at the same 
 * time as we usually go with any one of them but it is possible to use both if required.
 */
	
	/**
	 * we made this blank-arg constructor to imitate the java's default constructor
	 */
	public CustomerServiceImpl() {
		
	}
	
	/**
	 * this constructor represents a way to set constructor injection
	 * the dependencies are set in to this class via this constructor
	 * @param customerRepo
	 */
	public CustomerServiceImpl(CustomerRepositoryInterface customerRepo) {
		this.customerRepo = customerRepo;
	}
	
	/* (non-Javadoc)
	 * @see com.customer.service.CustomerServiceInterface#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}

	/**
	 * the below method represents how the dependency injection is done
	 * using the setter injection.
	 * The instance of customer repo is injected as a setter dependency in
	 * this class
	 * @param customerRepo
	 */
//	public void setCustomerRepo(CustomerRepositoryInterface customerRepo) {
//		this.customerRepo = customerRepo;
//	}
}
