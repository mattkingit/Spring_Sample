package com.Pluralsight.service;

import java.util.List;

import com.Pluralsight.model.Customer;

public interface CustomerService {

	public abstract List<Customer> findAll();

}