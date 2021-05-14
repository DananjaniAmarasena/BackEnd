package com.programming.techie.OnlineLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.programming.techie.OnlineLibrary.models.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

	@Query(value = "SELECT accountId FROM Account a WHERE a.user_id = ?1 AND a.book_id = ?2", 
			countQuery = "SELECT count(*) FROM Account a WHERE a.user_id = ?1 AND a.book_id = ?2",
			nativeQuery = true)
	Integer findBurrowed(Integer user_id, Integer book_id);
	
	@Query(value = "SELECT * FROM Account a WHERE a.book_id = ?1",
			countQuery =   "SELECT count(*) FROM Account a WHERE a.book_id = ?1",
			nativeQuery = true)
	Integer findBurrowedBooks( Integer book_id);
	
	@Query(value = "SELECT * FROM Account a WHERE a.user_id = ?1",
			countQuery =   "SELECT count(*) FROM Account a WHERE a.user_id = ?1"
			, nativeQuery = true)
	Integer findUserOrders( Integer user_id);
}
