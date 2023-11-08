package com.assignment.BookStoreApi.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.BookStoreApi.Entity.Customer;
import com.assignment.BookStoreApi.Entity.Order;


@Repository
public interface OrderRepository extends CrudRepository<Order, Long>  {

}
