package com.assignment.BookStoreApi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.BookStoreApi.Entity.Customer;
import com.assignment.BookStoreApi.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService cs ;
	
	
	
	@GetMapping("/id")
	public Customer getCustomerById(@RequestParam Long id ) {
		return cs.findById(id).get() ;
	}
	
	@PostMapping("save")
	public void saveCustomer(@RequestBody Customer customer ) {
		cs.save(customer);
	}
	
	
	
	
	
	

}
