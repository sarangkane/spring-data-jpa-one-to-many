package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Book;
import com.example.demo.vo.BookVO;

public interface BookService {

	public Book getBookById(long id);

	public void saveBook(BookVO book);
	
	public List<Book> getBooksByAuthor(String author);
	
	public List<Book> getBooksByShelfName(String shelfName);
	
}
