package com.assignment.BookStoreApi.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.BookStoreApi.Entity.Customer;
import com.assignment.BookStoreApi.Repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	CustomerRepository cr ;

	@Override
	public Optional<Customer> findById(Long id) {
		// TODO Auto-generated method stub
		return cr.findById(id);
	}


	@Override
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		return cr.save(customer);
	}
}
