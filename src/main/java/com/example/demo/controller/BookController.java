package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import com.example.demo.vo.BookVO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/library")
@Tag(name = "BookController", description = "The Book Controller")
public class BookController {

	@Autowired
	BookService bookService;

	@GetMapping("/books/author")
	@Operation(summary = "Method to get books by Author")
	@ApiResponse(responseCode = "200", description = "OK")
	public List<Book> getBooksByAuthor(@RequestParam String author) {
		return bookService.getBooksByAuthor(author);
	}

	@GetMapping("/book/id")
	@Operation(summary = "Method to get a book by Id")
	@ApiResponse(responseCode = "200", description = "OK")
	public Book getBookById(@RequestParam long id) {
		return bookService.getBookById(id);
	}

	@PostMapping("/book/save")
	@Operation(summary = "Method to save a book")
	@ApiResponse(responseCode = "200", description = "OK")
	public void saveBook(@RequestBody BookVO bookVO) {
		bookService.saveBook(bookVO);
	}
	
	@GetMapping("/books/shelf/name")
	@Operation(summary = "Method to get all books on a shelf by shelf name")
	@ApiResponse(responseCode = "200", description = "OK")
	public List<Book> getBooksByShelfName(@RequestParam String shelfName) {
		return bookService.getBooksByShelfName(shelfName);
	}

}
