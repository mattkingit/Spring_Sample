package com.Pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.Pluralsight.model.Customer;


public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.Pluralsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Matthew");
		customer.setLastname("King");
		
		customers.add(customer);
		
		return customers;
	}

}
