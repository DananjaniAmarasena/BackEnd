package com.programming.techie.OnlineLibrary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programming.techie.OnlineLibrary.models.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	 List<Book> findByAuthor(String author);
	 List<Book> findByYear(int year);
	 List<Book> findByTitle(String title);
	
}
