package com.programming.techie.OnlineLibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programming.techie.OnlineLibrary.models.Book;
import com.programming.techie.OnlineLibrary.service.BookService;


@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*" )
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping("/")
	public ResponseEntity<Book> saveBook(@RequestBody Book book) {
		try {
			 bookService.saveBook(book);
			 return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return null;
		}
		
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Book>> findAll() {
		try {
			
			return new ResponseEntity<List<Book>>(bookService.findAll(),HttpStatus.OK);
		} catch (Exception e) {
			return null;
		}
		
	}
	
	@GetMapping("/{id}")
	public Book findById(@PathVariable int id) {
		return bookService.findById(id);
	}
	

}
