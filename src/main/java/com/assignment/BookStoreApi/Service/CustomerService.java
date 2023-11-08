package com.assignment.BookStoreApi.Service;

import java.util.Optional;

import com.assignment.BookStoreApi.Entity.Customer;

public interface CustomerService {
	
	
	
	Optional<Customer> findById(Long id) ;
	Customer save(Customer customer) ;

}
