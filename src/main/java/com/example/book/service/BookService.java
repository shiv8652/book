package com.example.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.Repository.BookRepository;
import com.example.book.model.Book;



@Service
public class BookService {

	@Autowired
	private BookRepository bookrepository;
	
	public Book registerBook(Book book) {
		return bookrepository.save(book);
	}

	public List<Book> getBook(){
		return (List<Book>) bookrepository.findAll();
	}
	
	public void deleteBook(Integer id) {
		bookrepository.deleteById(id);
	}
	
	
	public Book updateBook(Book book) {
		Integer bookNumber = book.getBookNumber();
		Book std = bookrepository.findById(bookNumber).get();
		std.setBookname(book.getBookname());
		std.setAuthorname(book.getAuthorname());
		return bookrepository.save(std);
	}
}
