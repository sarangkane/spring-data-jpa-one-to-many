package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	public List<Book> getBooksByAuthor(String author);
	
	public List<Book> getBooksByShelfName(String shelfName);

}
