package com.example.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.model.Book;
import com.example.book.service.BookService;



@RestController
@CrossOrigin(allowedHeaders = "*",origins = "*")
public class BookController {
	
	@Autowired
	private BookService BookService;
	
	@PostMapping("/registerBook")
	public Book registerBook(@RequestBody Book book) {
		return BookService.registerBook(book);	
	}
	
	
	@GetMapping("/getBook")
	public List<Book> getBook(){
		return BookService.getBook();
	}
	
	@DeleteMapping("/deleteBook")
	public void deleteBook(@RequestParam Integer id ) {
		BookService.deleteBook(id);
	}
	
	
	@PutMapping("/updateBook")
	public Book updateBook(@RequestBody Book book) {
		return BookService.updateBook(book);

	}
	
}
