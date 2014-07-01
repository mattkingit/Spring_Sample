package com.Pluralsight.repository;

import java.util.List;

import com.Pluralsight.model.Customer;

public interface CustomerRepository {

	public abstract List<Customer> findAll();

}