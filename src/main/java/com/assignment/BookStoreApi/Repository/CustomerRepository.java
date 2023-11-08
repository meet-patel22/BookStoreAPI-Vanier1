package com.assignment.BookStoreApi.Repository;

import org.springframework.data.repository.CrudRepository;

import com.assignment.BookStoreApi.Entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
