package com.assignment.BookStoreApi.Repository;

import org.springframework.data.repository.CrudRepository;

import com.assignment.BookStoreApi.Entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
