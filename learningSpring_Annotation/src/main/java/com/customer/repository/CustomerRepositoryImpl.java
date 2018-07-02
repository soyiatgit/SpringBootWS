package com.customer.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.customer.model.Customer;

	@Repository("customerRepository")
	public class CustomerRepositoryImpl implements CustomerRepositoryInterface {
		
		/* (non-Javadoc)
		 * @see com.customer.repository.CustomerRepositoryInterface#findAll()
		 */
		@Override
		public List<Customer> findAll() {
			List<Customer> customers = new ArrayList<>();
			Customer customer = new Customer();
			customer.setAge(27);
			customer.setfName("Saurabh");
			customer.setlName("Tiwari");
			
			customers.add(customer);
			
			return customers;
			
		}
}
