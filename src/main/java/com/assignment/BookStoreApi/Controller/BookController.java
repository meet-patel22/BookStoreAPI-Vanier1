package com.assignment.BookStoreApi.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.BookStoreApi.Entity.Book;
import com.assignment.BookStoreApi.Entity.Customer;
import com.assignment.BookStoreApi.Service.BookService;
import com.assignment.BookStoreApi.Service.BookServiceImpl;
import com.assignment.BookStoreApi.Service.CustomerServiceImpl;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookService bs ;
	
	@GetMapping("/id")
	public Book getBookById(@RequestParam Long id ) {
		return bs.findById(id).get();
	}
	
	
	@PostMapping("/save")
	public void saveBook(@RequestBody Book book ) {
		bs.save(book);
	}

}
