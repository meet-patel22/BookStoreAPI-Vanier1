package com.assignment.BookStoreApi.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.BookStoreApi.Entity.Book;
import com.assignment.BookStoreApi.Repository.BookRepository;



@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository br ;
	
	
	@Override
	public Optional<Book> findById(Long id) {
		// TODO Auto-generated method stub
		return br.findById(id);
	}

	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return br.save(book);
	}

}
