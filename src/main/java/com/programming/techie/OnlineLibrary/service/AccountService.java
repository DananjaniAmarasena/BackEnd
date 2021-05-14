package com.programming.techie.OnlineLibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programming.techie.OnlineLibrary.models.Account;
import com.programming.techie.OnlineLibrary.models.Book;
import com.programming.techie.OnlineLibrary.repository.AccountRepository;
import com.programming.techie.OnlineLibrary.repository.BookRepository;
import com.programming.techie.OnlineLibrary.repository.UserRepository;

@Service
public class AccountService {

		@Autowired
		AccountRepository accountRepository;
		@Autowired
		UserRepository userRepository;
		@Autowired
		BookRepository bookRepository;
		
		public boolean isBurrowed(int userId, int bookId) {

			if (accountRepository.findBurrowed(userId, bookId) == null) {
				return false;
			} else {

				int accountId = accountRepository.findBurrowed(userId, bookId);
				System.out.println(accountId);
				return true;
			}
		}

		
}
