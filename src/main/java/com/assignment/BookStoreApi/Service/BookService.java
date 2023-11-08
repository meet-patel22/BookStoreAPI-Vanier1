package com.assignment.BookStoreApi.Service;

import java.util.Optional;

import com.assignment.BookStoreApi.Entity.Book;

public interface BookService {
	
	
	Optional<Book> findById(Long id) ;
	Book save(Book book) ;
	

}
