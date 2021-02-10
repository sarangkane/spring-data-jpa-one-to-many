package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.entity.Shelf;
import com.example.demo.repo.BookRepository;
import com.example.demo.repo.ShelfRepository;
import com.example.demo.vo.BookVO;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepo;

	@Autowired
	ShelfRepository shelfRepo;

	public Book getBookById(long id) {
		return bookRepo.findById(id).orElse(null);
	}

	public void saveBook(BookVO bookVO) {
		Shelf shelf = shelfRepo.findByName(bookVO.getShelfName());
		Book book = new Book();
		book.setAuthor(bookVO.getAuthor());
		book.setIsbn(bookVO.getIsbn());
		book.setTitle(bookVO.getTitle());
		book.setShelf(shelf);

		bookRepo.save(book);
	}

	public List<Book> getBooksByAuthor(String author) {
		return bookRepo.getBooksByAuthor(author);
	}
	
	public List<Book> getBooksByShelfName(String shelfName) {
		return bookRepo.getBooksByShelfName(shelfName);
	}
}
